package io.swagger.util.common2.middle;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;


/**
 * Get tools location or size
 */
public class ScreenUtils {

	private static Dimension scrSize = getScreenSize();

	/**
	 * ���봰��Ŀ�Ⱥ͸߶ȣ��Ϳ��Ի�ȡ������ʾ���м��λ����Ϣ
	 * 
	 * @param width
	 * @param height
	 * @return
	 */
	public static int[] getCenterLocation(int width, int height) {
		int[] pos = new int[4];
		pos[0] = (scrSize.width - width) / 2;
		pos[1] = (scrSize.height - height) / 2;
		pos[2] = width;
		pos[3] = height;
		return pos;
	}


	/**
	 * ��ȡ��Ļ�ֱ��ʴ�С
	 * 
	 * @return
	 */
	public static Dimension getScreenSize() {
		Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
		return scrSize;
	}

	/**
	 * ��ȡͼƬ�ֱ��ʵĴ�С
	 * 
	 * @param image
	 * @param observer
	 * @return
	 */
	public static Dimension getSizeOfImage(Image image, ImageObserver observer) {
		Dimension dimension = new Dimension(image.getWidth(observer), image
				.getHeight(observer));
		return dimension;
	}
}
