package com.huifu.module.util.format.model;

import java.io.Serializable;

public class TableMO implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * 表格标题
	 */
	private String tableTitle;
	/*
	 * 表格内容
	 */
	private String tableContent;

	public String getTableTitle() {
		return tableTitle;
	}

	public void setTableTitle(String tableTitle) {
		this.tableTitle = tableTitle;
	}

	public String getTableContent() {
		return tableContent;
	}

	public void setTableContent(String tableContent) {
		this.tableContent = tableContent;
	}
}
