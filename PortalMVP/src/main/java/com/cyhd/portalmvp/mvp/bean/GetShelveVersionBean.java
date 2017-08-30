package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.16portal_online_16：获取栏目上架数据版本号信息
 */
public class GetShelveVersionBean {

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
     * 查询当前栏目的上架数据版本号;必选
     */
    private int columnId;

    public GetShelveVersionBean(String userToken, String userName, String portalCode, int columnId) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.columnId = columnId;
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

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    @Override
    public String toString() {
        return "GetShelveVersionBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", columnId=" + columnId +
                '}';
    }
}
