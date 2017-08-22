package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.ui.adapter.BrowseAdapter;

import java.util.ArrayList;

import butterknife.BindView;

public class ImageBrowseActivity extends SimpleActivity {


    @BindView(R.id.rv_browse)
    RecyclerView rvBrowse;

    @Override
    protected int getLayout() {
        return R.layout.activity_image_browse;
    }

    @Override
    protected void initEventAndData() {
        ArrayList<String> paths = getIntent().getExtras().getStringArrayList("paths");
        BrowseAdapter adapter=new BrowseAdapter(this,paths);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

    }

}
