package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.presenter.FirstPresenter;
import com.tb.wangfang.news.ui.activity.MianSearchActivity;
import com.tb.wangfang.news.ui.adapter.MainCourseAdapter;
import com.tb.wangfang.news.widget.VerticalTextview;
import com.wanfang.main.AllCource;
import com.wanfang.main.AllLastNews;
import com.wanfang.main.AllProject;
import com.wanfang.main.AllScience;
import com.wanfang.main.GuessLikeOuterClass;
import com.wanfang.main.MeetingMessage;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class FirstFragment extends BaseFragment<FirstPresenter> implements FirstContract.View {

    private static final String TAG = "FirstFragment";

    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.tv_hot)
    TextView tvHot;
    @BindView(R.id.tv_quick_see)
    TextView tvQuickSee;
    @BindView(R.id.tv_guess_love)
    TextView tvGuessLove;
    @BindView(R.id.tv_more)
    TextView tvMore;
    @BindView(R.id.iv_last_news_icon)
    ImageView ivLastNewsIcon;
    @BindView(R.id.iv_news_type)
    ImageView ivNewsType;
    @BindView(R.id.tv_last_news)
    VerticalTextview tvLastNews;
    @BindView(R.id.tv_last_news_more)
    TextView tvLastNewsMore;
    @BindView(R.id.tv_expert_all)
    TextView tvExpertAll;
    @BindView(R.id.tv_expert1)
    TextView tvExpert1;
    @BindView(R.id.tv_expert2)
    TextView tvExpert2;
    @BindView(R.id.tv_expert3)
    TextView tvExpert3;
    @BindView(R.id.tv_metting_all)
    TextView tvMettingAll;
    @BindView(R.id.tv_metting1)
    TextView tvMetting1;
    @BindView(R.id.tv_metting2)
    TextView tvMetting2;
    @BindView(R.id.tv_metting3)
    TextView tvMetting3;
    @BindView(R.id.tv_science_all)
    TextView tvScienceAll;
    @BindView(R.id.tv_science1)
    TextView tvScience1;
    @BindView(R.id.tv_science2)
    TextView tvScience2;
    @BindView(R.id.tv_science3)
    TextView tvScience3;
    @BindView(R.id.tv_love_exchange)
    TextView tvLoveExchange;
    @BindView(R.id.iv_love1)
    ImageView ivLove1;
    @BindView(R.id.tv_love1)
    TextView tvLove1;
    @BindView(R.id.iv_love2)
    ImageView ivLove2;
    @BindView(R.id.tv_love2)
    TextView tvLove2;
    @BindView(R.id.iv_love3)
    ImageView ivLove3;
    @BindView(R.id.tv_love3)
    TextView tvLove3;
    @BindView(R.id.ll_bottom_tab)
    LinearLayout llBottomTab;
    Unbinder unbinder;
    @BindView(R.id.recycler_course)
    RecyclerView recyclerCourse;
    private MainCourseAdapter mainCourseAdapter;
    private ArrayList<AllCource.Course> coursetemArrayList = new ArrayList<>();

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
        mPresenter.getBanner("tb");
        mPresenter.getCourese("tb");
        mPresenter.getGuessLike();
        mPresenter.getLastNews();
        mPresenter.getMeeting();
        mPresenter.getProject();
        mPresenter.getScience();


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerCourse.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mainCourseAdapter = new MainCourseAdapter(coursetemArrayList, getContext());
        recyclerCourse.setAdapter(mainCourseAdapter);
        mainCourseAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

            }
        });
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
    public void showProjects(AllProject.ProjectReply reply) {
        for (int i = 0; i < reply.getProjectList().size(); i++) {
            if (i == 0) {
                tvExpert1.setText(reply.getProject(i).getProjectTitle());
                tvExpert1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 1) {
                tvExpert2.setText(reply.getProject(i).getProjectTitle());
                tvExpert2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 2) {
                tvExpert3.setText(reply.getProject(i).getProjectTitle());
                tvExpert3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }

        }
    }

    @Override
    public void showMeeting(MeetingMessage.MeetingReply reply) {
        for (int i = 0; i < reply.getMeetingList().size(); i++) {
            if (i == 0) {
                tvMetting1.setText(reply.getMeeting(i).getMeetingTitle());
                tvMetting1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 1) {
                tvMetting2.setText(reply.getMeeting(i).getMeetingTitle());
                tvMetting2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 2) {
                tvMetting3.setText(reply.getMeeting(i).getMeetingTitle());
                tvMetting3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }

        }
    }

    @Override
    public void showScience(AllScience.AllScienceReply reply) {
        for (int i = 0; i < reply.getScienceList().size(); i++) {
            if (i == 0) {
                tvScience1.setText(reply.getScience(i).getScienceTitle());
                tvScience1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 1) {
                tvScience2.setText(reply.getScience(i).getScienceTitle());
                tvScience2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 2) {
                tvScience3.setText(reply.getScience(i).getScienceTitle());
                tvScience3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }

        }
    }

    @Override
    public void showGuessLike(GuessLikeOuterClass.GuessLikeReply reply) {
        for (int i = 0; i < reply.getGuessLikeList().size(); i++) {
            if (i == 0) {
                tvLove1.setText(reply.getGuessLike(i).getLikeTitle());
                Glide.with(getActivity()).load(reply.getGuessLike(i).getLikeCover()).into(ivLove1);
                ivLove1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 1) {
                tvLove2.setText(reply.getGuessLike(i).getLikeTitle());
                Glide.with(getActivity()).load(reply.getGuessLike(i).getLikeCover()).into(ivLove2);
                ivLove2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
            if (i == 2) {
                tvLove3.setText(reply.getGuessLike(i).getLikeTitle());
                Glide.with(getActivity()).load(reply.getGuessLike(i).getLikeCover()).into(ivLove3);
                ivLove3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }

        }
    }

    @Override
    public void showCourse(AllCource.AlCourseReply reply) {
        mainCourseAdapter.setNewData(reply.getCourseList());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.tv_hot, R.id.tv_quick_see, R.id.tv_guess_love, R.id.tv_more, R.id.tv_last_news_more, R.id.tv_expert_all,
            R.id.tv_metting_all, R.id.tv_science_all, R.id.tv_love_exchange, R.id.ll_top_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_hot:
                break;
            case R.id.tv_quick_see:
                break;
            case R.id.tv_guess_love:
                break;
            case R.id.tv_more:
                break;
            case R.id.tv_last_news_more:
                break;
            case R.id.tv_expert_all:
                break;
            case R.id.tv_metting_all:
                break;
            case R.id.tv_science_all:
                break;
            case R.id.tv_love_exchange:
                break;
            case R.id.ll_top_search:
                Intent intent = new Intent(getActivity(), MianSearchActivity.class);
                getActivity().startActivity(intent);
                break;
        }
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

    @OnClick(R.id.ll_top_search)
    public void onViewClicked() {
    }
}
