package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.42portal_online_42：获取全部上架频道当天节目单
 */
public class GetTodayProgramBean {

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
     * 查询当前栏目的频道数据;必选
     */
    private int columnId;
    /**
     * 频道编码(内容唯一标识，资产编号,对应CDN的CHID);可选
     */
    private String channelCode;
    /**
     * 每页多少条;可选
     */
    private int pageSize;
    /**
     * 第几页;可选
     */
    private int pageNum;
    /**
     * 0：不需要回看节目单;1：需要回看节目单;可选
     */
    private String isBackProgram;
    /**
     * 标识接口版本,2.0：兼容1.0版本;可选
     */
    private String version;
    /**
     * 1：获取频道列表;可选
     */
    private String isChannelList;

    public GetTodayProgramBean(String userToken, String userName, String portalCode, int columnId,
                               String channelCode, int pageSize, int pageNum, String isBackProgram,
                               String version, String isChannelList) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.columnId = columnId;
        this.channelCode = channelCode;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.isBackProgram = isBackProgram;
        this.version = version;
        this.isChannelList = isChannelList;
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

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
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

    public String getIsBackProgram() {
        return isBackProgram;
    }

    public void setIsBackProgram(String isBackProgram) {
        this.isBackProgram = isBackProgram;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIsChannelList() {
        return isChannelList;
    }

    public void setIsChannelList(String isChannelList) {
        this.isChannelList = isChannelList;
    }

    @Override
    public String toString() {
        return "GetTodayProgramBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", columnId=" + columnId +
                ", channelCode='" + channelCode + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", isBackProgram='" + isBackProgram + '\'' +
                ", version='" + version + '\'' +
                ", isChannelList='" + isChannelList + '\'' +
                '}';
    }
}
