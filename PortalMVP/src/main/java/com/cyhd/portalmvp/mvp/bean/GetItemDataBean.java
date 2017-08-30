package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.20portal_online_20：获取剧集/节目详情接口
 */
public class GetItemDataBean {

    /**
     * 如果用户已经登陆则填写真实的userToken，如果用户未登录，则由终端随机一个uuid，带此值的目的是分析日志和业务流程使用;必选
     */
    private String userToken;
    /**
     * 如果用户已经登陆，则填写用户的名称，如果用户未登录，则填写固定值“tempUserName”，带此值的目的是分析日志和业务流程使用;必选
     */
    private String userName;
    /**
     * 门户编码;必选
     */
    private String portalCode;
    /**
     * 内容ID;必选
     */
    private String contentId;
    /**
     * 枚举值：0:剧集;1:节目;必选
     */
    private String type;
    /**
     * 0：升序 1：降序;可选
     */
    private String sortType;

    public GetItemDataBean(String userToken, String userName, String portalCode, String contentId, String type, String sortType) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.contentId = contentId;
        this.type = type;
        this.sortType = sortType;
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

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public String toString() {
        return "GetItemDataBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", contentId='" + contentId + '\'' +
                ", type='" + type + '\'' +
                ", sortType='" + sortType + '\'' +
                '}';
    }
}
