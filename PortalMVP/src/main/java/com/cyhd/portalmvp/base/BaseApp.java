package com.cyhd.portalmvp.base;

import android.text.TextUtils;

import com.cyhd.portalmvp.BuildConfig;
import com.lh.commonclasses.base.CommonBaseApp;
import com.lh.commonclasses.utils.LogUtil;

import org.swl.feedback.FeedBack;

import swl.lib.common.SwlDeviceInfo;

public abstract class BaseApp extends CommonBaseApp {
    protected static String sn;

    @Override
    public void onCreate() {
        super.onCreate();
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
}
