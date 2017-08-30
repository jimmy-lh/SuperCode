package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class ItemList implements Serializable {

    /**
     * 枚举值：
     * 0:剧集
     * 1:节目
     */
    private String type;
    /**
     * 剧集或者节目的内容ID
     */
    private String contentId;
    /**
     * 名称
     */
    private String name;
    /**
     * 导演
     */
    private String director;
    /**
     * 主演
     */
    private String actorDisplay;
    /**
     * 地区（产地）
     */
    private String originalCountry;
    /**
     * 上映时间
     */
    private String releaseTime;
    /**
     * 关联标签，多个之间使用逗号分隔
     */
    private String tags;
    /**
     * 节目类型
     * 枚举值：movie:电影
     * teleplay：电视剧
     * variety:综艺
     * documentary:纪实
     * cartoon:卡通
     * news:热点
     */
    private String programType;
    /**
     * 剧集与节目海报集合，poster集合
     */
    private List<PosterList> posterList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActorDisplay() {
        return actorDisplay;
    }

    public void setActorDisplay(String actorDisplay) {
        this.actorDisplay = actorDisplay;
    }

    public String getOriginalCountry() {
        return originalCountry;
    }

    public void setOriginalCountry(String originalCountry) {
        this.originalCountry = originalCountry;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public List<PosterList> getPosterList() {
        return posterList;
    }

    public void setPosterList(List<PosterList> posterList) {
        this.posterList = posterList;
    }

    @Override
    public String toString() {
        return "ItemList{" +
                "type='" + type + '\'' +
                ", contentId='" + contentId + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", actorDisplay='" + actorDisplay + '\'' +
                ", originalCountry='" + originalCountry + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", tags='" + tags + '\'' +
                ", programType='" + programType + '\'' +
                ", posterList=" + posterList +
                '}';
    }
}
