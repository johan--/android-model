package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FilterDocContract;
import com.tb.wangfang.news.model.bean.Level0;
import com.tb.wangfang.news.model.bean.Level1;

import java.util.ArrayList;
import java.util.List;

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
        List<Level0> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Level0 level0 = new Level0();
            level0.setText("服务交付给IE我" + i);
            for (int j = 0; j < 10; j++) {
                Level1 level1 = new Level1();
                level0.addSubItem(level1);
            }
            list.add(level0);
        }
        mView.loadFilterView(list);

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
