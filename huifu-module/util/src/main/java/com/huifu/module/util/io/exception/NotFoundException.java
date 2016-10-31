package com.huifu.module.util.io.exception;

public class NotFoundException extends ApiException {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5325409256699856270L;
	/**
	 * 错误码
	 */
	private int code;

	public NotFoundException(int code, String msg) {
		super(code, msg);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
