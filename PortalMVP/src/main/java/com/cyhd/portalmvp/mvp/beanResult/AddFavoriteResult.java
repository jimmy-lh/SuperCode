package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * 4.1.27portal_online_27：用户收藏信息新增
 */
public class AddFavoriteResult implements Serializable {

    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AddFavoriteResult{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
