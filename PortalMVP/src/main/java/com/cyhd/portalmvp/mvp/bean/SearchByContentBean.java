package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.38portal_online_38：相似影片搜索接口
 */
public class SearchByContentBean {

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
     * 枚举值：
     * 0:剧集
     * 1:节目;必选
     */
    private String type;
    /**
     * 需要搜索的内容ID;必选
     */
    private String contentId;
    /**
     * 查询开始记录，从1开始;必选
     */
    private int start;
    /**
     * 查询结束记录，大于等于start值，小于等于50;必选
     */
    private int end;
    /**
     * 排除节目类型,枚举值：movie:电影;teleplay：电视剧;variety:综艺;documentary:纪实;
     * cartoon:卡通;news:热点（多值可用逗号分隔）;可选
     */
    private String programType;

    public SearchByContentBean(String userToken, String userName, String portalCode, String type,
                               String contentId, int start, int end, String programType) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.type = type;
        this.contentId = contentId;
        this.start = start;
        this.end = end;
        this.programType = programType;
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

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    @Override
    public String toString() {
        return "SearchByContentBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", type='" + type + '\'' +
                ", contentId='" + contentId + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", programType='" + programType + '\'' +
                '}';
    }
}
