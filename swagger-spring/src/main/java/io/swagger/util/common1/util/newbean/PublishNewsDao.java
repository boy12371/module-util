package io.swagger.util.common1.util.newbean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import io.swagger.util.common1.domain.PublishNews;
import io.swagger.util.common2.sql_server.DbUtil;

/**
 * 
 * 
 * =============================================================================
 * 
 * 描述：对新闻表信息的增删改查
 * 
 * 作者：
 * 
 * 日期： 
 * 
 * =============================================================================
 */
public class PublishNewsDao {
	/**
	 * 获取所有新闻信息。
	 * 
	 * @return
	 */
	public static List<PublishNews> getPublishNewsList() {
		List<PublishNews> publishNewsList = new ArrayList<PublishNews>();
		Connection conn = DbUtil.getConnect();
		String sql = "select * from PublishNews";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				PublishNews publishNews = new PublishNews();
				String id = rs.getString("id");
				boolean topFlag = rs.getBoolean(id);
				int listIndex = rs.getInt("listIndex");

				publishNews.setId(id);
				publishNews.setTopFlag(topFlag);
				publishNews.setListIndex(listIndex);
				publishNewsList.add(publishNews);
			}

			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return publishNewsList;
	}

	/**
	 * 插入一条新闻记录
	 * 
	 * @param PublishNews
	 *            新闻
	 */
	public static boolean insert(PublishNews publishNews) {
		Connection conn = DbUtil.getConnect();
		String sql = "insert into PublishNews values(?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, publishNews.getId());
			pstmt.setBoolean(2, publishNews.isTopFlag());
			pstmt.setInt(3, publishNews.getListIndex());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * 根据学号删除一条记录
	 * 
	 * @param stuID
	 *            学号
	 */
	public static void delete(String stuID) {
		Connection conn = DbUtil.getConnect();
		String sql = "delete from PublishNews where stuID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stuID);
			pstmt.execute();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 更新一条记录
	 * 
	 * @param PublishNews
	 *            要更新的新闻信息
	 */
	public void update(PublishNews publishNews) {
		Connection conn = DbUtil.getConnect();
		String sql = "update PublishNews set id=?, topflag=?, age=? where listindex=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareCall(sql);
			pstmt.setString(1, publishNews.getId());
			pstmt.setBoolean(2, publishNews.isTopFlag());
			pstmt.setInt(3, publishNews.getListIndex());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public PublishNews getEntryObject(String id) {
		PublishNews publishNews = new PublishNews();
		publishNews.setId(id);
		return publishNews;
	}

}
