package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetColumnRecommendResourceBean;

/**
 * 4.1.19portal_online_19：获取栏目推荐信息接口
 */
public interface IGetColumnRecommendResourceModel {

    /**
     * 获取栏目推荐信息接口
     *
     * @param getColumnRecommendResourceBean
     * @param baseBeanResult
     */
    void getColumnRecommendResource(GetColumnRecommendResourceBean getColumnRecommendResourceBean, BaseBeanResult baseBeanResult);
}
