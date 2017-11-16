package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.subscribe.AddSubscribePerioTreeListResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/10/27.
 */

public class JournalMenuAdapter extends BaseQuickAdapter<AddSubscribePerioTreeListResponse.AddSubscribeTreeItemMessage, BaseViewHolder> {
    public int getSeletedPosition() {
        return seletedPosition;
    }

    public void setSeletedPosition(int seletedPosition) {
        this.seletedPosition = seletedPosition;
    }

    private int seletedPosition = -1;

    public JournalMenuAdapter(@Nullable List<AddSubscribePerioTreeListResponse.AddSubscribeTreeItemMessage> data) {
        super(R.layout.item_journal_menu, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AddSubscribePerioTreeListResponse.AddSubscribeTreeItemMessage item) {
        TextView textView = helper.getView(R.id.tv_name);
        if (helper.getAdapterPosition() == seletedPosition) {
            textView.setTextColor(textView.getResources().getColor(R.color.white));
            textView.setBackgroundResource(R.color.colorPrimaryDark);
        } else {
            textView.setTextColor(textView.getResources().getColor(R.color.black_text));
            textView.setBackgroundResource(R.color.white);
        }
        textView.setText(item.getName());
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSingleLine(true);
        textView.setSelected(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
    }
}
