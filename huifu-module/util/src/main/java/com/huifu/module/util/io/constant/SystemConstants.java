package com.huifu.module.util.io.constant;

/**
 * 
 * 系统常量
 * 全局统一的系统值
 * 
 * @author richard
 * @version v1.0.0 
 * @since JDK 1.8
 */
public class SystemConstants {

    public static final int VERSION_LENGTH = 2;
    public static final int CMD_ID_LENGTH = 3;
    public static final int OPER_ID_MAX_LENGTH = 20;
    public static final int ORD_DATE_REQUIRED_LENGTH = 8;
    public static final int AMOUNT_MAX_LENGTH = 14;
    public static final int CHECK_VALUE_LENGTH = 3136;

    public static final String CMD_ID = "cmd_id";
    public static final String VERSION = "10";
    public static final String MER_CUST_ID = "mer_cust_id";
    public static final String USER_CUST_ID = "user_cust_id";
    public static final String ORDER_ID = "order_id";
    public static final String ORDER_DATE = "order_date";
    public static final String CARD_VERIFY_TYPE = "card_verify_type";
    public static final String USER_NAME = "user_name";
    public static final String CERT_ID = "cert_id";
    public static final String USER_MOBILE = "user_mobile";
    public static final String USER_EMAIL = "user_email";
    public static final String PAY_PWD = "pay_password";
    public static final String ACCT_ID = "acct_id";
    public static final String VALI_DATE = "vali_date";
    public static final String CUST_PROV = "cust_prov";
    public static final String CUST_AREA = "cust_area";
    public static final String CUST_ADDRESS = "cust_address";
    public static final String OCCUPATION = "occupation";
    public static final String SMS_CODE = "sms_code";
    public static final String SMS_ORDER_ID = "sms_order_id";
    public static final String SMS_ORDER_DATE = "sms_order_date";
    public static final String SMS_SEQ_ID = "sms_seq_id";
    public static final String PLATFORM_SEQ_ID = "platform_seq_id";
    public static final String ORIGINAL_PLATFORM_SEQ_ID = "original_platform_seq_id";
    public static final String FEE_AMT = "fee_amt";
    public static final String FEE_ACCT_ID = "fee_acct_id";
    public static final String FEE_CUST_ID = "fee_cust_id";
    public static final String BANK_ID = "bank_id";
    public static final String DC_FLAG = "dc_flag";
    public static final String CARD_NO = "card_no";
    public static final String CARD_ID = "card_id";
    public static final String CARD_MOBILE = "card_mobile";
    public static final String CARD_BUSS_TYPE = "cardBussType";
    public static final String CARD_PROV = "card_prov";
    public static final String CARD_AREA = "card_area";
    public static final String TRANS_TYPE = "trans_type";
    public static final String BUSINESS_TYPE = "business_type";
    public static final String SIGN_ORDER_ID = "sign_order_id";
    public static final String SIGN_ORDER_DATE = "sign_order_date";
    public static final String IN_CUST_ID = "in_cust_id";
    public static final String DIV_DETAIL = "div_detail";
    public static final String DIV_AMT = "div_amt";
    public static final String DIV_ACCT_ID = "div_acct_id";
    public static final String BALANCE = "balance";
    public static final String CASH_BALANCE = "cash_balance";
    public static final String ACCT_BALANCE = "acct_balance";
    public static final String FREEZE_BALANCE = "freeze_balance";
    public static final String REAL_TRANS_AMT = "real_trans_amt";
    public static final String TRANS_STAT = "trans_stat";
    public static final String PRODUCT_ID = "product_id";
    public static final String AW_FLAG = "aw_flag";
    public static final String QP_FLAG = "qp_flag";
    public static final String PAY_TYPE = "pay_type";
    public static final String DIV_FREEZE_FLG = "div_freeze_flg";
    public static final String SOLO_FLG = "solo_flg";

    public static final String RECV_MER_ID = "999999";
    public static final int RAS_VERIFY_SIGN_SUCCESS = 0;
    public static final String ZERO_AMT = "0.00";

    public static final String BLANK = " ";
    public static final String EMPTY = "";
    public static final String BANG = "!";
    public static final String QUESTION_MARK = "?";
    public static final String COMMA = ",";
    public static final String POINT = ".";
    public static final String COLON = ":";
    public static final String SEMICOLON = ";";
    public static final String QUOTE = "'";
    public static final String SINGLE_QUOTE = "\'";
    public static final String DOUBLE_QUOTE = "\"";
    public static final String STAR = "*";
    public static final String THREE_STAR = "***";
    public static final String PLUS = "+";
    public static final String DASH = "-";
    public static final String EQUAL = "=";
    public static final String SLASH = "/";
    public static final String BACK_SLASH = "\\";
    public static final String PIPE = "|";
    public static final String UNDERLINE = "_";
    public static final String DOLOR = "$";
    public static final String AT = "@";
    public static final String CROSS_HATCH = "#";
    public static final String PERCENT = "%";
    public static final String AND = "&";
    public static final String CIRCUMFLEX = "^";
    public static final String TILDE = "~";
    public static final String LEFT_BRACE = "{";
    public static final String RIGHT_BRACE = "}";
    public static final String LEFT_BRACKET = "[";
    public static final String RIGHT_BRACKET = "]";
    public static final String LEFT_ANGLE_BRACKET = "<";
    public static final String RIGHT_ANGLE_BRACKET = ">";
    public static final String LEFT_PARENTHESES = "(";
    public static final String RIGHT_PARENTHESES = ")";
    public static final String BACK_SLASH_PIPE = "\\|";
    public static final String LINE_CHANGE_SYMBOL = "\n";
    public static final String ENTER_SYMBOL = "\r";
    public static final String TAB_SYMBOL = "\t";

    public static final String STR_X = "X";
    public static final String STR_x = "x";

    public static final String STR_ZERO = "0";
	public static final String REQINSTANCE = "reqInstance";

	public static final int REQUIRED_SEQUENCE_LENGTH_8 = 8;
	public static final int REQUIRED_SEQUENCE_LENGTH_10 = 10;
	public static final String PAGE_RESP_CODE = "respCode";
	public static final String PAGE_RESP_DESC = "respDesc";

    /** 
     * io.file.PdfCreater
     */
	public static final String DEFAULT_FILENAME = "undefined";
	public static final String PDF_DEFAULT_TITLE = "未定义标题";
	public static final String PDF_DEFAULT_CONTENT = "未定义正文";
	public static final String PDF_DEFAULT_INFO = "未定义正文信息";
	
    /** 
     * 企业开户
     */
	public static final String PERMANENT_DATE_C = "永久";
	public static final String PERMANENT_DATE_N = "99991231";
	public static final String MKEY_CORPREG = "corpRegKey";
	public static final int FILE_MAX_NUM = 10;
    public static final String APPLY_ID = "apply_id";
    public static final String OPERATE_TYPE = "operate_type";
    public static final String CORP_LICENSE_TYPE = "corp_license_type";
    public static final String CORP_TYPE = "corp_type";
    public static final String CORP_NAME = "corp_name";
    public static final String BUSINESS_CODE = "business_code";
    public static final String INSTITUTION_CODE = "institution_code";
    public static final String TAX_CODE = "tax_code";
    public static final String SOCIAL_CREDIT_CODE = "social_credit_code";
    public static final String LEGAL_NAME = "legal_name";
    public static final String LEGAL_CERT_TYPE = "legal_cert_type";
    public static final String LEGAL_CERT_ID = "legal_cert_id";
    public static final String LEGAL_MOBILE = "legal_mobile";
    public static final String CONT_NAME = "contact_name";
    public static final String CONT_MOBILE = "contact_mobile";
    public static final String CONT_EMAIL = "contact_email";
    public static final String BANK_ACCT_NAME = "bank_acct_name";
    public static final String BANK_ACCT_NO = "bank_acct_no";
    public static final String BANK_BRANCH_NAME = "bank_branch";
    public static final String BANK_PROV_ID = "bank_prov";
    public static final String BANK_AREA_ID = "bank_area";
    public static final String LEGAL_CERT_START_DATE = "legal_cert_start_date";
    public static final String LEGAL_CERT_END_DATE = "legal_cert_end_date";
    public static final String LICENSE_START_DATE = "license_start_date";
    public static final String LICENSE_END_DATE = "license_end_date";
    public static final String CORP_BUSINESS_ADDRESS = "corp_business_address";
    public static final String CORP_REG_ADDRESS = "corp_reg_address";
    public static final String CORP_FIXED_TELEPHONE = "corp_fixed_telephone";
    public static final String BUSINESS_SCOPE = "business_scope";
    public static final String CONTROLLING_SHAREHOLDER = "controlling_shareholder";
    public static final String AUDIT_STATUS = "audit_status";
    public static final String AUDIT_DESC = "audit_desc";
    public static final String INDUSTRY = "industry";
    
    /** 转账 start**/
    public static final String TANSFER_TYPE = "transfer_type";
    public static final String OUT_CUST_ID = "out_cust_id";
    public static final String OUT_ACCT_ID = "out_acct_id";
    public static final String IN_ACCT_ID = "in_acct_id";
    public static final String TRANSFER_AMT = "transfer_amt";
    /** 转账 end**/
    
    /**产品录入start**/
    public static final String PRODUCT_AMT = "product_amt";
    public static final String PRODUCT_PERIODS = "product_periods";
    public static final String PRODUCT_START_TIME = "product_start_time";
    public static final String PRODUCT_END_TIME = "product_end_time";
    public static final String PRODUCT_LOCATION = "product_location";
    /**产品录入end**/
    
    /** 充值 start **/
    public static final String RECHARGE_TYPE = "recharge_type";
    public static final String SIGN_SEQ_ID = "sign_seq_id";
    /** 充值 end **/
    
    /** 快捷支付 start **/
    
    /** 快捷支付 end **/

    public static final String TRANS_AMT = "trans_amt";
    public static final String CASH_DEDUCT_TYPE = "cash_deduct_type";
    public static final String SERV_FEE_AMT = "serv_fee_amt";
    public static final String SERV_FEE_ACCT_ID = "serv_fee_acct_id";
    public static final String FEE_OBJ = "fee_obj";
    public static final String CASH_TYPE = "cash_type";

    public static final String BG_RET_URL = "bg_ret_url";
    public static final String RET_URL = "ret_url";
    public static final String EXTENSION = "extension";
    public static final String MER_PRIV = "mer_priv";
    public static final String CHECK_VALUE = "check_value";

    public static final String BANK_NO = "bank_no";
    public static final String CARD_TYPE = "card_type";
    public static final String CARD_BIN = "card_bin";
    public static final String BANK_NAME = "bank_name";
    
    public static final String RESP_CODE = "resp_code";
    public static final String CMD_RESP_CODE = "cmd_resp_code";
    public static final String RESP_DESC = "resp_desc";

    public static final String IS_DEFAULT = "is_default";
    
    public static final String FRZ_FLAG = "frz_flag";
    
    
    
    public static final String BIND_CARD_ID = "bind_card_id";
    public static final String CASH_BIND_CARD_ID = "cash_bind_card_id";
    public static final String CREDIT_CVV2 = "credit_cvv2";
    public static final String CREDIT_VALI_DATE = "credit_vali_date";
    
    public static final String BANK_ACCT_TYPE = "bank_acct_type";
    public static final String CARD_USER_TYPE = "card_user_type";
    public static final String CARD_USER_ID = "card_user_id";
    public static final String CARD_MP = "card_mp";
    public static final String CARD_NAME = "card_name";
    public static final String BANK_CODE = "bank_code";
    public static final String GATE_ID = "gate_id";
    public static final String ROUTE_ID = "route_id";
    public static final String CHECK_TYPE = "check_type";
    public static final String PRODUCT_SEQ_ID = "product_seq_id";
    public static final String PRODUCT_SEQ_DATE = "product_seq_date";
    public static final String TRANS_ID = "trans_id";
    
    public static final String FREEZE_FG = "freeze_fg";
    public static final String ORGINAL_PLATFORM_SEQ_ID = "orginal_platform_seq_id";
    
    /** 订单解冻start **/
    public static final String SUCCESS_CNT = "success_cnt";
    public static final String SUCCESS_AMT = "success_amt";
    public static final String FAIL_CNT = "fail_cnt";
    public static final String FAIL_AMT = "fail_amt";
    public static final String FAIL_DIV_DETAIL = "fail_div_detail";
    /** 订单解冻end **/
    
    /** 个体户审核start **/
    public static final String SOLO_BUSINESS_CODE = "solo_business_code";
    
    /** 个体户审核end **/
}
