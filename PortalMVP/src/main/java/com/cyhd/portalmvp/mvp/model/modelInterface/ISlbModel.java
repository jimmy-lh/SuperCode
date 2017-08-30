package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;

/**
 * Created on 2017/7/19.
 */
public interface ISlbModel {

    /**
     * 获取slb地址
     */
    void getSLB(String user_id
            , String type
            , String trans_id, String app_id, String lang, BaseBeanResult baseBeanResult);
}
