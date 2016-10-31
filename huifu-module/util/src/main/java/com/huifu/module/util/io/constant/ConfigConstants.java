package com.huifu.module.util.io.constant;

/**
 * 配置常量 从配置文件中读取的常量 全局统一配置，可用于从pyxis中读取
 * 
 * @author richard
 * @version v1.0.0
 * @since JDK 1.8
 */
public class ConfigConstants {

	/**
	 * 域名地址
	 */
	public static final String GLOBAL_MODULE_DOMAIN_URL = "domain.url.module";

	/**
	 * 静态服务器地址
	 */
	public static final String GLOBAL_STATICS_SERVER_URL = "statics.server.url";

	/**
	 * 网银支付常量
	 */
	public static final String ONLINE_RECHARGE_SYNC_RETURN_URL_KEY = "onlineRecharge.syncReturnUrl";
	public static final String ONLINE_PAY_SYNC_RETURN_PATH = "onlinePay.syncReturn";
	public static final String ONLINE_RECHARGE_SIGN_KEY_PATH = "onlineRecharge.pgPubk.key";

	public static final String APP_SMS_MERID = "app.sms.merid";

	public static final String IFS_SYSTEM_ID = "module";
	public static final String IFS_SERVER_URL = "ifs_server_url";
	public static final String PRODUCT_ID_FOR_PA = "product.id.for.pa";

	public static final String USER_TO_MER_TRANSFER_MERINFOS = "user.to.mer.transfer.merinfos";

	/**
	 * txt模板存放路径
	 */
	public static final String TXT_TEMPLATE_PATH = "txt.template.path";
	public static final String TXT_TEMPLATE_NAME_DEFAULT = "txt.template.name.default";

	/**
	 * PDF文档存放路径
	 */
	public static final String APP_PDF_PATH = "app.pdf.path";

	/**
	 * 发送邮箱
	 */
	public static final String EMAIL_FROM = "mail.from";

	/**
	 * SMTP服务器
	 */
	public static final String EMAIL_SMTP_HOST = "mail.smtp.host";
	/**
	 * SMTP服务器端口
	 */
	public static final String EMAIL_SMTP_PORT = "mail.smtp.port";
	/**
	 * SMTP服务器登录名
	 */
	public static final String EMAIL_SMTP_USERNAME = "mail.username";
	/**
	 * SMTP服务器密码
	 */
	public static final String EMAIL_SMTP_PASSWORD = "mail.password";

	/**
	 * 商户注册发送邮件，邮件模板
	 */
	public static final String EMAIL_TEMPLATE_PATH_MER_REGIST = "email.template.path.mer.regist";
	/**
	 * 密码重置，邮件模板
	 */
	public static final String EMAIL_TEMPLATE_PATH_PASSWORD_RESET = "email.template.path.password.reset";

	/**
	 * 商户控台地址
	 */
	public static final String EMAIL_MODULEMC_INDEX = "email.modulemc.index";

	/**
	 * 商户注册发送邮件，邮件标题
	 */
	public static final String EMAIL_SUBJECT_MER_REGIST = "email.subject.mer.regist";

	/**
	 * 商户密码重置发送邮件，邮件标题
	 */
	public static final String EMAIL_SUBJECT_MER_PASSWORD_RESET = "email.subject.mer.password.reset";

	public static final String EMAIL_TEMPLATE_BACKOUND_IMAGE_PATH = "email.template.background.image.path";
	public static final String EMAIL_TEMPLATE_TOP_IMAGE_PATH = "email.template.image.top.path";
	public static final String EMAIL_TEMPLATE_BOTTOM_IMAGE_PATH = "email.template.image.bottom.path";

	/**
	 * 操作日志描述文本
	 */
	public static final String OPERATELOG_MER_REGIST = "operatelog.mer.regist";
	public static final String OPERATELOG_MERINFO_UPDATE = "operatelog.mer.info.update";
	public static final String OPERATELOG_MER_PASSWORD_RESET = "operatelog.mer.password.reset";
	public static final String OPERATELOG_MERCONFIG_RSA_SET = "operatelog.merconfig.rsaset";
	public static final String OPERATELOG_MERCONFIG_INTERFACE_SET = "operatelog.merconfig.interfaceset";
	public static final String OPERATELOG_MERCONFIG_ADMIN_AUTH_SET = "operatelog.merconfig.adminauthset";
	public static final String OPERATELOG_MERCONFIG_SAVE_INFO_SET = "operatelog.merconfig.saveinfoset";
	public static final String OPERATELOG_MERCONFIG_SAVE_ROUTE_SET = "operatelog.merconfig.saverouteset";
	public static final String OPERATELOG_MERCONFIG_SAVE_CHARGE_SET = "operatelog.merconfig.savechargeset";
	public static final String OPERATELOG_MERCONFIG_CASH_INFO_SET = "operatelog.merconfig.cashinfoset";
	public static final String OPERATELOG_MERCONFIG_TRANSFER_INFO_SET = "operatelog.merconfig.transferinfoset";
	public static final String OPERATELOG_MERCONFIG_CHECK_INFO_SET = "operatelog.merconfig.checkset";
	public static final String OPERATELOG_CORP_REGIST_CHECK = "operatelog.corp.registcheck";
	public static final String OPERATELOG_SUB_ACCOUNT_ADD = "operatelog.sub.account.add";
	public static final String OPERATELOG_SUB_ACCOUNT_UPDATE = "operatelog.sub.account.update";
	public static final String OPERATELOG_SYSTEM_GLOBAL_PARAM_UPDATE = "operatelog.system.globalparamupdate";
	public static final String OPERATELOG_REALME_INFO_SET = "operatelog.realme.info.set";
	public static final String OPERATELOG_REALME_CHECKCARD_ROUTE_SET = "operatelog.realme.checkcard.route.set";
	public static final String OPERATELOG_SOLO_CHECK = "operatelog.solo.check";

	/******** MQ名称定义 ********/
	// 企业审核监听队列
	public static final String MODULE_CORP_CHECK_QUEUE = "MODULE_CORP_CHECK_QUEUE";

	// 个体户审核监听队列
	public static final String MODULE_SOLO_CHECK_QUEUE = "MODULE_SOLO_CHECK_QUEUE";

}
