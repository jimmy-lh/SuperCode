package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AddHistoryBean;

/**
 * 4.1.34portal_online_34：用户播放历史信息记录
 */
public interface IAddHistoryModel {

    /**
     * 用户播放历史信息记录
     *
     * @param addHistoryBean
     * @param baseBeanResult
     */
    void addHistory(AddHistoryBean addHistoryBean, BaseBeanResult baseBeanResult);
}
