package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ActiveBean;
import com.cyhd.portalmvp.mvp.beanResult.ActiveResult;

/**
 * 4.1.2portal_online_02：用户激活接口
 */
public interface IActiveModel {

    /**
     * 用户激活接口
     *
     * @param activeBean
     * @param baseBeanResult
     */
    void active(ActiveBean activeBean, BaseBeanResult baseBeanResult);

    /**
     * 将服务器返回的数据保存到本地
     *
     * @param activeResult
     */
    void saveData(ActiveResult activeResult);

    /**
     * 取消订阅
     */
    void cancel();
}
