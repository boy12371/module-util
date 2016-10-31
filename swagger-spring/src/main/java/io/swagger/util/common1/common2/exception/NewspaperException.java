package io.swagger.util.common1.common2.exception;

/**
 * 自定义异常类。
 * 第一种定义方式，继承Exception类
 */
public class NewspaperException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4331504099716639794L;

	public NewspaperException() {
		super();
	}

	public NewspaperException(String msg) {
		super(msg);
	}

	public NewspaperException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NewspaperException(Throwable cause) {
		super(cause);
	}
	//自定义异常类的主要作用是区分异常发生的位置，当用户遇到异常时，
	//根据异常名就可以知道哪里有异常，根据异常提示信息进行修改。
}
