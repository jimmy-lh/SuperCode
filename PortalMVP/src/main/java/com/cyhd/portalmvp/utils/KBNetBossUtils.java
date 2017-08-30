package com.cyhd.portalmvp.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

/**
 * 3DS加密和解密的JAVA实现.
 */
public class KBNetBossUtils {

	private static final String DES = "DESede";

	private static final String PADDING = "0";

	private static final String CIPHER_DESC = "DESede/ECB/PKCS5Padding";

	/**
	 * 解密指定的字符串
	 * 
	 * @param message 需解密的字符串
	 * @param key 密钥
	 * @return 解密后的字符串
	 */
	public static String decrypt(String message, String key) {
		try {
			byte[] bytes = hex2byte(message);
			Cipher cipher = Cipher.getInstance(CIPHER_DESC);
			SecretKey secretKey = genSecretKey(key);
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
		
			bytes = cipher.doFinal(bytes);
			return new String(bytes);
	            
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	
	/**
	 * 加密指定的字符串
	 * 
	 * @param message 需加密的字符串
	 * @param key 密钥
	 * @return 加密后的字符串
	 */
	public static String encrypt(String message, String key) {
		try {
			Cipher cipher = Cipher.getInstance(CIPHER_DESC);
			SecretKey secretKey = genSecretKey(key);
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] bytes = cipher.doFinal(message.getBytes());
			return byte2hex(bytes);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 根据密钥字符串生成DESede的密钥对象
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	private static SecretKey genSecretKey(String key) throws Exception {
		// 不足24位的右补0
		key = StringTools.rightPad(key, 24, PADDING);
		DESedeKeySpec desKeySpec = new DESedeKeySpec(key.getBytes());
		SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
		return secretKey;
	}

	public static String byte2hex(byte[] bytes) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			String temp = Integer.toHexString(bytes[i] & 0XFF);
			temp = StringTools.leftPad(temp, 2, PADDING);
			buffer.append(temp);
		}
		return buffer.toString().toUpperCase();
	}

	public static byte[] hex2byte(String hex) {
		int length = hex.length();
		byte[] bytes = new byte[length / 2];
		for (int i = 0; i < length / 2; i++) {
			String temp = "" + hex.charAt(2 * i) + hex.charAt(2 * i + 1);
			bytes[i] = (byte) Integer.parseInt(temp, 16);
		}
		return bytes;
	}
	

}
