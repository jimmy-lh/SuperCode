package com.cyhd.portalmvp.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umeng.analytics.MobclickAgent;

public abstract class MVPBaseFragment extends Fragment {
    protected boolean isPrepared = false;
    protected boolean isVisible = false;
    protected View view;
    public String TAG;
    protected MVPBaseActivity mActivity;

    /**
     * @return 返回布局R.layout.xxx
     */
    protected abstract int getLayoutId();

    /**
     * 初始化View控件
     */
    protected abstract void initView(Bundle savedInstanceState);

    /**
     * 处理业务逻辑，状态恢复等操作
     *
     * @param savedInstanceState
     */
    protected abstract void processLogic(Bundle savedInstanceState);

    /**
     * 查找View
     *
     * @param id   控件的id
     * @param <VT> View类型
     * @return
     */
    protected <VT extends View> VT getViewById(@IdRes int id) {
        return (VT) view.findViewById(id);
    }

    public void replaceFragment(@IdRes int resID, Fragment fragment) {
        try {
            if (!getChildFragmentManager().isDestroyed() && !mActivity.isFinishing())
                getChildFragmentManager().beginTransaction().replace(resID, fragment).commitAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        TAG = this.getClass().getSimpleName();
        mActivity = (MVPBaseActivity) getActivity();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = getLayoutInflater(savedInstanceState).inflate(getLayoutId(), null);
            initView(savedInstanceState);
            isPrepared = true;
            lazyLoad();
            processLogic(savedInstanceState);
        } else {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null) {
                parent.removeView(view);
            }
        }
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            isVisible = true;
            onUserVisible();
        } else {
            isVisible = false;
            onUserInvisible();
        }
    }

    /**
     * 当fragment对用户可见时，会调用该方法，可在该方法中懒加载网络数据
     */
    protected void onUserVisible() {
        lazyLoad();
    }

    /**
     * 当fragment对用户不可见时，会调用该方法
     */
    protected void onUserInvisible() {
    }

    protected void lazyLoad() {
        if (!isVisible || !isPrepared)
            return;
    }

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart(TAG);
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd(TAG);
    }

}
