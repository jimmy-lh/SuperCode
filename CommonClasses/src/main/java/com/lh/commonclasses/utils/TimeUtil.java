package com.lh.commonclasses.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 对时间操作的工具类
 */
public class TimeUtil {

    /**
     * 当地时间 ---> UTC时间
     */
    public static String Local2UTC() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("gmt"));
        String gmtTime = sdf.format(new Date());
        return gmtTime;
    }

    /**
     * utc转化为milliseconds
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
     */
    public static long getUTC2Milliseconds() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        fmt.setTimeZone(TimeZone.getTimeZone("Etc/GMT+0"));
        String utcTime = fmt.format(new Date());

        Date date = new Date();
        try {
            date = fmt.parse(utcTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    /**
     * UTC时间 ---> 当地时间
     *
     * @param utcTime UTC时间
     * @return
     */
    public static String utc2Local(String utcTime) {
        SimpleDateFormat utcFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//UTC时间格式
        utcFormater.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date gpsUTCDate = null;
        try {
            gpsUTCDate = utcFormater.parse(utcTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat localFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//当地时间格式
        localFormater.setTimeZone(TimeZone.getDefault());
        String localTime = localFormater.format(gpsUTCDate.getTime());
        return localTime;
    }

}
