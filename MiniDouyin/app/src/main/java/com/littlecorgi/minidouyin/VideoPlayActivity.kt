package com.littlecorgi.minidouyin

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerListener
import com.littlecorgi.minidouyin.ijkplayer.view.IjkVideoPlayer
import com.littlecorgi.minidouyin.viewModel.PublishVideoViewModel
import tv.danmaku.ijk.media.player.IjkMediaPlayer

class VideoPlayActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private val MSG_UPDATE_TIME = 0

    private lateinit var viewModel: PublishVideoViewModel
    private lateinit var mIjkVideoPlayer: IjkVideoPlayer
    private lateinit var mButtonStartOrPause: ImageView
    private lateinit var mSeekBar: SeekBar
    private lateinit var mTextViewTime: TextView
    private val mVideoUri: String? = null
    private var isPlaying = false
    private var isSeeking = false
    private var isFullScreen = false
    private var seekBarProgress = 0
    private val mHandler: Handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            var msg = msg
            super.handleMessage(msg)
            if (msg.what == MSG_UPDATE_TIME) {
                refreshTime()
                if (isPlaying) {
                    msg = obtainMessage(MSG_UPDATE_TIME)
                    sendMessageDelayed(msg, 200)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_play)

        mIjkVideoPlayer = findViewById(R.id.ijkPlayer1)
        mButtonStartOrPause = findViewById(R.id.button_start_pause)
        mSeekBar = findViewById(R.id.seekBar)
        mTextViewTime = findViewById(R.id.tv_time)
        //加载native库
        try {
            IjkMediaPlayer.loadLibrariesOnce(null)
            IjkMediaPlayer.native_profileBegin("libijkplayer.so")
        } catch (e: Exception) {
            finish()
        }
        mIjkVideoPlayer.mVideoPlayerSurfaceView!!.mIjkPlayerController.setListener(VideoPlayerListener())
        //        ijkPlayer.setVideoResource(R.raw.bytedance);
        mIjkVideoPlayer.mVideoPlayerSurfaceView!!.mIjkPlayerController.load("http://lf1-hscdn-tos.pstatp.com/obj/developer-baas/baas/tt7217xbo2wz3cem41/a8efa55c5c22de69_1560563154288.mp4")
        val message = Message.obtain()
        message.what = MSG_UPDATE_TIME
        mHandler.sendMessage(Message.obtain())
        isPlaying = true
        isSeeking = false
        mButtonStartOrPause.setOnClickListener {
            if (isPlaying) {
                mIjkVideoPlayer.pause()
                isPlaying = false
                mButtonStartOrPause.setImageResource(R.drawable.ic_play_arrow_white_30dp)
            } else {
                mIjkVideoPlayer.start()
                isPlaying = true
                mButtonStartOrPause.setImageResource(R.drawable.ic_pause_white_30dp)
                mHandler.sendEmptyMessage(MSG_UPDATE_TIME)
                mSeekBar.max = mIjkVideoPlayer.getDuration().toInt()
            }
        }
        mSeekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                seekBarProgress = seekBar.progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                isSeeking = true
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                isSeeking = false
                mIjkVideoPlayer.seekTo(seekBarProgress.toLong())
            }
        })
        // 获取调起的uri
        val uri = intent.data
        if (uri != null) {
            val proj = arrayOf(MediaStore.Audio.Media.DATA)
            val cursor = managedQuery(uri, proj, null, null, null)
            val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)
            cursor.moveToFirst()
            mIjkVideoPlayer.load(cursor.getString(columnIndex))
        }
    }

    //        return "android.resource://" + this.getPackageName() + "/" + resId;
    private val videoPath: String
        private get() = "http://qthttp.apple.com.edgesuite.net/1010qwoeiuryfg/sl.m3u8"
    //        return "android.resource://" + this.getPackageName() + "/" + resId;

    private fun fullChangeScreen() {
        requestedOrientation = if (requestedOrientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) { // 切换为竖屏
            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        } else {
            ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        }
    }

    /**
     * 视频开始播放时使用handle.sendMessageDelayed更新时间显示
     */
    private fun refreshTime() {
        val totalSeconds = (mIjkVideoPlayer.getcurrentPosition() / 1000).toInt()
        Log.d(TAG, "refreshTime: " + mIjkVideoPlayer.getcurrentPosition())
        val seconds = totalSeconds % 60
        val minutes = totalSeconds / 60 % 60
        val hours = totalSeconds / 3600
        val timeString = if (hours > 0) String.format("%02d:%02d:%02d", hours, minutes, seconds) else String.format("%02d:%02d", minutes, seconds)
        mTextViewTime.text = timeString
        if (!isSeeking) {
            if (mIjkVideoPlayer.getDuration() != 0L) {
                Log.d(TAG, "refreshTime1: " + mIjkVideoPlayer.getcurrentPosition() / mIjkVideoPlayer.getDuration())
                Log.d(TAG, "refreshTime2: " + mIjkVideoPlayer.getcurrentPosition())
                Log.d(TAG, "refreshTime3: " + mIjkVideoPlayer.getDuration())
                mSeekBar.progress = mIjkVideoPlayer.getcurrentPosition().toInt()
            }
        }
    }

    private fun startPlay() {
        mIjkVideoPlayer.start()
        isPlaying = true
        mHandler.sendEmptyMessage(MSG_UPDATE_TIME)
    }

    override fun onPause() {
        super.onPause()
        if (mIjkVideoPlayer.isPlaying()) {
            mIjkVideoPlayer.stop()
        }
        IjkMediaPlayer.native_profileEnd()
    }

    override fun onBackPressed() {
        if (isFullScreen) {
            fullChangeScreen()
            mIjkVideoPlayer.changeScreen(this)
            isFullScreen = false
            return
        }
        super.onBackPressed()
    }
}