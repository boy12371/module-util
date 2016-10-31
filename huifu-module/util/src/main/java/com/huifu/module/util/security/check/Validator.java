package com.huifu.module.util.security.check;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.huifu.module.util.enums.biz.DcFlagEnum;
import com.huifu.module.util.enums.util.FlagEnum;
import com.huifu.module.util.format.time.DateUtils;
import com.huifu.module.util.io.constant.SystemConstants;
import com.huifu.saturn.model.Money;

/**
 * 
 * 校验工具类
 * 
 * @author richard
 * @version v1.0.0
 * @since JDK 1.8
 */
public class Validator {

	public final static String YUAN_FORMAT = "[\\d]+\\.[\\d]{2}";

	/**
	 * 利用正则表达式检查是否完整匹配
	 * 
	 * @param text
	 * @param reg
	 * @return
	 */
	public static final boolean isRegexMatch(String text, String reg) {
		if (StringUtils.isNotEmpty(text) && StringUtils.isNotBlank(reg)) {
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(text);
			return m.matches();
		}
		return false;
	}

	/**
	 * 判断汉字和字符串的字节
	 * 
	 * @param fld
	 * @param leng
	 * @return
	 */
	public static boolean lessThanMaxLength(String fld, int leng) {
		int len = fld.length();
		int bytes = len;
		Boolean pass;

		/* if the input text has chinese word , process it as two bytes */
		for (int i = 0; i < len; i++) {
			if (fld.charAt(i) < 0 || fld.charAt(i) > 255) {
				bytes++;
			}
		}

		if (bytes <= leng) {
			pass = true;
		} else {
			pass = false;
		}

		return pass;

	}

	/**
	 * 判断参数str不为空并且小于等于要求的最大长度
	 * 
	 * @param str
	 * @param maxLength
	 * @return
	 */
	public static boolean notNullAndLessEqualThanMaxLength(String str, int maxLength) {

		if (StringUtils.isBlank(str)) {
			return false;
		}
		return str.getBytes().length <= maxLength;
	}

	/**
	 * 判断参数str不为空并且等于要求的最大长度
	 * 
	 * @param str
	 * @param length
	 * @return boolean
	 */
	public static boolean notNullAndEqualLength(String str, int length) {

		if (StringUtils.isBlank(str)) {
			return false;
		}
		return str.getBytes().length == length;
	}

	/**
	 * 判断参数str可以为空若是不为空则判断长度
	 * 
	 * @param str
	 * @param length
	 * @return boolean
	 */
	public static boolean nullOrEqualLength(String str, int length) {

		if (StringUtils.isBlank(str)) {
			return true;
		}
		return str.getBytes().length == length;
	}

	/**
	 * 判断参数str可以为空若是不为空则判断长度
	 * 
	 * @param str
	 * @param maxLength
	 * @return
	 */
	public static boolean nullOrLessEqualThanMaxLength(String str, int maxLength) {
		if (StringUtils.isBlank(str)) {
			return true;
		}
		return str.getBytes().length <= maxLength;
	}

	/**
	 * 
	 * @param orderAmount
	 * @return
	 */
	public static boolean lessEqualThanZero(String orderAmount) {
		return new Money(orderAmount).compareTo(new Money(0)) <= 0;
	}

	// --------------------------- 业务方法 ------------------------------//

	/**
	 * 判断手机号是否为以1开头的11位数字
	 * 
	 * @param mobile
	 * @return boolean
	 */
	public static final boolean isMobileFormat(String mobile) {
		return isRegexMatch(mobile, "^((\\(\\d{2,3}\\))|(\\d{3}\\-))?1\\d{10}$");

	}

	/**
	 * 判断用户姓名是否小于50位 false 为大于50位
	 * 
	 * @param usrName
	 * @return boolean
	 */
	public static final boolean isUsrNameFormat(String usrName) {
		return lessThanMaxLength(usrName, 50);
	}

	/**
	 * 判断email格式是否正确
	 * 
	 * @param email
	 * @return boolean
	 */
	public static final boolean isEmailFormat(String email) {
		return isRegexMatch(email, "^([a-zA-Z0-9_\\.\\-]+)(@{1})([a-zA-Z0-9_\\.\\-]+)(\\.[a-zA-Z0-9]{1,3})$");
	}

	/**
	 * 判断身份证号是否正确,只支持18位,允许以x/X结尾
	 * 
	 * @param certId
	 * @return boolean
	 */
	public static final boolean isCertIdFormat(String certId) {
		return isRegexMatch(certId, "\\d{17}[\\dXx]");
	}

	/**
	 * 判断订单号不能为空且最大长度不超过20位
	 * 
	 * @param ordId
	 * @return boolean
	 */
	public static final boolean isValidOrdId(String ordId) {
		return isRegexMatch(ordId, "(^[a-zA-Z0-9]{0,20}$)");
	}

	/**
	 * 账户号不能为空且最大长度不超过20位
	 * 
	 * @param ordId
	 * @return boolean
	 */
	public static final boolean isValidAcctId(String acctId) {
		return notNullAndLessEqualThanMaxLength(acctId, 9);
	}

	/**
	 * 判断商户/用户客户号不能为空且长度为16位的数字 格式正确，返回true
	 * 
	 * @param custId
	 * @return boolean
	 */
	public static final boolean isValidCustId(String custId) {
		return notNullAndEqualLength(custId, 16) && isDigit(custId);
	}

	/**
	 * 判断短信验证码不能为空且长度为6位的数字
	 * 
	 * @param smsCode
	 * @return boolean
	 */
	public static final boolean isSmsCode(String smsCode) {
		return notNullAndEqualLength(smsCode, 6) && isDigit(smsCode);
	}

	/**
	 * 判断字符窜是否全是数字组合
	 * 
	 * @param s
	 * @return boolean
	 */
	public static boolean isDigit(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < '0' || c > '9')
				return false;
		}
		return true;
	}

	/**
	 * 判断八位日期类型
	 * 
	 * @param str
	 * @return boolean
	 */
	public static Boolean isDate(String str) {
		if (StringUtils.isBlank(str)) {
			return false;
		}
		if (!(str.length() == 8)) {
			return false;
		}
		if (!Validator.isDigit(str)) {
			return false;
		}
		Boolean flag1 = false;
		Boolean flag2 = false;

		if (str.charAt(4) == '0') {
			if ('0' < str.charAt(5) && str.charAt(5) <= '9') {
				flag1 = true;
			}
		} else if (str.charAt(4) == '1') {
			if ('0' <= str.charAt(5) && str.charAt(5) <= '2') {
				flag1 = true;
			}
		}
		if ('0' == str.charAt(6)) {
			if ('0' < str.charAt(7) && str.charAt(7) <= '9') {
				flag2 = true;
			}
		} else if (str.charAt(6) == '1' || str.charAt(6) == '2') {
			if ('0' <= str.charAt(7) && str.charAt(7) <= '9') {
				flag2 = true;
			}
		} else if ('3' == str.charAt(6)) {
			if ('1' == str.charAt(7) || '0' == str.charAt(7)) {
				flag2 = true;
			}
		}
		if (flag1 && flag2) {
			return true;
		}
		return false;
	}

	/**
	 * 判断八位日期类型yyyyMMdd
	 * 
	 * @param date
	 * @return boolean
	 */
	public static boolean isValidDate(String date) {
		try {
			if (!Validator.notNullAndEqualLength(date, SystemConstants.ORD_DATE_REQUIRED_LENGTH)
					|| !Validator.isDigit(date)) {
				return false;
			}
			DateUtils.parseMailDateDtPartStringNew(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * 判断八位日期类型yyyyMMddHHmmss
	 * 
	 * @param date
	 * @return boolean
	 */
	public static boolean isValidFullDate(String date) {
		try {
			if (!Validator.notNullAndEqualLength(date, SystemConstants.AMOUNT_MAX_LENGTH) || !Validator.isDigit(date)) {
				return false;
			}
			DateUtils.parseMailDatePartStringNew(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * 判断证件结束日期包括永久汉字
	 * 
	 * @param endDate
	 * @return boolean
	 */
	public static boolean isValidEndDate(String endDate) {
		if (isValidDate(endDate)) {
			return true;
		}
		if (StringUtils.isNotBlank(endDate) && SystemConstants.PERMANENT_DATE_C.equals(endDate)) {
			return true;
		}
		return false;
	}

	/**
	 * 是否是合法的金额格式
	 * 
	 * ValidateUtils.isValidMoney(null) = false ValidateUtils.isValidMoney(" ")
	 * = false ValidateUtils.isValidMoney("") = false
	 * ValidateUtils.isValidMoney("ab") = false
	 * ValidateUtils.isValidMoney("12.00") = true
	 * ValidateUtils.isValidMoney("12") = false
	 * ValidateUtils.isValidMoney("12.") = false
	 * ValidateUtils.isValidMoney("12.0") = false
	 * ValidateUtils.isValidMoney("12.254") = false
	 * ValidateUtils.isValidMoney("0.56") = true
	 * ValidateUtils.isValidMoney("1b.56") = false
	 * 
	 * @param orderAmount
	 * @return
	 */
	public static boolean isValidMoney(String orderAmount) {
		if (!notNullAndLessEqualThanMaxLength(orderAmount, SystemConstants.AMOUNT_MAX_LENGTH)) {
			return false;
		}
		if (!isYuanAmount(orderAmount)) {
			return false;
		}
		if (lessEqualThanZero(orderAmount)) {
			return false;
		}
		return true;
	}

	/**
	 * 金额是否匹配形如："12.00"
	 * 
	 * @param amount
	 * @return "", "12", "12.000" 返回false; "0.00" 返回true
	 */
	public static boolean isYuanAmount(String amount) {
		if (StringUtils.isBlank(amount)) {
			return false;
		}
		if (!isRegexMatch(amount, YUAN_FORMAT)) {
			return false;
		}
		return true;
	}

	/**
	 * 判断bankId不能为空且最大长度不超过8位
	 * 
	 * @param ordId
	 * @return boolean
	 */
	public static final boolean isValidBankId(String bankId) {
		return isRegexMatch(bankId, "(^[a-zA-Z0-9]{0,8}$)");
	}

	/**
	 * 判断是否正确银行卡号9-32位
	 */
	public static final boolean isValidCardNo(String cardNo) {
		return isRegexMatch(cardNo, "(^[0-9]{9,32}$)");
	}

	/**
	 * 判断后台返回地址格式是否非法，不可为空且长度不超过128位
	 * 
	 * @param bgRetUrl
	 * @return
	 */
	public static final boolean isValidBgRetUrl(String bgRetUrl) {
		return notNullAndLessEqualThanMaxLength(bgRetUrl, 128);
	}

	/**
	 * merPriv = ""; true merPriv = " "; true merPriv = null; true
	 * 判断私有域可为空且最大长度不超过120位
	 * 
	 * @param ordId
	 * @return boolean
	 */
	public static final boolean isMerPriv(String merPriv) {
		if (StringUtils.isBlank(merPriv)) {
			return true;
		}
		return notNullAndLessEqualThanMaxLength(merPriv, 120);
	}

	/**
	 * extension = ""; true extension = " "; true extension = null; true
	 * 判断扩展域可为空且最大长度不超过512位
	 * 
	 * @param ordId
	 * @return boolean
	 */
	public static final boolean isExtension(String extension) {
		if (StringUtils.isBlank(extension)) {
			return true;
		}
		return notNullAndLessEqualThanMaxLength(extension, 512);
	}

	/**
	 * 是否借贷记标志
	 * 
	 * @param dcFlag
	 * @return
	 */
	public static final boolean isValidDcFlag(String dcFlag) {
		if (DcFlagEnum.DEBIT.getCode().equals(dcFlag) || DcFlagEnum.CREDIT.getCode().equals(dcFlag)) {
			return true;
		}
		return false;
	}

	/**
	 * 是否省份地区
	 * 
	 * @param provOrAreaId
	 * @return
	 */
	public static final boolean isValidProvOrArea(String provOrAreaId) {
		return notNullAndEqualLength(provOrAreaId, 4) && isDigit(provOrAreaId);
	}

	/**
	 * 是否正常标志位
	 * 
	 * @param flag
	 * @return
	 */
	public static final boolean isValidFlag(String flag) {
		return FlagEnum.NORMAL.getDictCode().equals(flag) || FlagEnum.CLOSE.getDictCode().equals(flag);
	}

	/**
	 * 判断四位日期类型yymm
	 * 
	 * @param str
	 * @return boolean
	 */
	public static Boolean isFourDate(String str) {
		if (StringUtils.isBlank(str)) {
			return false;
		}
		if (!(str.length() == 4)) {
			return false;
		}
		if (!Validator.isDigit(str)) {
			return false;
		}
		Boolean flag1 = false;

		if (str.charAt(2) == '0') {
			if ('0' < str.charAt(3) && str.charAt(3) <= '9') {
				flag1 = true;
			}
		} else if (str.charAt(2) == '1') {
			if ('0' <= str.charAt(3) && str.charAt(3) <= '2') {
				flag1 = true;
			}
		}
		if (flag1) {
			return true;
		}
		return false;
	}

	/**
	 * 判断是否是合法的卡业务类型（非空且只有一位，合法值0，1，2）
	 * 
	 * @param ordId
	 * @return boolean
	 */
	public static final boolean isValidCardBussType(String cardBussType) {
		return isRegexMatch(cardBussType, "(^[0,1,2]{1}$)");
	}

	/**
	 * 判断不为空且长度不大于length位的数字
	 * 
	 * @param num
	 * @param length
	 * @return boolean
	 */
	public static final boolean isValidNum(String num, int length) {
		return notNullAndLessEqualThanMaxLength(num, length) && isDigit(num);
	}

	/**
	 * 判断不为空且长度等于length位的数字
	 * 
	 * @param num
	 * @param length
	 * @return boolean
	 */
	public static final boolean isValidNumEqual(String num, int length) {
		return notNullAndEqualLength(num, length) && isDigit(num);
	}

	/**
	 * 判断不为空且符合手机格式
	 * 
	 * @param mobile
	 * @return boolean
	 */
	public static final boolean isValidMobile(String mobile) {
		if (StringUtils.isBlank(mobile)) {
			return false;
		}
		return isMobileFormat(mobile);
	}

	/**
	 * 判断不为空且不大于50个字符的邮箱格式
	 * 
	 * @param email
	 * @return boolean
	 */
	public static final boolean isValidemail(String email) {
		return notNullAndLessEqualThanMaxLength(email, 50) && isEmailFormat(email);
	}

	/**
	 * 判断不为空且不大于200个字符的网址格式
	 * 
	 * @param webUrl
	 * @return boolean
	 */
	public static final boolean isValidWebUrl(String webUrl) {
		return notNullAndLessEqualThanMaxLength(webUrl, 200);
	}

	/**
	 * 判断不为空且为八位日期格式
	 * 
	 * @param effectDate
	 * @return boolean
	 */
	public static final boolean isValidEffectDate(String effectDate) {
		return notNullAndEqualLength(effectDate, 8) && isValidDate(effectDate);
	}

	/**
	 * 判断不为空且为18位身份证号
	 * 
	 * @param certId
	 * @return boolean
	 */
	public static final boolean isValidCertId(String certId) {
		return notNullAndEqualLength(certId, 18) && isCertIdFormat(certId);
	}

	/**
	 * 判断不为空且长度大于8小于18位 代扣签约流水号
	 * 
	 * @param signSeqId
	 * @return
	 */
	public static final boolean isValidSignSeqId(String signSeqId) {
		return isRegexMatch(signSeqId, "(^[0-9]{9,18}$)");
	}
}
