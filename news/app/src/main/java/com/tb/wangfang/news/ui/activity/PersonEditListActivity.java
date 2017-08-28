package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.ui.adapter.SelectPersonInfoAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.SearchEditText;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class PersonEditListActivity extends SimpleActivity {

    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.et_search)
    SearchEditText etSearch;
    @BindView(R.id.rv)
    RecyclerView rv;
    public final static int TYPE_JOB_TITLE = 0;
    public final static int TYPE_UNIT = 1;
    public final static int TYPE_SUBJECT = 5;
    int type = 0;
    private SelectPersonInfoAdapter adapter;


    @Override
    protected int getLayout() {
        return R.layout.activity_person_edit_list;
    }

    @Override
    protected void initEventAndData() {
        etSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    if (!TextUtils.isEmpty(etSearch.getText().toString()) && !TextUtils.isEmpty(etSearch.getText().toString().trim())) {

                    } else {
                        ToastUtil.shortShow("请输入搜索关键字");
                    }
                }
                return false;
            }
        });
        type = getIntent().getIntExtra("type", 0);
        ArrayList<String> arrayList = new ArrayList<>();
        if (type == TYPE_JOB_TITLE) {
            tvPageTitle.setText("职称");
            arrayList.add("正高级");
            arrayList.add("副高级");
            arrayList.add("中级");
            arrayList.add("初级");
            arrayList.add("其他");
            adapter = new SelectPersonInfoAdapter(arrayList, TYPE_JOB_TITLE);
        } else if (type == TYPE_SUBJECT) {
            tvPageTitle.setText("学科");
            arrayList.add("哲学");
            arrayList.add("经济学");
            arrayList.add("法学");
            arrayList.add("文学");
            arrayList.add("心理学");
            arrayList.add("工学");
            arrayList.add("管理学");
            arrayList.add("医学");
            arrayList.add("艺术学");
            arrayList.add("生物学");
            arrayList.add("其他专业");
            adapter = new SelectPersonInfoAdapter(arrayList, TYPE_SUBJECT);
        } else if (type == TYPE_UNIT) {
            tvPageTitle.setText("所在院系");
            arrayList.add("信息工程学院");
            arrayList.add("政法学院");
            arrayList.add("数学科学学院");
            arrayList.add("生命科学学院");
            arrayList.add("艺术设计学院");
            arrayList.add("计算机学院");
            adapter = new SelectPersonInfoAdapter(arrayList, TYPE_UNIT);
        }


        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent();
                if (type == TYPE_JOB_TITLE) {
                    intent.putExtra("item", (String) adapter.getData().get(position));
                    PersonEditListActivity.this.setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });

    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}
