package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class FavoriteList implements Serializable {

    /**
     * 收藏内部ID，删除时使用
     */
    private int favoriteId;
    /**
     * 内容唯一标识，资产编号
     */
    private String contentId;
    /**
     * 终端类型：
     * 1:机顶盒
     * 2:微投
     * 3:PC
     * 4:PHONE
     * 5:PAD
     * 99:其他
     */
    private String platform;
    /**
     * 枚举值：
     * 0:剧集
     * 1:节目
     */
    private String type;
    /**
     * 名称
     */
    private String name;
    /**
     * 收藏时间，UTC时间，格式YYYYMMDDHH24MISS
     */
    private String favoriteTime;
    /**
     * 枚举值：
     * 0:失效
     * 1:有效无更新
     * 2: 有效有更新
     */
    private String status;
    /**
     * 剧集更新至多少集/期
     */
    private int updateCount;
    /**
     * 剧集与节目海报集合，poster集合
     */
    private List<PosterList> posterList;

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteTime() {
        return favoriteTime;
    }

    public void setFavoriteTime(String favoriteTime) {
        this.favoriteTime = favoriteTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    public List<PosterList> getPosterList() {
        return posterList;
    }

    public void setPosterList(List<PosterList> posterList) {
        this.posterList = posterList;
    }

    @Override
    public String toString() {
        return "FavoriteList{" +
                "favoriteId=" + favoriteId +
                ", contentId='" + contentId + '\'' +
                ", platform='" + platform + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", favoriteTime='" + favoriteTime + '\'' +
                ", status='" + status + '\'' +
                ", updateCount=" + updateCount +
                ", posterList=" + posterList +
                '}';
    }
}
