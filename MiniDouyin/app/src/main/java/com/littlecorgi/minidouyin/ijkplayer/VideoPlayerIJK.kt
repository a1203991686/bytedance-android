package com.littlecorgi.minidouyin.ijkplayer

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.AttrRes
import androidx.appcompat.app.AppCompatActivity
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerIJK
import tv.danmaku.ijk.media.player.IMediaPlayer
import tv.danmaku.ijk.media.player.IjkMediaPlayer
import java.io.IOException

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-06 10-08
 */
class VideoPlayerIJK : FrameLayout {
    /**
     * 由ijkplayer提供，用于播放视频，需要给他传入一个surfaceView
     */
    private var mMediaPlayer: IMediaPlayer? = null
    private var hasCreateSurfaceView = false
    private var mIsFullScreen = false
    /**
     * 表示视频初始高度
     */
    private var mInitHeight = 0
    private var mWidthPixels = 0
    /**
     * 视频文件地址
     */
    private var mPath = ""
    private var resId = 0
    private var surfaceView: SurfaceView? = null
    private var listener: VideoPlayerListener? = null
    private var mContext: Context? = null

    constructor(context: Context) : super(context) {
        initVideoView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initVideoView(context)
    }

    constructor(context: Context, attrs: AttributeSet?, @AttrRes defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initVideoView(context)
    }

    private fun initVideoView(context: Context) {
        mContext = context
        isFocusable = true
    }

    /**
     * 设置视频地址。
     * 根据是否第一次播放视频，做不同的操作。
     *
     * @param path the path of the video.
     */
    fun setVideoPath(path: String) {
        mPath = path
        createSurfaceView()
        load()
    }

    fun setVideoResource(resourceId: Int) {
        resId = resourceId
        createSurfaceView()
        load(resId)
    }

    /**
     * 新建一个surfaceview
     */
    private fun createSurfaceView() {
        if (hasCreateSurfaceView) {
            return
        }
        //生成一个新的surface view
        surfaceView = SurfaceView(mContext)
        surfaceView!!.holder.addCallback(PlayerSurfaceCallback())
        val layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                , ViewGroup.LayoutParams.MATCH_PARENT)
        surfaceView!!.layoutParams = layoutParams
        this.addView(surfaceView)
        hasCreateSurfaceView = true
    }

    /**
     * surfaceView的监听器
     */
    private inner class PlayerSurfaceCallback : SurfaceHolder.Callback {
        override fun surfaceCreated(holder: SurfaceHolder) { //surfaceview创建成功后，加载视频
//给mediaPlayer设置视图
            mMediaPlayer!!.setDisplay(holder)
        }

        override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {}
        override fun surfaceDestroyed(holder: SurfaceHolder) {}
    }

    /**
     * 加载视频
     */
    private fun load() { //每次都要重新创建IMediaPlayer
        createPlayer()
        try { //            mMediaPlayer.setDataSource(mPath);
            val mUri = Uri.parse(mPath)
            val scheme = mUri.scheme
            //            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
//                    (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase("file"))) {
//                IMediaDataSource dataSource = new FileMediaDataSource(new File(mUri.toString()));
//                mMediaPlayer.setDataSource(dataSource);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
                mMediaPlayer!!.setDataSource(mContext, mUri, null)
            } else {
                mMediaPlayer!!.dataSource = mUri.toString()
            }
            //                mMediaPlayer.setDataSource(mContext, Uri.parse(mPath), null);
            mMediaPlayer!!.prepareAsync()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    /**
     * 加载视频
     */
    private fun load(resourceId: Int) { //每次都要重新创建IMediaPlayer
        createPlayer()
        val fileDescriptor = mContext!!.resources.openRawResourceFd(resourceId)
        val provider = RawDataSourceProvider(fileDescriptor)
        mMediaPlayer!!.setDataSource(provider)
        mMediaPlayer!!.prepareAsync()
    }

    /**
     * 创建一个新的player
     */
    private fun createPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.stop()
            mMediaPlayer!!.setDisplay(null)
            mMediaPlayer!!.release()
        }
        val ijkMediaPlayer = IjkMediaPlayer()
        //        ijkMediaPlayer.native_setLogLevel(IjkMediaPlayer.IJK_LOG_DEBUG);
//开启硬解码
        ijkMediaPlayer.setOption(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "mediacodec", 1)
        mMediaPlayer = ijkMediaPlayer
        (mMediaPlayer as IjkMediaPlayer?)!!.setSpeed(3f)
        if (listener != null) {
            mMediaPlayer!!.setOnPreparedListener(listener)
            mMediaPlayer!!.setOnInfoListener(listener)
            mMediaPlayer!!.setOnSeekCompleteListener(listener)
            mMediaPlayer!!.setOnBufferingUpdateListener(listener)
            mMediaPlayer!!.setOnErrorListener(listener)
        }
    }

    fun setListener(listener: VideoPlayerListener?) {
        this.listener = listener
        if (mMediaPlayer != null) {
            mMediaPlayer!!.setOnPreparedListener(listener)
        }
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        if (mInitHeight == 0) {
            mInitHeight = height
            Log.d(TAG, "onLayout: $mInitHeight")
            mWidthPixels = resources.displayMetrics.widthPixels
        }
    }

    /**
     * -------======--------- 下面封装了一下控制视频的方法
     */
    fun firstStart() {
        if (mMediaPlayer != null) {
        }
    }

    fun start() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.start()
        }
    }

    fun release() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.reset()
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    fun pause() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.pause()
        }
    }

    fun stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.stop()
        }
    }

    fun reset() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.reset()
        }
    }

    val duration: Long
        get() = if (mMediaPlayer != null) {
            mMediaPlayer!!.duration
        } else {
            0
        }

    val currentPosition: Long
        get() = if (mMediaPlayer != null) {
            mMediaPlayer!!.currentPosition
        } else {
            0
        }

    val isPlaying: Boolean
        get() = if (mMediaPlayer != null) {
            mMediaPlayer!!.isPlaying
        } else false

    fun seekTo(l: Long) {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.seekTo(l)
        }
    }

    fun changeScreen(context: Context) {
        val mActivity = context as AppCompatActivity
        mContext = context
        Log.d(TAG, "changeScreen: " + mActivity.requestedOrientation)
        if (mActivity.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) { //        if (mActivity.getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
//            mFullScreen.setSelected(false);
//            mIsFullScreen = false;
            mIsFullScreen = true
            Log.d(TAG, "changeScreen: LAND")
            //            mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//            mActivity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//            setScreenBar();
        } else { //            mFullScreen.setSelected(true);
//            mIsFullScreen = true;
            mIsFullScreen = false
            //设置全屏
//            mActivity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            Log.d(TAG, "changeScreen: PORT")
            //            mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//            setScreenBar();
//            mBottomLayout.setVisibility(View.VISIBLE);
        }
        changeHeight()
    }

    private fun changeHeight() {
        val layoutParams = layoutParams
        if (mIsFullScreen) { // 高度扩展为横向全屏
            layoutParams.height = mWidthPixels
            layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT
        } else {
            layoutParams.height = 630
            //            layoutParams.height = mInitHeight;
            layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
        }
        setLayoutParams(layoutParams)
    }

    companion object {
        private val TAG = VideoPlayerIJK::class.java.simpleName
    }
}