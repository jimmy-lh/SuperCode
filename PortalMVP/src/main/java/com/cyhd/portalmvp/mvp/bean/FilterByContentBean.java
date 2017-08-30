package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.39portal_online_39：用户节目筛选接口
 */
public class FilterByContentBean {

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
     * 地区;可选
     */
    private String originalCountry;
    /**
     * 类型;可选
     */
    private String tags;
    /**
     * 年份;可选
     */
    private String year;
    /**
     * 栏目的栏目ID;可选
     */
    private int columnId;
    /**
     * 每页多少条;必选
     */
    private int pageSize;
    /**
     * 第几页;必选
     */
    private int pageNum;

    public FilterByContentBean(String userToken, String userName, String portalCode,
                               String originalCountry, String tags, String year,
                               int columnId, int pageSize, int pageNum) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.originalCountry = originalCountry;
        this.tags = tags;
        this.year = year;
        this.columnId = columnId;
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

    public String getOriginalCountry() {
        return originalCountry;
    }

    public void setOriginalCountry(String originalCountry) {
        this.originalCountry = originalCountry;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
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
        return "FilterByContentBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", originalCountry='" + originalCountry + '\'' +
                ", tags='" + tags + '\'' +
                ", year='" + year + '\'' +
                ", columnId=" + columnId +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }
}
