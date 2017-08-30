package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class StartPlayBTVResultData implements Serializable {

    /**
     * 回看播放URL列表
     */
    private List<String> playUrlList;
    /**
     * 针对一级栏目关联的产品进行一一批价
     */
    private List<ProductPriceList> productPriceList;
    /**
     * 针对一级栏目关联的套餐进行一一批价
     */
    private List<PackagePriceList> packagePriceList;

    public List<String> getPlayUrlList() {
        return playUrlList;
    }

    public void setPlayUrlList(List<String> playUrlList) {
        this.playUrlList = playUrlList;
    }

    public List<ProductPriceList> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(List<ProductPriceList> productPriceList) {
        this.productPriceList = productPriceList;
    }

    public List<PackagePriceList> getPackagePriceList() {
        return packagePriceList;
    }

    public void setPackagePriceList(List<PackagePriceList> packagePriceList) {
        this.packagePriceList = packagePriceList;
    }

    @Override
    public String toString() {
        return "StartPlayBTVResultData{" +
                "playUrlList=" + playUrlList +
                ", productPriceList=" + productPriceList +
                ", packagePriceList=" + packagePriceList +
                '}';
    }
}
