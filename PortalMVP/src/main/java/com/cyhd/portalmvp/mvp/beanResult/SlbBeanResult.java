package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created by fanjia on 2017/6/29.
 */

public class SlbBeanResult implements Serializable {

    private String result_code;
    private String code_desc;

    public String getCode_desc() {
        return code_desc;
    }

    public void setCode_desc(String code_desc) {
        this.code_desc = code_desc;
    }

    public String getSlb_host() {
        return slb_host;
    }

    public void setSlb_host(String slb_host) {
        this.slb_host = slb_host;
    }

    private String slb_host;

    public String getReturn_code() {
        return result_code;
    }

    public void setReturn_code(String result_code) {
        this.result_code = result_code;
    }

    @Override
    public String toString() {
        return "SlbBeanResult{" +
                "result_code='" + result_code + '\'' +
                ", code_desc='" + code_desc + '\'' +
                ", slb_host='" + slb_host + '\'' +
                '}';
    }
}
