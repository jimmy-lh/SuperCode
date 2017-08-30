package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.36portal_online_36：影片名称搜索接口
 */
public class SearchByNameBean {

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
     * 栏目的栏目ID;可选
     */
    private int columnId;
    /**
     * 搜索关键字（支持拼音）;必选
     */
    private String value;
    /***枚举：1：全局;2：只搜索一级栏目下面的内容;3：查询当前栏目;必选
     */
    private String type;
    /**
     * 每页多少条;可选
     */
    private int pageSize;
    /**
     * 第几页;可选
     */
    private int pageNum;

    public SearchByNameBean(String userToken, String userName, String portalCode, int columnId,
                            String value, String type, int pageSize, int pageNum) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.columnId = columnId;
        this.value = value;
        this.type = type;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "SearchByNameBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", columnId=" + columnId +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }
}
