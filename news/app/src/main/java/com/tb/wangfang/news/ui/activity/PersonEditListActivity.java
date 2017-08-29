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
    public final static int TYPE_EDUCATION = 2;
    public final static int TYPE_GRADUATE_SCHOOL = 3;
    public final static int TYPE_GRADUATE_SCHOOL_DEPARTMENT = 30;
    public final static int TYPE_UNIT_DEPARTMENT = 10;
    public final static int TYPE_SUBJECT = 5;
    public final static int TYPE_SUBJECT_ONE = 6;
    public final static int TYPE_SUBJECT_TWO = 7;
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
        addData(arrayList, type);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent();
                if (type == TYPE_JOB_TITLE || type == TYPE_UNIT_DEPARTMENT || type == TYPE_EDUCATION || type == TYPE_GRADUATE_SCHOOL_DEPARTMENT ||
                        type == TYPE_SUBJECT_TWO) {
                    intent.putExtra("item", (String) adapter.getData().get(position));
                    PersonEditListActivity.this.setResult(RESULT_OK, intent);
                    finish();
                }
//                if (type == TYPE_UNIT || type == TYPE_GRADUATE_SCHOOL || type == TYPE_SUBJECT || type == TYPE_SUBJECT_ONE) {
//                    intent.putExtra("item", (String) adapter.getData().get(position));
////                    PersonEditListActivity.this.setResult(RESULT_OK, intent);
//                    startActivityForResult(intent, type);
//                }
                intent.setClass(PersonEditListActivity.this, PersonEditListActivity.class);
                if (type == TYPE_UNIT) {
                    intent.putExtra("item", (String) adapter.getData().get(position));
                    intent.putExtra("type", TYPE_UNIT_DEPARTMENT);
                    startActivityForResult(intent, TYPE_UNIT);
                }
                if (type == TYPE_GRADUATE_SCHOOL) {
                    intent.putExtra("item", (String) adapter.getData().get(position));
                    intent.putExtra("type", TYPE_GRADUATE_SCHOOL_DEPARTMENT);
                    startActivityForResult(intent, TYPE_GRADUATE_SCHOOL);
                }
                if (type == TYPE_SUBJECT) {
                    intent.putExtra("item", (String) adapter.getData().get(position));
                    intent.putExtra("type", TYPE_SUBJECT_ONE);
                    startActivityForResult(intent, TYPE_SUBJECT);
                }
                if (type == TYPE_SUBJECT_ONE) {
                    intent.putExtra("item", (String) adapter.getData().get(position));
                    intent.putExtra("type", TYPE_SUBJECT_TWO);
                    startActivityForResult(intent, TYPE_SUBJECT_ONE);
                }

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case TYPE_UNIT:
            case TYPE_SUBJECT:
            case TYPE_GRADUATE_SCHOOL:
            case TYPE_SUBJECT_ONE:
                setResult(RESULT_OK, data);
                finish();
                break;

        }
    }

    private void addData(ArrayList<String> arrayList, int type) {
        switch (type) {
            case TYPE_JOB_TITLE:
                tvPageTitle.setText("职称");
                arrayList.add("正高级");
                arrayList.add("副高级");
                arrayList.add("中级");
                arrayList.add("初级");
                arrayList.add("其他");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_JOB_TITLE);
                break;
            case TYPE_SUBJECT:
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
                break;
            case TYPE_UNIT:
                tvPageTitle.setText("当前单位/院校");
                arrayList.add("清华大学");
                arrayList.add("北京大学");
                arrayList.add("人民大学");
                arrayList.add("北京师范大学");
                arrayList.add("北京电影学院");
                arrayList.add("北京理工大学");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_UNIT);
                break;
            case TYPE_UNIT_DEPARTMENT:

                tvPageTitle.setText("所在院系");
                arrayList.add("信息工程学院");
                arrayList.add("政法学院");
                arrayList.add("数学科学学院");
                arrayList.add("生命科学学院");
                arrayList.add("艺术设计学院");
                arrayList.add("计算机学院");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_UNIT_DEPARTMENT);
                break;
            case TYPE_GRADUATE_SCHOOL_DEPARTMENT:
                tvPageTitle.setText("所在院系");
                arrayList.add("信息工程学院");
                arrayList.add("政法学院");
                arrayList.add("数学科学学院");
                arrayList.add("生命科学学院");
                arrayList.add("艺术设计学院");
                arrayList.add("计算机学院");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_UNIT_DEPARTMENT);
                break;
            case TYPE_EDUCATION:
                tvPageTitle.setText("最高学历");
                arrayList.add("博士研究生");
                arrayList.add("硕士研究生");
                arrayList.add("本科");
                arrayList.add("大专");
                arrayList.add("其他");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_EDUCATION);
                break;
            case TYPE_GRADUATE_SCHOOL:
                tvPageTitle.setText("毕业院校");
                arrayList.add("清华大学");
                arrayList.add("北京大学");
                arrayList.add("人民大学");
                arrayList.add("北京师范大学");
                arrayList.add("北京电影学院");
                arrayList.add("北京理工大学");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_GRADUATE_SCHOOL);
                break;
            case TYPE_SUBJECT_ONE:
                tvPageTitle.setText("学科");
                arrayList.add("马克思’恩格斯");
                arrayList.add("列林著作");

                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_SUBJECT_ONE);
                break;
            case TYPE_SUBJECT_TWO:
                tvPageTitle.setText("学科");
                arrayList.add("选集");
                arrayList.add("单行著作");

                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_SUBJECT_TWO);
                break;
        }


    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}
