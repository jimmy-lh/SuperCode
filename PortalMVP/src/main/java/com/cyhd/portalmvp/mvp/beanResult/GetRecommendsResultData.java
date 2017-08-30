package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class GetRecommendsResultData implements Serializable {

    /**
     * 推荐位排期信息，recommend集合
     */
    private List<RecommendList> recommendList;

    public List<RecommendList> getRecommendList() {
        return recommendList;
    }

    public void setRecommendList(List<RecommendList> recommendList) {
        this.recommendList = recommendList;
    }

    @Override
    public String toString() {
        return "GetRecommendsResultData{" +
                "recommendList=" + recommendList +
                '}';
    }
}
