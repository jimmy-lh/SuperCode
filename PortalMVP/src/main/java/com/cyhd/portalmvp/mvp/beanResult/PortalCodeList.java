package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

public class PortalCodeList implements Serializable {

    /**
     * 门户编码
     */
    private String portalCode;
    /**
     * 终端类型, 逗号隔开：1:机顶盒;2:微投;3:PC;4:PHONE;5:PAD
     */
    private String type;

    public String getPortalCode() {
        return portalCode;
    }

    public void setPortalCode(String portalCode) {
        this.portalCode = portalCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PortalCodeList{" +
                "portalCode='" + portalCode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
