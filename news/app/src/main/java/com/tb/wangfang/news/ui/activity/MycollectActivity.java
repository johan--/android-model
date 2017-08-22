package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.ui.adapter.MyCollectAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class MycollectActivity extends SimpleActivity {

    MyCollectAdapter adapter;
    @BindView(R.id.rv_collect)
    RecyclerView rvCollect;

    @Override
    protected int getLayout() {
        return R.layout.activity_mycollect;
    }

    @Override
    protected void initEventAndData() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arrayList.add("" + i);
        }
        adapter = new MyCollectAdapter(arrayList);
        rvCollect.setLayoutManager(new LinearLayoutManager(this));
        rvCollect.setAdapter(adapter);
    }



    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}
