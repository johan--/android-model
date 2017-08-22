package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.tb.wangfang.news.model.bean.HistoryDocItem;

import java.util.List;

/**
 * Created by tangbin on 2017/5/9.
 */

public interface SecondContract {
    interface View extends BaseView {
        void initView();


        void showHistoryItem(List<HistoryDocItem> historyDocItems);

        void showHotSearchWord(List<String> hotSearchWord);

    }

    interface Presenter extends BasePresenter<View> {


        void searchAllHistory();

        void deleteAllHistry();

        void stotyHistory(HistoryDocItem item);

        void deleteHistory(HistoryDocItem item);

        void getHotDoc();

    }
}
