package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.25portal_online_25：获取当前用户是否点赞接口
 */
public class QueryLoveClickFlagBean {

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
     * 枚举值：0:剧集;1:节目;必选
     */
    private String type;
    /**
     * 点赞的内容ID，剧集或者节目的内容ID;必选
     */
    private String contentId;

    public QueryLoveClickFlagBean(String userToken, String userName, String portalCode, String type, String contentId) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.type = type;
        this.contentId = contentId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @Override
    public String toString() {
        return "QueryLoveClickFlagBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", type='" + type + '\'' +
                ", contentId='" + contentId + '\'' +
                '}';
    }
}
