package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/12.
 */
public class ProductPriceList implements Serializable {

    /**
     * 产品编码
     */
    private String productCode;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 计费类型，枚举值：
     * 1:免费
     * 2:包时段
     * 3:单片按次
     * 4:整包按次
     */
    private String chargeType;
    /**
     * 价格
     */
    private float price;

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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductPriceList{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", chargeType='" + chargeType + '\'' +
                ", price=" + price +
                '}';
    }
}
