package com.tb.wangfang.news.ui.activity;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import java.util.ArrayList;

import butterknife.BindView;
import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class ImageBrowseActivity extends SimpleActivity {


    @BindView(R.id.viewpager1)
    ViewPager viewpager1;
    @BindView(R.id.tipsBox)
    LinearLayout tipsBox;
    /**
     * 装点点的ImageView数组
     */
    private ImageView[] tips;

    private ArrayList<String> paths;
    private PhotoView[] photoViews;


    @Override
    protected int getLayout() {
        return R.layout.activity_image_browse;
    }

    @Override
    protected void initEventAndData() {
        paths = getIntent().getExtras().getStringArrayList("paths");
        int position = getIntent().getExtras().getInt("position");
        tips = new ImageView[paths.size()];
        photoViews = new PhotoView[paths.size()];
        for (int i = 0; i < tips.length; i++) {
            ImageView img = new ImageView(this);
            img.setLayoutParams(new ViewGroup.LayoutParams(10, 10));

            tips[i] = img;

            if (i == position) {
                img.setBackgroundResource(R.drawable.gray_radius);//蓝色背景

            } else {
                img.setBackgroundResource(R.drawable.white_radius);//黑色背景
            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            params.leftMargin = 5;
            params.rightMargin = 5;
            tipsBox.addView(img, params); //把点点添加到容器中
            PhotoView photoView = new PhotoView(this);
            photoView.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() {
                @Override
                public void onPhotoTap(View view, float x, float y) {
                    onBackPressed();
                }
            });
            Glide.with(this).load(paths.get(i)).into(photoView);
            photoViews[i] = photoView;

        }
        viewpager1.setAdapter(new BrowsePageAdapter());
        viewpager1.setCurrentItem(position);
    }

    public class BrowsePageAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return tips.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            // container.removeViewAt(position);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(photoViews[position]);
            return photoViews[position];
        }
    }
}
