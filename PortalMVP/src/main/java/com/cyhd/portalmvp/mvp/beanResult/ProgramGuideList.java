package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/13.
 */
public class ProgramGuideList implements Serializable {

    /**
     * 所属频道的编码
     */
    private String channelCode;
    /**
     * 节目内容ID
     */
    private String contentId;
    /**
     * 节目名称
     */
    private String programName;
    /**
     * 开始时间，UTC时间，格式YYYYMMDDHH24MISS
     */
    private String startTime;
    /**
     * 结束时间，UTC时间，格式YYYYMMDDHH24MISS
     */
    private String endTime;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "ProgramGuideList{" +
                "channelCode='" + channelCode + '\'' +
                ", contentId='" + contentId + '\'' +
                ", programName='" + programName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
