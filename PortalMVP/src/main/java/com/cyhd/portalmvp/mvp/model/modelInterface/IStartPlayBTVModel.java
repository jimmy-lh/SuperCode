package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.StartPlayBTVBean;

/**
 * 4.1.23portal_online_23：回看鉴权接口
 */
public interface IStartPlayBTVModel {

    /**
     * 回看鉴权接口
     *
     * @param startPlayBTVBean
     * @param baseBeanResult
     */
    void startPlayBTV(StartPlayBTVBean startPlayBTVBean, BaseBeanResult baseBeanResult);
}
