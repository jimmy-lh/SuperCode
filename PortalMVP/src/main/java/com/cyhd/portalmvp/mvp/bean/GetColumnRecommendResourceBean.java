package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.19portal_online_19：获取栏目推荐信息接口
 */
public class GetColumnRecommendResourceBean {

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
     * 查询当前栏目的上架数据;必选
     */
    private int columnId;
    /**
     * 栏目类型：1：直播;2：回看;3：点播;必选
     */
    private String columnType;

    public GetColumnRecommendResourceBean(String userToken, String userName, String portalCode, int columnId, String columnType) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.columnId = columnId;
        this.columnType = columnType;
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

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Override
    public String toString() {
        return "GetColumnRecommendResourceBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", columnId=" + columnId +
                ", columnType='" + columnType + '\'' +
                '}';
    }
}
