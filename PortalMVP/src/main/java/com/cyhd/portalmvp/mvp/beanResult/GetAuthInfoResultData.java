package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/26.
 */
class GetAuthInfoResultData implements Serializable {

    /**
     * 复合参数，authInfo集合
     */
    private List<AuthInfoList> authInfoList;

    /**
     * 当前系统时间
     */
    private String nowTime;

    public List<AuthInfoList> getAuthInfoList() {
        return authInfoList;
    }

    public void setAuthInfoList(List<AuthInfoList> authInfoList) {
        this.authInfoList = authInfoList;
    }

    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    @Override
    public String toString() {
        return "GetAuthInfoResultData{" +
                "authInfoList=" + authInfoList +
                ", nowTime='" + nowTime + '\'' +
                '}';
    }
}
