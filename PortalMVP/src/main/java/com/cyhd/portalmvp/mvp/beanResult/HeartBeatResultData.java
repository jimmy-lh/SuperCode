package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/12.
 */
public class HeartBeatResultData implements Serializable {

    /**
     * 目前服务端先返回原来的token，防止性能瓶颈，后续根据实际情况来看是否需要增加逻辑
     */
    private String userToken;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    @Override
    public String toString() {
        return "HeartBeatResultData{" +
                "userToken='" + userToken + '\'' +
                '}';
    }
}
