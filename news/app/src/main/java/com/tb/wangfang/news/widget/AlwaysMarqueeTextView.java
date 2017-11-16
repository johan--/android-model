package com.tb.wangfang.news.widget;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by tangbin on 2017/11/15.
 */

public class AlwaysMarqueeTextView extends android.support.v7.widget.AppCompatTextView {


    public AlwaysMarqueeTextView(Context context) {
        super(context);
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
