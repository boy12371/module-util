package com.huifu.module.util.enums.sys;

import com.huifu.module.util.enums.iface.IRespCode;

/**
 * 
 * 公用业务类返回码
 * 
 * @author richard
 * @version v1.0.0 
 * @since JDK 1.8
 */
public enum RespEnum implements IRespCode {
	
    SUCCESS("000","交易成功"),
    PROCCESS("001", "交易处理中"),
    ACCEPT("002", "请求已受理"),
    FAIL("003", "交易失败"),
    SYSTEM_OVERTIME("098", "系统超时"),
    SYSTEM_EXCEPTION("099", "系统异常"),
    
    /*1###：商户请求参数异常类*/
    PARAM_REQUIRED_ERROR("100", "请求参数非法"),
    MER_AUTH_ERROR("101", "商户无此接口权限"),
    VALID_CHKVALUE_ERROR("102", "验证签名失败"),
    MER_STAT_ERROR("103", "商户状态异常"),
    USER_STAT_ERROR("104", "用户状态异常"),
    ACCT_STAT_ERROR("105", "账户状态异常"),
    MER_SIGN_CONF_ERROR("106", "商户签名未配置"),
    
    CMD_ID_SIGN_ERROR("107", "消息类型与签名内容不一致"),
    MER_CUST_ID_SIGN_ERROR("108", "商户客户号与签名内容不一致"),
    VERSION_SIGN_ERROR("109", "版本号与签名内容不一致"),
    MER_EXIST_ERROR("110", "商户号不存在"),
    USER_EXIST_ERROR("111","用户客户号不存在"),
    ACCT_EXIST_ERROR("112","账号不存在"),
    TEMP_ACCT_AS_OUT_ACCT_ERROR("113","过渡账户不能出账"),
    
    /*2###：公用业务异常类*/
    PAGE_DATA_MODIFY("201", "页面数据被篡改"),
    REPEAT_TRANS("202", "交易订单号重复"),
    ACCT_AVLBAL_LACK("203", "账户可用余额不足"),
    MER_RULE_NOT_CONFIG("204", "商户配置异常"),
    SMS_CODE_CHECK_ERROR("205", "短信验证码验证失败"),
    SMS_SEND_MOBILE_NOT_SAME("206", "短信验证码发送手机号与验证手机号不一致"),
    SMS_REQUIRED_ERROR("207", "短信验证码或短信唯一标识为空"),
    SMS_CODE_INVALID("208", "短信验证码已失效请重新获取"),
    SMS_SEND_INTERFACE_NOT_SAME("209", "验证码发送接口与接口不一致"),
    SMS_SEND_FREQUENT("210", "短信验证码发送过于频繁"),
    SMS_SEND_ERROR("211", "短信验证码发送失败"),
    QUERY_BALANCE_ERROR("212","账户余额查询失败"),
    QUERY_NOT_FOUND("213", "未查询到内容"),
    QUERY_ERROR("214", "查询出现异常"),
    SOLO_ADDITION_INVALID("215","请补录身份信息"),
    SMS_SEND_ADDUP_ERROR("216", "短信验证码发送过于频繁或单日发送次数超限"),
    
    /*3###--5###：业务自定义异常类*/
    
    /*6绑卡 */
    BIND_CASH_ERROR("601", "贷记卡不能绑定为取现卡"),

    /*7###：交易状态查询 快捷支付*/
    TRANS_STAT_SUCCESS("701", "当前状态:成功"),
    TRANS_STAT_FAIL("702", "当前状态:失败"),
    TRANS_STAT_OPER("703", "当前状态:处理中"),
    TRANS_STAT_INIT("700", "当前状态:初始化"),
    
    QUICKPAY_ROLE_ERROR("720", "快捷支付只服务于个人或个体用户"),
    DIVINFO_OVER_COUNT("721", "分账串内容不能超过五个"),
    DIVINFO_ELEM_NULL("722", "分账串部分字段为空"),
    DIVINFO_AMT_ERROR("723", "分账串金额格式错误"),
    DIVINFO_SUMAMT_ERROR("724", "分账串累计金额不等于订单金额"),
    DIVINFO_USER_STAT_ERROR("725", "分账信息用户状态异常"),
    DIVINFO_ACCT_STAT_ERROR("726", "分账信息账户状态异常"),
    DIVINFO_ERROR("727", "分账信息异常"),
    DIVINFO_ACCT_ERROR("728", "分账串账户信息格式错误"),
    DIVINFO_FREEZE_ERROR("729", "分账串账户异常"),
    QUICKPAY_BINDCARD_ERROR("730", "快捷支付卡有变更，请重新获取验证码"),
    QUICKPAY_TRANSFER_ERROR("731", "快捷支付分账转账失败"),
    QUICKPAY_TRANSFER_MAIN_ERROR("732", "快捷支付分账转账表处理失败"),
    QUICKPAY_TRANSFER_DETAIL_ERROR("733", "分账支付明细表处理失败"),
    PAY_FEE_NOT_CONFIG("734", "该商户客户号网银支付网关号未配置"),
    ONLINEPAY_GATEID_ERROR("735", "商户无目标支付网关权限"),
    QUICKPAY_TRANSAMT_ERROR("736", "快捷支付交易金额不一致"),
    QUICKPAY_PAY_DETAIL_ERROR("737", "支付明细表处理失败"),
    QUICKPAY_DIV_STRING_ERROR("738", "快捷支付分账串内容不一致"),
    QUICKPAY_SMS_ERROR("739", "快捷支付短信发送异常"),
    QUICKPAY_MEMCACHE_ERROR("740", "快捷支付信息异常"),
    DIVINFO_REPEAT("741", "分账串内容重复"),
    QUICKPAY_PAY_S_TRANSFER_E("742", "快捷支付成功，分账失败"),
    
    /* 8###：调风控系统异常类 */
    RISK_INTERCEPT("803","支付交易受限，限额限次或其他"),
    RISK_INTERCEPT_LIMIT("804","商户超限额或限次"),
    RISK_INTERCEPT_SWITCH("805","商户未开通该功能权限 "),
    RISK_INTERCEPT_BLACK_LIST("806","商户交易限制"),
    /* 9###：系统响应给商户异常类 */    
    
    REFUND_ACCEPT("1500", "银行卡退款 受理中");
    
    private String code;
    private String desc;
    
    private RespEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static RespEnum findByCode(String code) {
		for (RespEnum result : RespEnum.values()) {
			if (result.getCode().equals(code)) {
				return result;
			}
		}
		return null;
	}

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }
    
}
