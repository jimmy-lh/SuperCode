package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/24.
 */
public class AuthInfoList implements Serializable {

    /**
     * OTT账户用户名
     */
    private String userName;
    /**
     * 产品编码
     */
    private String productCode;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 实付金额
     */
    private float price;
    /**
     * 内容编码，如果产品为单片按次，为节目的内容ID，如果产品为整包按次，为剧集的内容ID，如果产品为包时段，不校验此字段
     */
    private String contentId;
    /**
     * 订购的内容名称
     */
    private String name;
    /**
     * 状态：
     * 1:启用
     * 0:禁用
     */
    private String status;
    /**
     * 生效时间
     */
    private String effectTime;
    /**
     * 失效时间
     */
    private String invalidTime;
    /**
     * 订购日期
     */
    private String subTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }

    public String getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
    }

    public String getSubTime() {
        return subTime;
    }

    public void setSubTime(String subTime) {
        this.subTime = subTime;
    }

    @Override
    public String toString() {
        return "AuthInfoList{" +
                "userName='" + userName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", contentId='" + contentId + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", effectTime='" + effectTime + '\'' +
                ", invalidTime='" + invalidTime + '\'' +
                ", subTime='" + subTime + '\'' +
                '}';
    }
}
