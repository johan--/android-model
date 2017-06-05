package com.tb.wangfang.news.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.presenter.FirstPresenter;
import com.youth.banner.Banner;

import java.util.List;

import butterknife.BindView;


public class FirstFragment extends BaseFragment<FirstPresenter> implements FirstContract.View {

    private static final String TAG = "FirstFragment";
    @BindView(R.id.banner)
    Banner banner;


    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

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
        showTabContent();
        mPresenter.getDailyData();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    URL url = new URL("http://www.medline.org.cn/ueditor/jsp/upload/file/20170510/1494388974063025511.pdf");
//                    HttpURLConnection connection = (HttpURLConnection)
//                            url.openConnection();
//                    connection.setRequestMethod("GET");//试过POST 可能报错
//                    connection.setDoInput(true);
//                    connection.setConnectTimeout(10000);
//                    connection.setReadTimeout(10000);
//                    //实现连接
//                    connection.connect();
//
//                    System.out.println("connection.getResponseCode()=" + connection.getResponseCode());
//                    if (connection.getResponseCode() == 200) {
//                        InputStream is = connection.getInputStream();
//                        //这里给过去就行了
//
//
//                        pdfview.fromStream(is)
//                                // all pages are displayed by default
//                                .enableSwipe(true) // allows to block changing pages using swipe
//                                .swipeHorizontal(false)
//                                .enableDoubletap(true)
//                                .defaultPage(0)
//                                .onDraw(new OnDrawListener() {
//                                    @Override
//                                    public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {
//
//                                        Log.d(TAG, "onLayerDrawn: " + "pagewidth" + pageWidth + " pageHeight" + pageHeight + " displayedPage" + displayedPage);
//                                    }
//                                }) // allows to draw something on a provided canvas, above the current page
//                                .onLoad(new OnLoadCompleteListener() {
//                                    @Override
//                                    public void loadComplete(int nbPages) {
//                                        Log.d(TAG, "loadComplete: nbPages" + nbPages);
//                                    }
//                                }) // called after document is loaded and starts to be rendered
//                                .onPageChange(new OnPageChangeListener() {
//                                    @Override
//                                    public void onPageChanged(int page, int pageCount) {
//                                        Log.d(TAG, "onPageChanged: page" + page + "pageCount" + pageCount);
//                                    }
//                                })
//                                .onPageScroll(new OnPageScrollListener() {
//                                    @Override
//                                    public void onPageScrolled(int page, float positionOffset) {
//                                        Log.d(TAG, "onPageScrolled: page" + page + "positionOffset " + positionOffset);
//                                    }
//                                })
//                                .onError(new OnErrorListener() {
//                                    @Override
//                                    public void onError(Throwable t) {
//
//                                    }
//                                })
//                                .onRender(new OnRenderListener() {
//                                    @Override
//                                    public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {
//                                        Log.d(TAG, "onInitiallyRendered: nbPages" + nbPages + "pageWidth" + pageWidth + "pageHeight" + pageHeight);
//                                    }
//                                }) // called after document is rendered for the first time
//                                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
//                                .password(null)
//                                .scrollHandle(null)
//                                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
//                                .load();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


    @Override
    public void showSpanner(List<String> imgUrl) {

        banner.setImageLoader(mPresenter.getImageLoader());
        //设置图片集合
        banner.setImages(imgUrl);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }

    @Override
    public void showTabContent() {
        TabAdapter adapter = new TabAdapter(getChildFragmentManager(), getActivity());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorPrimary));
    }

    public class TabAdapter extends FragmentPagerAdapter {
        public final int COUNT = 3;
        private String[] titles = new String[]{"热点", "快看", "其他"};
        private Context context;
        public Fragment[] fragments = new Fragment[]{
                HotFragment.newInstance(), new QuickSeeFragment(), new OtherFragment()
        };

        public TabAdapter(FragmentManager fm, Context context) {
            super(fm);
            this.context = context;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}
