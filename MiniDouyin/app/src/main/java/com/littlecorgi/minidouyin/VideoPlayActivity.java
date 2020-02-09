package com.littlecorgi.minidouyin;

import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerIJK;
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerListener;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class VideoPlayActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    private final int MSG_UPDATE_TIME = 0;
    private VideoPlayerIJK ijkPlayer;
    private ImageView mButtonStartOrPause;
    private SeekBar mSeekBar;
    private TextView mTextViewTime;
    private String mVideoUri;

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
        setContentView(R.layout.activity_video_play);

        ijkPlayer = findViewById(R.id.ijkPlayer);
        mButtonStartOrPause = findViewById(R.id.button_start_pause);
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
//        ijkPlayer.setVideoResource(R.raw.bytedance);
        ijkPlayer.setVideoPath("http://lf1-hscdn-tos.pstatp.com/obj/developer-baas/baas/tt7217xbo2wz3cem41/a8efa55c5c22de69_1560563154288.mp4");


        Message message = Message.obtain();
        message.what = MSG_UPDATE_TIME;
        mHandler.sendMessage(Message.obtain());
        isPlaying = false;
        isSeeking = false;

        mButtonStartOrPause.setOnClickListener(v -> {
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
            ijkPlayer.changeScreen(this);
            isFullScreen = false;
            return;
        }
        super.onBackPressed();
    }
}
