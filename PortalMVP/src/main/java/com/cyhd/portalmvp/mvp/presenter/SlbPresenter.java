package com.cyhd.portalmvp.mvp.presenter;

import android.text.TextUtils;

import com.cyhd.portalmvp.base.BaseApp;
import com.cyhd.portalmvp.constant.PlayConstant;
import com.cyhd.portalmvp.constant.SPConstant;
import com.cyhd.portalmvp.constant.UrlConstant;
import com.cyhd.portalmvp.entity.PlayErrorMessage;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.SlbBeanResult;
import com.cyhd.portalmvp.mvp.model.SlbModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.ISlbModel;
import com.cyhd.portalmvp.mvp.view.ISlbView;
import com.lh.commonclasses.utils.SuperLog;
import com.lh.commonclasses.utils.SPUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

import retrofit2.adapter.rxjava.HttpException;

import static com.cyhd.portalmvp.constant.HttpResultErrorCode.BAD_GATEWAY;
import static com.cyhd.portalmvp.constant.HttpResultErrorCode.FORBIDDEN;
import static com.cyhd.portalmvp.constant.HttpResultErrorCode.GATEWAY_TIMEOUT;
import static com.cyhd.portalmvp.constant.HttpResultErrorCode.INTERNAL_SERVER_ERROR;
import static com.cyhd.portalmvp.constant.HttpResultErrorCode.NOT_FOUND;
import static com.cyhd.portalmvp.constant.HttpResultErrorCode.REQUEST_TIMEOUT;
import static com.cyhd.portalmvp.constant.HttpResultErrorCode.SERVICE_UNAVAILABLE;
import static com.cyhd.portalmvp.constant.HttpResultErrorCode.UNAUTHORIZED;

/**
 * Created on 2017/7/19.
 */
public class SlbPresenter extends BasePresenter<ISlbView> implements BaseBeanResult.ISlbBeanResult {

    private String TAG = "SlbPresenter";
    private ISlbModel model;
    private long start_glsb_time = System.currentTimeMillis();

    public SlbPresenter(ISlbView view) {
        super(view);
        model = new SlbModel();
    }

    public void requestData(String user_id, String type, String trans_id, String app_id, String lang) {
        start_glsb_time = System.currentTimeMillis();
        model.getSLB(user_id, type, trans_id, app_id, lang, this);
    }

    @Override
    public void onNext(SlbBeanResult result) {
        SuperLog.d(TAG, "glsb耗时=" + (System.currentTimeMillis() - start_glsb_time) + "ms");
        SPConstant.request_slb_done = true;
        if (result != null) {
            String cache_slb = SPUtil.getString(BaseApp.getContext(), SPConstant.SLB_HOST);
            if (!TextUtils.isEmpty(result.getSlb_host())) {
                /**
                 *   注意事项：apk启动时访问激活接口，激活成功后，请求GLSB时要在
                 *  view.requestSlbSuccess(result);回调成功方法里面加一行代码 ： UrlConstant.NEW_SLB_HOST = result.getSlb_host();
                 */

                SuperLog.d(TAG, "NEW_SLB_HOST=" + UrlConstant.NEW_SLB_HOST);
                SPUtil.putString(BaseApp.getContext(), SPConstant.SLB_HOST, result.getSlb_host());
                PlayErrorMessage.getInstace().clearMessage();
                view.requestSlbSuccess(result);
            } else if (!TextUtils.isEmpty(cache_slb)) {
                UrlConstant.CACHE_SLB_HOST = cache_slb;
                SuperLog.d(TAG, "cache_slb=" + UrlConstant.CACHE_SLB_HOST);
                PlayErrorMessage.getInstace().clearMessage();
                view.requestSlbSuccess(result);
            } else  {
                int error_code=0;
                if (!TextUtils.isEmpty(result.getReturn_code())) {
                    SuperLog.d(TAG, "result.getReturn_code=" + result.getReturn_code());
                    try {
                        error_code=Integer.parseInt(result.getReturn_code());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                PlayErrorMessage.getInstace().setErrorCode(error_code);
                view.requestSlbError(error_code);
            }
        }

    }

    @Override
    public void onError(Throwable e) {
        SuperLog.d(TAG, "requestSlbError");
        SuperLog.d(TAG, "glsb耗时=" + (System.currentTimeMillis() - start_glsb_time) + "ms");
        e.printStackTrace();
        int error_code=0;
        SPConstant.request_slb_done = true;
        String cache_slb = SPUtil.getString(BaseApp.getContext(), SPConstant.SLB_HOST);
        if (!TextUtils.isEmpty(cache_slb)) {
            UrlConstant.NEW_SLB_HOST = cache_slb;
            SuperLog.d(TAG, "requestSlbError cache_slb=" + UrlConstant.NEW_SLB_HOST);
            PlayErrorMessage.getInstace().clearMessage();
        } else if (e instanceof HttpException) {              //HTTP错误
            HttpException httpException = (HttpException) e;
            switch (httpException.code()) {
                case UNAUTHORIZED:
                case FORBIDDEN:
                case NOT_FOUND:
                case REQUEST_TIMEOUT:
                case GATEWAY_TIMEOUT:
                case INTERNAL_SERVER_ERROR:
                case BAD_GATEWAY:
                case SERVICE_UNAVAILABLE: {
                    SuperLog.d(TAG, "requestSlbError httpException.code()=" + httpException.code());
                    error_code=PlayConstant.PLAY_GSLB_EXCEPTION;
                }
                break;
                default:
                    break;
            }
        } else if (e instanceof ConnectException
                || e instanceof SocketTimeoutException
                || e instanceof TimeoutException) {
            SuperLog.d(TAG, "requestSlbError TimeoutException");
            error_code=PlayConstant.PLAY_GSLB_DISCONNECT;
        }
        PlayErrorMessage.getInstace().setErrorCode(error_code);
        view.requestSlbError(error_code);
    }
}
