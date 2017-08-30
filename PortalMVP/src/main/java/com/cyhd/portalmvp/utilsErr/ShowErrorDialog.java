package com.cyhd.portalmvp.utilsErr;


import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * 错误码提示框
 *
 *
 */
public class ShowErrorDialog extends BaseErrorDialog {
	private TextView tv_loading;
	private LinearLayout ll_error_msg;

	/**
	 * @param mContext
	 * @param style
	 * @param bg       错误码弹出框背景
	 * @param width    弹出框的宽度
	 * @param height   弹出框的高度
	 */
	public ShowErrorDialog(Context mContext, String str, int style, int bg, int width, int height) {
		super(mContext,str, style, bg, width, height);
	}

}