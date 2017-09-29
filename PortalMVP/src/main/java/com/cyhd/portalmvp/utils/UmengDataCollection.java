package com.cyhd.portalmvp.utils;

import android.annotation.SuppressLint;

import com.cyhd.portalmvp.mvp.beanResult.ChannelList;

/**
 * 友盟数据收集工具类
 * Created by yangsong on 2016/2/14.
 */
public class UmengDataCollection {
    private static String TAG = "UmengDataCollection";

    public interface UmengKey {
        String START_TIME = "startTime";
        String SN = "SN";
        String CHANNEL_ID = "channelID";
        String CHANNEL_NAME = "channelName";
        String SERVE_IP = "serveIP";
    }

    public interface UmengEventKey {
        String CH_BUFFERING = "CH_BUFFERING";
        String CH_PLAY = "CH_PLAY";
        String CH_REPLAY = "CH_REPLAY";
        String CH_STOP = "CH_STOP";
        String CH_UNAUTH = "CH_UNAUTH";
        String CHLIST_DOWNLOAD_FAILED = "CHLIST_DOWNLOAD_FAILED";
        String CHLIST_PARSE_FAILED = "CHLIST_PARSE_FAILED";
        String EPGLIST_DOWNLOAD_FAILED = "EPGLIST_DOWNLOAD_FAILED";
        String EPGLIST_PARSE_FAILED = "EPGLIST_PARSE_FAILED";
        String DNS_ACCESS_FAILED = "DNS_ACCESS_FAILED";
        String NET_ACCESS_FAILED = "NET_ACCESS_FAILED";

        String ERCODE_EA1 = "ERCODE_EA1"; // SN没与产品绑定
        String ERCODE_EA5 = "ERCODE_EA5"; // AAA数据库中无产品信息
        String ERCODE_EA7 = "ERCODE_EA7"; // 无效协议数据
        String ERCODE_EB2 = "ERCODE_EB2"; // 盒子与EPG失联
        String ERCODE_EC1 = "ERCODE_EC1"; // 盒子与GSLB失联+++++++++++++++++6
        String ERCODE_EC2 = "ERCODE_EC2"; // 盒子与EMS失联
        String ERCODE_EC7 = "ERCODE_EC7"; // 用户上行带宽不足
        String ERCODE_ED2 = "ERCODE_ED2"; // 用户访问的产品未授权
        String ERCODE_ED4 = "ERCODE_EA8"; // 用户授权已过期
    }

    private static long lastCollectTime;

    public static void collectLiveMsg(String eventKey, ChannelList channel) {
       /* if (eventKey == UmengEventKey.CH_BUFFERING && (SystemClock.uptimeMillis() - lastCollectTime < 5000)) {
            return;
        }
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        HashMap<String, String> eventMap = new HashMap<String, String>();
        eventMap.put(UmengKey.START_TIME, sDateFormat.format(new Date()));
        eventMap.put(UmengKey.SN, BaseApp.getInstance().getSn());
        eventMap.put(UmengKey.CHANNEL_ID, channel.getChannelCode());
        eventMap.put(UmengKey.CHANNEL_NAME, channel.getName());
        SuperLog.d(TAG, "====================== CollectionLiveMsg start=====================");
        SuperLog.d(TAG, "eventKey=" + eventKey);
        SuperLog.d(TAG, "START_TIME=" + sDateFormat.format(new Date()));
        SuperLog.d(TAG, "SN=" + BaseApp.getInstance().getSn());
        SuperLog.d(TAG, "channelId=" + channel.getChannelCode());
        SuperLog.d(TAG, "channelName=" + channel.getName());
        SuperLog.d(TAG, "====================== CollectionLiveMsg end=====================");
        MobclickAgent.onEvent(BaseApp.getInstance(), eventKey, eventMap);
        if (eventKey == UmengEventKey.CH_BUFFERING)
            lastCollectTime = SystemClock.uptimeMillis();
            */
    }

    public static void collectNetMsg(String eventKey, String serverIP) {
      /*  SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        HashMap<String, String> eventMap = new HashMap<String, String>();
        eventMap.put(UmengKey.START_TIME, sDateFormat.format(new Date()));
        eventMap.put(UmengKey.SN, BaseApp.getInstance().getSn());
        eventMap.put(UmengKey.SERVE_IP, serverIP);
        SuperLog.d(TAG, "====================== CollectionLiveMsg start=====================");
        SuperLog.d(TAG, "eventKey=" + eventKey);
        SuperLog.d(TAG, "START_TIME=" + sDateFormat.format(new Date()));
        SuperLog.d(TAG, "SN=" + BaseApp.getInstance().getSn());
        SuperLog.d(TAG, "serverIP=" + serverIP);
        SuperLog.d(TAG, "====================== CollectionLiveMsg end=====================");
        MobclickAgent.onEvent(BaseApp.getInstance(), eventKey, eventMap);
*/
    }

    @SuppressLint("SimpleDateFormat")
    public static void collectionErrInfoMsg(String eventKey) {
      /*  if (!TextUtils.isEmpty(eventKey)) {
            SimpleDateFormat sDateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");
            HashMap<String, String> eventMap = new HashMap<String, String>();
            eventMap.put("startTime", sDateFormat.format(new Date()));
            eventMap.put("sn", BaseApp.getInstance().getSn());
            MobclickAgent.onEvent(BaseApp.getInstance(), eventKey, eventMap);
        }
        */
    }

}
