package com.lh.commonclasses.base;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.tencent.bugly.crashreport.CrashReport;

import org.xutils.x;

public abstract class CommonBaseApp extends Application {
    protected String TAG;
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
        CrashReport.initCrashReport(getApplicationContext());//budly，跟友盟一样的
    }

    public static <AT extends CommonBaseApp> AT getInstance() {
        return (AT) mInstance;
    }

    public void initXutils() {
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }

//    public void initUMeng() {
//        MobclickAgent.setDebugMode(false);
//        MobclickAgent.openActivityDurationTrack(false);
//        SuperLog.d(TAG, "initUMeng");
//    }
}
