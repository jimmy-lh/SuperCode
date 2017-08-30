package com.lh.commonclasses.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;

import com.lh.commonclasses.constant.SPConstant;
import com.lh.commonclasses.entity.AppInfoModel;

import java.util.List;
import java.util.Locale;

/**
 * app工具类
 */
public class AppUtil {
    public static final String TAG = "AppUtil";

    /**
     * 判断程序是否在前台运行
     *
     * @return 结果
     */
    public static boolean isAppOnForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(context.ACTIVITY_SERVICE);
        String packageName = context.getApplicationContext().getPackageName();
        List<RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();
        if (appProcesses == null)
            return false;
        for (RunningAppProcessInfo appProcess : appProcesses) {
            if (appProcess.processName.equals(packageName)
                    && appProcess.importance == RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
                return true;
            }
        }
        return false;
    }


    /**
     * 是否是第一次进入app
     *
     * @return 是第一次进入:true
     */
    public static boolean isFirstEnterApp(Context context) {
        boolean result = SPUtil.getBoolean(context, SPConstant.USER_ENTER_STATE, true);
        LogUtil.d(TAG, "isFirstIn=" + result);
        if (result) {
            SPUtil.putBoolean(context, SPConstant.USER_ENTER_STATE, false);
            LogUtil.d(TAG, "put=" + SPUtil.getBoolean(context, SPConstant.USER_ENTER_STATE, true));
        }
        return result;
    }

    /**
     * 获取当前app的名称，版本号，版本名称,icon
     */
    public static AppInfoModel getAppInfo(Context context) {
        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0);
            String versionName = info.versionName;
            String versionCode = info.versionCode + "";
            String appName = info.applicationInfo.loadLabel(
                    context.getPackageManager()).toString();
            Drawable appIcon = info.applicationInfo.loadIcon(context.getPackageManager());
            AppInfoModel appInfoModel = new AppInfoModel();
            appInfoModel.setAppName(appName);
            appInfoModel.setVersionCode(versionCode);
            appInfoModel.setVersionName(versionName);
            appInfoModel.setAppIcon(appIcon);
            return appInfoModel;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取包名
     */
    public static String getPackageName(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        if (packageName.equalsIgnoreCase("com.supernet.huanxidianshi")) {
            return "com.swl.onelive";
        } else {
            return packageName;
        }
    }

    /**
     * 获取系统语言
     */
    public static String getLanguageEnv() {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry().toLowerCase();
        if ("zh".equals(language)) {
            if ("cn".equals(country)) {
                language = "zh-CN";
            } else if ("tw".equals(country)) {
                language = "zh-TW";
            } else if ("hk".equals(country)) {
                language = "zh-HK";
            }
        } else if ("pt".equals(language)) {
            if ("br".equals(country)) {
                language = "pt-BR";
            } else if ("pt".equals(country)) {
                language = "pt-PT";
            }
        }
        LogUtil.d(TAG, "language=" + language);
        return language;
    }
}
