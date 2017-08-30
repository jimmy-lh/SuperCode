package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

public class ActiveResultData implements Serializable {

    /**
     * 绑定的OTT账号用户名
     */
    private String userName;
    /**
     * 激活返回的token信息，用来心跳和其他接口调用时传递给后台进行校验
     */
    private String userToken;
    /**
     * 门户编码list
     */
    private List<PortalCodeList> portalCodeList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public List<PortalCodeList> getPortalCodeList() {
        return portalCodeList;
    }

    public void setPortalCodeList(List<PortalCodeList> portalCodeList) {
        this.portalCodeList = portalCodeList;
    }

    @Override
    public String toString() {
        return "ActiveResultData{" +
                "userName='" + userName + '\'' +
                ", userToken='" + userToken + '\'' +
                ", portalCodeList=" + portalCodeList +
                '}';
    }
}
