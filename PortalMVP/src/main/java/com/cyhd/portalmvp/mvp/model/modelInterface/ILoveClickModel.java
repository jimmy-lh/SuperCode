package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.LoveClickBean;

/**
 * 4.1.24portal_online_24：点赞/取消点赞接口
 */
public interface ILoveClickModel {

    /**
     * 点赞/取消点赞接口
     *
     * @param loveClickBean
     * @param baseBeanResult
     */
    void loveClick(LoveClickBean loveClickBean, BaseBeanResult baseBeanResult);
}
