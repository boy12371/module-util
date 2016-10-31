package com.huifu.module.util.enums.util;

import com.huifu.module.util.enums.iface.IDictEnum;

/**
 * 
 * 控制开关，状态等
 * 
 * @author richard
 * @version v1.0.0
 * @since JDK 1.8
 */
public enum FlagEnum implements IDictEnum {

	NORMAL("1", "00000001", "正常/开启"),

	CLOSE("0", "00000000", "关闭");

	private String code;
	private String dictCode;
	private String desc;

	private FlagEnum(String code, String dictCode, String desc) {
		this.code = code;
		this.dictCode = dictCode;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDictCode() {
		return dictCode;
	}

	public String getDesc() {
		return desc;
	}

	public static FlagEnum findByCode(String code) {
		for (FlagEnum result : FlagEnum.values()) {
			if (result.getCode().equals(code)) {
				return result;
			}
		}
		return null;
	}

	public static FlagEnum findByDictionayCode(String dictCode) {
		for (FlagEnum result : FlagEnum.values()) {
			if (result.getDictCode().equals(dictCode)) {
				return result;
			}
		}
		return null;
	}
}
