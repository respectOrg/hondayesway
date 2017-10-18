package cn.yesway.hondayesway.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

	public static final String DATEPATTERN = "yyyy-MM-dd";
	public static final String TIMEPATTERN = "yyyy-MM-dd HH:mm:ss";

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

	public static Date convertDate(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		return cal.getTime();
	}
	
	public static long getPeriodOnSecond(Date a, Date b) {
		return (a.getTime() - b.getTime()) / 1000;
	}
}
