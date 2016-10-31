package com.huifu.module.web.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * StringPdf
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T02:13:04.643+08:00")

public class StringPdf {
	private String filename = null;

	private String title = null;

	private String content = null;

	public StringPdf filename(String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * 填写文件名
	 * 
	 * @return filename
	 **/
	@ApiModelProperty(example = "withholdsign", required = true, value = "填写文件名")
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public StringPdf title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * 填写标题
	 * 
	 * @return title
	 **/
	@ApiModelProperty(example = "代扣签约协议", required = true, value = "填写标题")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public StringPdf content(String content) {
		this.content = content;
		return this;
	}

	/**
	 * 填写正文内容
	 * 
	 * @return content
	 **/
	@ApiModelProperty(example = "甲方：用户（您） 身份证号： 联系地址： 联系电话：乙方：上海汇付数据服务有限公司 地址：上海市虹梅路1801号凯科国际大厦9楼 联系电话：021－33323999 传真：021－33323830 邮政编码：200233", required = true, value = "填写正文内容")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StringPdf stringPdf = (StringPdf) o;
		return Objects.equals(this.filename, stringPdf.filename) && Objects.equals(this.title, stringPdf.title)
				&& Objects.equals(this.content, stringPdf.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash(filename, title, content);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StringPdf {\n");

		sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
