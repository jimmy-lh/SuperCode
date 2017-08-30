package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/24.
 */
public class ExchangeResultData implements Serializable {

    private List<AuthInfoList> authInfoList;

    public List<AuthInfoList> getAuthInfoList() {
        return authInfoList;
    }

    public void setAuthInfoList(List<AuthInfoList> authInfoList) {
        this.authInfoList = authInfoList;
    }

    @Override
    public String toString() {
        return "ExchangeResultData{" +
                "authInfoList=" + authInfoList +
                '}';
    }
}
