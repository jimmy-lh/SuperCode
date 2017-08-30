package com.cyhd.portalmvp.mvp.network;

import com.cyhd.portalmvp.constant.UrlConstant;
import com.cyhd.portalmvp.mvp.network.api.DataCollectApi;
import com.cyhd.portalmvp.mvp.network.api.GetIPApi;
import com.cyhd.portalmvp.mvp.network.api.LivePlayUrlApi;
import com.cyhd.portalmvp.mvp.network.api.PortalApi;
import com.cyhd.portalmvp.mvp.network.api.SlbApi;
import com.cyhd.portalmvp.mvp.network.api.XmlEpgApi;
import com.lh.commonclasses.utils.LogUtil;

/**
 * Singleton Factory with retrofit
 */
public class ApiFactory {

    private final static String TAG = "ApiFactory";
    protected static final Object monitor = new Object();

    /**
     * Portal的基础url
     */
    static PortalApi mPortalApi = null;
    public static String AAA_PORTAL_BASE_URL = "http://" + UrlConstant.AAADomain + "/api/portalCore/";
    public static String SPAREAAA_PORTAL_BASE_URL = "http://" + UrlConstant.SPAREAAADomain + "/api/portalCore/";

    /**
     * 不用更换主备，请求调用此方法
     */
    public static PortalApi getPortalApi() {
        synchronized (monitor) {
            if (mPortalApi == null) {
                mPortalApi = ApiRetrofit.getCustomRetrofit(AAA_PORTAL_BASE_URL).create(PortalApi.class);
            }
            return mPortalApi;
        }
    }

    /**
     * 需要更换主备的调用此方法
     */
    public static PortalApi getPortalApiSwitch(int requestTimes) {
        synchronized (monitor) {
            if (requestTimes == 1) {
                LogUtil.i(TAG, "请求第一次ip=" + AAA_PORTAL_BASE_URL);
                mPortalApi = ApiRetrofit.getCustomRetrofit(AAA_PORTAL_BASE_URL).create(PortalApi.class);
            } else if (requestTimes == 2) {
                LogUtil.i(TAG, "请求第二次ip=" + SPAREAAA_PORTAL_BASE_URL);
                mPortalApi = ApiRetrofit.getCustomRetrofit(SPAREAAA_PORTAL_BASE_URL).create(PortalApi.class);
            }
            return mPortalApi;
        }
    }

    /**
     * xml格式节目预告
     */
    static XmlEpgApi mXmlEpgApi = null;

    public static XmlEpgApi getXmlEpgApi() {
        synchronized (monitor) {
            if (mXmlEpgApi == null) {
                mXmlEpgApi = ApiRetrofit.getXmlRetrofit("http://" + UrlConstant.DOMAIN_LIVE_EPG + "/").create(XmlEpgApi.class);
            }
            return mXmlEpgApi;
        }
    }

    /**
     * 请求slb地址的基础url
     */
    private static SlbApi mSlbApi = null;

    public static SlbApi getSlbApi(int requestTimes) {
        synchronized (monitor) {
            if (requestTimes == 1) {
                LogUtil.i(TAG, "请求第一次ip=" + UrlConstant.slb_url);
                mSlbApi = ApiRetrofit.getRetrofit(UrlConstant.slb_url).create(SlbApi.class);
            } else if (requestTimes == 2) {
                LogUtil.i(TAG, "请求第二次ip=" + UrlConstant.slb_spare_url);
                mSlbApi = ApiRetrofit.getRetrofit(UrlConstant.slb_spare_url).create(SlbApi.class);
            }
            return mSlbApi;
        }
    }

    /**
     * 直播请求播放地址的基础url
     *
     * @return
     */
    private static LivePlayUrlApi mLivePlayApi = null;

    public static LivePlayUrlApi getLivePlayUrlApi() {
        synchronized (monitor) {
            mLivePlayApi = ApiRetrofit.getRetrofit("http://" + UrlConstant.NEW_SLB_HOST + "/").create(LivePlayUrlApi.class);
            return mLivePlayApi;
        }
    }

    /**
     * apk上报接口的基础url
     */
    static DataCollectApi mDataCollectApi = null;

    public static DataCollectApi getDataCollectApi() {
        synchronized (monitor) {
            if (mDataCollectApi == null) {
                mDataCollectApi = ApiRetrofit.getRetrofit(UrlConstant.DATA_COLLECT_BASE_URL).create(DataCollectApi.class);
            }
            return mDataCollectApi;
        }
    }

    /**
     * 获取IP地址的基础url
     */
    static GetIPApi mGetIPApi = null;
    public static final String GETIP_BASE_URL = "https://api.ipify.org/";

    public static GetIPApi getGetIpApi() {
        synchronized (monitor) {
            if (mGetIPApi == null) {
                mGetIPApi = ApiRetrofit.getRetrofit(GETIP_BASE_URL).create(GetIPApi.class);
            }
            return mGetIPApi;
        }
    }
}
