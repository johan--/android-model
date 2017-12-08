package com.tb.wangfang.news.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangbin on 2017/12/7.
 */

public class RemainChargeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    List<String> data;

    public int getSelectPoint() {
        return selectPoint;
    }

    public void setSelectPoint(int selectPoint) {
        this.selectPoint = selectPoint;
    }

    int selectPoint = -1;
    int[] str = new int[]{10, 20, 30, 50, 100, 200, 300, 500, 1000};

    public RemainChargeAdapter() {
        super(R.layout.item_charge_num);
        mData = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            mData.add(str[i] + "");
        }

    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_num, "￥" + item);
        if (helper.getAdapterPosition() == selectPoint) {
            helper.getView(R.id.tv_num).setBackgroundResource(R.drawable.search_selected_bg);
        } else {
            helper.getView(R.id.tv_num).setBackgroundResource(R.drawable.white_corners_solide);
        }

    }
}
