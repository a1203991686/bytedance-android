package com.littlecorgi.minidouyin;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
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
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/**
 * @author tianweikang
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int PERMISSION_CAMERA_OK = 100;
    private static final int PERMISSION_AUDIO_OK = 101;
    private static final int PERMISSION_WRITE_OK = 102;
    private static final int PERMISSION_READ_OK = 103;

    private RecyclerView mRecyclerView;
    private ArrayList<OngoingMovies.MsBean> mMsBeans = new ArrayList<>();
    private RecyclerAdapter mAdapter;
    private ImageView mBtnCaptureVideo;

    private boolean isFirstPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv_feed);

        findViewById(R.id.btn_capture_video).setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT > 22) {
                if (ContextCompat.checkSelfPermission(MainActivity.this,
                        android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    //先判断有没有权限 ，没有就在这里进行权限的申请
                    Log.d(TAG, "onCreate: 相机权限");
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{android.Manifest.permission.CAMERA}, PERMISSION_CAMERA_OK);
                } else if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
                    //先判断有没有权限 ，没有就在这里进行权限的申请
                    Log.d(TAG, "onCreate: 麦克风权限");
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{android.Manifest.permission.RECORD_AUDIO}, PERMISSION_AUDIO_OK);

                } else if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    //先判断有没有权限 ，没有就在这里进行权限的申请
                    Log.d(TAG, "onCreate: 存储权限");
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_WRITE_OK);
                } else if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    //先判断有没有权限 ，没有就在这里进行权限的申请
                    Log.d(TAG, "onCreate: 读取文件权限");
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_READ_OK);
                } else {
                    //说明已经获取到摄像头权限了 想干嘛干嘛
                    startActivity(new Intent(MainActivity.this, CaptureVideoActivity.class));
                }
            } else {
                //这个说明系统版本在6.0之下，不需要动态获取权限。
            }
        });

        //加载native库
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception e) {
            this.finish();
        }
        requestOngoingMovies();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mRecyclerView.setItemViewCacheSize(0);
        mRecyclerView.setRecyclerListener(holder -> {
            Log.d(TAG, "initRecyclerView: 翻页了");
            ((RecyclerAdapter.ViewHolder) holder).mIjkPlayer.stop();
            ((RecyclerAdapter.ViewHolder) holder).mIjkPlayer.release();
        });
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

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_CAMERA_OK: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(MainActivity.this, "请手动打开相机权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case PERMISSION_AUDIO_OK: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(MainActivity.this, "请手动打开麦克风权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case PERMISSION_WRITE_OK: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(MainActivity.this, "请手动打开存储权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case PERMISSION_READ_OK: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(MainActivity.this, "请手动打开读取文件权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            default:
                break;
        }
    }
}
