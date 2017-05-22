package com.tb.wangfang.news.ui.fragment;

import android.os.Environment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.model.bean.DownInfo;
import com.tb.wangfang.news.presenter.ThirdPresenter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdFragment extends BaseFragment<ThirdPresenter> implements ThirdContract.View {
    List<DownInfo> listData;
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
        listData=new ArrayList<>();
        String[] downUrl=new String[]{"http://www.izaodao.com/app/izaodao_app.apk",
                "http://download.fir.im/v2/app/install/572eec6fe75e2d7a05000008?download_token=572bcb03dad2eed7c758670fd23b5ac4"};
        for (int i = 0; i < downUrl.length; i++) {
            File outputFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                    "test"+i + ".apk");
            DownInfo apkApi=new DownInfo(downUrl[i]);
            apkApi.setSavePath(outputFile.getAbsolutePath());
            listData.add(apkApi);
        }
    }
}
