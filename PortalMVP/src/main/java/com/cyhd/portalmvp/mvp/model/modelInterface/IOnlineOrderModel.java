package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.OnlineOrderBean;

/**
 * 4.1.8portal_online_08：在线订购接口
 */
public interface IOnlineOrderModel {

    /**
     * 在线订购接口
     *
     * @param onlineOrderBean
     * @param baseBeanResult
     */
    void onlineOrder(OnlineOrderBean onlineOrderBean, BaseBeanResult baseBeanResult);
}
