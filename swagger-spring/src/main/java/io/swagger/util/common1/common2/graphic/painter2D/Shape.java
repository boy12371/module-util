package io.swagger.util.common1.common2.graphic.painter2D;

import java.awt.Graphics;
/**
 * 自定义图形的接口
 */
public interface Shape {
	// 画图，每个自定义图形都必须实现该接口。
	public void draw(Graphics g);
}