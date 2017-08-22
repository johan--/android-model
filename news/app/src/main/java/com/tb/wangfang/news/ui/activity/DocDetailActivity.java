package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class DocDetailActivity extends SimpleActivity {
    @BindView(R.id.view_stub)
    ViewStub viewStub;
    @BindView(R.id.tv_summary_num)
    TextView tvSummaryNum;
    @BindView(R.id.tv_down_num)
    TextView tvDownNum;
    @BindView(R.id.tv_link_num)
    TextView tvLinkNum;
    @BindView(R.id.tv_reference_num)
    TextView tvReferenceNum;
    @BindView(R.id.ll_num)
    LinearLayout llNum;
    @BindView(R.id.tv_similarity_one)
    TextView tvSimilarityOne;
    @BindView(R.id.tv_similarity_two)
    TextView tvSimilarityTwo;
    @BindView(R.id.tv_similarity_three)
    TextView tvSimilarityThree;
    @BindView(R.id.tv_similarity_four)
    TextView tvSimilarityFour;
    int i = 0;

    @Override
    protected int getLayout() {
        return R.layout.activity_doc_detail;
    }

    @Override
    protected void initEventAndData() {
        initView(i);

    }

    private void initView(int i) {
        viewStub = ((ViewStub) findViewById(R.id.view_stub));
        switch (i) {
            case 0://普通

                viewStub.setLayoutResource(R.layout.frag_article_fruit);
                viewStub.inflate();
//                TextView TvContent = (TextView) findViewById(R.id.tv_content);
//                TvContent.setText(Html.fromHtml("<b>摘要:</b>！China真伟大2001年，互联网尚未在中国老百姓的生活中真正普及时候，28岁的陈天桥却执意要买下一款韩" +
//                        "国的二线网游《传奇》的版权。盛大网络（由陈天桥创立）的投资方中华网惊呆了，认为他在讲一个商业笑话，于是与陈天桥一拍两散，撤回300万美元的风险投资。"));

                break;
            case 1://标准
                viewStub.setLayoutResource(R.layout.frag_article_standard);
                viewStub.inflate();

                break;
            case 2://成果

                break;
            case 3:
                break;
            case 4:
                break;
        }


    }


    @OnClick({R.id.tv_return, R.id.ll_read_online, R.id.ll_collect, R.id.ll_share})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.ll_read_online:
                Intent intent = new Intent(this, PayOrderActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_collect:
                break;
            case R.id.ll_share:
                break;
        }
    }
}
