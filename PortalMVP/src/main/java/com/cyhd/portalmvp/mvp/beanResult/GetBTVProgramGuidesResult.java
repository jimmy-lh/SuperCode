package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/11.
 * 4.1.18portal_online_18：获取频道回看节目单接口
 */
public class GetBTVProgramGuidesResult implements Serializable {

    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private GetBTVProgramGuidesResultData data;

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

    public GetBTVProgramGuidesResultData getData() {
        return data;
    }

    public void setData(GetBTVProgramGuidesResultData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetBTVProgramGuidesResult{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
