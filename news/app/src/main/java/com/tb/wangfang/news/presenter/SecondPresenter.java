package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.model.db.RealmHelper;
import com.wanfang.main.HomePageServiceGrpc;
import com.wanfang.main.HotSearchWord;

import java.util.ArrayList;

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

public class SecondPresenter extends RxPresenter<SecondContract.View> implements SecondContract.Presenter {
    private final RealmHelper realmHelper;
    private ManagedChannel managedChannel;
    private ArrayList<SearchDocItem> searchDocItemArrayList = new ArrayList<>();

    @Inject
    public SecondPresenter(ManagedChannel managedChannel, RealmHelper realmHelper) {
        this.managedChannel = managedChannel;
        this.realmHelper = realmHelper;
    }


    @Override
    public void searchAllHistory() {

        mView.showHistoryItem(realmHelper.findAllHistoryItem());
    }

    @Override
    public void deleteAllHistry() {
        realmHelper.deleteHistoryAll();
        mView.showHistoryItem(new ArrayList<HistoryDocItem>());
    }

    @Override
    public void stotyHistory(HistoryDocItem item) {

        realmHelper.save(item);
    }

    @Override
    public void deleteHistory(HistoryDocItem item) {
        realmHelper.deleteHis(item);
    }

    @Override
    public void getHotDoc() {

        Single.create(new SingleOnSubscribe<HotSearchWord.HotSearchWordReply>() {
            @Override
            public void subscribe(SingleEmitter<HotSearchWord.HotSearchWordReply> e) throws Exception {
                HomePageServiceGrpc.HomePageServiceBlockingStub stub = HomePageServiceGrpc.newBlockingStub(managedChannel);
                HotSearchWord.HotSearchWordRequest request = HotSearchWord.HotSearchWordRequest.newBuilder().setUserId("tb").build();
                HotSearchWord.HotSearchWordReply reply = stub.getHotSearchWord(request);
                e.onSuccess(reply);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<HotSearchWord.HotSearchWordReply>() {
            @Override
            public void onSuccess(HotSearchWord.HotSearchWordReply hotSearchWordReply) {
                mView.showHotSearchWord(hotSearchWordReply.getHotWordList());
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }
}



