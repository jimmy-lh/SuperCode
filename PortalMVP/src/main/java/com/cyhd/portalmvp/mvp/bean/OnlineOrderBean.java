package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.8portal_online_08：在线订购接口
 */
public class OnlineOrderBean {
    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * 订购的产品;可选
     */
    private String productCode;
    /**
     * 订购的套餐包;可选
     */
    private String packageCode;
    /**
     * 如果是产品是整包按次，传入订购的剧集contentId，如果产品是单片按次，传入订购的节目contentId;可选
     */
    private String contentId;

    public OnlineOrderBean(String userToken, String userName, String productCode, String packageCode, String contentId) {
        this.userToken = userToken;
        this.userName = userName;
        this.productCode = productCode;
        this.packageCode = packageCode;
        this.contentId = contentId;
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @Override
    public String toString() {
        return "OnlineOrderBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", packageCode='" + packageCode + '\'' +
                ", contentId='" + contentId + '\'' +
                '}';
    }
}
