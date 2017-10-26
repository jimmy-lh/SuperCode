package com.lh.viewclasses.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

import com.lh.commonclasses.utils.MetricsUtil;
import com.lh.viewclasses.R;

/**
 * thumb为动态图片的seekbar
 */
public class DynamicImageSeekBar extends RelativeLayout {

    private View mRootView;
    private SeekBar mSeekBar;
    private ImageView mImageView;
    private AnimationDrawable middlepb_loading;  //缓冲条
    private final int OFFSET = MetricsUtil.DipToPixels(getContext(), 387);//ImageView的偏移量
    private int mPorgress = OFFSET;

    private Rect bgRect;

    public DynamicImageSeekBar(Context context) {
        this(context, null);
    }

    public DynamicImageSeekBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DynamicImageSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.layout_load_seekbar, this, true);
        mSeekBar = (SeekBar) mRootView.findViewById(R.id.sb_loading);
        //获取SeekBar的范围
        bgRect = mSeekBar.getProgressDrawable().getBounds();
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setProgress(bgRect.width() * progress / mSeekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //设置ImageView为动态
        mImageView = (ImageView) mRootView.findViewById(R.id.iv_loading);
        mImageView.setImageResource(R.drawable.load_thumb);
        middlepb_loading = (AnimationDrawable) mImageView.getDrawable();
        middlepb_loading.start();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        //设置ImageView的位置
        setLayoutX(mImageView, mPorgress);
    }

    private void setProgress(int progress) {
        mPorgress = progress + OFFSET;
    }

    /**
     * 提供SeekBar给外面，用来动态设置Progress
     */
    public SeekBar getSeekBar() {
        return mSeekBar;
    }

    /**
     * 获取控件宽
     */
    public static int getWidth(View view) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(w, h);
        return (view.getMeasuredWidth());
    }

    /**
     * 获取控件高
     */
    public static int getHeight(View view) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(w, h);
        return (view.getMeasuredHeight());
    }

    /**
     * 设置控件所在的位置X，并且不改变宽高，
     * X为绝对位置，此时Y可能归0
     */
    public static void setLayoutX(View view, int x) {
        //用下面这个方法移位，不知道为什么到中间的时候，球就会变小
//        MarginLayoutParams margin = new MarginLayoutParams(view.getLayoutParams());
//        margin.setMargins(x, margin.topMargin, x + margin.width, margin.bottomMargin);
//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(margin);
//        view.setLayoutParams(layoutParams);

        //这种移位方法没有问题
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(x, 0, 0, 0);
        view.setLayoutParams(layoutParams);
    }

    /**
     * 设置控件所在的位置Y，并且不改变宽高，
     * Y为绝对位置，此时X可能归0
     */
    public static void setLayoutY(View view, int y) {
        MarginLayoutParams margin = new MarginLayoutParams(view.getLayoutParams());
        margin.setMargins(margin.leftMargin, y, margin.rightMargin, y + margin.height);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(margin);
        view.setLayoutParams(layoutParams);
    }

    /**
     * 设置控件所在的位置YY，并且不改变宽高，
     * XY为绝对位置
     */
    public static void setLayout(View view, int x, int y) {
        MarginLayoutParams margin = new MarginLayoutParams(view.getLayoutParams());
        margin.setMargins(x, y, x + margin.width, y + margin.height);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(margin);
        view.setLayoutParams(layoutParams);
    }
}
