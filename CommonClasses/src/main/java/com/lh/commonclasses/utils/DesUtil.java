package com.lh.commonclasses.utils;


import com.lh.commonclasses.retrofit2rxjava.sun.threeDESECB.ThreeDESECB;

/**
 * 加密解密工具类
 */
public class DesUtil {

    private static final String TAG = "DesUtil";
    private static boolean isEncrypt = true;  // 是否加密

    public static void setEncrypt(boolean encryption) {
        isEncrypt = encryption;
    }

    public static boolean getEncrypt() {
        return isEncrypt;
    }

    /**
     * 解密
     */
    public static String decrypt(String string) {
//        RequestLogger.d(TAG, "解密状态：" + isEncrypt);
        if (!isEncrypt) {
            return string;
        }
        String decryptResult = "";
//        RequestLogger.d(TAG, "密文：" + string);
        try {
            decryptResult = ThreeDESECB.decryptThreeDESECB(string, ThreeDESECB.KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        RequestLogger.d(TAG, "明文：" + decryptResult);
        return decryptResult;
    }

    /**
     * 加密
     */
    public static String encrypt(String string) {
//        RequestLogger.d(TAG, "加密状态：" + isEncrypt);
        if (!isEncrypt) {
            return string;
        }
        String encryptResult = "";
//        RequestLogger.d(TAG, "明文：" + string);
        try {
            encryptResult = ThreeDESECB.encryptThreeDESECB(string, ThreeDESECB.KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        RequestLogger.d(TAG, "密文：" + encryptResult);
        return encryptResult;
    }

    /**
     * 无条件解密
     *
     * @param string
     * @return
     */
    public static String decryptByUnconditional(String string) {
        String decryptResult = "";
        try {
            decryptResult = ThreeDESECB.decryptThreeDESECB(string, ThreeDESECB.KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptResult;
    }

    /**
     * 无条件加密
     *
     * @param string
     * @return
     */
    public static String encryptByUncondition(String string) {
        String encryptResult = "";
        try {
            encryptResult = ThreeDESECB.encryptThreeDESECB(string, ThreeDESECB.KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptResult;
    }

}
