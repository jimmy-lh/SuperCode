package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.11portal_online_11：用户信息获取接口
 */
public class QueryOttAccountBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;

    public QueryOttAccountBean(String userToken, String userName) {
        this.userToken = userToken;
        this.userName = userName;
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

    @Override
    public String toString() {
        return "QueryOttAccountBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
