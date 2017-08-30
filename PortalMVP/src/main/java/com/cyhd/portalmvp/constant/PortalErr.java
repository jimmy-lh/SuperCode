package com.cyhd.portalmvp.constant;

/**
 * 访问Portal接口返回的errCode
 */
public class PortalErr {

    /**
     * 请求AAA失败
     */
    public static final String PORTAL_AAA = "portal100000";
    /**
     * 成功
     */
    public static final String PORTAL_OK = "0";
    /**
     * 参数异常
     */
    public static final String PORTAL_PARAMETER_EXCEPTION = "1";
    /**
     * 系统内部错误（未知错误）
     */
    public static final String PORTAL_SYSTEM = "500";
    /**
     * 数据库错误
     */
    public static final String PORTAL_DATABASE = "1000";
    /**
     * 1、系统过载保护
     */

    public static final String SYSTEM_OVERLOAD_PROTECTION ="800";

    ////////////////////////////////////////////////////////////////////////////
    //           用户激活接口
    ////////////////////////////////////////////////////////////////////////////
    /**
     * 激活失败，SN校验失败
     */
    public static final String PORTAL_SN = "aaa100010";
    /**
     * 激活失败，MAC地址不匹配
     */
    public static final String PORTAL_MAC = "aaa100011";
    /**
     * 终端数据不存在
     */
    public static final String PORTAL_DATA = "aaa100040";
    /**
     * 终端为禁用状态，激活失败
     */
    public static final String PORTAL_FORBIDDEN = "aaa100019";
    /**
     * 更新终端信息失败
     */
    public static final String PORTAL_UPDATE_TERMINAL = "aaa100042";
    /**
     * 用户所在区域为黑名单，激活失败
     */
    public static final String PORTAL_BLACKLIST = "aaa100017";
    /**
     * 用户所在区域不在白名单中，激活失败
     */
    public static final String PORTAL_NOTLIST = "aaa100018";
    /**
     * 更新用户信息失败
     */
    public static final String PORTAL_UPDATE_USER = "aaa100044";
    /**
     * 终端不是首次激活、但并没有绑定用户
     */
    public static final String PORTAL_TERMINAL_BIND = "aaa100055";
    /**
     * 用户信息插入数据库失败
     */
    public static final String PORTAL_USER_INSERT = "aaa100041";
    /**
     * 更新token信息失败
     */
    public static final String PORTAL_UPDATE_TOKEN = "aaa100045";
    /**
     * 生成授权信息失败
     */
    public static final String PORTAL_AUTH = "aaa100039";
    /**
     * 授权策略为禁用状态
     */
    public static final String PORTAL_AUTH_TACTICS = "aaa100050";

    ////////////////////////////////////////////////////////////////////////////////////
    //      用户心跳接口
    ////////////////////////////////////////////////////////////////////////////////////
    /**
     * 心跳检测，未登录（没有找到登录信息）
     */
    public static final String PORTAL_LOGIN = "aaa100028";
    /**
     * 心跳检测，MAC地址不匹配
     */
    public static final String PORTAL_HEART_MAC = "aaa100029";
    /**
     * 心跳检测，用户名不匹配
     */
    public static final String PORTAL_HEART_USER = "aaa100030";
    /**
     * token已失效
     */
    public static final String PORTAL_TOKEN = "aaa100027";

    //////////////////////////////////////////////////////////////////////////////////////
    //      获取栏目信息接口
    //////////////////////////////////////////////////////////////////////////////////////
    /**
     * 根栏目不存在
     */
    public static final String PORTAL_ROOT_COLUMN = "portal100022";

    //////////////////////////////////////////////////////////////////////////////////////
    //        获取栏目上架数据接口
    //////////////////////////////////////////////////////////////////////////////////////
    /**
     * 当前栏目不存在
     */
    public static final String PORTAL_CUR_COLUMN = "portal100023";

    public static final String STR_PRODUCT_WITHOUT_AUTH="ed1"; // 用户访问的产品未授权,栏目接口为未订购状态
    public static final String NO_ASSOCIATED_PORTAL="ed2"; // 没有关联门户
    public static final String STR_BOX_EPG_TIMEOUT_ERROR="eb2"; // 用户访问的产品未授权
    public static final String STR_NET_ERROR="EE1";//机顶盒本身没有网络
    public static final String STR_COLUMN_TIMEOUT = "EA7";//激活获取超时
    public static final String NO_MACADDR="no_macaddr"; // 没有获取到Mac地址
}
