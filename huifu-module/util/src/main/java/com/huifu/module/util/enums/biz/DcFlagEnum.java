
package com.huifu.module.util.enums.biz;

import com.huifu.module.util.enums.iface.IDictEnum;

/**
 * 借贷枚举类
 * 
 * @author richard
 * @version v1.0.0
 * @since JDK 1.8
 */
public enum DcFlagEnum implements IDictEnum {

	DEBIT("0", "01050300", "借记"),
	CREDIT("1", "01050301", "贷记"),
	DC("2", "01050302", "借贷记不分离");

	private String code;
	private String dictCode;
	private String desc;

	private DcFlagEnum(String code, String dictCode, String desc) {
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

	public static DcFlagEnum findByCode(String code) {
		for (DcFlagEnum result : DcFlagEnum.values()) {
			if (result.getCode().equals(code)) {
				return result;
			}
		}
		return null;
	}

	public static DcFlagEnum findByDictCode(String dictCode) {
		for (DcFlagEnum result : DcFlagEnum.values()) {
			if (result.getDictCode().equals(dictCode)) {
				return result;
			}
		}
		return null;
	}
}
