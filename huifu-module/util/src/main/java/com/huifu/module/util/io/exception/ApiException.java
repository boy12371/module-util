package com.huifu.module.util.io.exception;

public class ApiException extends Exception {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7085250379272617469L;
	/**
	 * 错误码
	 */
	private int code;

	public ApiException(int code, String msg) {
		super(msg);
		this.setCode(code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
