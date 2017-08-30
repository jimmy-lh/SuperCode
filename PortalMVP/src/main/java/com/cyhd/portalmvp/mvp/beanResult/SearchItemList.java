package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 * 搜索结果列表，searchItem集合
 */
public class SearchItemList implements Serializable {

    /**
     * 节目类型
     */
    private String programType;

    /**
     * item集合
     */
    private List<ItemList> itemList;

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public List<ItemList> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemList> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "SearchItemList{" +
                "programType='" + programType + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}
