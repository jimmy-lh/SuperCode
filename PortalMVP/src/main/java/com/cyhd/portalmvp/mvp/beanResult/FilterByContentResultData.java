package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class FilterByContentResultData implements Serializable {

    /**
     * 搜索结果列表，asset集合
     */
    private List<AssetList> assetList;
    /**
     * 总条数
     */
    private int totalSize;

    public List<AssetList> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<AssetList> assetList) {
        this.assetList = assetList;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public String toString() {
        return "FilterByContentResultData{" +
                "assetList=" + assetList +
                ", totalSize=" + totalSize +
                '}';
    }
}
