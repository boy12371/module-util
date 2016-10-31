package io.swagger.util.common1.util;

import java.util.Date;

import io.swagger.util.common1.bean.User;

public class ResourcesDate {
	private String data;
	private String type;
	private String version;
	private String resourceDataId;
	private User user;
	private Date createTime;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getResourceDataId() {
		return resourceDataId;
	}

	public void setResourceDataId(String resourceDataId) {
		this.resourceDataId = resourceDataId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
