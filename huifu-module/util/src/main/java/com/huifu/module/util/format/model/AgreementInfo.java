package com.huifu.module.util.format.model;

import java.io.Serializable;

public class AgreementInfo implements Serializable{
	
    private static final long serialVersionUID = 1L;

	private String fileName;
	
	private String userName;
	
	private String certId;
	
	private String userMobile;
	
	private String cardNo;
	
	private String bankName;
    //用户地址
    private String userAddress;
    
	private String merName;
	
	private String merAddress;
	
	private String merContMobile;
	
	private String merWebSite;
	
	private String orderId;
	
	private String orderDate;
	
	private String productAmt;
	
	private String merCustId;
	
	private String userCustId;
	
	private String applyId;
	
	private String contractFileType;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCertId() {
		return certId;
	}

	public void setCertId(String certId) {
		this.certId = certId;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getMerAddress() {
		return merAddress;
	}

	public void setMerAddress(String merAddress) {
		this.merAddress = merAddress;
	}

	public String getMerContMobile() {
		return merContMobile;
	}

	public void setMerContMobile(String merContMobile) {
		this.merContMobile = merContMobile;
	}

	public String getMerWebSite() {
		return merWebSite;
	}

	public void setMerWebSite(String merWebSite) {
		this.merWebSite = merWebSite;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getProductAmt() {
		return productAmt;
	}

	public void setProductAmt(String productAmt) {
		this.productAmt = productAmt;
	}

	public String getMerCustId() {
	    return merCustId;
    }

	public void setMerCustId(String merCustId) {
	    this.merCustId = merCustId;
    }

	public String getUserCustId() {
	    return userCustId;
    }

	public void setUserCustId(String userCustId) {
	    this.userCustId = userCustId;
    }

	public String getApplyId() {
	    return applyId;
    }

	public void setApplyId(String applyId) {
	    this.applyId = applyId;
    }

	public String getContractFileType() {
	    return contractFileType;
    }

	public void setContractFileType(String contractFileType) {
	    this.contractFileType = contractFileType;
    }

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
}
