package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.model.bean.MainPageData;
import com.tb.wangfang.news.presenter.FirstPresenter;
import com.tb.wangfang.news.ui.activity.MainDetailActivity;
import com.tb.wangfang.news.ui.activity.MianSearchActivity;
import com.tb.wangfang.news.ui.adapter.MainCourseAdapter;
import com.tb.wangfang.news.ui.adapter.MainPageAdapter;
import com.tb.wangfang.news.widget.EvaluatePop;
import com.tb.wangfang.news.widget.VerticalTextview;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;
import com.wanfang.main.AllCource;
import com.wanfang.main.AllLastNews;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

import static com.tb.wangfang.news.app.App.SCREEN_HEIGHT;
import static me.iwf.photopicker.PhotoPicker.REQUEST_CODE;


public class FirstFragment extends BaseFragment<FirstPresenter> implements FirstContract.View, View.OnClickListener {

    private static final String TAG = "FirstFragment";

    @BindView(R.id.ll_top_search)
    LinearLayout llTopSearch;
    @BindView(R.id.recycler_course)
    RecyclerView recyclerCourse;
    TextView tvSpecial;

    TextView tvScience;

    TextView tvMeeting;

    TextView tvJournal;

    ImageView ivNewsType;

    VerticalTextview tvLastNews;

    TextView tvLastNewsMore;
    List<MultiItemEntity> datas = new ArrayList<>();
    int halfScreen = SCREEN_HEIGHT / 2;
    @BindView(R.id.iv_qc_code)
    ImageView ivQcCode;
    Unbinder unbinder;
    private MainCourseAdapter mainCourseAdapter;
    private ArrayList<AllCource.Course> coursetemArrayList = new ArrayList<>();
    private MainPageAdapter mainPageAdapter;
    private Banner banner;


    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override
    protected void initEventAndData() {
        View view = getActivity().getLayoutInflater().inflate(R.layout.item_main_head, (ViewGroup) recyclerCourse.getParent(), false);
        tvSpecial = (TextView) view.findViewById(R.id.tv_special);
        tvScience = (TextView) view.findViewById(R.id.tv_science);
        tvMeeting = (TextView) view.findViewById(R.id.tv_meeting);
        tvJournal = (TextView) view.findViewById(R.id.tv_journal);
        ivNewsType = (ImageView) view.findViewById(R.id.iv_news_type);
        tvLastNews = (VerticalTextview) view.findViewById(R.id.tv_last_news);
        tvLastNewsMore = (TextView) view.findViewById(R.id.tv_last_news_more);
        banner = (Banner) view.findViewById(R.id.banner);
        llTopSearch.setOnClickListener(this);
        tvSpecial.setOnClickListener(this);
        tvScience.setOnClickListener(this);
        tvMeeting.setOnClickListener(this);
        tvJournal.setOnClickListener(this);
        for (int i = 0; i < 30; i++) {
            MainPageData data = new MainPageData();
            data.setImg1("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
            data.setImg2("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
            data.setImg3("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
            data.setItemType(i % 3);
            data.setSource("个玩热风发改委为");
            data.setTitle("心有猛虎，细嗅蔷薇");
            datas.add(data);
        }
        mainPageAdapter = new MainPageAdapter(getActivity(), datas);
        mainPageAdapter.addHeaderView(view);
        recyclerCourse.setAdapter(mainPageAdapter);
        final LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        mainPageAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, final View view, int position) {
                final ImageView iv = (ImageView) view.findViewById(R.id.iv_delete);
                int[] location = new int[2];
                iv.getLocationOnScreen(location);
                int l1 = location[0];
                int l2 = location[1];
                if (l1 == 0 || l2 == 0) {
                    Rect rect = new Rect();
                    iv.getGlobalVisibleRect(rect);
                    l1 = rect.left;
                    l2 = rect.top;
                }
                WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                lp.alpha = 0.7f;
                getActivity().getWindow().setAttributes(lp);
                MainPageData item = (MainPageData) adapter.getData().get(position);
                EvaluatePop pop = null;
                if (item.getItemType() == MainPageAdapter.TYPE_IMAGE_0) {
                    if (l2 > halfScreen) {
                        pop = new EvaluatePop(getActivity(), EvaluatePop.TOP_CENTER);
                    } else {
                        pop = new EvaluatePop(getActivity(), EvaluatePop.BOTTOM_CENTER);
                    }
                } else {
                    if (l2 > halfScreen) {
                        pop = new EvaluatePop(getActivity(), EvaluatePop.TOP_RIGHT);
                    } else {
                        pop = new EvaluatePop(getActivity(), EvaluatePop.BOTTOM_RIGHT);
                    }
                }

                pop.showPopupWindow(iv);
                Log.d(TAG, "onItemChildClick:  iv.getTop() " + l1);
                Log.d(TAG, "onItemChildClick:  iv.getBottom() " + pop.getHeight());
                pop.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                        lp.alpha = 1f;
                        getActivity().getWindow().setAttributes(lp);
                    }
                });

            }
        });


        recyclerCourse.setLayoutManager(manager);
        //初始化扫码
        ivQcCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CaptureActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        mPresenter.getBanner("tb");
        mPresenter.getLastNews();


    }

    @Override
    public void showLastNews(final AllLastNews.LastNewsReply reply) {
        tvLastNews.setTextList(reply.getLastNewsList());
        tvLastNews.setTextStillTime(3000);//设置停留时长间隔
        tvLastNews.setAnimTime(300);//设置进入和退出的时间间隔

        tvLastNews.setOnItemClickListener(new VerticalTextview.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getActivity(), "点击了 : " + reply.getLastNews(position).getLastNewsLink(), Toast.LENGTH_SHORT).show();
            }
        });
        tvLastNews.setOnItemUpdataListener(new VerticalTextview.onItemUpdataListener() {
            @Override
            public void onItemUpdata(int position) {
                ivNewsType.setImageResource(R.mipmap.red_stroke_fruit);
            }
        });
        tvLastNews.startAutoScroll();
    }


    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


    @Override
    public void showSpanner(List<com.wanfang.main.Banner.Baner> baners) {
        banner.setImageLoader(mPresenter.getImageLoader());
        //设置图片集合
        banner.setImages(baners);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();
        tvLastNews.stopAutoScroll();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_top_search:
                Intent intent = new Intent(getActivity(), MianSearchActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.tv_special:
                Intent intent2 = new Intent(getActivity(), MainDetailActivity.class);
                getActivity().startActivity(intent2);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /**
         * 处理二维码扫描结果
         */
        if (requestCode == REQUEST_CODE) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(getActivity(), "解析结果:" + result, Toast.LENGTH_LONG).show();
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(getActivity(), "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

}


