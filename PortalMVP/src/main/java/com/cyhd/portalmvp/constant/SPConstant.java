package com.cyhd.portalmvp.constant;

import com.cyhd.portalmvp.BuildConfig;
import com.cyhd.portalmvp.base.BaseApp;
import com.cyhd.portalmvp.mvp.beanResult.GetColumnContentsResult;
import com.cyhd.portalmvp.mvp.beanResult.GetShelveDataResult;
import com.cyhd.portalmvp.utils.DesUtil;
import com.lh.commonclasses.utils.SPUtil;

/**
 * 常量工具类，存放SharedPreference的key
 * 保存在本地需要加密解密的，可以在这个类增加中间方法
 * 参考USER_TOKEN
 */
public class SPConstant {

    /**
     * 请求4.1.13用户授权信息获取接口
     */
    public static final String AUTH_TIME = "auth_time";

    public static String getAuthTime() {
        return DesUtil.decryptByUnconditional(
                SPUtil.getString(BaseApp.getContext(), SPConstant.AUTH_TIME));
    }

    public static void setAuthTime(String authTime) {
        SPUtil.putString(BaseApp.getContext(), SPConstant.AUTH_TIME, DesUtil.encryptByUncondition(authTime));
    }

    /**
     * 分类；栏目ID
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 存儲slb地址
     */
    public static final String SLB_HOST = "slb_host";

    /**
     * 4.1.14portal_online_14：获取栏目信息接口
     */
    public static GetColumnContentsResult column_content_result;

    /**
     * 4.1.17获取栏目上架数据接口返回數據
     */
    public static GetShelveDataResult shelve_result;
    /**
     * 是否授權完成
     */
    public static boolean request_activation_done = false;

    /**
     * 節目單是否獲取完成
     */
    public static boolean request_epg_done = false;

    /**
     * SLB地址是否請求完成
     */
    public static boolean request_slb_done = false;

    public static final int PRODUCT_WITHOUT_AUTH = 21900; // 用户访问的产品未授权

    /**
     * 直播节目预告
     */
    public static String DOMAIN_LIVE_EPG = BuildConfig.DOMAIN_EPG;

    /**
     * 获取授权信息
     */
    public static String AUTH_RESULT = "auth_result";

    /**
     * 存储on_close事件
     */
    public static String ON_CLOSE_INFO = "on_close_info";

    /**
     * SharedPreferences 保存用户是否第一次进入apk
     */
    public final static String USER_ENTER_STATE = "user_enter_state";

    /**
     * 激活返回的token信息，用来心跳和其他接口调用时传递给后台进行校验
     */
    public final static String USER_TOKEN = "user_token";
    /**
     * 绑定的OTT账号用户名,实际上就是机器的sn号
     */
    public final static String USER_NAME = "user_name";
    /**
     * 门户编码
     */
    public final static String PORTAL_CODE = "portal_code";

    /**
     * 从本地获取userToken
     */
    public static String getUserToken() {
        return DesUtil.decryptByUnconditional(
                SPUtil.getString(BaseApp.getContext(), SPConstant.USER_TOKEN));
    }

    /**
     * 将userToken保存到本地
     */
    public static void setUserToken(String userToken) {
        SPUtil.putString(BaseApp.getContext(), SPConstant.USER_TOKEN, DesUtil.encryptByUncondition(userToken));
    }

    /**
     * 从本地获取userName
     */
    public static String getUserName() {
        return DesUtil.decryptByUnconditional(
                SPUtil.getString(BaseApp.getContext(), SPConstant.USER_NAME));
    }

    /**
     * 将userName保存到本地
     */
    public static void setUserName(String userName) {
        SPUtil.putString(BaseApp.getContext(), SPConstant.USER_NAME, DesUtil.encryptByUncondition(userName));
    }

    /**
     * 从本地获取portalCode
     */
    public static String getPortalCode() {
        return DesUtil.decryptByUnconditional(
                SPUtil.getString(BaseApp.getContext(), SPConstant.PORTAL_CODE));
    }

    /**
     * 将portalCode保存到本地
     */
    public static void setPortalCode(String portalCode) {
        SPUtil.putString(BaseApp.getContext(), SPConstant.PORTAL_CODE, DesUtil.encryptByUncondition(portalCode));
    }
}
