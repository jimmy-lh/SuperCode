package com.cyhd.portalmvp.mvp.beanResult;

/**
 * Created by fanjia on 2017/6/30.
 */

public class GetLivePlayUrlResult {

    /**
     * 访问SLB返回播放地址
     */

    private String result_code;
    private String code_desc;
    private String redirect_url;

    @Override
    public String toString() {
        return "GetLivePlayUrlResult{" +
                "result_code=" + result_code +
                ", code_desc='" + code_desc + '\'' +
                ", redirect_url='" + redirect_url + '\'' +
                '}';
    }

    public String getReturn_code() {
        return result_code;
    }

    public void setReturn_code(String return_code) {
        this.result_code = result_code;
    }

    public String getCode_desc() {
        return code_desc;
    }

    public void setCode_desc(String code_desc) {
        this.code_desc = code_desc;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }
}
