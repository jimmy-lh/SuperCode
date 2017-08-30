package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.22portal_online_22：直播鉴权接口
 */
public class StartPlayLiveBean {

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
     * 枚举值，请求播放类型：0:栏目下请求播放;1:其他情况;必选
     */
    private String type;
    /**
     * 当type=0时，此值必须填写，填写一级栏目的栏目ID;可选
     */
    private int columnId;
    /**
     * 需要播放的频道编码;必选
     */
    private String channelCode;

    public StartPlayLiveBean(String userToken, String userName, String portalCode, String type, int columnId, String channelCode) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.type = type;
        this.columnId = columnId;
        this.channelCode = channelCode;
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

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Override
    public String toString() {
        return "StartPlayLiveBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", type='" + type + '\'' +
                ", columnId=" + columnId +
                ", channelCode='" + channelCode + '\'' +
                '}';
    }
}
