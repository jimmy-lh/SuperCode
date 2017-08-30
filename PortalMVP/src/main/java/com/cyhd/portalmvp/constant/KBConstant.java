package com.cyhd.portalmvp.constant;

public class KBConstant {

//	  点播类型
	public static final int TYPE_NONE= 0;
	public static final int TYPE_VOD= 1;
	public static final int TYPE_LIVE= 2;
	
//	  默认点播的端口
	public static final int DEFAULT_VOD_PORT= 9998;
	public static final int DEFAULT_LIVE_PORT= 9997;
	
//  加密key
	public static final String KEY = "yuevideoiptv";
	
	public static final String AUTHSTRING_REGISTER = "authString";
	
	public static final int AUTH_NOT_START  = 21800; // 用户SN授权时间未开始，无法使用对应产品
	public static final int PRODUCT_WITHOUT_AUTH  = 21900; // 用户访问的产品未授权
	public static final int NOT_BELONG_GROUP  = 22000; // 用户SN不属于任何分组
	public static final int LICENSE_EXPIRED  = 23000; // 用户授权已过期
	
	public static final int INITIALIZATION_FAILURE  = 24000; // 请求EPG4B没有查到产品名
	public static final int CATETORY_ERROR  = 20510; // 产品没有对应的节目单
	public static final int BOX_EPG_TIMEOUT_ERROR  = 20520; // 	盒子与EPG失联，请求超时
	public static final int CATETORY_PARSE_ERROR  = 20530; // 节目单解析失败
	public static final int EPG_PARSE_TIMEOUT_ERROR  = 20540; // EPG服务器地址解析失败
	public static final int BOX_GSLB_TIMEOUT_ERROR  = 20600; // 盒子与GSLB失联，请求超时
	public static final int BOX_EMS_TIMEOUT_ERROR  = 20700; // 盒子与EMS失联
	public static final int EMS_LOW_RESOURCES_ERROR  = 20800; // EMS服务器资源不足连接更多用户
	public static final int GSLB_NO_DATA_ERROR  = 20900; // GSLB未查询到系统存在该节目
	public static final int ZHONGJJ_MALOOC_ERROR  = 21000; //中间件分配内存失败
	public static final int ZHONGJJ_EXIT_ERROR  = 21010; //中间件异常退出              
	public static final int BANDWIDTH_ERROR  = 21100;  //  用户上行带宽不足，与EMS服务器失联
	
//  apk sn注册，播放错误码定义
	public static final int NET_ERROR  = 00001; // 网络错误码
	public static final int SN_ERROR  = 20000; // SN错误
	public static final int AAA_BOX_TIMEOUT_ERROR  = 20100; // 盒子与AAA请求超时
	public static final int AAA_EPG4B_TIMEOUT_ERROR  = 20200; // AAA与EPG4B请求超时
	public static final int AAA_PARSE_ERROR  = 20210; // AAA地址解析失败 
	public static final int EPG4B_NOPRODUCT_ERROR  = 20300; // 请求EPG4B可以查到产品名，
	public static final int ZHONGJIANJIAN_LOW_ERROR  = 20400; // 但在AAA数据库中无产品信息  机顶盒中间件版本过低，需要更新APK
	public static final int ZHONGJIANJIAN_DATA_ERROR  = 20500; // 无效协议数据	
	public static final int AUTH_NO_START = 21800; //授权时间未开始
	public static final int AUTH_NO_USER  = 21900; //用户未授权
	public static final int AUTH_NO_USER_GRUOP  = 22000; //用户不属于任何分组              
	public static final int INTERNAL_ACCESS = 23000;  // 国内访问
	public static final int NOT_USE_IN_BUY_PLACE = 24000;  // 不在购买地使用
	public static final int NO_MORE_THAN_SET_TIME = 90000;  // 没有超过24小时
	public static final int NO_GET_NET_TIME = 90001;  // 未获取到时间


	// cdn 2.0 新增错误码
	public static String ERRORAL100010 = "al100010";
	public static String ERRORAL100011 = "al100011";
	public static String ERRORAL100017 = "al100017";
	public static String ERRORAL100018 = "al100018";
	public static String ERRORAL100019 = "al100019";
	public static String ERRORAL100039= "al100039";
	public static String ERRORAL100040= "al100040";
	public static String ERRORAL100041= "al100041";
	public static String ERRORAL100042= "al100042";
	public static String ERRORAL100044= "al100044";
	public static String ERRORAL100045= "al100045";
	public static String ERRORAL100050= "al100050";
	public static String ERRORAL100055= "al100055";

	public static String ERROR1= "1";
	public static String ERROR500= "500";
	public static String ERROR800= "800";
	public static String ERROR1000= "1000";
	public static String ERRORPORTAL100000= "portal100000";
	public static String ERRORPORTAL100022= "portal100022";
	public static String ERRORPORTAL100023= "portal100023";




}
