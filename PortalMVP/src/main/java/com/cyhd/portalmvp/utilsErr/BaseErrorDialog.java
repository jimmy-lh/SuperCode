package com.cyhd.portalmvp.utilsErr;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cyhd.portalmvp.R;
import com.lh.commonclasses.utils.MetricsUtil;


/**
 * Created by fanjia on 2017/7/21.
 */

public class BaseErrorDialog extends Dialog {
        private TextView tv_loading;
        private LinearLayout ll_error_msg;

    /**
     *
     * @param mContext
     * @param style
     * @param bg   错误码弹出框背景
     * @param width  弹出框的宽度
     * @param height 弹出框的高度
     */
	public BaseErrorDialog(Context mContext, String str, int style, int bg, int width, int height) {
        super(mContext, style);
        View loadingView = LayoutInflater.from(mContext).inflate(
                R.layout.layout_error_dialog, null);
        ll_error_msg=(LinearLayout) loadingView
                .findViewById(R.id.ll_error_msg);
        if(width>0&&height>0){
            width= MetricsUtil.DipToPixels(mContext,width);
            height= MetricsUtil.DipToPixels(mContext,height);
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(width,height);
            ll_error_msg.setLayoutParams(layoutParams);
        }
        ll_error_msg.setBackgroundResource(bg);
        tv_loading = (TextView) loadingView
                .findViewById(R.id.tv_error_msg);
        setContentView(loadingView);
        tv_loading.setText(str);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
//                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
    }

    public void setShowMsg(int paramInt) {
        this.tv_loading.setText(paramInt);
    }

    public void setShowMsg(String paramString) {
        this.tv_loading.setText(paramString);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode != KeyEvent.KEYCODE_DPAD_CENTER && keyCode != KeyEvent.KEYCODE_DPAD_LEFT && keyCode != KeyEvent.KEYCODE_DPAD_RIGHT) {
            dismiss();
            cancel();
//            return true;
//        }
        return super.onKeyDown(keyCode, event);
    }
}
