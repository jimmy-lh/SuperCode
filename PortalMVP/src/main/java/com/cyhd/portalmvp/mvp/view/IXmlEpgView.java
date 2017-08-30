package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.XmlEpgsResult;

/**
 * Created on 2017/7/19.
 */
public interface IXmlEpgView {

    void requestXmlEpgSuccess(XmlEpgsResult result);

    void requestXmlEpgError(Throwable e);
}
