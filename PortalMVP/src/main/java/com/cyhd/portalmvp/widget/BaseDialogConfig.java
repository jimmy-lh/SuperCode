package com.cyhd.portalmvp.widget;

import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;

/**
 * Created by yangsong on 2016/4/8.
 */
public class BaseDialogConfig {
    public static final int INVALID_RES_ID = -1;
    private static BaseDialogConfig mInstance;
    private
    @IdRes
    int backgroundResId = INVALID_RES_ID;
    private
    @DrawableRes
    int positiveBtnBackgroundDrawableResId = INVALID_RES_ID;
    private
    @DrawableRes
    int NegativeBtnBackgroundDrawableResId = INVALID_RES_ID;
    private
    @StringRes
    int positiveBtnTextResId = INVALID_RES_ID;
    private
    @StringRes
    int negativeBtnTextResId = INVALID_RES_ID;

    private int width = INVALID_RES_ID;
    private int height = INVALID_RES_ID;

    private int paddingTop = 0;
    private int paddingLeft = 0;
    private int paddingRight = 0;
    private int paddingBottom = 0;

    private BaseDialogConfig() {
    }

    public static BaseDialogConfig getInstance() {
        if (mInstance == null)
            mInstance = new BaseDialogConfig();
        return mInstance;
    }

    public int getBackgroundResId() {
        return backgroundResId;
    }

    public BaseDialogConfig setBackgroundResId(int backgroundResId) {
        this.backgroundResId = backgroundResId;
        return this;
    }

    public int getPositiveBtnBackgroundDrawableResId() {
        return positiveBtnBackgroundDrawableResId;
    }

    public BaseDialogConfig setPositiveBtnBackgroundDrawableResId(int positiveBtnBackgroundDrawableResId) {
        this.positiveBtnBackgroundDrawableResId = positiveBtnBackgroundDrawableResId;
        return this;
    }

    public int getNegativeBtnBackgroundDrawableResId() {
        return NegativeBtnBackgroundDrawableResId;
    }

    public BaseDialogConfig setNegativeBtnBackgroundDrawableResId(int negativeBtnBackgroundDrawableResId) {
        NegativeBtnBackgroundDrawableResId = negativeBtnBackgroundDrawableResId;
        return this;
    }

    public int getPositiveBtnTextResId() {
        return positiveBtnTextResId;
    }

    public BaseDialogConfig setPositiveBtnTextResId(int positiveBtnTextResId) {
        this.positiveBtnTextResId = positiveBtnTextResId;
        return this;
    }

    public int getNegativeBtnTextResId() {
        return negativeBtnTextResId;
    }

    public BaseDialogConfig setNegativeBtnTextResId(int negativeBtnTextResId) {
        this.negativeBtnTextResId = negativeBtnTextResId;
        return this;
    }


    public BaseDialogConfig setContentPadding(int left, int top, int right, int bottom) {
        this.paddingLeft = left;
        this.paddingTop = top;
        this.paddingRight = right;
        this.paddingBottom = bottom;
        return this;
    }

    public int getPaddingTop() {
        return paddingTop;
    }

    public int getPaddingLeft() {
        return paddingLeft;
    }

    public int getPaddingRight() {
        return paddingRight;
    }

    public int getPaddingBottom() {
        return paddingBottom;
    }

    public int getWidth() {
        return width;
    }

    public BaseDialogConfig setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public BaseDialogConfig setHeight(int height) {
        this.height = height;
        return this;
    }
}
