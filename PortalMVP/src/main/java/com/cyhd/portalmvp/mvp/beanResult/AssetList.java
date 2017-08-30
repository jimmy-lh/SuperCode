package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/12.
 * 搜索结果列表，asset集合
 */
public class AssetList implements Serializable {

    /**
     * 内容唯一标识，资产编号
     */
    private String contentId;
    /**
     * 名称
     */
    private String name;
    /**
     * 演员
     */
    private String actorDisplay;
    /**
     * 枚举值：0:剧集;1:节目
     */
    private String type;
    /**
     * 播放时长
     */
    private String duration;
    /**
     * 节目类型,枚举值：movie:电影;teleplay：电视剧;variety:综艺;documentary:纪实;cartoon:卡通;news:热点
     */
    private String programType;
    /**
     * 总集数
     */
    private int volumnCount;
    /**
     * 更新至多少集
     */
    private int updateCount;
    /**
     * 别名，不同地区展示时区分使用
     */
    private String alias;
    /**
     * 导演
     */
    private String director;
    /**
     * 评分
     */
    private float score;
    /**
     * 看点，非常简短的剧情描述
     */
    private String viewpoint;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 海报集合，poster集合
     */
    private List<PosterList> posterList;
    /**
     * 关联标签，多个之间使用逗号分隔
     */
    private String tags;
    /**
     * 详细描述
     */
    private String description;

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

    public String getActorDisplay() {
        return actorDisplay;
    }

    public void setActorDisplay(String actorDisplay) {
        this.actorDisplay = actorDisplay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public int getVolumnCount() {
        return volumnCount;
    }

    public void setVolumnCount(int volumnCount) {
        this.volumnCount = volumnCount;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getViewpoint() {
        return viewpoint;
    }

    public void setViewpoint(String viewpoint) {
        this.viewpoint = viewpoint;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public List<PosterList> getPosterList() {
        return posterList;
    }

    public void setPosterList(List<PosterList> posterList) {
        this.posterList = posterList;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AssetList{" +
                "contentId='" + contentId + '\'' +
                ", name='" + name + '\'' +
                ", actorDisplay='" + actorDisplay + '\'' +
                ", type='" + type + '\'' +
                ", duration='" + duration + '\'' +
                ", programType='" + programType + '\'' +
                ", volumnCount=" + volumnCount +
                ", updateCount=" + updateCount +
                ", alias='" + alias + '\'' +
                ", director='" + director + '\'' +
                ", score=" + score +
                ", viewpoint='" + viewpoint + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", posterList=" + posterList +
                ", tags='" + tags + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
