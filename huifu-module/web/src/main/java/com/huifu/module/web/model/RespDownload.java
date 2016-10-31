package com.huifu.module.web.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * RespDownload
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T02:13:04.643+08:00")

public class RespDownload {
	private String code = null;

	private String link = null;

	public RespDownload code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * 文件下载编号
	 * 
	 * @return code
	 **/
	@ApiModelProperty(example = "d40029be-eda6-4d62-b1ef-d05e2e91a72a", value = "文件下载编号")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public RespDownload link(String link) {
		this.link = link;
		return this;
	}

	/**
	 * 用于客户端获取生成文件的URL
	 * 
	 * @return link
	 **/
	@ApiModelProperty(example = "http://domain.com:8080/1020207/d40029be-eda6-4d62-b1ef-d05e2e91a72a", value = "用于客户端获取生成文件的URL")
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RespDownload respDownload = (RespDownload) o;
		return Objects.equals(this.code, respDownload.code) && Objects.equals(this.link, respDownload.link);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, link);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RespDownload {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
