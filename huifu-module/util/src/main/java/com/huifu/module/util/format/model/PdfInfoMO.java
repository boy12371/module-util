package com.huifu.module.util.format.model;

import java.io.Serializable;

public class PdfInfoMO implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * pdf文件名
	 */
	private String fileName;
	/*
	 * 标题
	 */
	private String title;
	/*
	 * 文档正文
	 */
	private String text;
	/*
	 * 使用模板
	 */
	private TemplateMO templateMO;
	/*
	 * 使用表格
	 */
	private TableMO tableMO;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TemplateMO getTemplateMO() {
		return templateMO;
	}

	public void setTemplateMO(TemplateMO templateMO) {
		this.templateMO = templateMO;
	}

	public TableMO getTableMO() {
		return tableMO;
	}

	public void setTableMO(TableMO tableMO) {
		this.tableMO = tableMO;
	}
}
