package com.tb.wangfang.news.widget;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by tangbin on 2017/10/26.
 */

public class InvisibleTextView extends android.support.v7.widget.AppCompatTextView {


    public InvisibleTextView(Context context) {
        super(context);
    }

    public InvisibleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InvisibleTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
        if (text.toString().equals("0")) {
            this.setVisibility(INVISIBLE);
        } else {
            this.setVisibility(VISIBLE);
        }
    }
}
