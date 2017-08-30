package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.29portal_online_29：用户收藏信息删除
 */
public class DelFavoriteBean {

    /**
     * 登录用户的UserToken;必选
     */
    private String userToken;
    /**
     * 已经登录用户的用户名;必选
     */
    private String userName;

    /**
     * 变更具体的收藏信息;可选
     */
    private int favoriteId;

    public DelFavoriteBean(String userToken, String userName, int favoriteId) {
        this.userToken = userToken;
        this.userName = userName;
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

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    @Override
    public String toString() {
        return "DelFavoriteBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", favoriteId=" + favoriteId +
                '}';
    }
}
