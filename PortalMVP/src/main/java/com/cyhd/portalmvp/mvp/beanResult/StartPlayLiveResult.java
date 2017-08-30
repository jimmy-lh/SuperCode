package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/11.
 * 4.1.22portal_online_22：直播鉴权接口
 */
public class StartPlayLiveResult implements Serializable {

    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private StartPlayLiveResultData data;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public StartPlayLiveResultData getData() {
        return data;
    }

    public void setData(StartPlayLiveResultData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "StartPlayLiveResult{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
