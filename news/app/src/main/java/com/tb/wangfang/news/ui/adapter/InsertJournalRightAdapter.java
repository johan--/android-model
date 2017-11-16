package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.utils.SystemUtil;
import com.wanfang.subscribe.SubscribePerioListSearchResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/11/15.
 */

public class InsertJournalRightAdapter extends BaseQuickAdapter<SubscribePerioListSearchResponse.PerioListSearchMessage, BaseViewHolder> {
    private Context context;
    private String TAG = "InsertJournalAdapter";

    public InsertJournalRightAdapter(@Nullable List<SubscribePerioListSearchResponse.PerioListSearchMessage> data, Context context) {
        super(R.layout.item_insertjournal_right, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, SubscribePerioListSearchResponse.PerioListSearchMessage item) {
        String url = "http://new.wanfangdata.com.cn/images/PeriodicalImages/" + item.getPerioId() + "/" + item.getPerioId() + ".jpg";
        Log.d(TAG, "convert: " + url);
        Glide.with(context).load(url).into((ImageView) helper.getView(R.id.iv_journal_cover));
        helper.setText(R.id.tv_title, item.getPerioTitle()).setText(R.id.tv_date, item.getEndYear() + "年第" + item.getEndIssue() + "期");
        Button btn_scribe = helper.getView(R.id.btn_subscribe_state);
        if (item.getIsSubscribed()) {
            btn_scribe.setBackgroundResource(R.mipmap.journal_has_subscribe);
            btn_scribe.setWidth(SystemUtil.dp2px(60));
        } else {
            btn_scribe.setBackgroundResource(R.mipmap.journal_to_subscribe);
            btn_scribe.setWidth(SystemUtil.dp2px(50));
        }
        helper.addOnClickListener(R.id.btn_subscribe_state);
    }


}
