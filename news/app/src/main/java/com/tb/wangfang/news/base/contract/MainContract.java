package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.tbruyelle.rxpermissions2.RxPermissions;

/**
 * Created by tangbin on 2017/5/8.
 */

public interface MainContract {

    interface View extends BaseView {

        void showUpdateDialog(String versionContent);

        void startDownloadService();
        void restart();
    }

    interface Presenter extends BasePresenter<View> {

        void checkVersion(String currentVersion);

        void checkPermissions(RxPermissions rxPermissions);

        void setNightModeState(boolean b);

        void restorePersonnalMappingTable();
        void  reLogin();
        void jMessageLogin();

    }
}