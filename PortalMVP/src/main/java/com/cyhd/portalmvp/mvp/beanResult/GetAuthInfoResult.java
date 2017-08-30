package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/11.
 * 4.1.13portal_online_13：用户授权信息获取接口
 */

public class GetAuthInfoResult implements Serializable{
    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private GetAuthInfoResultData data;

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

    public GetAuthInfoResultData getData() {
        return data;
    }

    public void setData(GetAuthInfoResultData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetAuthInfoResult{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
