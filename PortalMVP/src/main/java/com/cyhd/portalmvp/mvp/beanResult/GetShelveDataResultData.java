package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/12.
 */
public class GetShelveDataResultData implements Serializable {

    /**
     * 栏目上架关系数据版本
     */
    private String version;
    /**
     * 总条数，计算分页使用
     */
    private int channelListTotalSize;
    /**
     * 总条数，计算分页使用
     */
    private int assetListTotalSize;
    /**
     * 上架的频道信息，channel集合
     */
    private List<ChannelList> channelList;
    /**
     * 上架的节目或者剧集信息，asset集合
     */
    private List<AssetList> assetList;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getChannelListTotalSize() {
        return channelListTotalSize;
    }

    public void setChannelListTotalSize(int channelListTotalSize) {
        this.channelListTotalSize = channelListTotalSize;
    }

    public int getAssetListTotalSize() {
        return assetListTotalSize;
    }

    public void setAssetListTotalSize(int assetListTotalSize) {
        this.assetListTotalSize = assetListTotalSize;
    }

    public List<ChannelList> getChannelList() {
        return channelList;
    }

    public void setChannelList(List<ChannelList> channelList) {
        this.channelList = channelList;
    }

    public List<AssetList> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<AssetList> assetList) {
        this.assetList = assetList;
    }

    @Override
    public String toString() {
        return "GetShelveDataResultData{" +
                "version='" + version + '\'' +
                ", channelListTotalSize=" + channelListTotalSize +
                ", assetListTotalSize=" + assetListTotalSize +
                ", channelList=" + channelList +
                ", assetList=" + assetList +
                '}';
    }
}
