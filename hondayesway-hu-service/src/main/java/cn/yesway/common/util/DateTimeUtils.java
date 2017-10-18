package cn.yesway.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

public class DateTimeUtils {
	public static String getNowDateTimeStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dt = sdf.format(new Date());
		return dt;
	}

	public static String getNowDateTimeStr(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dt = sdf.format(new Date());
		return dt;
	}

	public static String getDateTimeStr(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dt = sdf.format(date);
		return dt;
	}

	public static String getDateTimeStrBySendRecord(Calendar c1) {
		if (c1 == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd（HH:mm）");
		String dt = sdf.format(c1.getTime());
		return dt;
	}

	public static String getDateTimeStrBySendRecords(Calendar c1) {
		if (c1 == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		String dt = sdf.format(c1.getTime());
		return dt;
	}

	public static String getDateTimeStr(Date date, String pattern) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dt = sdf.format(date);
		return dt;
	}

	public static String getDateTimeStr(Calendar c1) {
		if (c1 == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dt = sdf.format(c1.getTime());
		return dt;
	}

	public static String getDateTimeStr(Calendar c1, String pattern) {
		if (c1 == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dt = sdf.format(c1.getTime());
		return dt;
	}

	public static Date getNowDate() {
		return new Date();
	}

	public static Calendar getNowCalendar() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		return cal;
	}

	public static Calendar convertCalendar(Date date) {
		if (date == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	public static Calendar convertCalendar(String dateStr, String pattern) {
		// 先String---->Date
		Date date = convertDate(dateStr, pattern);
		// 再Date--->Calender
		Calendar cal= convertCalendar(date);
		return cal;
	}

	public static Calendar convertCalendar(String dateStr) {
		Calendar ca = null;
		if (StringUtils.isNotBlank(dateStr)) {
			Date date = null;
			if (dateStr.indexOf("-") != -1 && dateStr.indexOf(":") != -1) {
				date = convertDate(dateStr);
			} else if (dateStr.indexOf("-") != -1 && dateStr.indexOf(":") == -1) {
				date = convertDate(dateStr, "yyyy-MM-dd");
			}
			ca = convertCalendar(date);
		}
		return ca;
	}

	public static Date convertDate(String dateStr) {
		if (dateStr == null || dateStr.equals("")) {
			return null;
		}
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = sdf.parse(dateStr);
		} catch (Exception ex) {

		}
		return date;
	}

	public static Date convertDate(String dateStr, String pattern) {
		if (dateStr == null || dateStr.equals("")) {
			return null;
		}
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			date = sdf.parse(dateStr);
		} catch (Exception ex) {

		}
		return date;
	}

	public static XMLGregorianCalendar convertXMLGregorianCalendar(Date date) {
		XMLGregorianCalendar xmlg = null;
		if (date != null) {
			try {
				GregorianCalendar cal = new GregorianCalendar();
				cal.setTime(date);
				xmlg = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			} catch (Exception e) {

			}
		}
		return xmlg;
	}

	public static Date convertDate(XMLGregorianCalendar xmlg) {
		Date date = null;
		if (xmlg != null) {
			date = xmlg.toGregorianCalendar().getTime();
		}
		return date;
	}

	public static long getPeriodOnSecond(Date a, Date b) {
		return (a.getTime() - b.getTime()) / 1000;
	}

	public static String getWeekOfDate(Calendar cal) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		return weekDays[w];
	}

	/**
	 * 获取日期间的天数差距
	 * 
	 * @param cal1
	 * @param cal2
	 * @return
	 */
	public static int days(Calendar cal1, Calendar cal2) {
		int days = 0;
		if (cal2 != null)
			days = (int) ((cal2.getTimeInMillis() - cal1.getTimeInMillis()) / 1000 / 60 / 60 / 24);
		return days;
	}

	public static int getDaysBetweenDateStr(String startDate, String endDate) {
		Calendar start = convertCalendar(startDate);
		Calendar end = convertCalendar(endDate);
		int days = days(start, end);
		return days;
	}

	/**
	 * 判断当前时间在是否在给定时间的区间内
	 */
	public static boolean nowInStartAndEndDate(String startDate, String endDate) {
		boolean flag = false;
		String nowDate = DateTimeUtils.getDate1();
		int flag1 = DateTimeUtils.compare_date(nowDate, startDate);
		int flag2 = DateTimeUtils.compare_date(nowDate, endDate);
		if (flag1 >= 0 && flag2 <= 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 判断指定时间在是否在给定时间的区间内
	 */
	public static boolean inStartAndEndDate(String startDate, String endDate, String date) {
		boolean flag = false;
		if (StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate) || StringUtils.isBlank(date)) {
			return false;
		}
		int flag1 = DateTimeUtils.compare_date(date, startDate);
		int flag2 = DateTimeUtils.compare_date(date, endDate);
		if (flag1 >= 0 && flag2 <= 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 日期字符串加减天数后的日期字符串
	 */
	public static String getDateTimeStrAddDays(String startDate, int days) {
		Calendar c = parse(startDate, "yyyy-MM-dd");
		c.add(Calendar.DAY_OF_YEAR, days);
		String dateStr = getConvertCalendar(c, "yyyy-MM-dd");
		return dateStr;
	}

	/**
	 * 转换calendar
	 * 
	 * @param cal
	 * @return
	 */
	public static String getConvertCalendar(Calendar cal, String format) {
		String currentDate = null;
		// 定制显示格式
		java.text.SimpleDateFormat f = new java.text.SimpleDateFormat(format);// ("yyyy年MM月dd日");
		currentDate = f.format(cal.getTime());
		return currentDate;
	}

	public static int compare_date(String DATE1, String DATE2) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dt1 = df.parse(DATE1);
			Date dt2 = df.parse(DATE2);
			// dt1 在dt2前
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				// dt1在dt2后
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

	public static String getDate1() {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dt = sdf.format(new Date());
		return dt;
	}

	public static Calendar parse(String param, String pattern) {
		Calendar c = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			Date date = sdf.parse(param);
			c = Calendar.getInstance();
			c.setTime(date);
		} catch (Exception ex) {

		}
		return c;
	}

	/**
	 * Calendar类型时间增加小时数
	 * 
	 * @param startDate
	 *            初始时间
	 * @param hours
	 *            要增加的小时数
	 * @return 增加后的时间
	 */
	public static Calendar getDateTimeStrAddHours(Calendar startDate, int hours) {
		Calendar cal = startDate;
		cal.add(Calendar.HOUR_OF_DAY, hours);
		return cal;
	}
}
