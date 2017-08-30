package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.StartPlayLiveBean;

/**
 * 4.1.22portal_online_22：直播鉴权接口
 */
public interface IStartPlayLiveModel {

    /**
     * 直播鉴权接口
     *
     * @param startPlayLiveBean
     * @param baseBeanResult
     */
    void startPlayLive(StartPlayLiveBean startPlayLiveBean, BaseBeanResult baseBeanResult);
}
