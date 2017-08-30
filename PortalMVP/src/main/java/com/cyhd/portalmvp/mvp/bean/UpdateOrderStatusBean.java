package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.9portal_online_09：在线订购状态更新接口
 */
public class UpdateOrderStatusBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * 订单号，在线支付确认时需要回传;可选
     */
    private String orderCode;
    /**
     * 2:支付中
     * 3:支付失败
     * 注意：只能取上述值，其他值报错;
     * 可选
     */
    private String payStatus;

    public UpdateOrderStatusBean(String userToken, String userName, String orderCode, String payStatus) {
        this.userToken = userToken;
        this.userName = userName;
        this.orderCode = orderCode;
        this.payStatus = payStatus;
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

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Override
    public String toString() {
        return "UpdateOrderStatusBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", orderCode='" + orderCode + '\'' +
                ", payStatus='" + payStatus + '\'' +
                '}';
    }
}
