package com.cyhd.portalmvp.constant;

/**
 * 类说明：  播放器中间件通过UDP返回的消息的类型
 */
public class PlayConstant {


    /*
     * 错误码
     */
    public static final int KBMSG_LIBEXIT = 21010;    // 中间件异常退出
    public static final int KBMSG_UNAUTH_ERROR = 21500;    //  播放资源未授权
    public static final int KBMSG_LICENSE_EXPIRED = 21600;   //   播放权限授权过期
    public static final int KBMSG_RESOURCE_NOT_FOUND = 21700;    //   资源未找到
    public static final int KBMSG_NO_PUSH_TSTREAM = 21710;    //   服务器断流

    ////////////////////////////////////////////////////////////////////////////////
    //   状态码
    ////////////////////////////////////////////////////////////////////////////////
    /**
     * EC2:APK请求GSLB参数错误
     * 测试方式：请求gslb缺少user_id参数
     */
    public static final int KBMSG_CONNECTTIMEOUT = 20600;
    /**
     * EC3:连接数据库错误
     * 测试方式：把gslb的配置端口改成5433
     */
    public static final int KBMSG_CONNECTAUTHFAILED = 20700;
    /**
     * EC4:SN未激活
     * 测试方式：SN填写一个不存在的用户
     */
    public static final int KBMSG_EMS_LOWRESOURCE = 20800;
    /**
     * EC5:无可用的SLB
     * 测试方式：停止sn对应的组的所有slb
     */
    public static final int KBMSG_GSLB_NO_PROGRAM = 20900;
    /**
     * EC7:APK请求LSLB参数错误
     * 测试方式：请求lslb缺少所有参数
     */
    public static final int KBMSG_MOLLOCFAILE = 21000;
    /**
     * EC8:防盗链认证失败
     * 测试方式：拿已经失效的链接访问slb地址
     */
    public static final int KBMSG_SPPED_ERROR = 21100;
    /**
     * EC9:流不存在或没有发布
     * 测试方式：停掉一路流，apk请求该路流
     */
    public static final int PLAY_NOT_STREAM = 21200;
    /**
     * EC10:LSLB没有找到可用的服务器
     * 测试方式：停掉请求的LSLB对应的evlss
     */
    public static final int PLAY_MISS_SERVICE = 21300;


    ////////////////////////////////////////////////////////////////////////////////
    //    APK自判断,重25000开始
    ////////////////////////////////////////////////////////////////////////////////
    /**
     * EC1:APK与GSLB失联，请求超时;
     * 测试方式：停止gslb
     */
    public static final int PLAY_GSLB_DISCONNECT = 25100;
    /**
     * EC6:APK与LSLB失联，请求超时;
     * 测试方式：停止对应的slb
     */
    public static final int PLAY_LSLB_DISCONNECT = 25200;
    public static final int PLAY_LSLB_DISCONNECT1 = 20174;
    /**
     * EC11:盒子与EMS失联，请求超时,可能原因:
     * 1、EVLSS服务器访问失败
     * 2、EVLSS服务器死机
     * 3、EVLSS服务器无效
     * 4、EVLSS服务器程序死掉
     * 测试方式：产生边缘url后停掉 对应的evlss，或者产生一个不存在的播放地址
     */
    public static final int PLAY_EVLSS_DISCONNECT = 25300;
    public static final int PLAY_EVLSS_DISCONNECT1 = 20171;
    /**
     * EC12:EVLSS 可以连接但开始播放直播资源超时或失败;
     * 测试方式：evlss 配置一共错误的回源地址，导致不能回源拉流
     */
    public static final int PLAY_EVLSS_FAIL = 25400;

    /**
     * EC12:EVLSS 可以连接但开始播放直播资源超时或失败;
     * 测试方式：evlss 配置一共错误的回源地址，导致不能回源拉流
     */
    public static final int PLAY_EVLSS_FAIL1 =20172;

    /**
     * EC13:GSLB异常退出（http 404错误）
     * 测试方式：在gslb.lua中去掉一个require
     */
    public static final int PLAY_GSLB_EXCEPTION = 25500;
    /**
     * EC14:LSLB异常退出（http 404错误）
     * 测试方法：在live_lslb.lua中去掉一个require
     */
    public static final int PLAY_LSLB_EXCEPTION = 25600;
    /**
     * EC15:播放EVLSS直播资源播放成功后又断流或没有数据
     * 测试方式：干掉源站mvlss
     */
    public static final int PLAY_EVLSS_OK2ERR = 25700;

    /**
     * EC15:播放EVLSS直播资源播放成功后又断流或没有数据
     * 测试方式：干掉源站mvlss
     */
    public static final int PLAY_EVLSS_OK2ERR1 = 20173;

}
