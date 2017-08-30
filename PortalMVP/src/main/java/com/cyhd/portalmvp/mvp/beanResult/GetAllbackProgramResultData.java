package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class GetAllbackProgramResultData implements Serializable {

    /**
     * 总条数，计算分页使用
     */
    private int totalSize;
    /**
     * 频道信息，channel集合
     */
    private List<ChannelList> channelList;

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public List<ChannelList> getChannelList() {
        return channelList;
    }

    public void setChannelList(List<ChannelList> channelList) {
        this.channelList = channelList;
    }

    @Override
    public String toString() {
        return "GetAllbackProgramResultData{" +
                "totalSize=" + totalSize +
                ", channelList=" + channelList +
                '}';
    }
}
