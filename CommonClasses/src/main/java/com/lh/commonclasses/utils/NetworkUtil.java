package com.lh.commonclasses.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网络工具类
 */
public class NetworkUtil {

    private final static String TAG = "NetworkUtil";

    /**
     * 判断wifi是否连接
     *
     * @param context
     * @return
     */
    public static boolean isWifiConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiNetworkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiNetworkInfo.isConnected()) {
            return true;
        }

        return false;
    }

    /**
     * 判断网线是否连接
     *
     * @param context
     * @return
     */
    public static boolean isLanConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo lanNetworkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_ETHERNET);

        if (lanNetworkInfo != null && lanNetworkInfo.isConnected()) {
            return true;
        }

        return false;
    }

    /**
     * 判断网络是否连接
     */
    public static boolean isNetworkConnected(Context context) {
        if (!NetworkUtil.isLanConnected(context) && !NetworkUtil.isWifiConnected(context)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断网络是否连接
     */
    public static boolean isNetEnable(Context context) {
        ConnectivityManager connManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkinfo = connManager.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isAvailable()) {
            return false;
        }
        return true;
    }

    /**
     * 判断ip是否可以连接
     *
     * @param host    ip地址或域名
     * @param timeOut 超时时间milliseconds
     * @return
     */
    public static void isHostConnect(final String host, final Integer timeOut,
                                     final hostConnectCallBack mhostConnectCallBack) {
        final String ip = domain2ip(host);
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean ishostConnect = false;
                try {
                    ishostConnect = InetAddress.getByName(ip).isReachable(timeOut);
                    LogUtil.d(TAG, "ip = " + ip + ",网络 ishostConnect= " + ishostConnect);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mhostConnectCallBack.hostConnectConmplete(ishostConnect);
            }
        }).start();
    }

    public interface hostConnectCallBack {
        void hostConnectConmplete(boolean ishostConnect);
    }

    /**
     * 域名转ip
     *
     * @param domain
     * @return ip地址
     */
    public static String domain2ip(String domain) {

        if (isIP(domain)) {//判断是否是ip地址，如果是，直接返回
            LogUtil.d(TAG, "是ip地址,直接返回，无需解析");
            return domain;
        }
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        try {
            LogUtil.d(TAG, "开始解析" + domain);
            InetAddress address = InetAddress.getByName(domain);
            return address.getHostAddress();
        } catch (UnknownHostException e) {
            LogUtil.d(TAG, new StringBuilder(domain).append(" DNS解析失败").toString());
        }
        return null;
    }

    /**
     * 判断是否是ip
     */
    public static boolean isIP(String addr) {
        if (addr.length() < 7 || addr.length() > 15 || "".equals(addr)) {
            return false;
        }
        /**
         * 判断IP格式和范围
         */
        String rexp = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";
        Pattern pat = Pattern.compile(rexp);
        Matcher mat = pat.matcher(addr);
        boolean ipAddress = mat.find();
        return ipAddress;
    }

    private static boolean pingIpAddress(String ipAddress) {
        try {
            Process process = Runtime.getRuntime().exec("/system/bin/ping -c 1 -w 100 " + ipAddress);
            int status = process.waitFor();
            if (status == 0) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
