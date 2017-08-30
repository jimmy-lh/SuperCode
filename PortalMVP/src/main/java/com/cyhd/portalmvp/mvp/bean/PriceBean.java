package com.cyhd.portalmvp.mvp.bean;

import java.util.List;

/**
 * 4.1.5portal_online_05：产品批价接口
 */
public class PriceBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * 需要批价的产品Code数组;可选
     */
    private List<String> productCodeArr;
    /**
     * 需要批价的套餐Code数组;可选
     */
    private List<String> packageCodeArr;

    public PriceBean(String userToken, String userName, List<String> productCodeArr, List<String> packageCodeArr) {
        this.userToken = userToken;
        this.userName = userName;
        this.productCodeArr = productCodeArr;
        this.packageCodeArr = packageCodeArr;
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

    public List<String> getPackageCodeArr() {
        return packageCodeArr;
    }

    public void setPackageCodeArr(List<String> packageCodeArr) {
        this.packageCodeArr = packageCodeArr;
    }

    @Override
    public String toString() {
        return "PriceBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", productCodeArr=" + productCodeArr +
                ", packageCodeArr=" + packageCodeArr +
                '}';
    }
}
