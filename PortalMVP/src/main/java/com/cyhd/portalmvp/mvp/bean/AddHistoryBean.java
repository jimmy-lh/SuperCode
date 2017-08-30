package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.34portal_online_34：用户播放历史信息记录
 */
public class AddHistoryBean {

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
     * 栏目ID，如果是从栏目进去的，传递当前栏目的id;可选
     */
    private int columnId;

    /**
     * 枚举值：0:剧集;1:节目;;必选
     */
    private String type;

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

    public AddHistoryBean(String userToken, String userName, String portalCode, String platform,
                          int columnId, String type, String contentId, String programContentId, String name) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.platform = platform;
        this.columnId = columnId;
        this.type = type;
        this.contentId = contentId;
        this.programContentId = programContentId;
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

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AddHistoryBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", platform='" + platform + '\'' +
                ", columnId=" + columnId +
                ", type='" + type + '\'' +
                ", contentId='" + contentId + '\'' +
                ", programContentId='" + programContentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
