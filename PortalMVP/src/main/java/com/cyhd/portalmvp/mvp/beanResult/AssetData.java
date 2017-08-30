package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/12.
 */
public class AssetData implements Serializable {

    /**
     * 内容唯一标识，资产编号
     */
    private String contentId;
    /**
     * 名称
     */
    private String name;
    /**
     * 播放时长
     */
    private String duration;
    /**
     * 是否有上线正片
     * 0：无
     * 1：有
     */
    private String hasPositive;
    /**
     * 是否有上线花絮
     * 0：无
     * 1：有
     */
    private String hasTidbits;
    /**
     * 是否有预告片花絮
     * 0：无
     * 1：有
     */
    private String hasTrailer;
    /**
     * 点赞数量
     */
    private int loveCount;
    /**
     * 限制级标识
     * 0:非限制级
     * 1:限制级
     */
    private String restricted;
    /**
     * 节目类型
     */
    private String programType;
    /**
     * 总集数
     */
    private int volumnCount;
    /**
     * 剧集更新至多少集/期
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
     * 演员
     */
    private String actorDisplay;
    /**
     * 语言
     */
    private String language;
    /**
     * 产地
     */
    private String originalCountry;
    /**
     * 评分
     */
    private float score;
    /**
     * 上映时间
     */
    private String releaseTime;
    /**
     * 看点,非常简短的剧情描述
     */
    private String viewPoint;
    /**
     * 关键字，多个关键字之间使用逗号分隔
     */
    private String keyWords;
    /**
     * 关联标签，多个之间使用逗号分隔
     */
    private String tags;
    /**
     * 详细描述
     */
    private String description;
    /**
     * 剧集关联的节目简单列表描述，simpleProgram集合
     */
    private SimpleProgramList simpleProgramList;
    /**
     * 剧集与节目海报集合，poster集合
     */
    private PosterList posterList;

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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getHasPositive() {
        return hasPositive;
    }

    public void setHasPositive(String hasPositive) {
        this.hasPositive = hasPositive;
    }

    public String getHasTidbits() {
        return hasTidbits;
    }

    public void setHasTidbits(String hasTidbits) {
        this.hasTidbits = hasTidbits;
    }

    public String getHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(String hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public int getLoveCount() {
        return loveCount;
    }

    public void setLoveCount(int loveCount) {
        this.loveCount = loveCount;
    }

    public String getRestricted() {
        return restricted;
    }

    public void setRestricted(String restricted) {
        this.restricted = restricted;
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

    public String getActorDisplay() {
        return actorDisplay;
    }

    public void setActorDisplay(String actorDisplay) {
        this.actorDisplay = actorDisplay;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOriginalCountry() {
        return originalCountry;
    }

    public void setOriginalCountry(String originalCountry) {
        this.originalCountry = originalCountry;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getViewPoint() {
        return viewPoint;
    }

    public void setViewPoint(String viewPoint) {
        this.viewPoint = viewPoint;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
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

    public SimpleProgramList getSimpleProgramList() {
        return simpleProgramList;
    }

    public void setSimpleProgramList(SimpleProgramList simpleProgramList) {
        this.simpleProgramList = simpleProgramList;
    }

    public PosterList getPosterList() {
        return posterList;
    }

    public void setPosterList(PosterList posterList) {
        this.posterList = posterList;
    }

    @Override
    public String toString() {
        return "AssetData{" +
                "contentId='" + contentId + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", hasPositive='" + hasPositive + '\'' +
                ", hasTidbits='" + hasTidbits + '\'' +
                ", hasTrailer='" + hasTrailer + '\'' +
                ", loveCount=" + loveCount +
                ", restricted='" + restricted + '\'' +
                ", programType='" + programType + '\'' +
                ", volumnCount=" + volumnCount +
                ", updateCount=" + updateCount +
                ", alias='" + alias + '\'' +
                ", director='" + director + '\'' +
                ", actorDisplay='" + actorDisplay + '\'' +
                ", language='" + language + '\'' +
                ", originalCountry='" + originalCountry + '\'' +
                ", score=" + score +
                ", releaseTime='" + releaseTime + '\'' +
                ", viewPoint='" + viewPoint + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", tags='" + tags + '\'' +
                ", description='" + description + '\'' +
                ", simpleProgramList=" + simpleProgramList +
                ", posterList=" + posterList +
                '}';
    }
}
