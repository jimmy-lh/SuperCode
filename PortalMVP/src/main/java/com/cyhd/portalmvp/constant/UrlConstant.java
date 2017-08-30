package com.cyhd.portalmvp.constant;

import com.cyhd.portalmvp.BuildConfig;

/**
 * Created on 2017/7/19.
 */
public class UrlConstant {

    /**
     * 请求slb地址
     * 请求消息样例：
     * http://ip:port/gslb/live?user_id= xxxxxxxx-xxxx&class=live&trans_id=xxxxxx
     * 响应消息样例：
     * {
     * “return_code”:0,
     * “code_desc”: “Success”,
     * “slb_host”: “127.0.0.1:8888”
     * <p>
     * }
     */
    public static final String glsb_domain = BuildConfig.DOMAIN_LIVE_GSLB;
    public static final String slb_url = "http://" + glsb_domain + "/";
    public static final String glsb_spare_domain = BuildConfig.DOMAIN_LIVE_GSLB;
    public static final String slb_spare_url = "http://" + glsb_spare_domain + "/";
    //默認SLB地址
    public static String DEFUALT_SLB_HOST = "198.168.1.1:8080";
    //SLB地址
    public static String NEW_SLB_HOST = "198.168.1.1:8080";
    //缓存的SLB地址
    public static String CACHE_SLB_HOST = "";

    //数据上报接口
    public static final String DATA_COLLECT_BASE_URL = "http://" + BuildConfig.DOMAIN_COLLECT_DATA + "/";

    /**
     * 直播节目预告
     */
    public static String DOMAIN_LIVE_EPG = BuildConfig.DOMAIN_EPG;

    //激活主域名
    public static String AAADomain = BuildConfig.DOMAIN_AAA_1;
    //激活备域名
    public static String SPAREAAADomain = BuildConfig.DOMAIN_AAA_2;

}
