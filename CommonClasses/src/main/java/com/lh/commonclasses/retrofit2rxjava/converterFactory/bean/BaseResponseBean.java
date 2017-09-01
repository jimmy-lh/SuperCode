package com.lh.commonclasses.retrofit2rxjava.converterFactory.bean;

public class BaseResponseBean {

    private String returnCode;
    private String errorMessage;

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

}
