package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.31portal_online_31：用户书签信息新增
 */
public class AddBookMarkBean {

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
     * 枚举值：0:剧集;1:节目;;必选
     */
    private String type;
    /**
     * 终端类型：1:机顶盒;2:微投;3:PC;4:PHONE;5:PAD;99:其他;必选
     */
    private String platform;
    /**
     * 书签的内容ID，剧集或者节目的内容ID;必选
     */
    private String contentId;
    /**
     * 如果type=0时，必须填写具体的节目的内容ID;可选
     */
    private String programContentId;
    /**
     * 名称;必选
     */
    private String name;
    /**
     * 播放到的时间点，单位为秒;必选
     */
    private int time;

    public AddBookMarkBean(String userToken, String userName, String portalCode, String type,
                           String platform, String contentId, String programContentId, String name, int time) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.type = type;
        this.platform = platform;
        this.contentId = contentId;
        this.programContentId = programContentId;
        this.name = name;
        this.time = time;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "AddBookMarkBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", type='" + type + '\'' +
                ", platform='" + platform + '\'' +
                ", contentId='" + contentId + '\'' +
                ", programContentId='" + programContentId + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
