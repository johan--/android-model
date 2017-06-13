package com.tb.wangfang.news.ui.fragment;

import android.os.Environment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.model.DataManager;
import com.tb.wangfang.news.model.bean.DownInfo;
import com.tb.wangfang.news.model.bean.DownState;
import com.tb.wangfang.news.model.http.DownLoadListener.HttpDownOnNextListener;
import com.tb.wangfang.news.model.http.HttpDownManager;
import com.tb.wangfang.news.presenter.ThirdPresenter;
import com.tb.wangfang.news.utils.LogUtil;
import com.tb.wangfang.news.utils.ToastUtil;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import butterknife.OnClick;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdFragment extends BaseFragment<ThirdPresenter> implements ThirdContract.View {
    @Inject
    DataManager mDataManager;
    List<DownInfo> listData;
    HttpDownManager manager;

    public static ThirdFragment newInstance() {
        ThirdFragment fragment = new ThirdFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_third;
    }

    @Override
    protected void initEventAndData() {

    }


    @Override
    public void showUpdateDialog(String versionContent) {

    }

    @Override
    public void startDownloadService() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @OnClick(R.id.btn_down)
    public void down() {

        listData = mDataManager.queryDownAll();
        if (listData.isEmpty()) {
            String[] downUrl = new String[]{"https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png"};
            for (int i = 0; i < downUrl.length; i++) {
                File outputFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                        "test" + i + ".apk");
                DownInfo apkApi = new DownInfo(downUrl[i]);
                apkApi.setState(DownState.START);
                apkApi.setSavePath(outputFile.getAbsolutePath());
                mDataManager.save(apkApi);
                apkApi.setListener(new HttpDownOnNextListener() {
                    @Override
                    public void onNext(Object o) {
                        LogUtil.d("来说");
                    }

                    @Override
                    public void onStart() {
                        LogUtil.d("来说");
                    }

                    @Override
                    public void onComplete() {
                        LogUtil.d("来说");
                    }

                    @Override
                    public void updateProgress(long readLength, long countLength) {
                        ToastUtil.shortShow(readLength + "");
                    }
                });

            }
            listData = mDataManager.queryDownAll();
        }
        DownInfo apkApi = mDataManager.queryDownBy("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
        manager = HttpDownManager.getInstance(mDataManager);
        manager.startDown(apkApi,mDataManager);
    }
}
