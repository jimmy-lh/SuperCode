package com.cyhd.portalmvp.mvp.presenter;

import android.text.TextUtils;

import com.cyhd.portalmvp.constant.PlayConstant;
import com.cyhd.portalmvp.entity.PlayErrorMessage;
import com.cyhd.portalmvp.mvp.base.BasePlayBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetLivePlayUrlResult;
import com.cyhd.portalmvp.mvp.model.GetLivePlayUrlModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetLivePlayUrlModel;
import com.cyhd.portalmvp.mvp.view.IGetLivePlayUrlView;

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
public class GetLivePlayUrlPresenter extends BasePresenter<IGetLivePlayUrlView> implements BasePlayBeanResult.IGetLivePlayUrlBean{

    private IGetLivePlayUrlModel model;

    public GetLivePlayUrlPresenter(IGetLivePlayUrlView view) {
        super(view);
        model = new GetLivePlayUrlModel();
    }

    public void requestData(String slb_url,String playCode) {
        model.getLivePlayUrl(slb_url,playCode, this);
    }

    @Override
    public void onNext(GetLivePlayUrlResult result ,String playCode) {
        PlayErrorMessage.getInstace().clearMessage();
        if(result!=null) {
            if(!TextUtils.isEmpty(result.getRedirect_url())){
                view.requestPlayUrlSuccess(result,playCode);
            }else if(!TextUtils.isEmpty(result.getReturn_code())){
                try {
                    view.requestPlayUrlError(Integer.parseInt(result.getReturn_code()),playCode);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Override
    public void onError(Throwable e,String playCode) {
        PlayErrorMessage.getInstace().clearMessage();
        int error_code=0;
        if (e instanceof HttpException) {              //HTTP错误
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
                    error_code=PlayConstant.PLAY_LSLB_EXCEPTION;
                }
                break;
                default:
                    break;
            }
        } else if (e instanceof ConnectException
                || e instanceof SocketTimeoutException
                || e instanceof TimeoutException) {
            error_code=PlayConstant.PLAY_LSLB_DISCONNECT;
        }
        view.requestPlayUrlError(error_code,playCode);
    }
}
