package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FilterDocContract;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/25.
 */

public class FilterDocPresenter extends RxPresenter<FilterDocContract.View> implements FilterDocContract.Presenter {
    private ManagedChannel managedChannel;

    @Inject
    public FilterDocPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;

    }

    @Override
    public void search(final String text, final int page) {


//        Flowable<WXHttpResponse<List<SearchDocItem>>> observable;
//        observable = mDataManager.fetchWechatSearchListInfo(20, page, text);
//        addSubscribe(observable
//                .compose(RxUtil.<WXHttpResponse<List<SearchDocItem>>>rxSchedulerHelper())
//                .compose(RxUtil.<List<SearchDocItem>>handleWXResult())
//                .subscribeWith(new CommonSubscriber<List<SearchDocItem>>(mView) {
//                    @Override
//                    public void onNext(List<SearchDocItem> wxItemBeen) {
//                        if (page == 1) {
//                            mView.refreshView(wxItemBeen);
//                            mView.loadFilterView(wxItemBeen);
//                        } else {
//                            mView.loadMoreView(wxItemBeen);
//                        }
//                    }
//                })
//        );

    }
}
