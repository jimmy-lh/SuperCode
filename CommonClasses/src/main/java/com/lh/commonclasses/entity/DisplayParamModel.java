package com.lh.commonclasses.entity;

/**
 * Created by yangsong on 2016/2/29.
 */
public class DisplayParamModel {
    /**
     * 屏幕宽度（px）
     */
    private int width;

    /**
     * 屏幕高度（px）
     */
    private int height;

    /**
     * 屏幕密度（0.75 / 1.0 / 1.5）
     */
    private float density;

    /**
     *  屏幕密度DPI（120 / 160 / 240）
     */
    private int densityDpi;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public int getDensityDpi() {
        return densityDpi;
    }

    public void setDensityDpi(int densityDpi) {
        this.densityDpi = densityDpi;
    }

    @Override
    public String toString() {
        return "DisplayParamModel{" +
                "width=" + width +
                ", height=" + height +
                ", density=" + density +
                ", densityDpi=" + densityDpi +
                '}';
    }
}
