package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class FilterGenreResultData implements Serializable {

    /**
     * 地区
     */
    private List<String> originalCountry;
    /**
     * 类型
     */
    private List<String> tags;
    /**
     * 年份
     */
    private List<String> year;

    public List<String> getOriginalCountry() {
        return originalCountry;
    }

    public void setOriginalCountry(List<String> originalCountry) {
        this.originalCountry = originalCountry;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getYear() {
        return year;
    }

    public void setYear(List<String> year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "FilterGenreResultData{" +
                "originalCountry=" + originalCountry +
                ", tags=" + tags +
                ", year=" + year +
                '}';
    }
}
