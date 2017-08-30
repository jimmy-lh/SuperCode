package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.27portal_online_27：用户收藏信息新增
 */
public class AddFavoriteBean {

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
     * 终端类型：1:机顶盒;2:微投;3:PC;4:PHONE;5:PAD;99:其他;必选
     */
    private String platform;
    /**
     * 枚举值：0:剧集;1:节目;必选
     */
    private String type;
    /**
     * 收藏的内容ID，剧集或者节目的内容ID;必选
     */
    private String contentId;
    /**
     * 名称;必选
     */
    private String name;

    public AddFavoriteBean(String userToken, String userName, String portalCode, String platform, String type, String contentId, String name) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.platform = platform;
        this.type = type;
        this.contentId = contentId;
        this.name = name;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AddFavoriteBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", platform='" + platform + '\'' +
                ", type='" + type + '\'' +
                ", contentId='" + contentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
