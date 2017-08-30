package com.lh.commonclasses.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences工具类
 */
public class SPUtil {
    private static SharedPreferences sp;
    private static final String SHARED_XML = "config";


    /**
     * @param context 上下文环境
     * @param key     存储节点名称
     * @param value   存储节点的值String
     */
    public static void putString(Context context, String key, String value) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        sp.edit().putString(key, value).commit();
    }

    /**
     * @param context 上下文环境
     * @param key     存储节点名称
     * @return 默认值或者此节点读到的结果
     */
    public static String getString(Context context, String key) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        return sp.getString(key, "");
    }

    /**
     * @param context  上下文环境
     * @param key      存储节点名称
     * @param defValue 没有此节点默认值
     * @return 默认值或者此节点读到的结果
     */
    public static String getString(Context context, String key, String defValue) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        return sp.getString(key, defValue);
    }

    /**
     * @param context 上下文环境
     * @param key     存储节点名称
     * @param value   存储节点的值boolean
     */
    public static void putBoolean(Context context, String key, boolean value) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        sp.edit().putBoolean(key, value).commit();
    }

    /**
     * @param context  上下文环境
     * @param key      存储节点名称
     * @param defValue 没有此节点默认值
     * @return 默认值或者此节点读到的结果
     */
    public static boolean getBoolean(Context context, String key, boolean defValue) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key, defValue);
    }

    /**
     * @param context 上下文环境
     * @param key     存储节点名称
     * @param value   存储节点的值int
     */
    public static void putInt(Context context, String key, int value) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        sp.edit().putInt(key, value).commit();
    }

    /**
     * @param context 上下文环境
     * @param key     存储节点名称
     * @return 默认值或者此节点读到的结果
     */
    public static int getInt(Context context, String key) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        return sp.getInt(key, 0);
    }

    /**
     * @param context  上下文环境
     * @param key      存储节点名称
     * @param defValue 没有此节点默认值
     * @return 默认值或者此节点读到的结果
     */
    public static int getInt(Context context, String key, int defValue) {
        //(存储节点文件名称，读写方式)
        if (sp == null) {
            sp = context.getSharedPreferences(SHARED_XML, Context.MODE_PRIVATE);
        }
        return sp.getInt(key, defValue);
    }
}
