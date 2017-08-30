package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.43portal_online_43：获取全部上架频道7天回看节目单
 */
public class GetAllbackProgramBean {

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
     * 标识接口版本,2.0：兼容1.0版本;可选
     */
    private String version;

    public GetAllbackProgramBean(String userToken, String userName, String portalCode, int columnId,
                                 String channelCode, int pageSize, int pageNum, String version) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.columnId = columnId;
        this.channelCode = channelCode;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.version = version;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "GetAllbackProgramBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", columnId=" + columnId +
                ", channelCode='" + channelCode + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", version='" + version + '\'' +
                '}';
    }
}
