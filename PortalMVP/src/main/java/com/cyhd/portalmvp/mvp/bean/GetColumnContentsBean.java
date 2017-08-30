package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.14portal_online_14：获取栏目信息接口
 */
public class GetColumnContentsBean {

    /**
     * 如果用户已经登陆则填写真实的userToken，如果用户未登录，则由终端随机一个uuid，
     * 带此值的目的是分析日志和业务流程使用;
     * 必选
     */
    private String userToken;
    /**
     * 如果用户已经登陆，则填写用户的名称，如果用户未登录，
     * 则填写固定值“tempUserName”，带此值的目的是分析日志和业务流程使用;
     * 必选
     */
    private String userName;
    /**
     * 门户编码；必选
     */
    private String portalCode;
    /**
     * 为空时或者不传时表示查询根栏目信息；可选
     */
//    private int columnId;
//    /**
//     * 表示是查询专题还是非专题栏目:
//     * 0:非专题
//     * 1:专题；
//     * 可选
//     */
//    private String specialFlag;
//    /**
//     * 当前页数；可选
//     */
//    private int pageNum;
//    /**
//     * 每页展示的条数，不传默认为10；可选
//     */
//    private int pageSize;
//    /**
//     * 此参数有值时，以此参数作为展示条数，pageSize和pageNum相乘作为起始值（TV端使用）；可选
//     */
//    private int numDisplay;
    /**
     * 标识接口版本
     * 2.0：兼容1.0版本；
     * 可选
     */
//    private String version;

    public GetColumnContentsBean(String userToken, String userName, String portalCode) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
    }

//    public GetColumnContentsBean(String userToken, String userName, String portalCode, int columnId,
//                                 String specialFlag, int pageNum, int pageSize, int numDisplay, String version) {
//        this.userToken = userToken;
//        this.userName = userName;
//        this.portalCode = portalCode;
//        this.columnId = columnId;
//        this.specialFlag = specialFlag;
//        this.pageNum = pageNum;
//        this.pageSize = pageSize;
//        this.numDisplay = numDisplay;
//        this.version = version;
//    }

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

//    public int getColumnId() {
//        return columnId;
//    }
//
//    public void setColumnId(int columnId) {
//        this.columnId = columnId;
//    }

//    public String getSpecialFlag() {
//        return specialFlag;
//    }
//
//    public void setSpecialFlag(String specialFlag) {
//        this.specialFlag = specialFlag;
//    }

//    public int getPageNum() {
//        return pageNum;
//    }
//
//    public void setPageNum(int pageNum) {
//        this.pageNum = pageNum;
//    }
//
//    public int getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public int getNumDisplay() {
//        return numDisplay;
//    }
//
//    public void setNumDisplay(int numDisplay) {
//        this.numDisplay = numDisplay;
//    }

//    public String getVersion() {
//        return version;
//    }
//
//    public void setVersion(String version) {
//        this.version = version;
//    }

//    @Override
//    public String toString() {
//        return "GetColumnContentsBean{" +
//                "userToken='" + userToken + '\'' +
//                ", userName='" + userName + '\'' +
//                ", portalCode='" + portalCode + '\'' +
//                ", columnId=" + columnId +
//                ", specialFlag='" + specialFlag + '\'' +
//                ", pageNum=" + pageNum +
//                ", pageSize=" + pageSize +
//                ", numDisplay=" + numDisplay +
//                ", version='" + version + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "GetColumnContentsBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
//                ", columnId=" + columnId +
                '}';
    }
}
