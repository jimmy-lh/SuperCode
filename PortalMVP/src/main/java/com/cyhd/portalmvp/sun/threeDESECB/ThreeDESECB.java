package com.cyhd.portalmvp.sun.threeDESECB;

import com.cyhd.portalmvp.sun.misc.BASE64Decoder;
import com.cyhd.portalmvp.sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

/**
 * 3DES加密解密
 *
 * @version 2016年12月8日
 */

public class ThreeDESECB {


    private static final String TAG = "ThreeDESECB";
    public static final String KEY = "2b494e53756c664c2f44465245733572";

    /**
     * 加密
     *
     * @param str
     * @param key
     * @return
     * @throws Exception
     * @see
     */
    public static String encryptThreeDESECB(String str, String key) throws Exception {
        String temp = "";
        try {
            byte[] keys = new BASE64Decoder().decodeBuffer(key);
            DESedeKeySpec dks = new DESedeKeySpec(keys);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
            SecretKey securekey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(1, securekey);
            byte[] b = cipher.doFinal(str.getBytes("UTF-8"));
            BASE64Encoder encoder = new BASE64Encoder();
            temp = encoder.encode(b).replaceAll("\r", "").replaceAll("\n", "");
//            RequestLogger.d(TAG, "明文加密后使用hex编码前的密文：" + temp);
            temp = HexUtil.toHexString(temp);
//            RequestLogger.d(TAG, "明文加密后使用hex编码后的密文" + temp);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return temp;
    }

    /**
     * 解密
     *
     * @param src 密文解密前hex转码前的密文
     * @param key key
     * @return
     * @throws Exception
     * @see
     */
    public static String decryptThreeDESECB(String src, String key) throws Exception {
        try {
//            RequestLogger.d(TAG, "密文解密前hex转码前的密文：" + src);
            src = HexUtil.fromHexString(src);
//            RequestLogger.d(TAG, "密文解密前hex转码后的密文：" + src);
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bytesrc = decoder.decodeBuffer(src);
            byte[] keys = new BASE64Decoder().decodeBuffer(key);
            DESedeKeySpec dks = new DESedeKeySpec(keys);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
            SecretKey securekey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, securekey);
            byte[] retByte = cipher.doFinal(bytesrc);
            return new String(retByte, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
