package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class ContentList implements Serializable {

    /**
     * 资产id，若type为0则为剧集的资产id，若type为1则为节目资产id，若为2则为频道资产id，若type为3则为栏目id，若type为4则忽略
     */
    private String contentId;
    /**
     * 名称
     */
    private String name;
    /**
     * 看点描述
     */
    private String viewPoint;
    /**
     * 内容类型，枚举：
     * 0：剧集
     * 1：节目
     * 2：频道
     * 3：栏目
     * 4：链接
     */
    private String type;
    /**
     * 链接，若type为0/1/2/3则忽略，若type为4则有值
     */
    private String url;
    /**
     * 描述信息
     */
    private String description;
    /**
     * 备注
     */
    private String remark;
    /**
     * 海报集合
     */
    private List<PosterList> posterList;

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

    public String getViewPoint() {
        return viewPoint;
    }

    public void setViewPoint(String viewPoint) {
        this.viewPoint = viewPoint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<PosterList> getPosterList() {
        return posterList;
    }

    public void setPosterList(List<PosterList> posterList) {
        this.posterList = posterList;
    }

    @Override
    public String toString() {
        return "ContentList{" +
                "contentId='" + contentId + '\'' +
                ", name='" + name + '\'' +
                ", viewPoint='" + viewPoint + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", remark='" + remark + '\'' +
                ", posterList=" + posterList +
                '}';
    }
}
