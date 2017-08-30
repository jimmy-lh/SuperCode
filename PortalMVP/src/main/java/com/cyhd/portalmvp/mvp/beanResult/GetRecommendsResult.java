package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * 4.1.35portal_online_35：获取推荐位信息
 */
public class GetRecommendsResult implements Serializable {

    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private GetRecommendsResultData data;

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

    public GetRecommendsResultData getData() {
        return data;
    }

    public void setData(GetRecommendsResultData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetRecommendsResult{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
