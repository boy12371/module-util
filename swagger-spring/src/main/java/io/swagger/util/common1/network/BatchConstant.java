package io.swagger.util.common1.network;

public class BatchConstant {
	
	/**
	 * GLOBAL 状态
	 */
	public static final char TX_STAT_ONLINE = '1';
	public static final char TX_STAT_DAYEND = '2';
	public static final char TX_STAT_DAYCHG = '3';
	public static final char TX_STAT_BACKUP = '4';
	public static final char TX_STAT_BATCH = '5';
	public static final char TX_STAT_DAYSTART = '6';
	
	/**
     * 符号
     */
	public static final String STRING_MDOT = "`";
	public static final String STRING_COMMA = ",";
	public static final String STRING_TAB = "\t";
	public static final String STRING_VLINE = "\\|";
	public static final String STRING_CEMICOLON = ";";
	public static final String STRING_NEWLINE = "\r\n";
	public static final String STRING_BLANK = " ";
	public static final String STRING_EMPTY = "";
	
	/**
	 * 配置参数文件
	 */
	public static final String SUBB_CONFIG = "subb.properties";
	
    /**
     * 文件
     */
    public static final String IFILE = "IYYYYMMDDXXX.dat";
    public static final String IFILE_SEQ = "XXX";
    
    /**
     * 短信网关
     */
    public static final String SMS_SVR_IP = "sms.svr.ip";
    public static final String SMS_SVR_PORT = "sms.svr.port";
    public static final String SMS_SVR_TIMEOUT = "sms.svr.timeout";
    public static final String SMS_MP = "sms.mp";
    
    public static final String RTN_SMS_SVR_IP ="rtn.sms.svr.ip";
    public static final String RTN_SMS_SVR_PORT ="rtn.sms.svr.port";
    
    public static final String SMS_ORG_ID = "200019";
    
    public static final String SMS_CONFIG = "sms.properties";
    
    public static final String REPORTDIR = "00/100001";
    
    
    public static final String RPT_CONFIG = "report.properties";
    
    public static final String RPT_BASE_DIR = "RptBaseDir";
    
    /**
     * wsdl地址
     */
    public static final String WSDL_CONFIG = "facade.properties";
    public static final String WSDL_DEDUCT_IP = "wsdl.deduct.ip";
    public static final String WSDL_TRANS_IP = "wsdl.trans.ip";
    public static final String WSDL_SYSSTAT_IP = "wsdl.sysStat.ip";
    public static final String WSDL_DTACCTINFO_IP = "wsdl.dtAcctInfo.ip";
    public static final String WSDL_BALANCECK_IP = "wsdl.balanceck.ip";
    public static final String WSDL_UBSWITHHOLDPAYMENT_IP = "wsdl.ubswithholdpayment.ip";
    public static final String WSDL_BALANCEGENERALCK_IP = "wsdl.balancegeneralck.ip";
    
    /**
     * 小文件存储
     */
    public static final String VOLANS_CONFIG ="volans.properties";
    public static final String BATCH_VOLANS_APP_KEY ="batch_volans_app_key";
    public static final String BATCH_VOLANS_APP_SECURE ="batch_volans_app_secure";
    
    public static final String VOLANS_FILE_PATH ="volansFilePath";
    public static final String VOLANS_FILEID ="volansFileId";
    
    /**
     * 对账接口配置参数
     */
    public static final String APP_PROPERTIES ="app.properties";
    public static final String GA3_GET_FILE_TIMES ="GA3_GET_FILE_TIMES";
    public static final String GA3_GET_FILE_PERIOD ="GA3_GET_FILE_PERIOD";
    public static final String GA3_INNER_ACTNO_SAVE ="GA3_INNER_ACTNO_SAVE";
    
    /**
     * 查询库
     */
    public static final String INQ_DB_TYPE = "inq.jdbc.type";
    public static final String INQ_DB_DRIVER = "inq.jdbc.driver";
    public static final String INQ_DB_URL = "inq.jdbc.url";
    public static final String INQ_DB_USER = "inq.jdbc.username";
    public static final String INQ_DB_PASSWD = "inq.jdbc.password";
    public static final String INQ_DB_SCHEMA = "inq.jdbc.schema";
    public static final String INQ_DB_LOCK_TIMEOUT = "inq.jdbc.locktimeout";
    public static final String INQ_DB_ENCRYPT = "inq.jdbc.encrypt";
    
    /**
     * 结算文件生成时间
     */
    public static final String PA_STMT_FILETIME = "235959";
	public static final String FSS_VOLANS_FSS_APP_KEY = null;
	public static final String FSS_VOLANS_FSS_APP_SECURE = null;
}