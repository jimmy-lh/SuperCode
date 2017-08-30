package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.HeartBeatBean;
import com.cyhd.portalmvp.mvp.beanResult.HeartBeatResult;

/**
 * 4.1.4portal_online_04：用户心跳接口
 */

public interface IHeartBeatModel {

    /**
     * 用户心跳接口
     *
     * @param heartBeatBean
     * @param baseBeanResult
     */
    void heartBeat(HeartBeatBean heartBeatBean, BaseBeanResult baseBeanResult);

    /**
     * 保存返回的数据
     *
     * @param heartBeatResult
     */
    void saveData(HeartBeatResult heartBeatResult);
}
