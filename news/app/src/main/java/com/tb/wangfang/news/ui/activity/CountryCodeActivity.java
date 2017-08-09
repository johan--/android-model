package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.ui.adapter.CountryCodeAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CountryCodeActivity extends SimpleActivity {


    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.rl)
    RecyclerView rl;

    @Override
    protected int getLayout() {
        return R.layout.activity_country_code;
    }

    @Override
    protected void initEventAndData() {
        CountryCodeAdapter adapter = new CountryCodeAdapter(getCountryList());
        rl.setLayoutManager(new LinearLayoutManager(this));
        rl.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String s = (String) adapter.getData().get(position);
                String itemSplite[] = s.split("\\*");

                Intent intent = new Intent();
                intent.putExtra("phone", itemSplite[1]);
                CountryCodeActivity.this.setResult(0, intent);
                CountryCodeActivity.this.finish();
            }
        });
    }

    /**
     * 获取国家列表
     */
    private ArrayList getCountryList() {
        String[] countryList = getResources().getStringArray(R.array.country_code_list_ch);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0, length = countryList.length; i < length; i++) {
            list.add(countryList[i]);
        }
        return list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
