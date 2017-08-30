package com.cyhd.portalmvp.constant;

/**
 * 存放管理订阅用到的key常量
 */
public class RxConstant {


    /**
     * 获取IP地址
     */
    public final static String GET_IP = "get_ip";
    /**
     * 获取直播的播放地址
     */
    public final static String GET_LIVE_PLAY_URL = "get_live_play_url";
    /**
     * 获取slb地址
     */
    public final static String SLB = "slb";
    /**
     * apk上报数据
     */
    public final static String APK_PLAY = "apk_play";
    /**
     * 通过xml格式获取的epg节目
     */
    public final static String XML_EPG = "xml_epg";
    /************************************
     * portal接口开始
     ************************************/
    /**
     * 4.1.1portal_online_01：用户注册接口
     */
    public final static String REGISTER = "register";

    /**
     * 4.1.2portal_online_02：用户激活接口
     */
    public final static String ACTIVE = "active";

    /**
     * 4.1.3portal_online_03：用户认证接口
     */
    public final static String LOGIN = "login";
    /**
     * 4.1.4portal_online_04：用户心跳接口
     */
    public final static String HEART_BEAT = "heart_beat";
    /**
     * 4.1.5portal_online_05：产品批价接口
     */
    public final static String PRICE = "price";
    /**
     * 4.1.6portal_online_06：用户鉴权接口
     */
    public final static String AUTH = "auth";
    /**
     * 4.1.7portal_online_07：兑换码兑换接口
     */
    public final static String EXCHANGE = "exchange";
    /**
     * 4.1.8portal_online_08：在线订购接口
     */
    public final static String ONLINE_ORDER = "online_order";
    /**
     * 4.1.9portal_online_09：在线订购状态更新接口
     */
    public final static String UPDATE_ORDER_STATUS = "update_order_status";
    /**
     * 4.1.10portal_online_10：钱海确认接口
     */
    public final static String OCEANPAYMENT_CONFRIM_ORDER = "oceanpayment_confrim_order";
    /**
     * 4.1.11portal_online_11：用户信息获取接口
     */
    public final static String QUERY_OTT_ACCOUNT = "query_ott_account";
    /**
     * 4.1.12portal_online_12：用户信息修改接口
     */
    public final static String MODIFY_OTT_ACCOUNT = "modify_ott_account";
    /**
     * 4.1.13portal_online_13：用户授权信息获取接口
     */
    public final static String GET_AUTH_INFO = "get_auth_info";
    /**
     * 4.1.14portal_online_14：获取栏目信息接口
     */
    public final static String GET_COLUMN_CONTENTS = "get_column_contents";
    /**
     * 4.1.15portal_online_15：栏目批价接口
     */
    public final static String COLUMN_PRICE = "column_price";
    /**
     * 4.1.16portal_online_16：获取栏目上架数据版本号信息
     */
    public final static String GET_SHELVE_VERSION = "get_shelve_version";
    /**
     * 4.1.17portal_online_17：获取栏目上架数据接口,每隔30分钟循环访问的key值
     */
    public final static String GET_SHELVE_DATA = "get_shelve_data";
    /**
     * 4.1.17portal_online_17：获取栏目上架数据接口,只访问一次的key值
     */
    public final static String GET_SHELVE_DATA_ONCE = "get_shelve_data_once";
    /**
     * 4.1.18portal_online_18：获取频道回看节目单接口
     */
    public final static String GET_BTV_PROGRAM_GUIDES = "get_btv_program_guides";
    /**
     * 4.1.19portal_online_19：获取栏目推荐信息接口
     */
    public final static String GET_COLUMN_RECOMMEND_RESOURCE = "get_column_recommend_resource";
    /**
     * 4.1.20portal_online_20：获取剧集/节目详情接口
     */
    public final static String GET_ITEM_DATA = "get_item_data";
    /**
     * 4.1.21portal_online_21：点播鉴权接口
     */
    public final static String START_PLAY_VOD = "start_play_vod";
    /**
     * 4.1.22portal_online_22：直播鉴权接口
     */
    public final static String START_PLAY_LIVE = "start_play_live";
    /**
     * 4.1.23portal_online_23：回看鉴权接口
     */
    public final static String START_PLAY_BTV = "start_play_btv";
    /**
     * 4.1.24portal_online_24：点赞/取消点赞接口
     */
    public final static String LOVE_CLICK = "love_click";
    /**
     * 4.1.25portal_online_25：获取当前用户是否点赞接口
     */
    public final static String QUERY_LOVE_CLICK_FLAG = "query_love_click_flag";
    /**
     * 4.1.26portal_online_26：获取用户收藏列表
     */
    public final static String GET_FAVORITES = "get_favorites";
    /**
     * 4.1.27portal_online_27：用户收藏信息新增
     */
    public final static String ADD_FAVORITE = "add_favorite";
    /**
     * 4.1.28portal_online_28：用户收藏信息修改
     */
    public final static String UPDATE_FAVORITE = "update_favorite";
    /**
     * 4.1.29portal_online_29：用户收藏信息删除
     */
    public final static String DEL_FAVORITE = "del_favorite";
    /**
     * 4.1.30portal_online_30：获取用户书签信息列表
     */
    public final static String GET_BOOK_MARKS = "get_book_marks";
    /**
     * 4.1.31portal_online_31：用户书签信息新增
     */
    public final static String ADD_BOOK_MARK = "add_book_mark";
    /**
     * 4.1.32portal_online_32：用户书签信息修改
     */
    public final static String UPDATE_BOOK_MARK = "update_book_mark";
    /**
     * 4.1.33portal_online_33：用户书签信息删除
     */
    public final static String DEL_BOOK_MARK = "del_book_mark";
    /**
     * 4.1.34portal_online_34：用户播放历史信息记录
     */
    public final static String ADD_HISTORY = "add_history";
    /**
     * 4.1.35portal_online_35：获取推荐位信息
     */
    public final static String GET_RECOMMENDS = "get_recommends";
    /**
     * 4.1.36portal_online_36：影片名称搜索接口
     */
    public final static String SEARCH_BY_NAME = "search_by_name";
    /**
     * 4.1.37portal_online_37：导演OR演员搜索接口
     */
    public final static String SEARCH_BY_STAR = "search_by_star";
    /**
     * 4.1.38portal_online_38：相似影片搜索接口
     */
    public final static String SEARCH_BY_CONTENT = "search_by_content";
    /**
     * 4.1.39portal_online_39：用户节目筛选接口
     */
    public final static String FILTER_BY_CONTENT = "filter_by_content";
    /**
     * 4.1.40portal_online_40：获取用户节目筛选类型接口
     */
    public final static String FILTER_GENRE = "filter_genre";
    /**
     * 4.1.41portal_online_41：获取关键字联想
     */
    public final static String ASSOCIATE = "associate";
    /**
     * 4.1.42portal_online_42：获取全部上架频道当天节目单
     */
    public final static String GET_TODAY_PROGRAM = "get_today_program ";
    /**
     * 4.1.43portal_online_43：获取全部上架频道7天回看节目单
     */
    public final static String GET_ALLBACK_PROGRAM = "get_allback_program";

    /************************************
     * portal接口结束
     ************************************/
}
