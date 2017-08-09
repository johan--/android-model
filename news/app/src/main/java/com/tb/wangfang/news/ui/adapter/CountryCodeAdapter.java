package com.tb.wangfang.news.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

/**
 * Created by tangbin on 2017/8/7.
 */

public class CountryCodeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public CountryCodeAdapter(List<String> ItemList) {

        super(R.layout.item_country_code, ItemList);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        String itemSplite[] = item.split("\\*");
        helper.setText(R.id.tv_county_name, itemSplite[0]).setText(R.id.tv_county_code, itemSplite[1]);
    }


}

