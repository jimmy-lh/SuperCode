package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.28portal_online_28：用户收藏信息修改
 */
public class UpdateFavoriteBean {

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
     * 变更具体的收藏信息;必选
     */
    private int favoriteId;

    public UpdateFavoriteBean(String userToken, String userName, String portalCode, int favoriteId) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.favoriteId = favoriteId;
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

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    @Override
    public String toString() {
        return "UpdateFavoriteBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", favoriteId=" + favoriteId +
                '}';
    }
}
