package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * 直播数据收集接口
 */
public class DataCollectResult implements Serializable {

    private int retrun_code;

    private String code_desc;

    public int getRetrun_code() {
        return retrun_code;
    }

    public void setRetrun_code(int retrun_code) {
        this.retrun_code = retrun_code;
    }

    public String getCode_desc() {
        return code_desc;
    }

    public void setCode_desc(String code_desc) {
        this.code_desc = code_desc;
    }

    @Override
    public String toString() {
        return "DataCollectResult{"
                + "retrun_code = '" + retrun_code + "\'"
                + ", code_desc = '" + code_desc + "\'"
                + "}";
    }
}
