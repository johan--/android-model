package com.tb.wangfang.news.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.ui.adapter.JournalPeriodAdapter;

import java.util.ArrayList;

import butterknife.BindView;


public class JournalPeriodFragment extends SimpleFragment {


    @BindView(R.id.rv_period)
    RecyclerView rvPeriod;
    private String TAG = "JournalPeriodFragment";

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_journal_period;
    }

    @Override
    protected void initEventAndData() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            arrayList.add(i + "");
        }
        JournalPeriodAdapter adapter = new JournalPeriodAdapter(getActivity(), arrayList);
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
}
