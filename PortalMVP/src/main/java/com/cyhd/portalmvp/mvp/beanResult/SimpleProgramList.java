package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/12.
 */
public class SimpleProgramList implements Serializable {

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
     * 是否有上线正片,0：无;1：有
     */
    private String hasPositive;
    /**
     * 是否有上线花絮,0：无;1：有
     */
    private String hasTidbits;
    /**
     * 是否有预告片花絮,0：无;1：有
     */
    private String hasTrailer;
    /**
     * 当前集数
     */
    private int seriesNumber;

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

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    @Override
    public String toString() {
        return "SimpleProgramList{" +
                "contentId='" + contentId + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", hasPositive='" + hasPositive + '\'' +
                ", hasTidbits='" + hasTidbits + '\'' +
                ", hasTrailer='" + hasTrailer + '\'' +
                ", seriesNumber=" + seriesNumber +
                '}';
    }
}
