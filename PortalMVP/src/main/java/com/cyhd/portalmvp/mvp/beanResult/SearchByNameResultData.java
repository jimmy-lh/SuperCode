package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class SearchByNameResultData implements Serializable {

    /**
     * 总条数，计算分页使用
     */
    private int totalSize;
    /**
     * 搜索结果列表，searchItem集合
     */
    private List<SearchItemList> searchItemList;

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public List<SearchItemList> getSearchItemList() {
        return searchItemList;
    }

    public void setSearchItemList(List<SearchItemList> searchItemList) {
        this.searchItemList = searchItemList;
    }

    @Override
    public String toString() {
        return "SearchByNameResultData{" +
                "totalSize=" + totalSize +
                ", searchItemList=" + searchItemList +
                '}';
    }
}
