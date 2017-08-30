package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetRecommendsBean;

/**
 * 4.1.35portal_online_35：获取推荐位信息
 */
public interface IGetRecommendsModel {

    /**
     * 获取推荐位信息
     *
     * @param getRecommendsBean
     * @param baseBeanResult
     */
    void getRecommends(GetRecommendsBean getRecommendsBean, BaseBeanResult baseBeanResult);
}
