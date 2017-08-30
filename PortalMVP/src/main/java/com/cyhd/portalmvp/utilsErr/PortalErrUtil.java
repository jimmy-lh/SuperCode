package com.cyhd.portalmvp.utilsErr;

/**
 * 存取访问Portal接口返回的errCode
 */
public class PortalErrUtil {

    private static PortalErrUtil mPortalErrUtil;

    private static String errCode = "";

    private PortalErrUtil() {

    }

    public static synchronized PortalErrUtil getInstance() {
        if (mPortalErrUtil == null) {
            mPortalErrUtil = new PortalErrUtil();
        }
        return mPortalErrUtil;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        PortalErrUtil.errCode = errCode;
    }
}
