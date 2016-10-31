package com.huifu.module.util.enums.sys;

import com.huifu.module.util.enums.iface.IPatternEnum;

public enum DebugEnum implements IPatternEnum {

	DEVELOPER("Developer", "开发者"), 
	DEVPRESS("Development progress", "开发进度"), 
	TESTER("Tester", "测试者"), 
	TESTPRESS("Test progress", "测试进度"), 
	DESCRIPTION("Description", "描述");
	
	private String patternString;
	private String patternDesc;

	private DebugEnum(String patternString, String patternDesc) {
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
