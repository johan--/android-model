package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MyWalletActivity extends SimpleActivity {


    @BindView(R.id.tv_remain_sum)
    TextView tvRemainSum;
    @BindView(R.id.tv_wanfang_card_sum)
    TextView tvWanfangCardSum;
    @BindView(R.id.rv_item)
    RecyclerView rvItem;

    @Override
    protected int getLayout() {
        return R.layout.activity_my_wallet;
    }

    @Override
    protected void initEventAndData() {

    }


    @OnClick({R.id.tv_return, R.id.btn_bind, R.id.btn_recharge})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
                break;
            case R.id.btn_bind:
                break;
            case R.id.btn_recharge:
                break;
        }
    }
}
