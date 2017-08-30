package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.41portal_online_41：获取关键字联想
 */
public class AssociateBean {

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
    /**
     * 搜索关键字;必选
     */
    private String value;

    public AssociateBean(String userToken, String userName, String portalCode, String value) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.value = value;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AssociateBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
