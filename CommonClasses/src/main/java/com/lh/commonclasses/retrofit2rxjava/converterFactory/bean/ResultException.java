package com.lh.commonclasses.retrofit2rxjava.converterFactory.bean;

import java.io.IOException;

public class ResultException extends IOException {

    private String returnCode;
    private String errorMessage;

    public ResultException(String returnCode, String errorMessage) {
        this.returnCode = returnCode;
        this.errorMessage = errorMessage;
    }

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
