package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.13portal_online_13：用户授权信息获取接口
 */
public class GetAuthInfoBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * 枚举值：
     * 1：查询有效的授权信息
     * 2：查询3个月内失效的授权信息;
     * 必选
     */
    private String type;

    /**
     * 订购的产品
     */
    private String productCode;

    public GetAuthInfoBean(String userToken, String userName, String type, String productCode) {
        this.userToken = userToken;
        this.userName = userName;
        this.type = type;
        this.productCode = productCode;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "GetAuthInfoBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", type='" + type + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}
