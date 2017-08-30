package com.cyhd.portalmvp.constant;

/**
 * Created by fanjia on 2017/7/5.
 */

public class HttpResultErrorCode {


    // 未知错误
    public static final String UNKNOWN = "1000";

    // 解析错误
    public static final String PARSE_ERROR = "1001";

    //对应HTTP的状态码
    public static final int UNAUTHORIZED = 401;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;
    public static final int REQUEST_TIMEOUT = 408;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int BAD_GATEWAY = 502;
    public static final int SERVICE_UNAVAILABLE = 503;
    public static final int GATEWAY_TIMEOUT = 504;

}
