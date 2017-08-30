package com.cyhd.portalmvp.utilsErr;

import android.annotation.SuppressLint;
import android.content.Context;

import com.umeng.analytics.MobclickAgent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class PlayUmengCollection {
	public static String TAG = "PlayUmengCollection";
	
	public enum ErrorKeyCode {
		ERCODE_AVAIL,
		ERCODE_EA1,
		ERCODE_EA5,
		ERCODE_EA7,
		ERCODE_EB2,
		ERCODE_EC1,
		ERCODE_EC2,
		ERCODE_EC7,
		ERCODE_ED2,
		ERCODE_EA8,
		ERCODE_EA9,
		ERCODE_EA4;
	};
	
	
	public static void collectionsDNSError(String address){
		SimpleDateFormat sDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		HashMap<String, String> eventMap = new HashMap<String, String>();
		eventMap.put("startTime", sDateFormat.format(new Date()));
		eventMap.put("server",address);
		MobclickAgent.onEvent(null,"DNS_ACCESS_FAILED", eventMap);
	}
	
	@SuppressLint("SimpleDateFormat")
	public static void CollectionErrInfoMsg(Context mContext, String channelName,
                                            String sn, ErrorKeyCode keyId) {
		if(!keyId.equals(ErrorKeyCode.ERCODE_AVAIL)) {
			SimpleDateFormat sDateFormat = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			HashMap<String, String> eventMap = new HashMap<String, String>();
			eventMap.put("startTime", sDateFormat.format(new Date()));
			eventMap.put("channelName",channelName);
			eventMap.put("sn",sn);
			MobclickAgent.onEvent(mContext,getUmengId(keyId), eventMap);
		}
	}
	
	@SuppressLint("SimpleDateFormat")
	public static void CollectionErrInfoMsg(Context mContext,
                                            String sn, ErrorKeyCode keyId) {
		if(!keyId.equals(ErrorKeyCode.ERCODE_AVAIL)) {
			SimpleDateFormat sDateFormat = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			HashMap<String, String> eventMap = new HashMap<String, String>();
			eventMap.put("startTime", sDateFormat.format(new Date()));
			eventMap.put("sn",sn);
			MobclickAgent.onEvent(mContext,getUmengId(keyId), eventMap);
		}
	}
	
	
	private static String getUmengId(ErrorKeyCode id) {
		String umengKey = "";
		switch (id) {
		case ERCODE_EA1:
			umengKey = PlayUmengKeyId.ERCODE_EA1;
			break;
		case ERCODE_EA5:
			umengKey = PlayUmengKeyId.ERCODE_EA5;
			break;
		case ERCODE_EA7:
			umengKey = PlayUmengKeyId.ERCODE_EA7;
			break;
		case ERCODE_EB2:
			umengKey = PlayUmengKeyId.ERCODE_EB2;
			break;
		case ERCODE_EC1:
			umengKey = PlayUmengKeyId.ERCODE_EC1;
			break;
		case ERCODE_EC2:
			umengKey = PlayUmengKeyId.ERCODE_EC2;
			break;
		case ERCODE_EC7:
			umengKey = PlayUmengKeyId.ERCODE_EC7;
			break;
		case ERCODE_ED2:
			umengKey = PlayUmengKeyId.ERCODE_ED2;
			break;
		case ERCODE_EA8:
			umengKey = PlayUmengKeyId.ERCODE_ED4;
			break;
		default:
			break;
		}
		return umengKey;
	}
}
