package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.18portal_online_18：获取频道回看节目单接口
 */
public class GetBTVProgramGuidesBean {
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
     * 频道编码(内容唯一标识，资产编号,对应CDN的CHID);必选
     */
    private String channelCode;

    public GetBTVProgramGuidesBean(String userToken, String userName, String portalCode, String channelCode) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
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

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Override
    public String toString() {
        return "GetBTVProgramGuidesBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", channelCode='" + channelCode + '\'' +
                '}';
    }
}
