package com.cyhd.portalmvp.base;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import com.cyhd.portalmvp.BuildConfig;
import com.lh.commonclasses.utils.LogUtil;
import com.umeng.analytics.MobclickAgent;

import org.swl.feedback.FeedBack;
import org.xutils.x;

import swl.lib.common.SwlDeviceInfo;

public abstract class BaseApp extends Application {
    protected String TAG;
    protected static String sn;
    protected static Application mInstance;

    @SuppressLint("StaticFieldLeak")
    private static Context mContext;

    /**
     * 返回context，整个代码任何地方需要context都可以调用此方法获取
     *
     * @return
     */
    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        TAG = this.getClass().getSimpleName();
        mContext = getApplicationContext();
        initUMeng();
    }

    public static <AT extends BaseApp> AT getInstance() {
        return (AT) mInstance;
    }

    public String getSn() {
        if (TextUtils.isEmpty(sn)) {
            sn = SwlDeviceInfo.getStbSn();
            if (TextUtils.isEmpty(sn)) {
                sn = BuildConfig.DEFAULT_SN;
            }
            sn.trim();
        }
        LogUtil.d(TAG, "sn = " + sn);
        return sn;
    }

    public void initFeedback() {
        FeedBack.init(this);
    }

    public void initXutils() {
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }

    public void initUMeng() {
        MobclickAgent.setDebugMode(false);
        MobclickAgent.openActivityDurationTrack(false);
        LogUtil.d(TAG, "initUMeng");
    }
}
