package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FilterDocContract;
import com.tb.wangfang.news.model.DataManager;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.model.http.response.WXHttpResponse;
import com.tb.wangfang.news.utils.RxUtil;
import com.tb.wangfang.news.widget.CommonSubscriber;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by tangbin on 2017/5/25.
 */

public class FilterDocPresenter extends RxPresenter<FilterDocContract.View> implements FilterDocContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public FilterDocPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;

    }

    @Override
    public void search(final String text, final int page) {


        Flowable<WXHttpResponse<List<SearchDocItem>>> observable;
        observable = mDataManager.fetchWechatSearchListInfo(20, page, text);
        addSubscribe(observable
                .compose(RxUtil.<WXHttpResponse<List<SearchDocItem>>>rxSchedulerHelper())
                .compose(RxUtil.<List<SearchDocItem>>handleWXResult())
                .subscribeWith(new CommonSubscriber<List<SearchDocItem>>(mView) {
                    @Override
                    public void onNext(List<SearchDocItem> wxItemBeen) {
                        if (page == 1) {
                            mView.refreshView(wxItemBeen);
                            mView.loadFilterView(wxItemBeen);
                        } else {
                            mView.loadMoreView(wxItemBeen);
                        }
                    }
                })
        );

    }
}
