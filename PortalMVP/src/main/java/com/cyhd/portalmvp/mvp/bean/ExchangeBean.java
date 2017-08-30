package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.7portal_online_07：兑换码兑换接口
 */
public class ExchangeBean {

    /**
     * 用户名：可以给自己兑换，也可以给其他用户兑换，当输入的用户名不存在时，
     * 返回错误，自己兑换由终端根据实际情况自动填充userName;
     * 必选
     */
    private String userName;
    /**
     * 需要兑换的兑换码；必选
     */
    private String exchangeCode;

    public ExchangeBean(String userName, String exchangeCode) {
        this.userName = userName;
        this.exchangeCode = exchangeCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    @Override
    public String toString() {
        return "ExchangeBean{" +
                "userName='" + userName + '\'' +
                ", exchangeCode='" + exchangeCode + '\'' +
                '}';
    }
}
