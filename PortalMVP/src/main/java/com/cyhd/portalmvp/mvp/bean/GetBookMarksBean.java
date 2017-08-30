package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.30portal_online_30：获取用户书签信息列表
 */
public class GetBookMarksBean {

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
     * 枚举值：0:剧集;1:节目;可选
     */
    private String type;
    /**
     * 书签的内容ID，剧集或者节目的内容ID;可选
     */
    private String contentId;
    /**
     * 如果type=0，则此值表示剧集的具体哪一集的书签信息;可选
     */
    private String programContentId;

    public GetBookMarksBean(String userToken, String userName, String portalCode, String type, String contentId, String programContentId) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.type = type;
        this.contentId = contentId;
        this.programContentId = programContentId;
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

    public String getProgramContentId() {
        return programContentId;
    }

    public void setProgramContentId(String programContentId) {
        this.programContentId = programContentId;
    }

    @Override
    public String toString() {
        return "GetBookMarksBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", type='" + type + '\'' +
                ", contentId='" + contentId + '\'' +
                ", programContentId='" + programContentId + '\'' +
                '}';
    }
}
