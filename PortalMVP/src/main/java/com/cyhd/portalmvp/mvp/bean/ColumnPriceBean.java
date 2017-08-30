package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.15portal_online_15：栏目批价接口
 */
public class ColumnPriceBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * 一级栏目id;必选
     */
    private int columnId;

    public ColumnPriceBean(String userToken, String userName, int columnId) {
        this.userToken = userToken;
        this.userName = userName;
        this.columnId = columnId;
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

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    @Override
    public String toString() {
        return "ColumnPriceBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", columnId=" + columnId +
                '}';
    }
}
