package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.17portal_online_17：获取栏目上架数据接口
 */
public class GetShelveDataBean {

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
     * 栏目类型：1：直播;2：点播;必选
     */
    private String columnType;
    /**
     * 每页多少条;必选
     */
    private int pageSize;
    /**
     * 第几页;必选
     */
    private int pageNum;
    /**
     * 此参数有值时，以此参数作为展示条数，pageSize和pageNum相乘作为起始值;可选
     * 注意：正整数
     */
    private int numDisplay;

    public GetShelveDataBean(String userToken, String userName, String portalCode, int columnId,
                             String columnType, int pageSize, int pageNum) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.columnId = columnId;
        this.columnType = columnType;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public GetShelveDataBean(String userToken, String userName, String portalCode, int columnId,
                             String columnType, int pageSize, int pageNum, int numDisplay) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.columnId = columnId;
        this.columnType = columnType;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.numDisplay = numDisplay;
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

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getNumDisplay() {
        return numDisplay;
    }

    public void setNumDisplay(int numDisplay) {
        this.numDisplay = numDisplay;
    }

    @Override
    public String toString() {
        return "GetShelveDataBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", columnId=" + columnId +
                ", columnType='" + columnType + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", numDisplay=" + numDisplay +
                '}';
    }
}
