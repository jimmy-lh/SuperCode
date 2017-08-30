package com.lh.commonclasses.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

import com.lh.commonclasses.entity.DisplayParamModel;

/**
 * 转换显示单位,DisplayMetrics的工具类
 * px（像素）：屏幕上的点。
 * in（英寸）：长度单位。
 * mm（毫米）：长度单位。
 * pt（磅）：1/72英寸。
 * dp（与密度无关的像素）：一种基于屏幕密度的抽象单位。在每英寸160点的显示器上，1dp = 1px。
 * dip：与dp相同，多用于android/ophone示例中。
 * sp（与刻度无关的像素）：与dp类似，但是可以根据用户的字体大小首选项进行缩放。
 */
public class MetricsUtil {

    public static DisplayParamModel getDisplayParams(Activity activity) {
        DisplayMetrics metric = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metric);
        DisplayParamModel model = new DisplayParamModel();
        model.setWidth(metric.widthPixels);// 屏幕宽度（像素）
        model.setHeight(metric.heightPixels);// 屏幕高度（像素）
        model.setDensity(metric.density);// 屏幕密度（0.75 / 1.0 / 1.5）
        model.setDensityDpi(metric.densityDpi);// 屏幕密度DPI（120 / 160 / 240）
        return model;
    }

    /**
     * dip转像素
     *
     * @param context
     * @param dip
     * @return
     */
    public static int DipToPixels(Context context, float dip) {
        final float SCALE = context.getResources().getDisplayMetrics().density;
        float valueDips = dip;
        int valuePixels = (int) (valueDips * SCALE + 0.5f);
        return valuePixels;
    }

    /**
     * 像素转dip
     *
     * @param context
     * @param Pixels
     * @return
     */
    public static float PixelsToDip(Context context, float Pixels) {
        final float SCALE = context.getResources().getDisplayMetrics().density;
        LogUtil.d("MetricsUtil", "dpi=" + context.getResources().getDisplayMetrics().densityDpi);
        float dips = Pixels / SCALE;
        return dips;
    }

}
