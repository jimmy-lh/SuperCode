package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/12.
 */
public class PackagePriceList implements Serializable {

    /**
     * 套餐编码
     */
    private String packageCode;
    /**
     * 套餐名称
     */
    private String packageName;
    /**
     * 价格
     */
    private float price;

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PackagePriceList{" +
                "packageCode='" + packageCode + '\'' +
                ", packageName='" + packageName + '\'' +
                ", price=" + price +
                '}';
    }
}
