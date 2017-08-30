package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class RecommendList implements Serializable {

    /**
     * 推荐位编码，提前约定，请求时传入
     */
    private String recommendCode;
    /**
     * 排期名称
     */
    private String scheduleName;
    /**
     * 内容集合
     */
    private List<ContentList> contentList;

    public String getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public List<ContentList> getContentList() {
        return contentList;
    }

    public void setContentList(List<ContentList> contentList) {
        this.contentList = contentList;
    }

    @Override
    public String toString() {
        return "RecommendList{" +
                "recommendCode='" + recommendCode + '\'' +
                ", scheduleName='" + scheduleName + '\'' +
                ", contentList=" + contentList +
                '}';
    }
}
