package com.lh.commonclasses.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity集合工具类
 */
public class ActivityCollectUtil {
    public static List<Activity> activities = new ArrayList<Activity>();

    /**
     * 添加Activity
     *
     * @param activity
     */
    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * 移除指定Activity
     *
     * @param activity
     */
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    /**
     * 移除所有Activity
     */
    public static void finishAllActivity() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
