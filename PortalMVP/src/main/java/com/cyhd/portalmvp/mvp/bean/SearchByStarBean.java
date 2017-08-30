package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.37portal_online_37：导演OR演员搜索接口
 */
public class SearchByStarBean {

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
     * 搜索关键字，导演或者演员的名字;必选
     */
    private String value;
    /**
     * 每页多少条;必选
     */
    private int pageSize;
    /**
     * 第几页;必选
     */
    private int pageNum;

    public SearchByStarBean(String userToken, String userName, String portalCode, String value, int pageSize, int pageNum) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.value = value;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        return "SearchByStarBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", value='" + value + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }
}
