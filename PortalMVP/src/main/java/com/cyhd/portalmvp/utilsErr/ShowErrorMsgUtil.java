package com.cyhd.portalmvp.utilsErr;

import android.app.Dialog;
import android.content.Context;

import com.cyhd.portalmvp.R;


/**
 * 错误码显示
 * Created by fanjia on 2017/7/21.
 */

public class ShowErrorMsgUtil {

    private static Dialog errorMsgDialog;

    /*
     * show apk error info
     */
    public static void showErrorDialog(Context context, String str, int bg, int width, int height) {
        hideErrorDialog();
        errorMsgDialog = new ShowErrorDialog(context, str, R.style.style_dialog_error, bg, width, height);
        errorMsgDialog.setCancelable(true);
        errorMsgDialog.setCanceledOnTouchOutside(true);
        ((ShowErrorDialog) errorMsgDialog).setShowMsg(str);
        errorMsgDialog.show();
    }

    public static Dialog getErrorMsgDialog() {
        return errorMsgDialog;
    }


    public static void hideErrorDialog() {
        if (errorMsgDialog != null && errorMsgDialog.isShowing()) {
            errorMsgDialog.dismiss();
            errorMsgDialog = null;
        }
    }

    public static void cancelErrorDialog() {
        if (errorMsgDialog != null && errorMsgDialog.isShowing()) {
            errorMsgDialog.dismiss();
            errorMsgDialog.cancel();
            errorMsgDialog = null;
        }
    }
}
