package com.tb.wangfang.news.presenter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/9.
 */

public class FirstPresenter extends RxPresenter<FirstContract.View> implements FirstContract.Presenter {
    private final ManagedChannel managedChannel;

    public GlideImageLoader getImageLoader() {
        return imageLoader;
    }

    private GlideImageLoader imageLoader;

    @Inject
    public FirstPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
        this.imageLoader = new GlideImageLoader();
    }


    @Override
    public void getDailyData() {
        List<String> imgUrls = new ArrayList<>();
        imgUrls.add("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
        imgUrls.add("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
        imgUrls.add("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
        mView.showSpanner(imgUrls);
    }

    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            /**
             注意：
             1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
             2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
             传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
             切记不要胡乱强转！
             */
            //Glide 加载图片简单用法
            Glide.with(context).load(path).into(imageView);

        }

//        //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
//        @Override
//        public ImageView createImageView(Context context) {
//            //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
//            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
//            return simpleDraweeView;
//        }
    }

}
