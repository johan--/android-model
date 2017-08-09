package com.tb.wangfang.news.widget;

import android.content.Context;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;

/**
 * Created by tangbin on 2017/8/1.
 */

public class searched extends android.support.v7.widget.AppCompatEditText {


    public searched(Context context) {
        super(context);
        setImeOptions(EditorInfo.IME_ACTION_SEARCH);
        setMaxLines(1);
        setInputType(InputType.TYPE_CLASS_TEXT);
    }

    public searched(Context context, AttributeSet attrs) {
        super(context, attrs);
        setImeOptions(EditorInfo.IME_ACTION_SEARCH);
        setLines(1);
        setMaxLines(1);
        setInputType(InputType.TYPE_CLASS_TEXT);

    }

    public searched(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setImeOptions(EditorInfo.IME_ACTION_SEARCH);
        setSingleLine();
        setLines(1);
        setMaxLines(1);
        setInputType(InputType.TYPE_CLASS_TEXT);
    }

    @Override
    public int getImeOptions() {
        return super.getImeOptions();
    }


}
