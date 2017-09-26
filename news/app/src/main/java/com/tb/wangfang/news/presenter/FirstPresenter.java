package com.tb.wangfang.news.presenter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.utils.LogUtil;
import com.wanfang.main.AllLastNews;
import com.wanfang.main.Banner;
import com.wanfang.main.HomePageServiceGrpc;
import com.youth.banner.loader.ImageLoader;

import javax.inject.Inject;

import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tangbin on 2017/5/9.
 */

public class FirstPresenter extends RxPresenter<FirstContract.View> implements FirstContract.Presenter {
    private final ManagedChannel managedChannel;

    private String TAG = "FirstPresenter";

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
    public void getBanner(String userId) {

        Single.create(new SingleOnSubscribe<com.wanfang.main.Banner.AllBannerReply>() {
            @Override
            public void subscribe(SingleEmitter<com.wanfang.main.Banner.AllBannerReply> e) throws Exception {
                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
                Banner.AllBannerRequest request = Banner.AllBannerRequest.newBuilder().setUserId("tb").build();
                Banner.AllBannerReply reply = stub.getAllBanner(request);
                e.onSuccess(reply);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<com.wanfang.main.Banner.AllBannerReply>() {
            @Override
            public void onSuccess(com.wanfang.main.Banner.AllBannerReply allBannerReply) {

                mView.showSpanner(allBannerReply.getBanerList());
                Log.d(TAG, "onSuccess: " + allBannerReply.getBaner(0).getBannerPic());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    @Override
    public void getLastNews() {
        Single.create(new SingleOnSubscribe<AllLastNews.LastNewsReply>() {
            @Override
            public void subscribe(SingleEmitter<AllLastNews.LastNewsReply> e) throws Exception {
                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
                AllLastNews.LastNewsRequest request = AllLastNews.LastNewsRequest.newBuilder().build();
                AllLastNews.LastNewsReply reply = stub.getAllLastNews(request);
                e.onSuccess(reply);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<AllLastNews.LastNewsReply>() {
            @Override
            public void onSuccess(AllLastNews.LastNewsReply Reply) {
                mView.showLastNews(Reply);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

//    @Override
//    public void getProject() {
//     Single.create(new SingleOnSubscribe<AllProject.ProjectReply>() {
//            @Override
//            public void subscribe(SingleEmitter<AllProject.ProjectReply> e) throws Exception {
//                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
//                AllProject.ProjectRequest request = AllProject.ProjectRequest.newBuilder().build();
//                AllProject.ProjectReply reply = stub.getAllProject(request);
//                e.onSuccess(reply);
//
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<AllProject.ProjectReply>() {
//            @Override
//            public void onSuccess(AllProject.ProjectReply Reply) {
//                mView.showProjects(Reply);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d(TAG, "onError: " + e.getMessage());
//            }
//        });
//    }

//    @Override
//    public void getMeeting() {
//       Single.create(new SingleOnSubscribe<MeetingMessage.MeetingReply>() {
//            @Override
//            public void subscribe(SingleEmitter<MeetingMessage.MeetingReply> e) throws Exception {
//                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
//                MeetingMessage.MeetingRequest request = MeetingMessage.MeetingRequest.newBuilder().build();
//                MeetingMessage.MeetingReply reply = stub.getAllMeetingMessage(request);
//                e.onSuccess(reply);
//
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MeetingMessage.MeetingReply>() {
//            @Override
//            public void onSuccess(MeetingMessage.MeetingReply Reply) {
//                mView.showMeeting(Reply);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d(TAG, "onError: " + e.getMessage());
//            }
//        });
//    }

//    @Override
//    public void getScience() {
//       Single.create(new SingleOnSubscribe<AllScience.AllScienceReply>() {
//            @Override
//            public void subscribe(SingleEmitter<AllScience.AllScienceReply> e) throws Exception {
//                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
//                AllScience.AllScienceRequest request = AllScience.AllScienceRequest.newBuilder().build();
//                AllScience.AllScienceReply reply = stub.getAllScience(request);
//                e.onSuccess(reply);
//
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<AllScience.AllScienceReply>() {
//            @Override
//            public void onSuccess(AllScience.AllScienceReply Reply) {
//                mView.showScience(Reply);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d(TAG, "onError: " + e.getMessage());
//            }
//        });
//    }

//    @Override
//    public void getGuessLike() {
//      Single.create(new SingleOnSubscribe<GuessLikeOuterClass.GuessLikeReply>() {
//            @Override
//            public void subscribe(SingleEmitter<GuessLikeOuterClass.GuessLikeReply> e) throws Exception {
//                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
//                GuessLikeOuterClass.GuessLikeRequest request = GuessLikeOuterClass.GuessLikeRequest.newBuilder().build();
//                GuessLikeOuterClass.GuessLikeReply reply = stub.getAllGuessLike(request);
//                e.onSuccess(reply);
//
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<GuessLikeOuterClass.GuessLikeReply>() {
//            @Override
//            public void onSuccess(GuessLikeOuterClass.GuessLikeReply Reply) {
//                mView.showGuessLike(Reply);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d(TAG, "onError: " + e.getMessage());
//            }
//        });
//    }

//    @Override
//    public void getCourese(String userId) {
//     Single.create(new SingleOnSubscribe<AllCource.AlCourseReply>() {
//            @Override
//            public void subscribe(SingleEmitter<AllCource.AlCourseReply> e) throws Exception {
//                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
//                AllCource.AlCourseRequest request = AllCource.AlCourseRequest.newBuilder().build();
//                AllCource.AlCourseReply reply = stub.getAlCourse(request);
//                e.onSuccess(reply);
//
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<AllCource.AlCourseReply>() {
//            @Override
//            public void onSuccess(AllCource.AlCourseReply Reply) {
//                mView.showCourse(Reply);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d(TAG, "onError: " + e.getMessage());
//            }
//        });
//    }

    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, final Object path, ImageView imageView) {
            /**
             注意：
             1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
             2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
             传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
             切记不要胡乱强转！
             */
            //Glide 加载图片简单用法
            Glide.with(context).load(((Banner.Baner) path).getBannerPic()).into(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LogUtil.d(((Banner.Baner) path).getBannerLink());
                }
            });
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
