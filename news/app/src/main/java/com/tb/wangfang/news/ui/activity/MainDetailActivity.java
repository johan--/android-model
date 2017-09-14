package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.ui.adapter.MainPageDetailAdapter;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.grpc.ManagedChannel;

public class MainDetailActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.rv_detail)
    RecyclerView rvDetail;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_main_detail;
    }

    @Override
    protected void initEventAndData() {
        for (int i = 0; i < 10; i++) {
            arrayList.add("你好啊" + i);
        }
        MainPageDetailAdapter adapter = new MainPageDetailAdapter(arrayList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvDetail.setAdapter(adapter);
        rvDetail.setLayoutManager(manager);
    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}
