package io.swagger.util.common1.domain;

import java.util.List;

public class BankBillRecord {
	private String totalsize;
	private String successsize;
	private String failsize;
	private List<?> recordlist;
	private Object successmoney;
	private Object failmoney;

	public String getTotalsize() {
		return totalsize;
	}

	public void setTotalsize(String totalsize) {
		this.totalsize = totalsize;
	}

	public String getSuccesssize() {
		return successsize;
	}

	public void setSuccesssize(String successsize) {
		this.successsize = successsize;
	}

	public String getFailsize() {
		return failsize;
	}

	public void setFailsize(String failsize) {
		this.failsize = failsize;
	}

	public List<?> getRecordlist() {
		return recordlist;
	}

	public void setRecordlist(List<?> recordlist) {
		this.recordlist = recordlist;
	}

	public Object getSuccessmoney() {
		return successmoney;
	}

	public void setSuccessmoney(Object successmoney) {
		this.successmoney = successmoney;
	}

	public Object getFailmoney() {
		return failmoney;
	}

	public void setFailmoney(Object failmoney) {
		this.failmoney = failmoney;
	}

}
