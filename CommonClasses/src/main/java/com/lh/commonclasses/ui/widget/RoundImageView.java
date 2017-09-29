package com.lh.commonclasses.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.lh.commonclasses.R;

/**
 * 使用方式：在xml中定义参数rs:image_radis="10dp"即可设置圆角图片
 * xml文件中增加下面的命名空间
 * xmlns:rs="http://schemas.android.com/apk/res-auto"
 */
public class RoundImageView extends ImageView {
    private int radis;
    private boolean mIsDrawShape = true;
    private RadiusRect mRadiusRect;
    private int angle;

    public RoundImageView(Context context) {
        super(context);
    }

    public RoundImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public RoundImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RoundImageView);
            radis = (int) a.getDimension(R.styleable.RoundImageView_image_radis, 10);
            angle = (int) a.getDimension(R.styleable.RoundImageView_image_angle, 90);
            mRadiusRect = new RadiusRect(radis, radis, radis, radis);
            a.recycle();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        //设置圆角.
        if (mIsDrawShape) {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG));
            canvas.clipPath(getShapePath());
        }
        super.draw(canvas);
    }

    public Path getShapePath() {
        return getRoundPath();
    }


    private Path getRoundPath() {
        int width = getWidth();
        int height = getHeight();
        //
        Path path = new Path();
        path.moveTo(mRadiusRect.topLeftRadius, 0);
        // 左上
        RectF arcTopLeft = new RectF(0, 0, mRadiusRect.topLeftRadius * 2, mRadiusRect.topLeftRadius * 2);
        path.arcTo(arcTopLeft, -angle, -angle);
        path.lineTo(mRadiusRect.topLeftRadius, 0);
        // 右上.
        RectF arcTopRight = new RectF(width - mRadiusRect.topRightRadius * 2, 0, width, mRadiusRect.topRightRadius * 2);
        path.arcTo(arcTopRight, -angle, angle);
        // 右下.
        RectF arcBottomRight = new RectF(width - mRadiusRect.bottomRightRadius * 2,
                height - mRadiusRect.bottomRightRadius * 2, width, height);
        path.arcTo(arcBottomRight, 0, angle);
        // 左下.
        RectF arc = new RectF(0, height - mRadiusRect.bottomLeftRadius * 2, mRadiusRect.bottomLeftRadius * 2, height);
        path.arcTo(arc, angle, angle);
        path.lineTo(0, mRadiusRect.topLeftRadius);
        path.close();
        return path;
    }


    public class RadiusRect {
        public float topLeftRadius;
        public float topRightRadius;
        public float bottomLeftRadius;
        public float bottomRightRadius;

        public RadiusRect() {
        }

        public RadiusRect(float tlRadius, float trRaius, float blRadius, float brRaius) {
            topLeftRadius = tlRadius;
            topRightRadius = trRaius;
            bottomLeftRadius = blRadius;
            bottomRightRadius = brRaius;
        }

        public void set(float tlRadius, float trRaius, float blRadius, float brRaius) {
            topLeftRadius = tlRadius;
            topRightRadius = trRaius;
            bottomLeftRadius = blRadius;
            bottomRightRadius = brRaius;
        }

        public RadiusRect get() {
            return new RadiusRect(topLeftRadius, topRightRadius, bottomLeftRadius, bottomRightRadius);
        }
    }

}
