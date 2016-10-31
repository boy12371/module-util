package com.huifu.module.util.enums.biz;

import com.huifu.module.util.enums.iface.IDictEnum;

/**
 * 
 * 账户类型枚举
 * 
 * @author richard
 * @version v1.0.0
 * @since JDK 1.8
 */
public enum AcctTypeEnum implements IDictEnum  {

	CASH("1", "01040000", "现金户"),

	CREDIT("2", "01040001", "信用户"),

	CLEARANCE("3", "01040002", "结算户");

	private String code;
	private String dictCode;
	private String desc;
	
	private AcctTypeEnum(String code, String dictCode, String desc) {
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
}
