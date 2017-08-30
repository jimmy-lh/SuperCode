package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * 4.1.14portal_online_14：获取栏目信息接口
 */
public class GetColumnContentsResult implements Serializable {

    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private GetColumnContentsResultData data;

    /**
     * 总条数，计算分页使;当查询为专题栏目时，返回
     */
    private int totalSize;

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

    public GetColumnContentsResultData getData() {
        return data;
    }

    public void setData(GetColumnContentsResultData data) {
        this.data = data;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public String toString() {
        return "GetColumnContentsResult{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                ", totalSize=" + totalSize +
                '}';
    }
}
