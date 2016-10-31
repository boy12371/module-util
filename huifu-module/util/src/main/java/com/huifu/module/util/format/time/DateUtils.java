package com.huifu.module.util.format.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.huifu.module.util.io.constant.SystemConstants;
import com.huifu.module.util.io.constant.TimeConstants;

/**
 * 
 * 时间工具类
 * 
 * @author richard
 * @version v1.0.0
 * @since JDK 1.8
 */
public class DateUtils {
	private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

	/**
	 * 获取当前日期类型时间
	 */
	public static Date getNow() {
		// Object b = SpringUtils.getSpringBeanById("generalDao");
		// Assert.notNull(b);
		// GeneralDao g = (GeneralDao)b;
		// return g.getDbTime();
		return new Date();
	}

	/**
	 * 获取当前时间戳
	 */
	public static long getNowTimestamp() {
		return getNow().getTime();
	}

	/**
	 * 获取当前日期 yyyyMMdd
	 */
	public static String getCurrentDate() {
		return toMailDateDtPartString(getNow());
	}

	/**
	 * 获取当期时间HHmmss
	 * 
	 * @return
	 */
	public static String getCurrentTime() {
		return toMailTimeTmPartString(getNow());
	}

	/**
	 * 获取当期时间MM月dd日HH:mm
	 * 
	 * @return
	 */
	public static String getCurrentMmDdHmTime() {
		return toMailDtmPart(getNow());
	}

	/**
	 * 获取当前日期和时间yyyyMMddHHmmss
	 * 
	 * @return
	 */
	public static String getCurrentDateTime() {
		return toMailDateString(getNow());
	}

	/**
	 * 获取当前日期和时间yyyyMMddHHmmssSSS
	 * 
	 * @return
	 */
	public static String getCurrentMiTime() {
		return toFullDateCompactString(getNow());
	}

	/**
	 * 将一个日期型转换为指定格式字串
	 * 
	 * @param aDate
	 * @param formatStr
	 * @return
	 */
	public static final String toFormatDateString(Date aDate, String formatStr) {
		if (aDate == null)
			return StringUtils.EMPTY;
		Assert.hasText(formatStr);
		return new SimpleDateFormat(formatStr).format(aDate);

	}

	/**
	 * 将一个日期型转换为'yyyy-MM-dd'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toShortDateString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.SHORT_DATE_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyyMMdd'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toMailDateDtPartString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.MAIL_DATE_DT_PART_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyyMMdd'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toMothPartString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.MAIL_MOUTH_DT_PART_FORMAT);
	}

	/**
	 * 将一个日期型转换为'HHmmss'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toMailTimeTmPartString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.MAIL_TIME_TM_PART_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyyMMddHHmmss'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toMailDateString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.MAIL_DATE_FORMAT);
	}

	/**
	 * 将一个日期型转换为MM月dd日HH:mm格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toMailDtmPart(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.MAIL_DATA_DTM_PART_FORMAT);
	}

	/**
	 * 将一个日期型转换为yyyy.MM.dd格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toPointDtmPart(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.POINT_DATA_DTM_PART_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyy-MM-dd HH:mm:ss'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toLongDateString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.LONG_DATE_FORMAT);
	}

	/**
	 * 将一个日期型转换为'HH:mm:ss'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toLongDateTmPartString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.LONG_DATE_TM_PART_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyy年MM月dd日'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toShortDateGBKString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.SHORT_DATE_GBK_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyy年MM月dd日 HH时mm分'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toDateGBKString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.DATE_GBK_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyy年MM月dd日 HH时mm分ss秒'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toLongDateGBKString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.LONG_DATE_GBK_FORMAT);
	}

	/**
	 * 将一个日期型转换为'HH时mm分ss秒'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toLongDateTmPartGBKString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.Long_DATE_TM_PART_GBK_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyy-MM-dd HH:mm:ss:SSS'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toFullDateString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.FULL_DATE_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyy年MM月dd日 HH时mm分ss秒SSS毫秒'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toFullDateGBKString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.FULL_DATE_GBK_FORMAT);
	}

	/**
	 * 将一个日期型转换为'yyyyMMddHHmmssSSS'格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toFullDateCompactString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.FULL_DATE_COMPACT_FORMAT);
	}

	/**
	 * 将一个日期型转换为LDAP格式字串
	 * 
	 * @param aDate
	 * @return
	 */
	public static final String toLDAPDateString(Date aDate) {
		return toFormatDateString(aDate, TimeConstants.LDAP_DATE_FORMAT);
	}

	/**
	 * 将一个符合指定格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @param formatter
	 * @return
	 * @throws ParseException
	 */
	public static final Date parser(String aDateStr, String formatter) throws ParseException {
		if (StringUtils.isBlank(aDateStr))
			return null;
		Assert.hasText(formatter);
		SimpleDateFormat sdf = new SimpleDateFormat(formatter);
		return sdf.parse(aDateStr);

	}

	/**
	 * 严格校验传入格式的字符串是否能转换为日期类型
	 * 
	 * @param aDateStr
	 * @param formatter
	 * @return
	 * @throws ParseException
	 */
	public static final Date parserNew(String aDateStr, String formatter) throws ParseException {
		if (StringUtils.isBlank(aDateStr))
			return null;
		Assert.hasText(formatter);
		SimpleDateFormat sdf = new SimpleDateFormat(formatter);
		sdf.setLenient(false);
		return sdf.parse(aDateStr);

	}

	/**
	 * 将一个符合'yyyy-MM-dd HH:mm:ss'格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseLongDateString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.LONG_DATE_FORMAT);

	}

	/**
	 * 将一个符合'yyyy-MM-dd HH:mm:ss'格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseLongDateDtPartString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.LONG_DATE_FORMAT);

	}

	/**
	 * 将一个符合'yyyy-MM-dd HH:mm:ss'格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseLongDateTmPartString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.LONG_DATE_FORMAT);

	}

	/**
	 * 将一个符合'yyyy-MM-dd'格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseShortDateString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.SHORT_DATE_FORMAT);

	}

	/**
	 * 将一个符合'yyyyMMddHHmmss'格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseMailDateString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.MAIL_DATE_FORMAT);

	}

	/**
	 * 将一个符合'yyyyMMdd'格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseMailDateDtPartString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.MAIL_DATE_DT_PART_FORMAT);
	}

	/**
	 * 将一个符合'yyyyMMdd'格式的字串解析成日期型, 严格解析日期逻辑 如“20150132”会报错
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseMailDateDtPartStringNew(String aDateStr) throws ParseException {
		return parserNew(aDateStr, TimeConstants.MAIL_DATE_DT_PART_FORMAT);
	}

	/**
	 * 将一个符合'yyyyMMdd'格式的字串解析成日期型, 严格解析日期逻辑 如“20150132”会报错
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseMailDatePartStringNew(String aDateStr) throws ParseException {
		return parserNew(aDateStr, TimeConstants.MAIL_DATE_FORMAT);
	}

	/**
	 * 将一个符合'HHmmss'格式的字串解析成日期型
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static final Date parseMailDateTmPartString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.MAIL_TIME_TM_PART_FORMAT);
	}

	/**
	 * 将一个符合'yyyy-MM-dd HH:mm:ss:SSS'格式的字串解析成日期型
	 * 
	 * @param strDate
	 * @return
	 */
	public static final Date parseFullDateString(String aDateStr) throws ParseException {
		return parser(aDateStr, TimeConstants.FULL_DATE_FORMAT);

	}

	/**
	 * 将一个符合'yyyy-MM-dd'、'yyyy-MM-dd HH:mm:ss'或'EEE MMM dd HH:mm:ss zzz
	 * yyyy'格式的字串解析成日期型， 如果为blank则返回空，如果不为blank又不符合格式则报错
	 * 
	 * @param aDateStr
	 * @return
	 */
	public static Date parseDateString(String aDateStr) {
		Date ret = null;
		if (StringUtils.isNotBlank(aDateStr)) {
			try {
				if (DataValidator.isShortDateStr(aDateStr)) {
					ret = DateUtils.parseShortDateString(aDateStr);
				} else if (DataValidator.isLongDateStr(aDateStr)) {
					ret = DateUtils.parseLongDateString(aDateStr);
				} else if (DataValidator.isDateStrMatched(aDateStr, TimeConstants.DEFAULT_DATE_FORMAT)) {
					ret = DateUtils.parser(aDateStr, TimeConstants.DEFAULT_DATE_FORMAT);
				} else {
					throw new IllegalArgumentException("date format mismatch");
				}
			} catch (ParseException e) {
				logger.error("发生错误原因：", e);
			}
		}
		return ret;
	}

	/**
	 * 转换日期格式 yyyy-MM-dd => yyyyMMdd
	 * 
	 * @param dt
	 *            yyyy-MM-dd
	 * @return yyyyMMdd
	 */
	public static String transfer2ShortDate(String dt) {
		if (dt == null || dt.length() != 10) {
			return dt;
		}
		Assert.notNull(dt);
		String[] tmp = StringUtils.split(dt, SystemConstants.DASH);
		Assert.isTrue(tmp != null && tmp.length == 3);
		return tmp[0].concat(StringUtils.leftPad(tmp[1], 2, "0")).concat(StringUtils.leftPad(tmp[2], 2, "0"));
	}

	/**
	 * 转换日期格式 yyyyMMdd HH:mm:ss => yyyy-MM-dd HH:mm:ss
	 * 
	 * @param dt
	 *            yyyyMMdd
	 * @param tm
	 *            HHmmss
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String transfer2LongDatePart(String dt, String tm) {
		return DateUtils.transfer2LongDateDtPart(dt).concat(SystemConstants.BLANK)
				.concat(DateUtils.transfer2LongDateTmPart(tm));
	}

	/**
	 * 转换日期格式 yyyyMMdd => yyyy-MM-dd
	 * 
	 * @param dt
	 *            yyyyMMdd
	 * @return yyyy-MM-dd
	 */
	public static String transfer2LongDateDtPart(String dt) {
		if (dt == null || dt.length() != 8) {
			return dt;
		}
		Assert.notNull(dt);
		Assert.isTrue(dt.length() == 8);
		return dt.substring(0, 4).concat(SystemConstants.DASH).concat(dt.substring(4, 6)).concat(SystemConstants.DASH)
				.concat(dt.substring(6));
	}

	/**
	 * 转换日期格式 HHmmss => HH:mm:ss
	 * 
	 * @param tm
	 *            HHmmss
	 * @return HH:mm:ss
	 */
	public static String transfer2LongDateTmPart(String tm) {
		if (tm == null || tm.length() != 6) {
			return tm;
		}
		Assert.notNull(tm);
		Assert.isTrue(tm.length() == 6);
		return tm.substring(0, 2).concat(SystemConstants.COLON).concat(tm.substring(2, 4)).concat(SystemConstants.COLON)
				.concat(tm.substring(4));
	}

	/**
	 * 转换日期格式 yyyyMMdd => yyyy年MM月dd日
	 * 
	 * @param dt
	 *            yyyyMMdd
	 * @return yyyy年MM月dd日
	 */
	public static String transfer2LongDateGbkDtPart(String dt) {
		if (dt == null || dt.length() != 8) {
			return dt;
		}
		Assert.notNull(dt);
		Assert.isTrue(dt.length() == 8);
		return dt.substring(0, 4).concat("年").concat(dt.substring(4, 6)).concat("月").concat(dt.substring(6))
				.concat("日");
	}

	/**
	 * 转换日期格式 yyyyMMdd => yyyy/MM/dd
	 * 
	 * @param dt
	 *            yyyyMMdd
	 * @return yyyy年MM月dd日
	 */
	public static String transfer2LongDate(String dt) {
		if (dt == null || dt.length() != 8) {
			return dt;
		}
		Assert.notNull(dt);
		Assert.isTrue(dt.length() == 8);
		return dt.substring(0, 4).concat("-").concat(dt.substring(4, 6)).concat("-").concat(dt.substring(6));
	}

	/**
	 * 转换日期格式HHmmss => HH时mm分ss秒
	 * 
	 * @param tm
	 *            HHmmss
	 * @return HH时mm分ss秒
	 */
	public static String transfer2LongDateGbkTmPart(String tm) {
		if (tm == null || tm.length() != 6) {
			return tm;
		}
		Assert.notNull(tm);
		Assert.isTrue(tm.length() == 6);
		return tm.substring(0, 2).concat("时").concat(tm.substring(2, 4)).concat("分").concat(tm.substring(4))
				.concat("秒");
	}

	/**
	 * 为一个日期加上指定年数
	 * 
	 * @param aDate
	 * @param amount
	 *            年数
	 * @return
	 */
	public static final Date addYears(Date aDate, int amount) {
		return addTime(aDate, Calendar.YEAR, amount);
	}

	/**
	 * 为一个日期加上指定月数
	 * 
	 * @param aDate
	 * @param amount
	 *            月数
	 * @return
	 */
	public static final Date addMonths(Date aDate, int amount) {
		return addTime(aDate, Calendar.MONTH, amount);
	}

	/**
	 * 为一个日期加上指定天数
	 * 
	 * @param aDate
	 * @param amount
	 *            天数
	 * @return
	 */
	public static final Date addDays(Date aDate, int amount) {
		return addTime(aDate, Calendar.DAY_OF_YEAR, amount);
	}

	/**
	 * 为一个日期加上指定天数
	 * 
	 * @param aDate
	 *            yyyyMMdd格式字串
	 * @param amount
	 *            天数
	 * @return
	 */
	public static final String addDays(String aDate, int amount) {
		try {
			return DateUtils.toMailDateDtPartString(
					addTime(DateUtils.parseMailDateDtPartString(aDate), Calendar.DAY_OF_YEAR, amount));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 为一个日期加上指定小时数
	 * 
	 * @param aDate
	 * @param amount
	 *            小时数
	 * @return
	 */
	public static final Date addHours(Date aDate, int amount) {
		return addTime(aDate, Calendar.HOUR, amount);

	}

	/**
	 * 为一个日期加上指定分钟数
	 * 
	 * @param aDate
	 * @param amount
	 *            分钟数
	 * @return
	 */
	public static final Date addMinutes(Date aDate, int amount) {
		return addTime(aDate, Calendar.MINUTE, amount);
	}

	/**
	 * 为一个日期加上指定秒数
	 * 
	 * @param aDate
	 * @param amount
	 *            秒数
	 * @return
	 */
	public static final Date addSeconds(Date aDate, int amount) {
		return addTime(aDate, Calendar.SECOND, amount);

	}

	private static final Date addTime(Date aDate, int timeType, int amount) {
		if (aDate == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(aDate);
		cal.add(timeType, amount);
		return cal.getTime();
	}

	/**
	 * 得到当前时间的UTC时间
	 * 
	 * @return
	 */
	public static final String getUTCTime() {
		return getSpecifiedZoneTime(Calendar.getInstance().getTime(), TimeZone.getTimeZone("GMT+0"));
	}

	/**
	 * 得到指定时间的UTC时间
	 * 
	 * @param aDate
	 *            时间戳
	 * @return yyyy-MM-dd HH:mm:ss 格式
	 */
	public static final String getUTCTime(Date aDate) {
		return getSpecifiedZoneTime(aDate, TimeZone.getTimeZone("GMT+0"));
	}

	/**
	 * 得到当前时间的指定时区的时间
	 * 
	 * @param tz
	 * @return
	 */
	public static final String getSpecifiedZoneTime(TimeZone tz) {
		return getSpecifiedZoneTime(Calendar.getInstance().getTime(), tz);

	}

	/**
	 * 得到指定时间的指定时区的时间
	 * 
	 * @param aDate
	 *            时间戳,Date是一个瞬间的long型距离历年的位移偏量，
	 *            在不同的指定的Locale/TimeZone的jvm中，它toString成不同的显示值，
	 *            所以没有必要为它再指定一个TimeZone变量表示获取它时的jvm的TimeZone
	 * 
	 * @param tz
	 *            要转换成timezone
	 * 
	 * @return yyyy-MM-dd HH:mm:ss 格式
	 */
	public static final String getSpecifiedZoneTime(Date aDate, TimeZone tz) {
		if (aDate == null)
			return StringUtils.EMPTY;
		Assert.notNull(tz);
		SimpleDateFormat sdf = new SimpleDateFormat(TimeConstants.LONG_DATE_FORMAT);
		sdf.setTimeZone(tz);
		return sdf.format(aDate);
	}

	/**
	 * 计算两个日期之间相差的月数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static final int getDifferenceMonths(Date startDate, Date endDate) {
		Assert.notNull(startDate);
		Assert.notNull(endDate);
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(startDate);
		Calendar endCal = Calendar.getInstance();
		endCal.setTime(endDate);

		return Math.abs((startCal.get(Calendar.YEAR) - endCal.get(Calendar.YEAR)) * 12
				+ (startCal.get(Calendar.MONTH) - endCal.get(Calendar.MONTH)));
	}

	/**
	 * 计算两个日期之间相差的月数
	 * 
	 * @param startDateStr
	 *            yyyy-mm-dd
	 * @param endDateStr
	 *            yyyy-mm-dd
	 * @return
	 */
	public static final int getDifferenceMonths(String startDateStr, String endDateStr) {
		DataValidator.checkShortDateStr(startDateStr);
		DataValidator.checkShortDateStr(endDateStr);
		try {
			return getDifferenceMonths(parseShortDateString(startDateStr), parseShortDateString(endDateStr));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param startDateStr
	 *            yyyy-mm-dd
	 * @param endDateStr
	 *            yyyy-mm-dd
	 * @return
	 */
	public static final int getDifferenceDays(String startDateStr, String endDateStr) {
		return Double.valueOf(getDifferenceMillis(startDateStr, endDateStr) / (TimeConstants.NANO_ONE_DAY)).intValue();
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param startDateStr
	 *            yyyymmdd
	 * @param endDateStr
	 *            yyyymmdd
	 * @return
	 */
	public static final int getDifferenceDays2(String startDateStr, String endDateStr) {
		return Double.valueOf(getDifferenceMillis(startDateStr, endDateStr, TimeConstants.MAIL_DATE_DT_PART_FORMAT)
				/ (TimeConstants.NANO_ONE_DAY)).intValue();
	}

	/**
	 * 两个日期之间相减（存在负数）
	 * 
	 * @param startDateStr
	 *            yyyy-mm-dd
	 * @param endDateStr
	 *            yyyy-mm-dd
	 * @return
	 */
	public static final int getDaysSubtract(String startDateStr, String endDateStr) {
		return Double.valueOf(getDaysSubtractMillis(startDateStr, endDateStr) / (TimeConstants.NANO_ONE_DAY))
				.intValue();
	}

	/**
	 * 两个日期之间相减（存在负数）
	 * 
	 * @param startDateStr
	 *            yyyymmdd
	 * @param endDateStr
	 *            yyyymmdd
	 * @return
	 */
	public static final int getDaysSubtract2(String startDateStr, String endDateStr) {
		return Double.valueOf(getDaysSubtractMillis(startDateStr, endDateStr, TimeConstants.MAIL_DATE_DT_PART_FORMAT)
				/ (TimeConstants.NANO_ONE_DAY)).intValue();
	}

	/**
	 * 两个日期之间相减（存在负数）
	 * 
	 * @param startDateStr
	 *            yyyy-mm-dd
	 * @param endDateStr
	 *            yyyy-mm-dd
	 * @return
	 * @throws ParseException
	 */
	public static final long getDaysSubtractMillis(String startDateStr, String endDateStr) {
		return getDaysSubtractMillis(startDateStr, endDateStr, TimeConstants.SHORT_DATE_FORMAT);
	}

	/**
	 * 计算两个日期之间相差的的毫秒数（存在负数）
	 * 
	 * @param startDateStr
	 * @param endDateStr
	 * @param dateFormat
	 * @return
	 */
	public static final long getDaysSubtractMillis(String startDateStr, String endDateStr, String dateFormat) {
		try {
			return getDaysSubtractMillis(parser(startDateStr, dateFormat), parser(endDateStr, dateFormat));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 计算两个日期之间相差的的毫秒数（存在负数）
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static final long getDaysSubtractMillis(Date startDate, Date endDate) {
		Assert.notNull(startDate);
		Assert.notNull(endDate);
		return endDate.getTime() - startDate.getTime();
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static final int getDifferenceDays(Date startDate, Date endDate) {
		return Double.valueOf(getDifferenceMillis(startDate, endDate) / (TimeConstants.NANO_ONE_DAY)).intValue();

	}

	/**
	 * 计算两个日期之间相差的的毫秒数
	 * 
	 * @param startDateStr
	 *            yyyy-mm-dd
	 * @param endDateStr
	 *            yyyy-mm-dd
	 * @return
	 * @throws ParseException
	 */
	public static final long getDifferenceMillis(String startDateStr, String endDateStr) {
		return getDifferenceMillis(startDateStr, endDateStr, TimeConstants.SHORT_DATE_FORMAT);
	}

	/**
	 * 计算两个日期之间相差的的毫秒数
	 * 
	 * @param startDateStr
	 *            yyyyMMddHHmmss
	 * @param endDateStr
	 *            yyyyMMddHHmmss
	 * @return
	 * @throws ParseException
	 */
	public static final long getDifferenceMillis2(String startDateStr, String endDateStr) {
		return getDifferenceMillis(startDateStr, endDateStr, TimeConstants.MAIL_DATE_FORMAT);
	}

	/**
	 * 计算两个日期之间相差的的毫秒数
	 * 
	 * @param startDateStr
	 * @param endDateStr
	 * @param dateFormat
	 * @return
	 */
	public static final long getDifferenceMillis(String startDateStr, String endDateStr, String dateFormat) {
		try {
			return getDifferenceMillis(parser(startDateStr, dateFormat), parser(endDateStr, dateFormat));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 计算两个日期之间相差的的毫秒数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static final long getDifferenceMillis(Date startDate, Date endDate) {
		Assert.notNull(startDate);
		Assert.notNull(endDate);
		return Math.abs(endDate.getTime() - startDate.getTime());
	}

	/**
	 * 检验 日期是否在指定区间内，如果格式错误，返回false
	 * 
	 * 如果maxDateStr或minDateStr为空则比较时变为正负无穷大，如果都为空，则返回false
	 * 
	 * @param aDate
	 * @param minDateStr
	 *            必须是yyyy-MM-dd格式，时分秒为00:00:00
	 * @param maxDateStr
	 *            必须是yyyy-MM-dd格式，时分秒为00:00:00
	 * @return
	 */
	public static final boolean isDateBetween(Date aDate, String minDateStr, String maxDateStr) {
		Assert.notNull(aDate);
		boolean ret = false;
		try {
			Date dMaxDate = null;
			Date dMinDate = null;
			dMaxDate = DateUtils.parseShortDateString(maxDateStr);
			dMinDate = DateUtils.parseShortDateString(minDateStr);
			switch ((dMaxDate != null ? 5 : 3) + (dMinDate != null ? 1 : 0)) {
			case 6:
				ret = aDate.before(dMaxDate) && aDate.after(dMinDate);
				break;
			case 5:
				ret = aDate.before(dMaxDate);
				break;
			case 4:
				ret = aDate.after(dMinDate);
			}
		} catch (ParseException e) {
		}
		return ret;
	}

	/**
	 * 计算某日期所在月份的天数
	 * 
	 * @param aDateStr
	 *            yyyy-mm-dd
	 * @return
	 */
	public static final int getDaysInMonth(String aDateStr) {
		DataValidator.checkShortDateStr(aDateStr);
		try {
			return getDaysInMonth(parseShortDateString(aDateStr));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 计算某日期所在月份的天数
	 * 
	 * @param aDate
	 * @return
	 */
	public static final int getDaysInMonth(Date aDate) {
		Assert.notNull(aDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(aDate);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 比较两日期大小 date
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static String compare(Date d1, Date d2) {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);

		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);

		if (c1.after(c2)) {
			return TimeConstants.MORE_THAN;
		} else if (c1.before(c2)) {
			return TimeConstants.LESS_THAN;
		} else {
			return TimeConstants.EQUAL;
		}
	}

	/**
	 * 比较两日期大小 2013-12-06
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String compareShortDate1(String s1, String s2) {
		Date d1 = parse(s1, TimeConstants.SHORT_DATE_FORMAT);
		Date d2 = parse(s2, TimeConstants.SHORT_DATE_FORMAT);
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		if (c1.after(c2)) {
			return TimeConstants.MORE_THAN;
		} else if (c1.before(c2)) {
			return TimeConstants.LESS_THAN;
		} else {
			return TimeConstants.EQUAL;
		}
	}

	/**
	 * 比较两日期大小 20131206
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String compareShortDate2(String s1, String s2) {
		Date d1 = parse(s1, TimeConstants.MAIL_DATE_DT_PART_FORMAT);
		Date d2 = parse(s2, TimeConstants.MAIL_DATE_DT_PART_FORMAT);
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		if (c1.after(c2)) {
			return TimeConstants.MORE_THAN;
		} else if (c1.before(c2)) {
			return TimeConstants.LESS_THAN;
		} else {
			return TimeConstants.EQUAL;
		}
	}

	public static Date parse(String str, String format) {
		try {
			SimpleDateFormat sf = new SimpleDateFormat(format);
			sf.setTimeZone(TimeZone.getTimeZone(TimeConstants.DEFAULT_TIME_ZONE));
			return sf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
