package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.33portal_online_33：用户书签信息删除
 */
public class DelBookMarkBean {

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
     * 变更具体的书签信息;可选
     */
    private int bookMarkId;

    public DelBookMarkBean(String userToken, String userName, String portalCode, int bookMarkId) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.bookMarkId = bookMarkId;
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

    public int getBookMarkId() {
        return bookMarkId;
    }

    public void setBookMarkId(int bookMarkId) {
        this.bookMarkId = bookMarkId;
    }

    @Override
    public String toString() {
        return "DelBookMarkBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", bookMarkId=" + bookMarkId +
                '}';
    }
}
