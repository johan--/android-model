package com.tb.wangfang.news.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.model.bean.ContentBean;
import com.tb.wangfang.news.presenter.FirstPresenter;
import com.tb.wangfang.news.ui.activity.MainDetailActivity;
import com.tb.wangfang.news.ui.activity.MianSearchActivity;
import com.tb.wangfang.news.ui.activity.WebViewActivity;
import com.tb.wangfang.news.ui.adapter.MainPageAdapter;
import com.tb.wangfang.news.widget.VerticalTextview;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;
import com.wanfang.main.Content;
import com.wanfang.main.SerMainContent;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.tb.wangfang.news.app.App.SCREEN_HEIGHT;
import static me.iwf.photopicker.PhotoPicker.REQUEST_CODE;


public class FirstFragment extends BaseFragment<FirstPresenter> implements FirstContract.View, View.OnClickListener, BaseQuickAdapter.RequestLoadMoreListener {

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


    int halfScreen = SCREEN_HEIGHT / 2;
    @BindView(R.id.iv_qc_code)
    ImageView ivQcCode;


    private MainPageAdapter mainPageAdapter;
    private Banner banner;
    private int page = 1;
    private RelativeLayout rlLastNews;


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
        rlLastNews = (RelativeLayout) view.findViewById(R.id.rl_last_news);
        banner = (Banner) view.findViewById(R.id.banner);
        llTopSearch.setOnClickListener(this);
        tvSpecial.setOnClickListener(this);
        tvScience.setOnClickListener(this);
        tvMeeting.setOnClickListener(this);
        tvJournal.setOnClickListener(this);

        mainPageAdapter = new MainPageAdapter(getActivity(), null);
        mainPageAdapter.setOnLoadMoreListener(this, recyclerCourse);
        mainPageAdapter.addHeaderView(view);
        recyclerCourse.setAdapter(mainPageAdapter);
        final LinearLayoutManager manager = new LinearLayoutManager(getActivity());
//        mainPageAdapter.setEmptyView(R.layout.normal_empty_layout);
        mainPageAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                ContentBean contentBean = (ContentBean) adapter.getData().get(position);
                WebViewActivity.startThisFromActivity(getActivity(), contentBean.getUrl(), contentBean.getTitle(), "0");

            }
        });

        mainPageAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, final View view, int position) {
//                final ImageView iv = (ImageView) view.findViewById(R.id.iv_delete);
//                int[] location = new int[2];
//                iv.getLocationOnScreen(location);
//                int l1 = location[0];
//                int l2 = location[1];
//                if (l1 == 0 || l2 == 0) {
//                    Rect rect = new Rect();
//                    iv.getGlobalVisibleRect(rect);
//                    l1 = rect.left;
//                    l2 = rect.top;
//                }
//                WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
//                lp.alpha = 0.7f;
//                getActivity().getWindow().setAttributes(lp);
//                MainPageData item = (MainPageData) adapter.getData().get(position);
//                EvaluatePop pop = null;
//                if (item.getItemType() == Constants.TYPE_INSERT_1) {
//                    if (l2 > halfScreen) {
//                        pop = new EvaluatePop(getActivity(), EvaluatePop.TOP_CENTER);
//                    } else {
//                        pop = new EvaluatePop(getActivity(), EvaluatePop.BOTTOM_CENTER);
//                    }
//                } else {
//                    if (l2 > halfScreen) {
//                        pop = new EvaluatePop(getActivity(), EvaluatePop.TOP_RIGHT);
//                    } else {
//                        pop = new EvaluatePop(getActivity(), EvaluatePop.BOTTOM_RIGHT);
//                    }
//                }
//
//                pop.showPopupWindow(iv);
//                Log.d(TAG, "onItemChildClick:  iv.getTop() " + l1);
//                Log.d(TAG, "onItemChildClick:  iv.getBottom() " + pop.getHeight());
//                pop.setOnDismissListener(new PopupWindow.OnDismissListener() {
//
//                    @Override
//                    public void onDismiss() {
//                        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
//                        lp.alpha = 1f;
//                        getActivity().getWindow().setAttributes(lp);
//                    }
//                });

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
        mPresenter.getMianPage(page);


    }

    @Override
    public void showLastNews(final SerMainContent.ContentResponse response) {
        if (response.getContentsList().size() > 0) {
            rlLastNews.setVisibility(View.VISIBLE);
        } else {
            rlLastNews.setVisibility(View.GONE);
        }
        tvLastNews.setTextList(response.getContentsList());
        tvLastNews.setTextStillTime(3000);//设置停留时长间隔
        tvLastNews.setAnimTime(300);//设置进入和退出的时间间隔

        tvLastNews.setOnItemClickListener(new VerticalTextview.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Content.ContentDetail contentBean = response.getContents(position);
                WebViewActivity.startThisFromActivity(getActivity(), contentBean.getUrl(), contentBean.getTitle(), "0");
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
    public void showMainPage(SerMainContent.ContentResponse response) {
        List<ContentBean> listContent = new ArrayList<>();

        for (int i = 0; i < response.getContentsList().size(); i++) {
            ContentBean bean = new ContentBean();
            bean.setTitle(response.getContents(i).getTitle());
            bean.setTags(response.getContents(i).getTagsList());
            bean.setId(response.getContents(i).getId() + "");
            bean.setUrl(response.getContents(i).getUrl());
            bean.setExcerpt(response.getContents(i).getExcerpt());
            bean.setImages(response.getContents(i).getImagesList());
            bean.setCategories(response.getContents(i).getCategoriesList());
            String soucre = response.getContents(i).getCustomFieldsMap().get("来源");
            String style = response.getContents(i).getCustomFieldsMap().get("显示样式");
            bean.setSource(soucre);
            bean.setStyle(style);
            switch (style) {
                case "1小图":
                    bean.setItemType(Constants.TYPE_INSERT_2);
                    listContent.add(bean);
                    break;
                case "1大图":
                    bean.setItemType(Constants.TYPE_INSERT_1);
                    listContent.add(bean);

                    break;
                case "3小图":
                    bean.setItemType(Constants.TYPE_INSERT_3);
                    listContent.add(bean);
                    break;
                default:
                    break;
            }

        }

        mainPageAdapter.addData(listContent);
        mainPageAdapter.setEnableLoadMore(true);
        mainPageAdapter.loadMoreComplete();
        if (response.getNoMore()) {
            mainPageAdapter.loadMoreEnd(false);
        }

    }


    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


    @Override
    public void showSpanner(List<Content.ContentDetail> baners) {
        banner.setImageLoader(new GlideImageLoader());
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
        if (tvLastNews != null) {
            tvLastNews.stopAutoScroll();
        }

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
                intent2.putExtra("type", MainDetailActivity.TYPE_ONE);
                getActivity().startActivity(intent2);
                break;
            case R.id.tv_meeting:
                //每周优选
                Intent intent3 = new Intent(getActivity(), MainDetailActivity.class);
                intent3.putExtra("type", MainDetailActivity.TYPE_THREE);
                getActivity().startActivity(intent3);
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

    @Override
    public void onLoadMoreRequested() {
        page++;
        mPresenter.getMianPage(page);

    }

    public class GlideImageLoader extends ImageLoader {


        public GlideImageLoader() {
        }

        @Override
        public void displayImage(final Context context, final Object path, ImageView imageView) {
            /**
             注意：
             1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
             2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
             传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
             切记不要胡乱强转！
             */
            //Glide 加载图片简单用法

            Content.ContentDetail detail = (Content.ContentDetail) path;
            String webUrl = "";
            String title = "";
            if (detail.getImagesCount() > 0) {
                String url = detail.getImages(0).getSizesMap().get("full").getSourceUrl();
                title = detail.getTitle();
                webUrl = detail.getUrl();
                Glide.with(context).load(url).into(imageView);
            }

            final String finalWebUrl = webUrl;
            final String finalTitle = title;
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WebViewActivity.startThisFromActivity(getActivity(), finalWebUrl, finalTitle, "");
                }
            });
        }

//        //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
//        @Override
//        public ImageView createImageView(Context context) {
//            //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
//            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
//            return simpleDraweeView;
//        }
    }
}


