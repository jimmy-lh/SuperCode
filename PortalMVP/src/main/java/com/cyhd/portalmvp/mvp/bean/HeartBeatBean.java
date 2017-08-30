package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.4portal_online_04：用户心跳接口
 */
public class HeartBeatBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * MAC地址
     * IOS系统：使用UUID，同一时间所有用户唯一
     * Android：优先使用LAN接口的MAC;
     * 必选
     */
    private String macAddr;

    public HeartBeatBean(String userToken, String userName, String macAddr) {
        this.userToken = userToken;
        this.userName = userName;
        this.macAddr = macAddr;
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

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    @Override
    public String toString() {
        return "HeartBeatBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", macAddr='" + macAddr + '\'' +
                '}';
    }
}
