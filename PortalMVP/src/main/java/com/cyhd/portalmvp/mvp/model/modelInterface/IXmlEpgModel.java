package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;

/**
 * 获取xml格式的节目预告
 */
public interface IXmlEpgModel {

    void getXmlEpg(String epgUrl, BaseBeanResult baseBeanResult);
}
