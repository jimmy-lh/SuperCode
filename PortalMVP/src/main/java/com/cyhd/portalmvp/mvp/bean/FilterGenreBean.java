package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.40portal_online_40：获取用户节目筛选类型接口
 */
public class FilterGenreBean {

    /**
     * 登录用户的UserToken;必选
     */
    private String userToken;
    /**
     * 已经登录用户的用户名;必选
     */
    private String userName;
    /**
     * 门户编码;必选
     */
    private String portalCode;

    public FilterGenreBean(String userToken, String userName, String portalCode) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPortalCode() {
        return portalCode;
    }

    public void setPortalCode(String portalCode) {
        this.portalCode = portalCode;
    }

    @Override
    public String toString() {
        return "FilterGenreBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                '}';
    }
}
