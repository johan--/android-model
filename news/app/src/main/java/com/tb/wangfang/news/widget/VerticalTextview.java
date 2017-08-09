package com.tb.wangfang.news.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.wanfang.main.AllLastNews;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangbin on 2017/7/21.
 */

public class VerticalTextview extends TextSwitcher implements ViewSwitcher.ViewFactory {
    private static final int FLAG_START_AUTO_SCROLL = 0;
    private static final int FLAG_STOP_AUTO_SCROLL = 1;
    private float mTextSize;
    private int mPadding;
    private int textColor;
    private VerticalTextview.OnItemClickListener itemClickListener;
    private onItemUpdataListener onItemUpdataListener;
    private Context mContext;
    private int currentId;
    private ArrayList<String> textList;
    private Handler handler;

    public void setText(float textSize, int padding, int textColor) {
        this.mTextSize = textSize;
        this.mPadding = padding;
        this.textColor = textColor;
    }

    public VerticalTextview(Context context) {
        this(context, (AttributeSet) null);
        this.mContext = context;
    }

    public VerticalTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mTextSize = 16.0F;
        this.mPadding = 5;
        this.textColor = -16777216;
        this.currentId = -1;
        this.mContext = context;
        this.textList = new ArrayList();
    }

    public void setAnimTime(long animDuration) {
        this.setFactory(this);
        TranslateAnimation in = new TranslateAnimation(0.0F, 0.0F, (float) animDuration, 0.0F);
        in.setDuration(animDuration);
        in.setInterpolator(new AccelerateInterpolator());
        TranslateAnimation out = new TranslateAnimation(0.0F, 0.0F, 0.0F, (float) (-animDuration));
        out.setDuration(animDuration);
        out.setInterpolator(new AccelerateInterpolator());
        this.setInAnimation(in);
        this.setOutAnimation(out);
    }

    public void setTextStillTime(final long time) {
        this.handler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
                        if (VerticalTextview.this.textList.size() > 0) {
                            VerticalTextview.this.currentId++;
                            VerticalTextview.this.setText((CharSequence) VerticalTextview.this.textList.get(VerticalTextview.this.currentId % VerticalTextview.this.textList.size()));
                            onItemUpdataListener.onItemUpdata(currentId);
                        }

                        VerticalTextview.this.handler.sendEmptyMessageDelayed(0, time);
                        break;
                    case 1:
                        VerticalTextview.this.handler.removeMessages(0);
                }

            }
        };
    }

    public void setTextList(List<AllLastNews.LastNews> titles) {
        this.textList.clear();
        for (int i = 0; i < titles.size(); i++) {
            this.textList.add(titles.get(i).getLastNewsTitle());
        }


        this.currentId = -1;
    }

    public void startAutoScroll() {
        this.handler.sendEmptyMessage(0);
    }

    public void stopAutoScroll() {
        if (handler!=null){
            this.handler.sendEmptyMessage(1);
        }

    }

    public View makeView() {
        TextView t = new TextView(this.mContext);
        t.setGravity(19);
        t.setMaxLines(1);
        t.setPadding(this.mPadding, this.mPadding, this.mPadding, this.mPadding);
        t.setTextColor(this.textColor);
        t.setTextSize(this.mTextSize);
        t.setClickable(true);
        t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (VerticalTextview.this.itemClickListener != null && VerticalTextview.this.textList.size() > 0 && VerticalTextview.this.currentId != -1) {
                    VerticalTextview.this.itemClickListener.onItemClick(VerticalTextview.this.currentId % VerticalTextview.this.textList.size());
                }

            }
        });
        return t;
    }

    public void setOnItemClickListener(VerticalTextview.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setOnItemUpdataListener(onItemUpdataListener itemUpdataListener) {
        this.onItemUpdataListener = itemUpdataListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int var1);
    }

    public interface onItemUpdataListener {
        void onItemUpdata(int position);
    }
}