package com.lh.commonclasses.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

import com.lh.commonclasses.R;
import com.lh.commonclasses.receiver.NetworkConnectChangedReceiver;
import com.lh.commonclasses.receiver.TimeChangedReceiver;
import com.lh.commonclasses.retrofit2rxjava.network.RxManager;
import com.lh.commonclasses.utils.ActivityCollectUtil;
import com.lh.commonclasses.utils.LogUtil;
import com.umeng.analytics.MobclickAgent;

public abstract class CommonBaseActivity extends FragmentActivity implements TimeChangedReceiver.OnTimeChangedListener, NetworkConnectChangedReceiver.onNetworkConnectChangedListener {
    protected String TAG;
    public Context mContext = this;

    /**
     * 获取IntentData
     */
    protected abstract void getIntentData();

    /**
     * @return 返回布局R.layout.xxx
     */
    protected abstract int getLayoutId();

    /**
     * 初始化布局以及View控件
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
        return (VT) findViewById(id);
    }

    public void replaceFragment(@IdRes int resID, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(resID, fragment).commitAllowingStateLoss();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getClass().getSimpleName();
        getIntentData();
        setContentView(getLayoutId());
        initView(savedInstanceState);
        ActivityCollectUtil.addActivity(this);
        processLogic(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerHomeKeyReceiver();
        registerNetConnectChangedReceiver();
        registerTimeChangedReceiver();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unRegisterHomeKeyReceiver();
        unRegisterNetConnectChangedReceiver();
        unRegisterTimeChangedReceiver();
        MobclickAgent.onPause(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollectUtil.removeActivity(this);
    }

    @Override
    public void finish() {
        onClearResource();
        super.finish();
    }

    protected void onClearResource() {
        cancelExitHintToast();
    }

    protected long mExitTime = 0;

    protected Toast mExitHintToast;

    protected void cancelExitHintToast() {
        if (mExitHintToast != null)
            mExitHintToast.cancel();
    }

    /**
     * 按两次返回键，退出app
     * 有的app不需要这个功能，所以有需要的app在自己框架中定义的BaseActivity中继承onBackPressed方法，然后调用此方法就行了
     */
    protected void pressAgain2Exits() {
        LogUtil.d(TAG, "pressAgain2Exits");
        if ((System.currentTimeMillis() - mExitTime) > 2000) {
            cancelExitHintToast();
            mExitHintToast = Toast.makeText(this, getString(R.string.press_again_to_exits), Toast.LENGTH_SHORT);
            mExitHintToast.show();
            mExitTime = System.currentTimeMillis();
        } else {
            LogUtil.d(TAG, " super.onBackPressed()");
            cancelExitHintToast();
            super.onBackPressed();
            exit();
        }
    }

    /**
     * 单次退出的，继承onBackPressed方法，然后调用此方法就行了
     * 退出所有activity,Terminates the currently running Java Virtual Machine
     */
    public void exit() {
        //取消所有订阅
        RxManager.getInstance().cancelAll();
        try {
            ActivityCollectUtil.finishAllActivity();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    /**
     * 注册Home按键事件广播
     */
    protected void registerHomeKeyReceiver() {
        registerReceiver(mHomeKeyEventReceiver, new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS));
    }

    /**
     * 注销Home按键事件广播
     */
    protected void unRegisterHomeKeyReceiver() {
        if (mHomeKeyEventReceiver != null) {
            unregisterReceiver(mHomeKeyEventReceiver);
        }
    }

    protected NetworkConnectChangedReceiver mNetworkConnectChangedReceiver;

    /**
     * 注册网络连接状态广播
     */
    protected void registerNetConnectChangedReceiver() {
        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        mNetworkConnectChangedReceiver = new NetworkConnectChangedReceiver();
        mNetworkConnectChangedReceiver.setOnNetworkConnectChangedListener(this);
        registerReceiver(mNetworkConnectChangedReceiver, filter);
    }

    /**
     * 注销网络连接状态广播
     */
    protected void unRegisterNetConnectChangedReceiver() {
        if (mNetworkConnectChangedReceiver != null) {
            unregisterReceiver(mNetworkConnectChangedReceiver);
        }
    }

    /**
     * 时间变化广播开始
     */
    protected TimeChangedReceiver mTimeChangedReceiver;

    /**
     * 注册时间变化广播
     */
    protected void registerTimeChangedReceiver() {
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_DATE_CHANGED);
        filter.addAction(Intent.ACTION_TIME_TICK);
        mTimeChangedReceiver = new TimeChangedReceiver();
        mTimeChangedReceiver.setOnTimeChangedListener(this);
        registerReceiver(mTimeChangedReceiver, filter);
    }

    /**
     * 注销时间变化广播
     */
    protected void unRegisterTimeChangedReceiver() {
        if (mTimeChangedReceiver != null) {
            unregisterReceiver(mTimeChangedReceiver);
        }
    }

    /**
     * 时间改变监听实现方法
     */
    @Override
    public void onTimeChanged() {
    }

    /**
     * Home按键事件广播
     */
    private BroadcastReceiver mHomeKeyEventReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {
                exit();
            }
        }
    };


}
