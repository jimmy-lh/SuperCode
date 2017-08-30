package com.cyhd.portalmvp.mvp.beanResult;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/12.
 */
@Table(name = "LiveAddressList")
public class LiveAddressList implements Serializable {

    @Column(name = "channelCode",isId = true)
    private String channelCode;
    /**
     * 播放URL地址列表
     */
    private List<String> playUrlList;

    @Column(name = "playUrl")
    private String playUrl;

    /**
     * URL失效时间，UTC表达,YYYYMMDDHH24MISS
     */
    @Column(name = "urlInvalidTime")
    private String urlInvalidTime;
    /**
     * 枚举值:画质（0:高清、1:标清、2:超清）
     */
    @Column(name = "quality")
    private String quality;
    /**
     * 码率
     */
    @Column(name = "bitRateType")
    private String bitRateType;
    /**
     * 枚举值，编码格式：1:mpeg2;2:mpeg4;3:flv;4:ts;5:h264;6:h265
     */
    @Column(name = "encodeFormat")
    private String encodeFormat;
    /**
     * 声道类型：0: 其他;1: Monaural 单声道;2: Stereo 多声道;3: Two-nation monaural 双单声道;
     * 4: Two-nation stereo 双多声道;5: AC3(5:1 channel) AC3 声道
     */
    @Column(name = "audioType")
    private String audioType;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public List<String> getPlayUrlList() {
        return playUrlList;
    }

    public void setPlayUrlList(List<String> playUrlList) {
        this.playUrlList = playUrlList;
    }

    public String getUrlInvalidTime() {
        return urlInvalidTime;
    }

    public void setUrlInvalidTime(String urlInvalidTime) {
        this.urlInvalidTime = urlInvalidTime;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getBitRateType() {
        return bitRateType;
    }

    public void setBitRateType(String bitRateType) {
        this.bitRateType = bitRateType;
    }

    public String getEncodeFormat() {
        return encodeFormat;
    }

    public void setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    @Override
    public String toString() {
        return "LiveAddressList{" +
                "playUrlList=" + playUrlList +
                ", urlInvalidTime='" + urlInvalidTime + '\'' +
                ", quality='" + quality + '\'' +
                ", bitRateType='" + bitRateType + '\'' +
                ", encodeFormat='" + encodeFormat + '\'' +
                ", audioType='" + audioType + '\'' +
                '}';
    }
}
