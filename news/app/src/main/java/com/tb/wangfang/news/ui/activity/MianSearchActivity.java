package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.db.RealmHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.FlowLayout;
import com.tb.wangfang.news.widget.SearchEditText;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MianSearchActivity extends SimpleActivity {

    private RealmHelper realmHelper = new RealmHelper(App.getInstance());
    @BindView(R.id.et_search)
    SearchEditText etSearch;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.flow_layout)
    FlowLayout flowLayout;


    @Override
    protected int getLayout() {
        return R.layout.activity_mian_search;
    }

    @Override
    protected void initEventAndData() {

        etSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    if (!TextUtils.isEmpty(etSearch.getText().toString()) && !TextUtils.isEmpty(etSearch.getText().toString().trim())) {
                        HistoryDocItem docItem = new HistoryDocItem();
                        docItem.setText(etSearch.getText().toString());
                        docItem.setTime(System.currentTimeMillis() / 1000);
                        realmHelper.save(docItem);
                        Intent intent = new Intent(MianSearchActivity.this, FilterDocActivity.class);
                        intent.putExtra("text", etSearch.getText().toString().trim());
                        startActivity(intent);
                    } else {
                        ToastUtil.shortShow("请输入搜索关键字");
                    }
                }
                return false;
            }
        });

        List<HistoryDocItem> historyDocItems = realmHelper.findAllHistoryItem();
        for (int i = 0; i < historyDocItems.size(); i++) {
            if (historyDocItems.size() < 13) {
                TextView textView = new TextView(this);
                textView.setTextSize(16);
                textView.setGravity(Gravity.CENTER);
                textView.setText(historyDocItems.get(i).getText());
                ViewGroup.LayoutParams vglp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(vglp);
                params.setMargins(10, 10, 10, 10);
                textView.setBackgroundResource(R.color.colorPrimary);
                textView.setLayoutParams(params);
                flowLayout.addView(textView);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.et_search, R.id.tv_cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.et_search:
                break;
            case R.id.tv_cancel:
                finish();
                break;
        }
    }

}
