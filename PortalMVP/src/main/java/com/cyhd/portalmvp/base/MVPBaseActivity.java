package com.cyhd.portalmvp.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.cyhd.portalmvp.R;
import com.cyhd.portalmvp.constant.PlayConstant;
import com.cyhd.portalmvp.constant.PortalErr;
import com.cyhd.portalmvp.mvp.network.RxManager;
import com.cyhd.portalmvp.receiver.NetworkConnectChangedReceiver;
import com.cyhd.portalmvp.receiver.TimeChangedReceiver;
import com.lh.commonclasses.utils.ActivityCollectUtil;
import com.cyhd.portalmvp.utilsErr.PlayUmengCollection;
import com.cyhd.portalmvp.utilsErr.ShowErrorMsgUtil;
import com.lh.commonclasses.utils.LogUtil;
import com.umeng.analytics.MobclickAgent;

import org.coolx.applicationupdate.CoolXMainActivity;


public abstract class MVPBaseActivity extends CoolXMainActivity implements TimeChangedReceiver.OnTimeChangedListener, NetworkConnectChangedReceiver.onNetworkConnectChangedListener {

    protected String TAG;
    private String errorStr = ""; //错误码提示信息

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
        cancelErrorDialog();
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

    /**
     * 取消ErrorDialog
     */
    public void cancelErrorDialog() {
        ShowErrorMsgUtil.cancelErrorDialog();
    }

    /**
     * 节目单错误码提示类型
     */
    public enum ProgrameErrorHintType {
        EXIT_RETRY,
        SWITCH_CATEGORY_RETRY
    }

    /**
     * 激活失败的相关提示信息
     *
     * @param errorCode 激活或者节目单获取的错误码
     * @param bg        错误码弹出框背景
     * @param width     弹出框的宽度
     * @param height    弹出框的高度
     * @return 错误提示信息
     */

    public void showAuthorErrorMsg(String errorCode, final int bg, final int width, final int height) {
        errorStr = "";
        if (PortalErr.NO_MACADDR.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "8"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.PORTAL_SN.equals(errorCode)
                || PortalErr.PORTAL_MAC.equals(errorCode)
                || PortalErr.PORTAL_DATA.equals(errorCode)
                || PortalErr.PORTAL_UPDATE_TERMINAL.equals(errorCode)
                || PortalErr.PORTAL_UPDATE_USER.equals(errorCode)
                || PortalErr.PORTAL_TERMINAL_BIND.equals(errorCode)
                || PortalErr.PORTAL_USER_INSERT.equals(errorCode)
                || PortalErr.PORTAL_UPDATE_TOKEN.equals(errorCode)
                || PortalErr.PORTAL_AUTH.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "1"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.PORTAL_FORBIDDEN.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "2"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.PORTAL_BLACKLIST.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "3"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.PORTAL_NOTLIST.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "4"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.PORTAL_AUTH_TACTICS.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "5"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.PORTAL_AAA.equals(errorCode)
                || PortalErr.PORTAL_PARAMETER_EXCEPTION.equals(errorCode)
                || PortalErr.PORTAL_SYSTEM.equals(errorCode)
                || PortalErr.PORTAL_DATABASE.equals(errorCode)
                || PortalErr.SYSTEM_OVERLOAD_PROTECTION.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "6"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.STR_COLUMN_TIMEOUT.equals(errorCode)) {
            errorStr = getString(R.string.error_code_sn_type) + "7"
                    + getString(R.string.error_code_sn_string);
        } else if (PortalErr.STR_PRODUCT_WITHOUT_AUTH.equals(errorCode)) {
            errorStr = getString(R.string.error_code_product_type) + "1"
                    + getString(R.string.error_code_product_string);
        } else if (PortalErr.NO_ASSOCIATED_PORTAL.equals(errorCode)) {
            errorStr = getString(R.string.error_code_product_type) + "2"
                    + getString(R.string.error_code_product_string);
        } else if (PortalErr.STR_NET_ERROR.equals(errorCode)) {
            errorStr = getString(R.string.error_code_net_type) + "1"
                    + getString(R.string.error_code_net_string);
        } else if (PortalErr.PORTAL_TOKEN.equals(errorCode)
                || PortalErr.PORTAL_LOGIN.equals(errorCode)
                || PortalErr.PORTAL_HEART_MAC.equals(errorCode)
                || PortalErr.PORTAL_HEART_USER.equals(errorCode)) {
            errorStr = getString(R.string.error_code_net_type) + "2"
                    + getString(R.string.error_code_sn_string);
        }
        if (!TextUtils.isEmpty(errorStr)) {
            Log.d(TAG, "显示激活失败或节目单获取失败错误码");
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    ShowErrorMsgUtil.showErrorDialog(mContext, errorStr, bg, width, height);
                }
            });
        }
    }

    /**
     * 节目单获取失败的相关提示信息
     *
     * @param errorCode              节目单获取的错误码
     * @param mProgrameErrorHintType 节目单获取失败提示信息类型. EXIT_RETRY:提示退出重试 ；  SWITCH_CATEGORY_RETRY：提示切换分类重试
     * @param bg                     错误码弹出框背景
     * @param width                  弹出框的宽度
     * @param height                 弹出框的高度
     * @return 错误提示信息
     */

    public void showEpgErrorMsg(String errorCode, final ProgrameErrorHintType mProgrameErrorHintType, final int bg, final int width, final int height) {
        errorStr = "";
        if (PortalErr.STR_NET_ERROR.equals(errorCode)) {
            errorStr = getString(R.string.error_code_net_type) + "1"
                    + getString(R.string.error_code_net_string);
        } else if (PortalErr.PORTAL_TOKEN.equals(errorCode)
                || PortalErr.PORTAL_LOGIN.equals(errorCode)
                || PortalErr.PORTAL_HEART_MAC.equals(errorCode)
                || PortalErr.PORTAL_HEART_USER.equals(errorCode)) {
            errorStr = getString(R.string.error_code_net_type) + "2"    //token失效
                    + getString(R.string.error_cateory_string)
                    + getString(R.string.error_code_try_agan);
        } else if (PortalErr.PORTAL_CUR_COLUMN.equals(errorCode)
                || PortalErr.PORTAL_ROOT_COLUMN.equals(errorCode)) {
            if (mProgrameErrorHintType == ProgrameErrorHintType.EXIT_RETRY)
                errorStr = getString(R.string.error_code_cateory_type) + "1"
                        + getString(R.string.error_cateory_string)
                        + getString(R.string.error_code_try_agan);
            else
                errorStr = getString(R.string.error_code_cateory_type) + "1"
                        + getString(R.string.load_data_error);
        } else if (PortalErr.STR_BOX_EPG_TIMEOUT_ERROR.equals(errorCode)) {
            if (mProgrameErrorHintType == ProgrameErrorHintType.EXIT_RETRY)
                errorStr = getString(R.string.error_code_cateory_type) + "2"
                        + getString(R.string.error_cateory_string)
                        + getString(R.string.error_code_try_agan);
            else
                errorStr = getString(R.string.error_code_cateory_type) + "2"
                        + getString(R.string.load_data_error);
        } else if (PortalErr.PORTAL_AAA.equals(errorCode)
                || PortalErr.PORTAL_PARAMETER_EXCEPTION.equals(errorCode)
                || PortalErr.PORTAL_SYSTEM.equals(errorCode)
                || PortalErr.PORTAL_DATABASE.equals(errorCode)
                || PortalErr.SYSTEM_OVERLOAD_PROTECTION.equals(errorCode)) {
            if (mProgrameErrorHintType == ProgrameErrorHintType.EXIT_RETRY)
                errorStr = getString(R.string.error_code_cateory_type) + "3"
                        + getString(R.string.error_cateory_string)
                        + getString(R.string.error_code_try_agan);
            else
                errorStr = getString(R.string.error_code_cateory_type) + "3"
                        + getString(R.string.load_data_error);
        } else if (PortalErr.STR_PRODUCT_WITHOUT_AUTH.equals(errorCode)) {
            errorStr = getString(R.string.error_code_product_type) + "1"
                    + getString(R.string.error_code_product_string);
        } else if (PortalErr.NO_ASSOCIATED_PORTAL.equals(errorCode)) {
            errorStr = getString(R.string.error_code_product_type) + "2"
                    + getString(R.string.error_code_product_string);
        }
        if (!TextUtils.isEmpty(errorStr)) {
            Log.d(TAG, "显示激活失败或节目单获取失败错误码");
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    ShowErrorMsgUtil.showErrorDialog(mContext, errorStr, bg, width, height);
                }
            });
        }
    }

    /**
     * 播放失败错误码提示类型
     */
    public enum PlayErrorHintType {
        EXIT_RETRY_PLAY,
        CHANGE_CHANNEL
    }

    /**
     * @param errorCode          播放失败的错误码
     * @param mPlayErrorHintType 播放失败提示信息类型. EXIT_RETRY_PLAY:提示播放失败，退出重试 ；  CHANGE_CHANNEL：提示播放失败，换台重试
     * @param bg                 错误码弹出框背景
     * @param mCurChannel        当前播放的节目名称
     * @param SN                 序列号
     * @param width              弹出框的宽度
     * @param height             弹出框的高度
     * @return 错误提示信息
     */
    public void showPlayFailErrorMsg(int errorCode, PlayErrorHintType mPlayErrorHintType, String mCurChannel, String SN, final int bg, final int width, final int height) {
        errorStr = "";
        Log.d(TAG, "显示播放失败错误码");
        switch (errorCode) {
            /**
             * EC1:APK与GSLB失联，请求超时;
             * 测试方式：停止gslb
             */
            case PlayConstant.PLAY_GSLB_DISCONNECT:
                errorStr = getString(R.string.error_code_play_type) + "1"
                        + getString(R.string.error_code_play_fail);
                PlayUmengCollection.CollectionErrInfoMsg(getApplicationContext(), mCurChannel, SN, PlayUmengCollection.ErrorKeyCode.ERCODE_EC1);
                break;
            /**
             * EC2:APK请求GSLB参数错误
             * 测试方式：请求gslb缺少user_id参数
             */
            case PlayConstant.KBMSG_CONNECTTIMEOUT:
                errorStr = getString(R.string.error_code_play_type) + "2"
                        + getString(R.string.error_code_play_fail);
                PlayUmengCollection.CollectionErrInfoMsg(getApplicationContext(), mCurChannel, SN, PlayUmengCollection.ErrorKeyCode.ERCODE_EC2);
                break;
            /**
             * EC3:连接数据库错误
             * 测试方式：把gslb的配置端口改成5433
             */
            case PlayConstant.KBMSG_CONNECTAUTHFAILED:
                errorStr = getString(R.string.error_code_play_type) + "3"
                        + getString(R.string.error_code_play_fail);
                break;
            /**
             * EC4:SN未激活
             * 测试方式：SN填写一个不存在的用户
             */
            case PlayConstant.KBMSG_EMS_LOWRESOURCE:
                errorStr = getString(R.string.error_code_play_type) + "4"
                        + getString(R.string.error_code_play_fail);
                break;
            /**
             * EC5:无可用的SLB
             * 测试方式：停止sn对应的组的所有slb
             */
            case PlayConstant.KBMSG_GSLB_NO_PROGRAM:
                errorStr = getString(R.string.error_code_play_type) + "5"
                        + getString(R.string.error_code_play_fail);

                break;
            /**
             * EC6:APK与LSLB失联，请求超时;
             * 测试方式：停止对应的slb
             */
            case PlayConstant.PLAY_LSLB_DISCONNECT:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "6"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "6"
                            + getString(R.string.error_code_play_string);
                break;
            case PlayConstant.PLAY_LSLB_DISCONNECT1:
                errorStr = getString(R.string.error_code_play_type) + "6" + getString(R.string.error_code_play_fail) + getString(R.string.film_reloading);
                break;
            /**
             * EC7:APK请求LSLB参数错误
             * 测试方式：请求lslb缺少所有参数
             */
            case PlayConstant.KBMSG_MOLLOCFAILE:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "7"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "7"
                            + getString(R.string.error_code_play_string);
                PlayUmengCollection.CollectionErrInfoMsg(getApplicationContext(), mCurChannel, SN, PlayUmengCollection.ErrorKeyCode.ERCODE_EC7);
                break;
            /**
             * EC8:防盗链认证失败
             * 测试方式：拿已经失效的链接访问slb地址
             */
            case PlayConstant.KBMSG_SPPED_ERROR:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "8"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "8"
                            + getString(R.string.error_code_play_string);
                break;
            /**
             * EC9:流不存在或没有发布
             * 测试方式：停掉一路流，apk请求该路流
             */
            case PlayConstant.PLAY_NOT_STREAM:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "9"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "9"
                            + getString(R.string.error_code_play_string);
                break;
            /**
             * EC10:LSLB没有找到可用的服务器
             * 测试方式：停掉请求的LSLB对应的evlss
             */
            case PlayConstant.PLAY_MISS_SERVICE:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "10"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "10"
                            + getString(R.string.error_code_play_string);
                break;
            /**
             * EC11:盒子与EMS失联，请求超时,可能原因:
             * 1、EVLSS服务器访问失败
             * 2、EVLSS服务器死机
             * 3、EVLSS服务器无效
             * 4、EVLSS服务器程序死掉
             * 测试方式：产生边缘url后停掉 对应的evlss，或者产生一个不存在的播放地址
             */
            case PlayConstant.PLAY_EVLSS_DISCONNECT:  //EC11
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "11"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "11"
                            + getString(R.string.error_code_play_string);

                break;
            case PlayConstant.PLAY_EVLSS_DISCONNECT1:
                errorStr = getString(R.string.error_code_play_type) + "11" + getString(R.string.error_code_play_fail) + getString(R.string.film_reloading);
                break;
            /**
             * EC12:EVLSS 可以连接但开始播放直播资源超时或失败;
             * 测试方式：evlss 配置一共错误的回源地址，导致不能回源拉流
             */
            case PlayConstant.PLAY_EVLSS_FAIL:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "12"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "12"
                            + getString(R.string.error_code_play_string);
                break;
            case PlayConstant.PLAY_EVLSS_FAIL1:
                errorStr = getString(R.string.error_code_play_type) + "12" + getString(R.string.error_code_play_fail) + getString(R.string.film_reloading);
                break;
            /**
             * EC13:GSLB异常退出（http 404错误）
             * 测试方式：在gslb.lua中去掉一个require
             */
            case PlayConstant.PLAY_GSLB_EXCEPTION:
                errorStr = getString(R.string.error_code_play_type) + "13"
                        + getString(R.string.error_code_play_fail);

                break;
            /**
             * EC14:LSLB异常退出（http 404错误）
             * 测试方法：在live_lslb.lua中去掉一个require
             */
            case PlayConstant.PLAY_LSLB_EXCEPTION:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "14"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "14"
                            + getString(R.string.error_code_play_string);

                break;
            /**
             * EC15:播放EVLSS直播资源播放成功后又断流或没有数据
             * 测试方式：干掉源站mvlss
             */
            case PlayConstant.PLAY_EVLSS_OK2ERR:
                if (mPlayErrorHintType == PlayErrorHintType.EXIT_RETRY_PLAY)
                    errorStr = getString(R.string.error_code_play_type) + "15"
                            + getString(R.string.error_code_play_exit);
                else
                    errorStr = getString(R.string.error_code_play_type) + "15"
                            + getString(R.string.error_code_play_string);

                break;
            case PlayConstant.PLAY_EVLSS_OK2ERR1:
                errorStr = getString(R.string.error_code_play_type) + "15" + getString(R.string.error_code_play_fail) + getString(R.string.film_reloading);
                break;
            default:
                break;
        }
        if (!TextUtils.isEmpty(errorStr)) {
            Log.d(TAG, "显示播放失败错误码");
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    ShowErrorMsgUtil.showErrorDialog(mContext, errorStr, bg, width, height);
                }
            });
        }
    }

}
