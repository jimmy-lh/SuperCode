package com.cyhd.portalmvp.mvp.view;

/**
 * 4.1.2portal_online_02：用户激活接口
 */
public interface IActiveView {

    /**
     * 请求数据成功后运行此方法
     */
    void onSucceedActive();

    /**
     * 显示错误提示框
     */
    void showErrDialogActive(String errCode);
}
