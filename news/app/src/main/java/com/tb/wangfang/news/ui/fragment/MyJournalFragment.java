package com.tb.wangfang.news.ui.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleFragment;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyJournalFragment extends SimpleFragment {
    @BindView(R.id.rv_journal)
    RecyclerView rvJournal;

    public MyJournalFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my_journal;
    }

    @Override
    protected void initEventAndData() {
    }


}
