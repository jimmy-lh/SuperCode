package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.DataCollectBean;

/**
 * apk上报接口,不切换主备,请求失败访问2次
 */
public interface IDataCollectModel {

    /**
     * apk上报接口,不切换主备,请求失败访问2次
     */
    void dataCollect(final DataCollectBean apkPlayBean, final BaseBeanResult baseBeanResult);
}
