package com.huifu.module.util.enums.util;

import com.huifu.module.util.enums.iface.IPatternEnum;

/**
 * 正则枚举类：用于放置各种匹配模式表达式
 * 
 * @author richard
 * @version v1.0.0
 * @since JDK 1.8
 */
public enum RegexEnum implements IPatternEnum {
	/**
	 * 模式枚举值规范为匹配类型+P+2位数字序列号 比如字符串StringP01 日期DateP01 时间TimeP01,
	 * 如果就唯一类型，就不用加P和数字
	 */
	StringP01("^\\(('\\w+')(,'\\w+')*\\)$", "匹配形式为('xx','xx')的字符串"), 
    StringP02("('\\w+')(,'\\w+')*", "匹配形式为'xx','xx'的字符串"),
    Chinese("[\u4e00-\u9fa5]+","匹配中文字符"),
    //Email("^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$","电子邮箱"),
    Email("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$","电子邮箱"),
    PersonID("^\\d{15}|\\d{17}(\\d|x)$","身份证15位数字或者18位数字,最后一位可以为x"),
    AmtP01("(^[1-9][0-9]*[\\.][0-9]{2}$)|(^0[\\.][0-9]{2}$)","严格匹配金额格式为xxxx.xx数字串，最后必须保留两位小数"),
    AmtP02("(^[1-9][0-9]*$)|(^[0-9]$)","严格匹配金额格式为xxxx数字串"),
    TELEPHONE("^((13[0-9])|(15[^4,\\D])|(17[0,6,7,8])|(14[5,7])|(18[0-9]))\\d{8}$","手机号码验证"),
    IP("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b","IP v4地址验证"),
    Number("^\\d+$","数字字符串"),
    English("^[a-zA-Z]+$","英文字母"),
    DateTimeP01("yyyyMMddHHmmss","匹配时间格式,形式为20150313170911"),
    DateP01("yyyy-MM-dd","匹配日期格式2015-03-16"),
    DateP02("yyyyMMdd","匹配日期格式20150316");

    private String patternString;
	private String patternDesc;

	private RegexEnum(String patternString, String patternDesc) {
		this.patternString = patternString;
		this.patternDesc = patternDesc;
	}

	public String getPatternString() {
		return patternString;
	}

	public String getPatternDesc() {
		return patternDesc;
	}
}
