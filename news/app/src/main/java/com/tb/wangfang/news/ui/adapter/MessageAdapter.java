package com.tb.wangfang.news.ui.adapter;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.gson.Gson;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.MessageBean;
import com.tb.wangfang.news.utils.DateUtils;
import com.tb.wangfang.news.utils.ToastUtil;

import java.util.Date;
import java.util.List;

import cn.jpush.im.android.api.content.TextContent;
import cn.jpush.im.android.api.model.Message;

/**
 * Created by tangbin on 2017/10/16.
 */

public class MessageAdapter extends BaseQuickAdapter<Message, BaseViewHolder> {
    Activity context;
    String TAG = "MessageAdapter";

    public MessageAdapter(Activity context, @Nullable List<Message> data) {
        super(R.layout.item_message, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Message item) {
        Gson gson = new Gson();
        try {
            final MessageBean bean = gson.fromJson(((TextContent) item.getContent()).getText(), MessageBean.class);
            helper.setText(R.id.tv_title, bean.getTitle()).setText(R.id.tv_time, DateUtils.formatDate(new Date(item.getCreateTime()), "yyyy-MM-dd HH:mm"));
            String content = bean.getBodyVO().getTemplate();
            final List<MessageBean.BodyVOBean.ContentsBean> beanContents = bean.getBodyVO().getContents();
            for (int i = 0; i < beanContents.size(); i++) {
                content = content.replace("{" + i + "}", beanContents.get(i).getName());
            }
            SpannableString ss = new SpannableString(content);
            for (int i = 0; i < beanContents.size(); i++) {
                int start = content.indexOf(beanContents.get(i).getName());
                int end = content.lastIndexOf(beanContents.get(i).getName()) + beanContents.get(i).getName().length();
                final int finalI = i;
                ss.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View widget) {
                        ToastUtil.show(beanContents.get(finalI).getValue());
                    }

                    @Override
                    public void updateDrawState(TextPaint ds) {
                        ds.setColor(context.getResources().getColor(R.color.colorPrimaryDark));
                        ds.setUnderlineText(false);
                        System.out.println("updateDrawState");
                        ds.clearShadowLayer();
                    }
                }, start, end, Spanned.SPAN_MARK_MARK);
            }
            helper.setText(R.id.tv_content, ss);
            ((TextView) helper.getView(R.id.tv_content)).setMovementMethod(LinkMovementMethod.getInstance());

        } catch (Exception e) {
       helper.setText(R.id.tv_title, ((TextContent) item.getContent()).getText());
        }

        Log.d(TAG, "convert: " + ((TextContent) item.getContent()).getText());
    }

}
