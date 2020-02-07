package com.bytedance.videoplayer;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bytedance.videoplayer.ijkplayer.VideoPlayerIJK;
import com.bytedance.videoplayer.ijkplayer.VideoPlayerListener;

import java.nio.file.Path;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/**
 * @author tianweikang
 */
public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    private final int MSG_UPDATE_TIME = 0;
    private VideoPlayerIJK ijkPlayer;
    private MediaPlayer player;
    private SurfaceHolder holder;
    private ImageView mButtonStartOrPause;
    private ImageView mButtonFullScreen;
    private SeekBar mSeekBar;
    private TextView mTextViewTime;
    private FrameLayout ijkPlayerLayout;

    private boolean isPlaying;
    private boolean isSeeking = false;
    private boolean isFullScreen = false;
    private int seekBarProgress;

    private Handler mHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == MSG_UPDATE_TIME) {
                refreshTime();
                if (isPlaying) {
                    msg = obtainMessage(MSG_UPDATE_TIME);
                    sendMessageDelayed(msg, 200);
                }
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ijkPlayer = findViewById(R.id.ijkPlayer);
        mButtonStartOrPause = findViewById(R.id.button_start_pause);
        mButtonFullScreen = findViewById(R.id.button_full_screen);
        mSeekBar = findViewById(R.id.seekBar);
        mTextViewTime = findViewById(R.id.tv_time);
        ijkPlayerLayout = findViewById(R.id.layout_ijkPlayer);

        //加载native库
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception e) {
            this.finish();
        }
        ijkPlayer.setListener(new VideoPlayerListener());
        ijkPlayer.setVideoResource(R.raw.bytedance);
//        ijkPlayer.setVideoPath(getVideoPath());

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Log.d(TAG, "run: " + Thread);
//                while (true) {
////                    Message message = Message.obtain();
////                    message.what = MSG_UPDATE_TIME;
////                    mHandler.sendMessageDelayed(message, 1000);
//                }
//            }
//        }).start();

//        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//        singleThreadExecutor.execute(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
////                    mHandler.sendEmptyMessageDelayed(MSG_UPDATE_TIME, 1000);
//                    Message message = Message.obtain();
//                    message.what = MSG_UPDATE_TIME;
//                    mHandler.sendMessageDelayed(message, 1000);
//                }
//            }
//        });
        Message message = Message.obtain();
        message.what = MSG_UPDATE_TIME;
        mHandler.sendMessage(Message.obtain());
        isPlaying = false;
        isSeeking = false;

        mButtonStartOrPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    ijkPlayer.pause();
                    isPlaying = false;
                    mButtonStartOrPause.setImageResource(R.drawable.ic_play_arrow_white_30dp);
                } else {
                    ijkPlayer.start();
                    isPlaying = true;
                    mButtonStartOrPause.setImageResource(R.drawable.ic_pause_white_30dp);
                    mHandler.sendEmptyMessage(MSG_UPDATE_TIME);
                    mSeekBar.setMax((int) ijkPlayer.getDuration());
                }
            }
        });

        mButtonFullScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFullScreen) {
                    isFullScreen = false;
                } else {
                    isFullScreen = true;
                }
                fullChangeScreen();
                ijkPlayer.changeScreen(MainActivity.this);
            }
        });

        findViewById(R.id.buttonSeek).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ijkPlayer.seekTo(20 * 1000);
            }
        });

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekBarProgress = seekBar.getProgress();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                isSeeking = true;
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                isSeeking = false;
                ijkPlayer.seekTo(seekBarProgress);
            }
        });

        // 获取调起的uri
        Uri uri = getIntent().getData();
        if (uri != null) {
            String[] proj = {MediaStore.Audio.Media.DATA};
            Cursor cursor = managedQuery(uri, proj, null, null, null);
            int columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA);
            cursor.moveToFirst();
            ijkPlayer.setVideoPath(cursor.getString(columnIndex));
        }
    }

    private String getVideoPath() {
        return "http://qthttp.apple.com.edgesuite.net/1010qwoeiuryfg/sl.m3u8";
//        return "android.resource://" + this.getPackageName() + "/" + resId;
    }

    private void fullChangeScreen() {
        if (getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {// 切换为竖屏
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    /**
     * 视频开始播放时使用handle.sendMessageDelayed更新时间显示
     */
    private void refreshTime() {
        int totalSeconds = (int) (ijkPlayer.getCurrentPosition() / 1000);
        Log.d(TAG, "refreshTime: " + ijkPlayer.getCurrentPosition());

        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int hours = totalSeconds / 3600;
        String timeString = hours > 0 ?
                String.format("%02d:%02d:%02d", hours, minutes, seconds)
                : String.format("%02d:%02d", minutes, seconds);
        mTextViewTime.setText(timeString);
        if (!isSeeking) {
            if (ijkPlayer.getDuration() != 0) {
                Log.d(TAG, "refreshTime1: " + ijkPlayer.getCurrentPosition() / ijkPlayer.getDuration());
                Log.d(TAG, "refreshTime2: " + ijkPlayer.getCurrentPosition());
                Log.d(TAG, "refreshTime3: " + ijkPlayer.getDuration());
                mSeekBar.setProgress((int) ijkPlayer.getCurrentPosition());
            }
        }
    }

    private void startPlay() {
        ijkPlayer.start();
        isPlaying = true;
        mHandler.sendEmptyMessage(MSG_UPDATE_TIME);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
//
//        Log.d(TAG, "changeScreen: " + getRequestedOrientation());
//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
////        if (mActivity.getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
////            mFullScreen.setSelected(false);
////            mIsFullScreen = false;
//            mIsFullScreen = true;
//            Log.d(TAG, "changeScreen: LAND");
////            mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
////            mActivity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
////            setScreenBar();
//        } else {
////            mFullScreen.setSelected(true);
////            mIsFullScreen = true;
//            mIsFullScreen = false;
//            //设置全屏
////            mActivity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
////                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
//            Log.d(TAG, "changeScreen: PORT");
////            mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
////            setScreenBar();
////            mBottomLayout.setVisibility(View.VISIBLE);
//        }
//        changeHeight();
        ijkPlayer.changeScreen(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (ijkPlayer.isPlaying()) {
            ijkPlayer.stop();
        }

        IjkMediaPlayer.native_profileEnd();
    }

    @Override
    public void onBackPressed() {
        if (isFullScreen) {
            fullChangeScreen();
            ijkPlayer.changeScreen(MainActivity.this);
            isFullScreen = false;
            return;
        }
        super.onBackPressed();
    }
}
