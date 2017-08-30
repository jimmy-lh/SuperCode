package com.lh.commonclasses.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.lh.commonclasses.R;

/**
 * 用Glide加载图片
 * 1.网络加载图片到ImageView中
 * Glide.with(context).load(imageUrl).into(imageView);
 * <p>
 * 2.当加载网络图片时，由于加载过程中图片未能及时显示，此时可能需要设置等待时的图片，通过placeHolder()方法
 * Glide.with(context).load(imageUrl).placeholder(R.mipmap.ic_launcher).into(imageView);
 * <p>
 * 3.当加载图片失败时，通过error(Drawable drawable)方法设置加载失败后的图片显示：
 * Glide.with(context).load(imageUrl).error(R.mipmap.ic_launcher).into(imageView);
 * <p>
 * 4.图片的缩放，centerCrop()和fitCenter()：
 * (1)使用centerCrop是利用图片图填充ImageView设置的大小，如果ImageView的Height是match_parent则图片就会被拉伸填充
 * Glide.with(context).load(imageUrl).centerCrop().into(imageView);
 * (2)使用fitCenter即缩放图像让图像都测量出来等于或小于 ImageView 的边界范围,该图像将会完全显示，但可能不会填满整个ImageView。
 * Glide.with(context).load(imageUrl).fitCenter().into(imageView);
 * <p>
 * 5.显示gif动画,asGif()判断是否是gif动画
 * Glide.with(context).load(imageUrl).asGif().into(imageView);
 * <p>
 * 6.显示本地视频
 * String filePath = "/storage/emulated/0/Pictures/example_video.mp4";
 * Glide.with( context ).load( Uri.fromFile( new File( filePath ) ) ).into(imageViewGifAsBitmap );
 * <p>
 * 7.缓存策略
 * Glide.with( context ).load(imageUrl).skipMemoryCache(true).into(imageViewInternet );//跳过内存缓存
 * Glide.with( context ).load(imageUrl).diskCacheStrategy(DiskCacheStrategy.NONE).into( imageViewInternet );//跳过硬盘缓存
 * DiskCacheStrategy.NONE 什么都不缓存
 * DiskCacheStrategy.SOURCE 仅仅只缓存原来的全分辨率的图像
 * DiskCacheStrategy.RESULT 仅仅缓存最终的图像，即降低分辨率后的（或者是转换后的）
 * DiskCacheStrategy.ALL 缓存所有版本的图像（默认行为）
 * <p>
 * 8.优先级，设置图片加载的顺序：
 * Glide.with(context).load(imageUrl).priority( Priority.HIGH).into( imageView);
 * <p>
 * 9.Glide.with(context).resumeRequests()和 Glide.with(context).pauseRequests()
 * 当列表在滑动的时候，调用pauseRequests()取消请求，滑动停止时，调用resumeRequests()恢复请求。
 * <p>
 * 10.Glide.clear()
 * 当你想清除掉所有的图片加载请求时，这个方法可以帮助到你。
 */
public class GlideUtil {

    private static String TAG = "GlideUtil";

    /**
     * 通过url获取图片并显示在imageView上
     *
     * @param context
     * @param imageView   显示图片的控件
     * @param url         图片地址
     * @param defaultIcon 默认显示的图片
     */
    public static void loadImage(final Context context, final ImageView imageView, final String url, final int defaultIcon) {
        imageView.setTag(R.id.image_tag, url);
        Glide.with(context)
                .load(url)
                .crossFade()
                .placeholder(defaultIcon)//当加载网络图片时，由于加载过程中图片未能及时显示，此时可能需要设置等待时的图片，通过placeHolder()方法
                .error(defaultIcon)//当加载图片失败时，通过error(Drawable drawable)方法设置加载失败后的图片显示
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        if (url.equals(imageView.getTag(R.id.image_tag))) {
                            LogUtil.d(TAG, "请求图片成功 = " + url);
                            imageView.setImageDrawable(resource);
                        }
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        super.onLoadFailed(e, errorDrawable);
                        if (url.equals(imageView.getTag(R.id.image_tag))) {
                            imageView.setImageDrawable(context.getResources().getDrawable(defaultIcon));
                        }
                    }
                });
    }
}
