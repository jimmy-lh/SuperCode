package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BasePlayBeanResult;

/**
 * Created on 2017/7/19.
 */
public interface IGetLivePlayUrlModel {

    /**
     * 获取直播的播放地址
     */
    void getLivePlayUrl(String slb_url,String playCode, BasePlayBeanResult baseBeanResult);
}
