package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * 有些app获取节目单时需要传此IP给服务器
 */
public class GetIPResult implements Serializable {

    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
