package com.tb.wangfang.news.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.model.bean.JournalYearBean;
import com.tb.wangfang.news.ui.adapter.JournalPeriodAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;

import butterknife.BindView;

import static com.tb.wangfang.news.app.Constants.SEARCH_LIST_CONTENT;


public class JournalPeriodFragment extends SimpleFragment {


    @BindView(R.id.rv_period)
    RecyclerView rvPeriod;
    private String TAG = "JournalPeriodFragment";

    public String getJournalId() {
        return journalId;
    }

    public void setJournalId(String journalId) {
        this.journalId = journalId;
    }

    private String journalId;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private String year;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_journal_period;
    }

    @Override
    protected void initEventAndData() {
        getColumList();

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            arrayList.add(i + "");
        }
        JournalPeriodAdapter adapter = new JournalPeriodAdapter(getActivity(), null);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvPeriod.setLayoutManager(linearLayoutManager);
        rvPeriod.setAdapter(adapter);
        rvPeriod.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int position = linearLayoutManager.findLastVisibleItemPosition();
                Log.d(TAG, "onScrolled: position=" + position);
            }
        });

    }

    private void getColumList() {
        OkHttpUtils.get().url(SEARCH_LIST_CONTENT).addParams("params", "期刊:" + journalId + "*年份:" + year).addParams("page", "1").addParams("pageSize", "100").build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                        ToastUtil.show("服务器异常");

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.d(TAG, "onResponse: " + response);
                        Gson gson = new Gson();
                        JournalYearBean bean = new JournalYearBean();


                    }


                });
    }
}
