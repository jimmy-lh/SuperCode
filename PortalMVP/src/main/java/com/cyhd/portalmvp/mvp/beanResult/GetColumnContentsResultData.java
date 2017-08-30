package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/12.
 */
public class GetColumnContentsResultData implements Serializable {

    private List<ChildColumnList> childColumnList;

    public List<ChildColumnList> getChildColumnList() {
        return childColumnList;
    }

    public void setChildColumnList(List<ChildColumnList> childColumnList) {
        this.childColumnList = childColumnList;
    }

    @Override
    public String toString() {
        return "GetColumnContentsResultData{" +
                "childColumnList=" + childColumnList +
                '}';
    }
}
