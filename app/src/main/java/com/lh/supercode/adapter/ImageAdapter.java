package com.lh.supercode.adapter;

import android.content.Context;

import com.lh.commonclasses.utils.GlideUtil;
import com.lh.supercode.R;
import com.lh.supercode.model.ImageModel;

import cn.bingoogolapple.androidcommon.adapter.BGAAdapterViewAdapter;
import cn.bingoogolapple.androidcommon.adapter.BGAViewHolderHelper;

/**
 * Created on 2017/8/25.
 */
public class ImageAdapter extends BGAAdapterViewAdapter<ImageModel> {

    private String TAG = "ImageAdapter";
    private Context mContext;

    public ImageAdapter(Context context, int itemLayoutId) {
        super(context, itemLayoutId);
        mContext = context;
    }

    @Override
    protected void fillData(BGAViewHolderHelper helper, int position, ImageModel model) {
        helper.getTextView(R.id.tv_num).setText(model.getText() + "");
        GlideUtil.loadImage(mContext, helper.getImageView(R.id.iv_picture), model.getUrl(), R.drawable.ic_tv2);
    }

}
