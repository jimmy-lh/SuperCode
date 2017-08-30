package com.cyhd.portalmvp.mvp.beanResult;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.io.Serializable;

/**
 * Created on 2017/7/12.
 * 剧集与节目海报集合，poster集合
 */
@Table(name = "PosterList")
public class PosterList implements Serializable {

    /**
     * 图片名称
     */
    @Column(name = "name")
    private String name;

    @Column(name = "channelCode",isId = true)
    private String channelCode;    //主键
    /**
     * 图片类型：topic：普通专题;special_topic：专题;background：背景;logo：标志;
     * banner：标语;stage：剧照;poster：海报;icon：图标
     */
    @Column(name = "fileType")
    private String fileType;
    /**
     * 图片URL地址
     */
    @Column(name = "fileUrl")
    private String fileUrl;
    /**
     * 图片尺寸
     */
    @Column(name = "size")
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Override
    public String toString() {
        return "PosterList{" +
                "name='" + name + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
