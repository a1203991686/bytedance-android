package com.littlecorgi.minidouyin.ijkplayer.view

import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceView
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.AttrRes
import androidx.appcompat.app.AppCompatActivity
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerListener
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerManager
import com.littlecorgi.minidouyin.ijkplayer.playerinterface.VideoPlayerStateInterface
import tv.danmaku.ijk.media.player.IMediaPlayer

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-06 10-08
 */
class IjkVideoPlayer : FrameLayout, VideoPlayerStateInterface {
    private var mIsFullScreen = false
    /**
     * 表示视频初始高度
     */
    private var mInitHeight = 0
    private var mWidthPixels = 0

    private var mContext: Context? = null
    var mVideoPlayerSurfaceView: VideoPlayerSurfaceView? = null
    private var mSurfaceView: SurfaceView? = null

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
        mVideoPlayerSurfaceView = VideoPlayerSurfaceView(this)
        mSurfaceView = mVideoPlayerSurfaceView!!.createSurfaceView()
        this.addView(mSurfaceView)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        if (mInitHeight == 0) {
            mInitHeight = height
            Log.d(TAG, "onLayout: $mInitHeight")
            mWidthPixels = resources.displayMetrics.widthPixels
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
        private val TAG = IjkVideoPlayer::class.java.simpleName
    }

    override fun load(mPath: String) {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.load(mPath)
        start()
    }

    override fun load(resourceId: Int) {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.load(resourceId)
    }

    override fun createPlayer(): IMediaPlayer {
        return mVideoPlayerSurfaceView!!.mIjkPlayerController.createPlayer()
    }

    override fun setListener(listener: VideoPlayerListener?) {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.setListener(listener)
    }

    override fun start() {
        VideoPlayerManager.instance()!!.setCurrentVideoPlayer(this)
        mVideoPlayerSurfaceView!!.mIjkPlayerController.start()
    }

    override fun start(position: Long) {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.start(position)
    }

    override fun seekTo(position: Long) {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.seekTo(position)
    }

    override fun restart() {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.restart()
    }

    override fun pause() {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.pause()
    }

    override fun stop() {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.stop()
    }

    override fun reset() {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.reset()
    }

    override fun release() {
        mVideoPlayerSurfaceView!!.mIjkPlayerController.release()
    }

    override fun getcurrentPosition(): Long {
        return mVideoPlayerSurfaceView!!.mIjkPlayerController.getcurrentPosition()
    }

    override fun getDuration(): Long {
        return mVideoPlayerSurfaceView!!.mIjkPlayerController.getDuration()
    }

    override fun isPlaying(): Boolean {
        return mVideoPlayerSurfaceView!!.mIjkPlayerController.isPlaying()
    }

    override fun isPaused(): Boolean {
        return mVideoPlayerSurfaceView!!.mIjkPlayerController.isPaused()
    }

    override fun isError(): Boolean {
        return mVideoPlayerSurfaceView!!.mIjkPlayerController.isError()
    }

    override fun isCompleted(): Boolean {
        return mVideoPlayerSurfaceView!!.mIjkPlayerController.isCompleted()
    }
}