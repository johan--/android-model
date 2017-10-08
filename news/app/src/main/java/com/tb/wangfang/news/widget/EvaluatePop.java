package com.tb.wangfang.news.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.utils.SystemUtil;

/**
 * Created by tangbin on 2017/8/24.
 */

public class EvaluatePop extends PopupWindow {


    LinearLayout llBg;
    /**
     * Constructor.
     *
     * @param context Context
     */
    private View conentView;
    private Activity context;
    public static final int TOP_CENTER = 0;
    public static final int TOP_RIGHT = 1;
    public static final int BOTTOM_CENTER = 2;
    public static final int BOTTOM_RIGHT = 3;
    int type;
    int[] records = new int[]{0, 0, 0, 0, 0, 0};

    public EvaluatePop(Activity context, int type) {
        super(context);
        this.context = context;
        this.type = type;
        this.initPopupWindow();

    }

    private void initPopupWindow() {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        conentView = inflater.inflate(R.layout.pop_evaluate, null);
        int h = context.getWindowManager().getDefaultDisplay().getHeight();
        int w = context.getWindowManager().getDefaultDisplay().getWidth();
        this.setContentView(conentView);
        // 设置SelectPicPopupWindow弹出窗体的宽
        this.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        // 设置SelectPicPopupWindow弹出窗体的高
        this.setHeight(SystemUtil.dp2px(context, 252));
        //设置SelectPicPopupWindow弹出窗体可点击
        this.setFocusable(true);
        this.setOutsideTouchable(true);
        // 刷新状态
        this.update();
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0000000000);
        // 点back键和其他地方使其消失,设置了这个才能触发OnDismisslistener ，设置其他控件变化等操作
        this.setBackgroundDrawable(dw);
        // mPopupWindow.setAnimationStyle(android.R.style.Animation_Dialog);
        // 设置SelectPicPopupWindow弹出窗体动画效果
//        this.setAnimationStyle(R.style.AnimationPreview);
        RelativeLayout ll_bg = (RelativeLayout) conentView.findViewById(R.id.ll_bg);
        LinearLayout ll_g = (LinearLayout) conentView.findViewById(R.id.ll_grivity);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        if (type == TOP_CENTER) {
            ll_bg.setBackgroundResource(R.mipmap.top_center_main_pop);
            params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            this.setAnimationStyle(R.style.AnimationPreviewTC);
        } else if (type == TOP_RIGHT) {
            ll_bg.setBackgroundResource(R.mipmap.top_right_main_pop);
            params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            this.setAnimationStyle(R.style.AnimationPreviewTR);
        } else if (type == BOTTOM_CENTER) {
            ll_bg.setBackgroundResource(R.mipmap.bottom_center_main_pop);
            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            this.setAnimationStyle(R.style.AnimationPreviewBC);
        } else {
            ll_bg.setBackgroundResource(R.mipmap.bottom_right_main_pop);
            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            this.setAnimationStyle(R.style.AnimationPreviewBR);
        }
        ll_g.setLayoutParams(params);
        ImageView iv_delete = (ImageView) conentView.findViewById(R.id.iv_delete);
        iv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EvaluatePop.this.dismiss();
            }
        });
        TextView tvEvaluate1 = (TextView) conentView.findViewById(R.id.tv_evaluate1);
        TextView tvEvaluate2 = (TextView) conentView.findViewById(R.id.tv_evaluate2);
        TextView tvEvaluate3 = (TextView) conentView.findViewById(R.id.tv_evaluate3);
        TextView tvEvaluate4 = (TextView) conentView.findViewById(R.id.tv_evaluate4);
        TextView tvEvaluate5 = (TextView) conentView.findViewById(R.id.tv_evaluate5);
        TextView tvEvaluate6 = (TextView) conentView.findViewById(R.id.tv_evaluate6);
        TextView tvSubmit = (TextView) conentView.findViewById(R.id.tv_submit);
        setOnclick(tvEvaluate1, 0);
        setOnclick(tvEvaluate2, 1);
        setOnclick(tvEvaluate3, 2);
        setOnclick(tvEvaluate4, 3);
        setOnclick(tvEvaluate5, 4);
        setOnclick(tvEvaluate6, 5);
        tvSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    private void setOnclick(final TextView tvEvaluate1, final int i) {
        tvEvaluate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (records[i] == 0) {
                    tvEvaluate1.setBackgroundResource(R.mipmap.main_pop_select);
                    tvEvaluate1.setTextColor(tvEvaluate1.getResources().getColor(R.color.colorPrimaryDark));
                    records[i] = 1;
                } else {
                    tvEvaluate1.setBackgroundResource(R.mipmap.main_pop_frame);
                    tvEvaluate1.setTextColor(tvEvaluate1.getResources().getColor(R.color.black_text));
                    records[i] = 0;
                }
            }
        });
    }


    public void showPopupWindow(View parent) {
        int[] location = new int[2];
        parent.getLocationOnScreen(location);
        if (!this.isShowing()) {
            if (type == TOP_CENTER || type == TOP_RIGHT) {
                showAtLocation(parent, Gravity.NO_GRAVITY, location[0], location[1] - getHeight());
            } else {
                this.showAsDropDown(parent);
            }
        } else {
            this.dismiss();
        }
    }
}
