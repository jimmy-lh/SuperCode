package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * 4.1.20portal_online_20：获取剧集/节目详情接口
 */
public class GetItemDataResult implements Serializable {

    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private GetItemDataResultData data;

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

    public GetItemDataResultData getData() {
        return data;
    }

    public void setData(GetItemDataResultData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetItemDataResult{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
