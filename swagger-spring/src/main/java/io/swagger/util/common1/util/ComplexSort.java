package io.swagger.util.common1.util;

import java.util.List;

import io.swagger.util.common1.domain.PublishNews;
import io.swagger.util.common1.util.newbean.PublishNewsDao;

public class ComplexSort {
	/**
	 * 设置新闻置顶,如果该新闻占用了其它新闻的置顶位,则将其它新闻置顶位顺位后移 <br>
	 * 如果是取消置顶,则把其它位置的新闻顺位前移
	 * 
	 * @param publishNews
	 * @param topPublishNewsList
	 * @author liangda
	 * @create 2010-10-15 下午03:01:21
	 */
	private static void sortTopList(PublishNews publishNews, List<PublishNews> topPublishNewsList) {
		boolean isPublishNewsTop = false;
		for (PublishNews pn : topPublishNewsList) {
			if (pn.getId() == publishNews.getId()) {
				isPublishNewsTop = true;
				break;
			}
		}

		// 如果之前是置顶的,缓存它旧的置顶位
		int oldPublishNewsIndex = 0;
		if (isPublishNewsTop)
			oldPublishNewsIndex = ((PublishNews) getPublishNewsDao().getEntryObject(publishNews.getId()))
					.getListIndex();

		boolean overMaxIndex = false;
		// 如果设置的排位大于数据库里的最大排位,强制处理为最大排位加1
		if (publishNews.isTopFlag() && publishNews.getListIndex() > topPublishNewsList.size()) {
			int maxIndex = topPublishNewsList.size() + 1;
			publishNews.setListIndex(maxIndex);
			overMaxIndex = true;
		}

		int index = publishNews.getListIndex();

		if (!overMaxIndex && (publishNews.isTopFlag() && isPublishNewsTop)) {
			// 如果之前已经是置顶,现在还是置顶,并且没超出最大排位,则代表换位操作
			for (PublishNews pn : topPublishNewsList) {
				if (oldPublishNewsIndex < index) {
					if (pn.getListIndex() <= oldPublishNewsIndex || index < pn.getListIndex())
						continue;
					pn.setListIndex(pn.getListIndex() - 1); // 如果之前的位置比现在的位置小,其它的就顺位前移
				} else if (oldPublishNewsIndex > index) {
					if (pn.getListIndex() < index || oldPublishNewsIndex <= pn.getListIndex())
						continue;
					pn.setListIndex(pn.getListIndex() + 1); // 如果之前的位置比现在的位置大,其它的就顺位后移
				}
				getPublishNewsDao().update(pn);
			}
		} else if (overMaxIndex && (publishNews.isTopFlag() && isPublishNewsTop)) {
			// 如果之前已经是置顶,现在还是置顶,并且超出最大排位,则代表置为末位
			for (PublishNews pn : topPublishNewsList) {
				int pnIndex = pn.getListIndex();
				if (oldPublishNewsIndex >= pnIndex || publishNews.getId() == pn.getId())
					continue;
				pn.setListIndex(pn.getListIndex() - 1);
				getPublishNewsDao().update(pn);
			}
			// 把新闻的置顶位设置为最大排位
			publishNews.setListIndex(topPublishNewsList.size());
		} else if (publishNews.isTopFlag() && !isPublishNewsTop) {
			// 如果以前不是置顶,现在是置顶,代表是新添加置顶,其它的就顺位后移
			for (PublishNews pn : topPublishNewsList) {
				if (index > pn.getListIndex())
					continue;
				pn.setListIndex(pn.getListIndex() + 1);
				getPublishNewsDao().update(pn);
			}
		} else if (!publishNews.isTopFlag() && isPublishNewsTop) {
			// 如果该新闻之前是设置着置顶的,现在不是置顶的,代表取消置顶,把其它顺位前移
			for (PublishNews pn : topPublishNewsList) {
				if (oldPublishNewsIndex > pn.getListIndex() || publishNews.getId() == pn.getId())
					continue;
				pn.setListIndex(pn.getListIndex() - 1);
				getPublishNewsDao().update(pn);
			}
		}
	}

	private static PublishNewsDao getPublishNewsDao() {
		PublishNewsDao pnd = new PublishNewsDao();
		return pnd;
	}
	
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	sortTopList(null, null);
    }
	
}