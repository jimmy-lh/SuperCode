package com.cyhd.portalmvp.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.Time;

import com.lh.commonclasses.utils.SuperLog;

import org.coolx.applicationupdate.HttpUtility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtil {
	private static final String TAG = "DateUtil";
	// Date Format1
	private static SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
	// Date Format2
	private static SimpleDateFormat sfd2 = new SimpleDateFormat("yyyyMMdd", Locale.US);

	private String[] mDates = new String[7];
	private static Date mNetDate;

	/**
	 * Turn today to format1
	 * 
	 * @return String
	 */
	public static String dateToString() {
		return sfd.format(new Date());
	}

	/**
	 * Turn today to format2
	 * 
	 * @return String
	 */
	public static String dateToString(Date date) {
		return sfd.format(date);
	}


	public static String dateToString(Date date, String format) {
		SimpleDateFormat fs = new SimpleDateFormat(format, Locale.US);
		return fs.format(date);
	}



	public static String stringToStringDateSfd2(String strDate) {
		Date date = null;
		try {
			date = sfd.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sfd2.format(date);
	}


	public static Date stringToDate(String date) {

		try {
			return sfd.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String getOneDayLaterDate(String date) {
		Date mDate = stringToDate(date);
		if (mDate == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(mDate);
		calendar.add(calendar.DATE, 1);// 把日期往后增加一天.整数往后推,负数往前移动
		Date newDate = calendar.getTime(); // 这个时间就是日期往后推一天的结果
		return dateToString(newDate);

	}

	public static String getOneDayBeforeDate(String date) {
		Date mDate = stringToDate(date);
		if (mDate == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(mDate);
		calendar.add(calendar.DATE, -1);// 把日期往后增加一天.整数往后推,负数往前移动
		Date newDate = calendar.getTime(); // 这个时间就是日期往后推一天的结果
		return dateToString(newDate);

	}


	public static Date stringToDate(String date, String format) {
		SimpleDateFormat fs = new SimpleDateFormat(format, Locale.US);
		try {
			return fs.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Turn today to format1
	 * 
	 * @return Date
	 */
	public static Date formatDate() {
		try {
			return sfd.parse(sfd.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Turn today to format2
	 * 
	 * @return String
	 */
	public static String dateToString2() {
		return sfd2.format(new Date());
	}


	public static String stringToStringDate(String strDate) {
		return dateToString(stringToDate(strDate));
	}

	/**
	 * Get time
	 * 
	 * @return String
	 */
	public static String getTime() {
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.US);
		return timeFormat.format(new Date());
	}


	public static String getHoursAgoTime(int i) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR, Calendar.HOUR - i);// 设置时间为当前时�?8小时
		return new SimpleDateFormat("HH:mm", Locale.US).format(cal.getTime());
	}

	public String getDate(int i, Context context) {
		if (mDates[i] == null) {
			Date date = DateUtil.getSysDaysAgoDate(i, context);

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
			mDates[i] = dateFormat.format(date);
			if (mDates[i].substring(0, 4).equals("1970") || (mDates[i].substring(0, 4).equals("1969"))) {
				if (i == 0) {
					if (mNetDate == null) {
						mNetDate = DateUtil.getCurBJTime(context);
					}
				}
				if (mNetDate != null) {
					mDates[i] = DateUtil.getNetDaysAgoDate(i, mNetDate, context);
				}
			}
		}
		return mDates[i];
	}

	public Date getSevenDate(int i, Context context) {
		Date date = null;
		if (mDates[i] == null) {
			date = DateUtil.getSysDaysAgoDate(i, context);

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
			mDates[i] = dateFormat.format(date);
			if (mDates[i].substring(0, 4).equals("1970") || (mDates[i].substring(0, 4).equals("1969"))) {
				if (i == 0) {
					if (mNetDate == null) {
						mNetDate = DateUtil.getCurBJTime(context);
					}
				}
				if (mNetDate != null) {
					mDates[i] = DateUtil.getNetDaysAgoDate(i, mNetDate, context);
				}
			}
		}

		return date;
	}


	public static Date getSysDaysAgoDate(int i, Context context) {
		Calendar cal = Calendar.getInstance();
		int inputDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		cal.set(Calendar.DAY_OF_YEAR, inputDayOfYear - i);// 设置时间为当前时�?8小时

		return cal.getTime();
	}


	public static String getNetDaysAgoDate(int i, Date curDate, Context context) {
		String mDate = "";
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(curDate);
		int inputDayOfYear2 = cal2.get(Calendar.DAY_OF_YEAR);
		cal2.set(Calendar.DAY_OF_YEAR, inputDayOfYear2 - i);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

		// dateFormat.setTimeZone(TimeZone.getDefault());
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT 08:00"));
		String time = dateFormat.format(cal2.getTime());
		mDate = time;
		return mDate;
	}


	public static Date getCurBJTime(Context context) {
		boolean isNetOK = HttpUtility.isNetEnable(context);
		try {
			if (isNetOK) {
				URL url = new URL("http://bjtime.cn");// 取得资源对象
				URLConnection uc = url.openConnection();// 生成连接对象
				uc.connect(); // 发出连接
				long ld = uc.getDate(); // 取得网站日期时间
				Date netDate = new Date(ld); // 转换为标准时间对�
				return netDate;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


	public static String getDaysAgoDate(int i, Context context) {
		String mDate = "";
		Calendar cal = Calendar.getInstance();
		int inputDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		cal.set(Calendar.DAY_OF_YEAR, inputDayOfYear - i);// 设置时间为当前时�?8小时
		mDate = new SimpleDateFormat("yyyy", Locale.US).format(cal.getTime());
		if (mDate != null && !mDate.trim().equals("")) {
			if (!mDate.equals("1970") && !mDate.equals("1969")) {
				mDate = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(cal.getTime());
			} else {
				try {
					boolean isNetOK = HttpUtility.isNetEnable(context);
					if (isNetOK) {
						URL url = new URL("http://www.bjtime.cn");// 取得资源对象
						URLConnection uc = url.openConnection();// 生成连接对象
						uc.connect(); // 发出连接
						long ld = uc.getDate(); // 取得网站日期时间
						Date netDate = new Date(ld); // 转换为标准时间对�

						Calendar cal2 = Calendar.getInstance();
						cal2.setTime(netDate);
						int inputDayOfYear2 = cal2.get(Calendar.DAY_OF_YEAR);
						cal2.set(Calendar.DAY_OF_YEAR, inputDayOfYear2 - i);
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
						dateFormat.setTimeZone(TimeZone.getTimeZone("GMT 08:00"));
						String time = dateFormat.format(cal2.getTime());
						mDate = time;
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		return mDate;
	}


	public static String getDaysAfterDate(int i) {
		Calendar cal = Calendar.getInstance();
		int inputDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		cal.set(Calendar.DAY_OF_YEAR, inputDayOfYear + i);// 设置时间为当前时�?8小时
		return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(cal.getTime());
	}


	public static String getWeekOfDate(Date dt, String[] weekDays) {

		Calendar cal = Calendar.getInstance();

		cal.setTime(dt);
		String date = new SimpleDateFormat("MM-dd", Locale.US).format(dt);

		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;

		return weekDays[w] + "\n" + date;
	}


	public static long getLongofTimes(String endTime, String startTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
		Date endDate = null;
		Date startDate = null;
		try {
			endDate = sdf.parse(endTime + "00");
			startDate = sdf.parse(startTime + "00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return (endDate.getTime() - startDate.getTime()) / 1000;
	}


	public static String showTime(long time) {
		int minute = (int) time / 60;
		int hour = (int) minute / 60;
		int second = (int) time % 60;
		minute %= 60;
		return String.format("%02d:%02d:%02d", hour, minute, second);


	}


	public static long timeStringToLong(String strTime) {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss", Locale.US);
		Date time = null;
		try {
			time = formatter.parse(strTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time.getTime() / 1000;
	}

	/**
	 * compare time
	 */
	public static boolean compareTime(String time1, String time2) {
		boolean bool = false;
		java.text.DateFormat df = new SimpleDateFormat("HH:mm", Locale.US);
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		try {
			c1.setTime(df.parse(time1));
			c2.setTime(df.parse(time2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int result = c1.compareTo(c2);
		if (result < 0)
			bool = true;
		return bool;
	}

	/**
	 * compare time
	 */
	public static long compareTime(String date) {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
		Date begin = null;
		Date end = null;
		try {
			begin = dfs.parse(dfs.format(new Date()));
			end = dfs.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long between = (end.getTime() - begin.getTime());
		return between;
	}


	public static Date transferDateToLocal(String dateStr, String timeZoneId) {
		SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

		try {
				sp.setTimeZone(TimeZone.getTimeZone(timeZoneId));
				Date date = sp.parse(dateStr);
				return date;
			
		} catch (ParseException e) {
			e.printStackTrace();
			SuperLog.e(TAG,"transfer error");
		}

		return null;
	}
	

	public static Date changeTimeZone(String date, Activity activity) {
		if (!TextUtils.isEmpty(date)) {
			String timezoneId = "GMT+8";
			Date result = DateUtil.transferDateToLocal(date, timezoneId);
			return result;
		} else {
			return null;
		}
	}

	public static Date changeTimeZone(String date) {
		if (!TextUtils.isEmpty(date)) {
			String timezoneId = "GMT+8";
			Date result = DateUtil.transferDateToLocal(date, timezoneId);
			return result;
		} else {
			return null;
		}
	}

	// public static String changeTimeZone(String date, String format,Activity
	// activity) {
	// if (!TextUtils.isEmpty(date)) {
	// int languageType = AppUtil.retrieveVodType(activity);
	// String timezoneId = null;
	// if (2 == languageType || 3 == languageType) // arabic and portugues
	// {
	// timezoneId = "GMT";
	// } else if (0 == languageType || 1 == languageType) { // chinese and
	// timezoneId = "GMT+8";
	// } else {
	// }
	// // SuperLog.d("changeTimeZone-languageType="+languageType+"
	// // timezoneId="+timezoneId);
	//
	// String result = DateUtil.transferDateToLocal(date, timezoneId, format);
	// return result;
	// } else {
	// return null;
	// }
	// }

	public static String getChangedTimeZoneCurrentDate(String changedFormat, Activity activity) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date resultDate = DateUtil.changeTimeZone(format.format(date), activity);
		if (resultDate != null) {
			SimpleDateFormat changedTimeZoneTimeFormat = new SimpleDateFormat(changedFormat);
			return changedTimeZoneTimeFormat.format(resultDate);
		} else {
			return null;
		}
	}

	public static int getCurrentWeekDay() {
		Time time = new Time();
		time.setToNow();
		int weekday = time.weekDay;
		if (weekday == 0) {
			weekday = 7;
		}
		return weekday;
	}

	public static String getChineseWeekDay(int day) {
		String chineseWeekDay = "";
		switch (day) {
		case 0:
			chineseWeekDay = "日";
			break;
		case 1:
			chineseWeekDay = "一";
			break;
		case 2:
			chineseWeekDay = "二";
			break;
		case 3:
			chineseWeekDay = "三";
			break;
		case 4:
			chineseWeekDay = "四";
			break;
		case 5:
			chineseWeekDay = "五";
			break;
		case 6:
			chineseWeekDay = "六";
			break;
		case 7:
			chineseWeekDay = "日";
			break;

		default:
			break;
		}

		return chineseWeekDay;
	}

	public static String getCurrentTimeZone() {
		TimeZone tz = TimeZone.getDefault();
		return createGmtOffsetString(true, true, tz.getRawOffset());
	}

	public static String createGmtOffsetString(boolean includeGmt, boolean includeMinuteSeparator, int offsetMillis) {
		int offsetMinutes = offsetMillis / 60000;
		char sign = '+';
		if (offsetMinutes < 0) {
			sign = '-';
			offsetMinutes = -offsetMinutes;
		}
		StringBuilder builder = new StringBuilder(9);
		if (includeGmt) {
			builder.append("GMT");
		}
		builder.append(sign);
		appendNumber(builder, 2, offsetMinutes / 60);
		if (includeMinuteSeparator) {
			builder.append(':');
		}
		appendNumber(builder, 2, offsetMinutes % 60);
		return builder.toString();
	}

	private static void appendNumber(StringBuilder builder, int count, int value) {
		String string = Integer.toString(value);
		for (int i = 0; i < count - string.length(); i++) {
			builder.append('0');
		}
		builder.append(string);
	}


	/**
	 * 得到两个日期相差的天数
	 */
	public static int getBetweenDay(Date fDate, Date oDate) {

		Calendar aCalendar = Calendar.getInstance();

		aCalendar.setTime(fDate);

		int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);

		aCalendar.setTime(oDate);

		int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);

		return day2 - day1;

	}

}
