package com.cyhd.portalmvp.mvp.bean;

import java.util.List;

/**
 * 4.1.6portal_online_06：用户鉴权接口
 */
public class AuthBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性；必选
     */
    private String userToken;
    /**
     * 用户名；必选
     */
    private String userName;
    /**
     * 需要鉴权的产品Code数组，只支持免费产品和包时段产品，
     * 任何一个产品鉴权通过返回鉴权成功，全部产品鉴权不通过返回批价信息;
     * 必选
     */
    private List<String> productCodeArr;

    public AuthBean(String userToken, String userName, List<String> productCodeArr) {
        this.userToken = userToken;
        this.userName = userName;
        this.productCodeArr = productCodeArr;
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

    public List<String> getProductCodeArr() {
        return productCodeArr;
    }

    public void setProductCodeArr(List<String> productCodeArr) {
        this.productCodeArr = productCodeArr;
    }

    @Override
    public String toString() {
        return "AuthBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", productCodeArr=" + productCodeArr +
                '}';
    }
}
