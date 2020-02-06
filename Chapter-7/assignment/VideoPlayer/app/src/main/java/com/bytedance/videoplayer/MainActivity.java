package com.bytedance.videoplayer;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bytedance.videoplayer.ijkplayer.VideoPlayerIJK;
import com.bytedance.videoplayer.ijkplayer.VideoPlayerListener;

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

    private boolean isPlaying;

    private Handler mHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MSG_UPDATE_TIME:
                    mTextViewTime.setText((String) msg.obj);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ijkPlayer");

        ijkPlayer = findViewById(R.id.ijkPlayer);
        mButtonStartOrPause = findViewById(R.id.button_start_pause);
        mButtonFullScreen = findViewById(R.id.button_full_screen);
        mSeekBar = findViewById(R.id.seekBar);
        mTextViewTime = findViewById(R.id.tv_time);

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


        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Message message = Message.obtain();
                    message.what = MSG_UPDATE_TIME;
                    message.obj = refreshTime();
                    mHandler.sendMessageDelayed(message, 1000);
                    if (mSeekBar.getProgress() == 100) {
                        break;
                    }
                }
            }
        });
        isPlaying = true;

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
                }
            }
        });

        mButtonFullScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                ijkPlayer.seekTo(seekBar.getProgress() * ijkPlayer.getDuration() / 100);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
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
    private String refreshTime() {
        int totalSeconds = (int) (ijkPlayer.getCurrentPosition() / 1000);

        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int hours = totalSeconds / 3600;
        return hours > 0 ?
                String.format("%02d:%02d:%02d", hours, minutes, seconds)
                : String.format("%02d:%02d", minutes, seconds);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        ijkPlayer.changeScreen(this);
//        long position = ijkPlayer.getCurrentPosition();
//        Log.d(TAG, "onConfigurationChanged: " + position);
//
//        setContentView(R.layout.activity_main);
//        ijkPlayer = findViewById(R.id.ijkPlayer);
//        //加载native库
//        try {
//            IjkMediaPlayer.loadLibrariesOnce(null);
//            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
//        } catch (Exception e) {
//            this.finish();
//        }
//        ijkPlayer.setListener(new VideoPlayerListener());
//        ijkPlayer.setVideoResource(R.raw.bytedance);

//        ijkPlayer.seekTo(position);

//        ijkPlayer.setVideoPath(getVideoPath());

//        findViewById(R.id.buttonPlay).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ijkPlayer.start();
//            }
//        });
//
//        findViewById(R.id.buttonPause).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ijkPlayer.pause();
//            }
//        });
//
//        findViewById(R.id.buttonSeek).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ijkPlayer.seekTo(20 * 1000);
//            }
//        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (ijkPlayer.isPlaying()) {
            ijkPlayer.stop();
        }

        IjkMediaPlayer.native_profileEnd();
    }
}
