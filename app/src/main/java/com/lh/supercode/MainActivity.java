package com.lh.supercode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.lh.commonclasses.utils.SuperLog;
import com.lh.supercode.adapter.ImageAdapter;
import com.lh.supercode.model.ImageModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    private ImageView iv_picture;
    private ListView lv_image;
    private ImageAdapter mAdpter;

    //    private String url = "http://192.240.126.154:8000/gateway/files/0f03521c-7c1a-4050-a262-2d64e01b20db";//湖南卫视，不可用
//    private String url = "http://23.237.34.170:8099/imagesrc/7/ff8a741b-35fa-424e-8a42-a9f2e82ccbb1.jpg";//cr图片,可用
//    private String url = "http://192.240.126.154:8000/gateway/files/4f7cf61b-b344-401b-9e15-b17ef3703f40";//湖南卫视可用
//    private String url1 = "http://192.240.126.154:8000/gateway/files/9b99095d-1772-4059-bba2-f634de4c2d05";
//    private String url2 = "http://img.juimg.com/tuku/yulantu/120926/219049-12092612154377.jpg";
//    private String url3 = "http://img.taopic.com/uploads/allimg/140326/235113-1403260U22059.jpg";
//    private String url4 = "http://pic39.nipic.com/20140312/18085061_092729513131_2.jpg";
//    private String url5 = "http://img1.3lian.com/2015/a1/84/d/102.jpg";
//    private String url6 = "http://img.taopic.com/uploads/allimg/110920/2443-1109200TK99.jpg";
//    private String url7 = "http://pic23.photophoto.cn/20120530/0020033092420808_b.jpg";
//    private String url8 = "http://img.taopic.com/uploads/allimg/140326/235113-1403260G01561.jpg";
//    private String url9 = "http://pic9.nipic.com/20100818/5462876_150854046500_2.jpg";
//    private String url10 = "http://imgsrc.baidu.com/image/c0%3Dshijue1%2C0%2C0%2C294%2C40/sign=8694cad471899e516c8332572aceb346/0eb30f2442a7d9337bfbfd5aa74bd11373f00143.jpg";
//    private String url11 = "http://imgsrc.baidu.com/image/c0%3Dshijue1%2C0%2C0%2C294%2C40/sign=30161d0030292df583cea456d4583615/e1fe9925bc315c609050b3c087b1cb13485477dc.jpg";
//    private String url12 = "http://imgsrc.baidu.com/image/c0%3Dshijue1%2C0%2C0%2C294%2C40/sign=ae9cc45edb1373f0e13267dccc66218e/83025aafa40f4bfb8432c271094f78f0f7361830.jpg";
//    private String url13 = "http://img.taopic.com/uploads/allimg/140505/235006-1405050Q44649.jpg";
//    private String url14 = "http://img1.3lian.com/2015/a1/124/d/229.jpg";
//    private String url15 = "http://img1.3lian.com/2015/a1/46/d/198.jpg";


    private String url1 = "http://192.240.126.154:8000/gateway/files/9b99095d-1772-4059-bba2-f634de4c2d05";
    private String url2 = "http://img.51ztzj.com/upload/image/20151213/201512133_321x200.jpg";//机器猫2
    private String url3 = "http://pic51.nipic.com/file/20141025/11284670_091543201000_2.jpg";//樱桃丸子3
    private String url4 = "http://img2.imgtn.bdimg.com/it/u=1768384381,1802849005&fm=214&gp=0.jpg";//艾斯4
    private String url5 = "http://img2.imgtn.bdimg.com/it/u=2635488591,3017605772&fm=214&gp=0.jpg";//路飞5
    private String url6 = "http://e.hiphotos.baidu.com/zhidao/pic/item/94cad1c8a786c91743d61a36cb3d70cf3ac757e3.jpg";//all海贼王6
    private String url7 = "http://tupian.enterdesk.com/2012/0428/78/18.jpg";//索罗7
    private String url8 = "http://tp.lingyu.me/wp-content/uploads/2016/03/20160313084516946.jpg";//白胡子8
    private String url9 = "http://img2.3lian.com/2014/f2/188/d/37.jpg";//罗9
    private String url10 = "http://pic14.nipic.com/20110507/7344400_234735189189_2.jpg";//女帝10
    private String url11 = "http://cdn.duitang.com/uploads/item/201502/12/20150212040507_3ycvS.thumb.700_0.jpeg";//红发11
    private String url12 = "http://cdnq.duitang.com/uploads/item/201503/14/20150314082801_zfSXr.jpeg";//罗宾12
    private String url13 = "http://img3.3lian.com/2013/s3/52/d/32.jpg";//乔巴13
    private String url14 = "http://k.zol-img.com.cn/sjbbs/8580/a8579393_s.jpg";//娜美14
    private String url15 = "http://wenwen.soso.com/p/20100209/20100209222912-197906238.jpg";//山治15

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        iv_picture = (ImageView) findViewById(R.id.iv_picture);
        lv_image = (ListView) findViewById(R.id.lv_image);

        lv_image.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                SuperLog.e(TAG, "onScrollStateChanged");
                switch (scrollState) {
                    case SCROLL_STATE_IDLE:
                        SuperLog.e(TAG, "SCROLL_STATE_IDLE.");
                        //滑动停止
                        Glide.with(MainActivity.this).resumeRequests();
                        break;
                    case SCROLL_STATE_FLING:
                        SuperLog.e(TAG, "SCROLL_STATE_FLING....");
                        //正在滚动
                        Glide.with(MainActivity.this).pauseRequests();
                        break;
                    case AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL:
                        SuperLog.e(TAG, ".....SCROLL_STATE_TOUCH_SCROLL");
                        //正在滚动
                        Glide.with(MainActivity.this).pauseRequests();
                        break;
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//                SuperLog.e(TAG, "onScroll");
            }
        });

        mAdpter = new ImageAdapter(this, R.layout.item_lv_image);
        lv_image.setAdapter(mAdpter);

        List<ImageModel> lists = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            lists.add(new ImageModel(1, url1));
            lists.add(new ImageModel(2, url2));
            lists.add(new ImageModel(3, url3));
            lists.add(new ImageModel(4, url4));
            lists.add(new ImageModel(5, url5));
            lists.add(new ImageModel(6, url6));
            lists.add(new ImageModel(7, url7));
            lists.add(new ImageModel(8, url8));
            lists.add(new ImageModel(9, url9));
            lists.add(new ImageModel(10, url10));
            lists.add(new ImageModel(11, url11));
            lists.add(new ImageModel(12, url12));
            lists.add(new ImageModel(13, url13));
            lists.add(new ImageModel(14, url14));
            lists.add(new ImageModel(15, url15));
        }

        mAdpter.setData(lists);
    }

}
