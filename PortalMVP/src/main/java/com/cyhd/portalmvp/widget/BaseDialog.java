package com.cyhd.portalmvp.widget;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cyhd.portalmvp.R;

/**
 * 双选择对话框
 * Created by yangsong on 2016/2/16.
 */
public class BaseDialog extends Dialog implements View.OnClickListener {
    private LinearLayout mRootView;
    private TextView mMsgTv;
    private Button mPositiveBtn, mNegativeBtn;
    private String mMessage, mPositiveText, mNegativeText;
    private OnClickListener mOnPositiveButtonClickListener, mOnNegativeButtonClickListener;


    public BaseDialog(Context context) {
        this(context, R.style.ToastDialog);
    }

    public BaseDialog(Context context, int style) {
        super(context, style);
        setContentView(R.layout.layout_base_dialog);
        mRootView = (LinearLayout) findViewById(R.id.base_dialog_root_view);
        mMsgTv = (TextView) findViewById(R.id.layout_double_dialog_msg_tv);
        mPositiveBtn = (Button) findViewById(R.id.layout_double_dialog_positive_btn);
        mNegativeBtn = (Button) findViewById(R.id.layout_double_dialog_negative_btn);
        if (BaseDialogConfig.getInstance().getWidth() != BaseDialogConfig.INVALID_RES_ID &&
                BaseDialogConfig.getInstance().getHeight() != BaseDialogConfig.INVALID_RES_ID) {
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.width = BaseDialogConfig.getInstance().getWidth();
            params.height = BaseDialogConfig.getInstance().getHeight();
            getWindow().setAttributes(params);
        }

        mRootView.setPadding(BaseDialogConfig.getInstance().getPaddingLeft(),
                BaseDialogConfig.getInstance().getPaddingTop(),
                BaseDialogConfig.getInstance().getPaddingRight(),
                BaseDialogConfig.getInstance().getPaddingBottom());

        if (BaseDialogConfig.getInstance().getBackgroundResId() != BaseDialogConfig.INVALID_RES_ID) {
            mRootView.setBackgroundResource(BaseDialogConfig.getInstance().getBackgroundResId());
        }

        if (BaseDialogConfig.getInstance().getPositiveBtnBackgroundDrawableResId() != BaseDialogConfig.INVALID_RES_ID) {
            mPositiveBtn.setBackgroundResource(BaseDialogConfig.getInstance().getPositiveBtnBackgroundDrawableResId());
        }

        if (BaseDialogConfig.getInstance().getPositiveBtnTextResId() != BaseDialogConfig.INVALID_RES_ID) {
            mPositiveBtn.setText(BaseDialogConfig.getInstance().getPositiveBtnTextResId());
        }

        if (BaseDialogConfig.getInstance().getNegativeBtnBackgroundDrawableResId() != BaseDialogConfig.INVALID_RES_ID) {
            mNegativeBtn.setBackgroundResource(BaseDialogConfig.getInstance().getPositiveBtnBackgroundDrawableResId());
        }

        if (BaseDialogConfig.getInstance().getNegativeBtnTextResId() != BaseDialogConfig.INVALID_RES_ID) {
            mNegativeBtn.setText(BaseDialogConfig.getInstance().getNegativeBtnTextResId());
        }

        mPositiveBtn.setOnClickListener(this);
        mNegativeBtn.setOnClickListener(this);
    }

    @Override
    public void show() {
        super.show();
        if (mMsgTv != null && !TextUtils.isEmpty(this.mMessage)) {
            mMsgTv.setText(this.mMessage);
            mMsgTv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        }

        if (mPositiveBtn != null && !TextUtils.isEmpty(this.mPositiveText)) {
            mPositiveBtn.setText(this.mPositiveText);
            mPositiveBtn.setVisibility(View.VISIBLE);
            mMsgTv.setGravity(Gravity.CENTER_HORIZONTAL);
        }
        if (mNegativeBtn != null && !TextUtils.isEmpty(this.mNegativeText)) {
            mNegativeBtn.setText(this.mNegativeText);
            mNegativeBtn.setVisibility(View.VISIBLE);
            mMsgTv.setGravity(Gravity.CENTER_HORIZONTAL);
        }
    }

    /**
     * 设置要显示的信息
     *
     * @param mMessage
     */
    public void setMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public Button setPositiveButton(String mPositiveText, OnClickListener onPositiveButtonClickListener) {
        this.mPositiveText = mPositiveText;
        this.mOnPositiveButtonClickListener = onPositiveButtonClickListener;
        return this.mPositiveBtn;
    }

    public Button setNegativeButton(String mNegativeText, OnClickListener onNegativeButtonClickListener) {
        this.mNegativeText = mNegativeText;
        this.mOnNegativeButtonClickListener = onNegativeButtonClickListener;
        return this.mNegativeBtn;
    }

    public Button getmPositiveBtn() {
        return mPositiveBtn;
    }

    public Button getmNegativeBtn() {
        return mNegativeBtn;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != KeyEvent.KEYCODE_DPAD_CENTER && keyCode != KeyEvent.KEYCODE_DPAD_LEFT && keyCode != KeyEvent.KEYCODE_DPAD_RIGHT) {
            dismiss();
            cancel();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.layout_double_dialog_positive_btn) {
            if (mOnPositiveButtonClickListener != null)
                mOnPositiveButtonClickListener.onClick(this, 0);
        } else if (id == R.id.layout_double_dialog_negative_btn) {
            if (mOnNegativeButtonClickListener != null)
                mOnNegativeButtonClickListener.onClick(this, 1);
        }
    }


}