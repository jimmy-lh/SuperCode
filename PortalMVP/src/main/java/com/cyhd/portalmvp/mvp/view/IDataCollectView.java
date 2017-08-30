package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.DataCollectResult;

/**
 * Created on 2017/7/19.
 * 直播数据收集接口回调
 */
public interface IDataCollectView {
    void onDataCollectSuc(DataCollectResult bean);
    void onDataCollectFail(Throwable e);
}
