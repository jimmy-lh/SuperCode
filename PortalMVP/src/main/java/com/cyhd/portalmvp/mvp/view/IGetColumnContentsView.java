package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.GetColumnContentsResult;

/**
 * 4.1.14portal_online_14：获取栏目信息接口
 */
public interface IGetColumnContentsView {

    /**
     * 获取栏目信息成功后运行此方法
     *
     * @param result
     */
    void onSucceedGetColumnContents(GetColumnContentsResult result);

    /**
     * 显示错误提示框
     */
    void showErrDialogGetColumnContents(String errCode);
}
