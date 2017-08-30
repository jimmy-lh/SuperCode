package com.cyhd.portalmvp.utils;

import android.os.Build;

import swl.lib.common.SwlConfig;

public class ProductInfoUtil {

    /**
     * 终端产品名称
     *
     * @return
     */
    public static String getProductName() {
        String productName = SwlConfig.getProductName();
        if (productName != null) {
            return productName;
        } else {
            return Build.MODEL;
        }
    }

    /**
     * 获取终端产品型号
     *
     * @return
     */
    public static String getTerminalModel() {
        return Build.MODEL;
    }

    /**
     * 获取CPU型号
     */
    public static String getCPUModel() {
        return Build.CPU_ABI;
    }
}
