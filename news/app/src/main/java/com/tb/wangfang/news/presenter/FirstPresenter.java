package com.tb.wangfang.news.presenter;

import android.util.Log;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.wanfang.main.AllLastNews;
import com.wanfang.main.Content;
import com.wanfang.main.ContentServiceGrpc;
import com.wanfang.main.HomePageServiceGrpc;
import com.wanfang.main.SerMainContent;

import javax.inject.Inject;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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
    private final ManagedChannel managedChannel2;

    private String TAG = "FirstPresenter";


    @Inject
    public FirstPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
        this.managedChannel2 = ManagedChannelBuilder.forAddress("10.20.13.179", 8081)
                .usePlaintext(true)
                .build();

    }


    @Override
    public void getBanner(String userId) {

        Single.create(new SingleOnSubscribe<SerMainContent.ContentResponse>() {
            @Override
            public void subscribe(SingleEmitter<SerMainContent.ContentResponse> e) throws Exception {
                ContentServiceGrpc.ContentServiceBlockingStub stub = ContentServiceGrpc.newBlockingStub(managedChannel2);
                Content.ContentRequest request = Content.ContentRequest.newBuilder().setPage(1).setPageSize(20).build();
//                Content.ContentRequest request = Content.ContentRequest.newBuilder().setPage(1).setPageSize(20).setTag(0, Constants.TYPE_BANNER_4 + "").build();
                SerMainContent.ContentResponse reply = stub.searchContent(request);
                e.onSuccess(reply);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SerMainContent.ContentResponse>() {
            @Override
            public void onSuccess(SerMainContent.ContentResponse Reply) {
                Log.d(TAG, "onSuccess: " + Reply.toString());

                mView.showSpanner(Reply.getContentsList());
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

    @Override
    public void getMianPage(final int page) {
        Single.create(new SingleOnSubscribe<SerMainContent.ContentResponse>() {
            @Override
            public void subscribe(SingleEmitter<SerMainContent.ContentResponse> e) throws Exception {
                ContentServiceGrpc.ContentServiceBlockingStub stub = ContentServiceGrpc.newBlockingStub(managedChannel2);
                Content.ContentRequest request = Content.ContentRequest.newBuilder().setPage(page).setPageSize(20).build();
                SerMainContent.ContentResponse reply = stub.searchContent(request);
                e.onSuccess(reply);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SerMainContent.ContentResponse>() {
            @Override
            public void onSuccess(SerMainContent.ContentResponse Reply) {
                Log.d(TAG, "onSuccess: " + Reply.toString());
                mView.showMainPage(Reply);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


}
