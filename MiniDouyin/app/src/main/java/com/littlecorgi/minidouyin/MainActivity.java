package com.littlecorgi.minidouyin;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.littlecorgi.minidouyin.bean.OngoingMovies;
import com.littlecorgi.minidouyin.network.IFeedInterface;
import com.littlecorgi.minidouyin.view.RecyclerAdapter;
import com.yc.pagerlib.recycler.OnPagerListener;
import com.yc.pagerlib.recycler.PagerLayoutManager;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author tianweikang
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<OngoingMovies.MsBean> mMsBeans = new ArrayList<>();
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv_feed);

        requestOngoingMovies();
        initRecyclerView();
    }

    private void initRecyclerView() {
        PagerLayoutManager viewPagerLayoutManager = new PagerLayoutManager(
                this, OrientationHelper.VERTICAL);
        viewPagerLayoutManager.setOnViewPagerListener(new OnPagerListener() {
            @Override
            public void onInitComplete() {
                System.out.println("OnPagerListener---onInitComplete--" + "初始化完成");
            }

            @Override
            public void onPageRelease(boolean isNext, int position) {
                System.out.println("OnPagerListener---onPageRelease--" + position + "-----" + isNext);
            }

            @Override
            public void onPageSelected(int position, boolean isBottom) {
                System.out.println("OnPagerListener---onPageSelected--" + position + "-----" + isBottom);
            }
        });
        mRecyclerView.setLayoutManager(viewPagerLayoutManager);
        mAdapter = new RecyclerAdapter(this, mMsBeans);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void requestOngoingMovies() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api-m.mtime.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IFeedInterface iFeedInterface = retrofit.create(IFeedInterface.class);
        Call<OngoingMovies> call = iFeedInterface.getMovie();
        call.enqueue(new Callback<OngoingMovies>() {
            @Override
            public void onResponse(Call<OngoingMovies> call, Response<OngoingMovies> response) {
                mAdapter.setData(response.body() != null ? response.body().getMs() : null);
                Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<OngoingMovies> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Feed流加载失败：首页列表网络获取失败", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
    }
}
