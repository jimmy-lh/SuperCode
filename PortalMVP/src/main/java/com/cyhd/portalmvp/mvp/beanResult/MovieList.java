package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/12.
 */
public class MovieList implements Serializable {

    /**
     * 内容唯一标识，资产编号
     */
    private String contentId;
    /**
     * 媒体类型
     * 1:正片
     * 2:预览片
     * 3:花絮
     */
    private String type;
    /**
     * 播放URL地址
     */
    private List<String> fileUrl;
    /**
     * 声道类型：
     * 0: 其他
     * 1: Monaural 单声道
     * 2: Stereo 多声道
     * 3: Two-nation monaural 双单声道
     * 4: Two-nation stereo 双多声道
     * 5: AC3(5:1 channel) AC3 声道
     */
    private String audioType;
    /**
     * 视频类型：
     * 1:blue-ray蓝光
     * 2:DVD-9超清
     * 3:DVD高清
     * 4:1080P高清
     * 5:720P高清
     * 6:360P标清
     * 7:流畅
     */
    private String videoType;
    /**
     * 屏幕格式
     * 0: 4x3
     * 1: 16x9(Wide)
     */
    private String screenFormat;
    /**
     * 编码格式：
     * 1:mpeg2
     * 2:mpeg4
     * 3:flv
     * 4:ts
     * 5:h264
     * 6:h265
     */
    private String encodeFormat;
    /**
     * 码率
     * 1: 500K
     * 2：900K
     * 3: 1.2M
     * 4：1.5M
     * 5：1.8M
     * 6: 2.0M
     * 7：2.5M
     */
    private String bitRateType;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(List<String> fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getScreenFormat() {
        return screenFormat;
    }

    public void setScreenFormat(String screenFormat) {
        this.screenFormat = screenFormat;
    }

    public String getEncodeFormat() {
        return encodeFormat;
    }

    public void setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
    }

    public String getBitRateType() {
        return bitRateType;
    }

    public void setBitRateType(String bitRateType) {
        this.bitRateType = bitRateType;
    }

    @Override
    public String toString() {
        return "MovieList{" +
                "contentId='" + contentId + '\'' +
                ", type='" + type + '\'' +
                ", fileUrl=" + fileUrl +
                ", audioType='" + audioType + '\'' +
                ", videoType='" + videoType + '\'' +
                ", screenFormat='" + screenFormat + '\'' +
                ", encodeFormat='" + encodeFormat + '\'' +
                ", bitRateType='" + bitRateType + '\'' +
                '}';
    }
}
