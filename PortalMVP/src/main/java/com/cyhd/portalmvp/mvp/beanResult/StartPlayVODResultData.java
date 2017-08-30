package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/12.
 */
public class StartPlayVODResultData implements Serializable {

    /**
     * movie集合
     */
    private List<MovieList> movieList;
    /**
     * 针对一级栏目关联的产品进行一一批价
     */
    private List<ProductPriceList> productPriceList;
    /**
     * 针对一级栏目关联的套餐进行一一批价
     */
    private List<PackagePriceList> packagePriceList;

    public List<MovieList> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<MovieList> movieList) {
        this.movieList = movieList;
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
        return "StartPlayVODResultData{" +
                "movieList=" + movieList +
                ", productPriceList=" + productPriceList +
                ", packagePriceList=" + packagePriceList +
                '}';
    }
}
