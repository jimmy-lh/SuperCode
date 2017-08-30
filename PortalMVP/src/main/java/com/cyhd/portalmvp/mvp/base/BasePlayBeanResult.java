package com.cyhd.portalmvp.mvp.base;

import com.cyhd.portalmvp.mvp.beanResult.GetLivePlayUrlResult;
import com.cyhd.portalmvp.mvp.beanResult.SlbBeanResult;

/**
 * Created by fanjia on 2017/6/30.
 * GLSB和SLB接口相关的
 */

public interface BasePlayBeanResult<T> {
    void onNext(T bean, String mplayCode);

    void onError(Throwable e, String mplayCode);

    interface IGetSLBBean extends BasePlayBeanResult<SlbBeanResult> {
    }
    interface IGetLivePlayUrlBean extends BasePlayBeanResult<GetLivePlayUrlResult> {
    }
}
