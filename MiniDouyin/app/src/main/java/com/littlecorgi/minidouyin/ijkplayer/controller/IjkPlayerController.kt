package com.littlecorgi.minidouyin.ijkplayer.controller

import android.content.Context
import android.net.Uri
import android.os.Build
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerListener
import com.littlecorgi.minidouyin.ijkplayer.playerinterface.VideoPlayerStateInterface
import com.littlecorgi.minidouyin.ijkplayer.util.RawDataSourceProvider
import tv.danmaku.ijk.media.player.IMediaPlayer
import tv.danmaku.ijk.media.player.IjkMediaPlayer
import java.io.IOException

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-14 14:41
 */
class IjkPlayerController(private val mContext: Context) : VideoPlayerStateInterface {

    private var mMediaPlayer: IMediaPlayer? = null
    private var listener: VideoPlayerListener? = null

    /**
     * 加载视频
     */
    override fun load(mPath: String) { //每次都要重新创建IMediaPlayer
        createPlayer()
        try {
            val mUri = Uri.parse(mPath)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
                mMediaPlayer!!.setDataSource(mContext, mUri, null)
            } else {
                mMediaPlayer!!.dataSource = mUri.toString()
            }
            mMediaPlayer!!.prepareAsync()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    /**
     * 加载视频
     */
    override fun load(resourceId: Int) { //每次都要重新创建IMediaPlayer
        createPlayer()
        val fileDescriptor = mContext.resources.openRawResourceFd(resourceId)
        val provider = RawDataSourceProvider(fileDescriptor)
        mMediaPlayer!!.setDataSource(provider)
        mMediaPlayer!!.prepareAsync()
    }

    /**
     * 创建一个新的player
     */
    override fun createPlayer(): IMediaPlayer {
//        mMediaPlayer!!.stop()
//        mMediaPlayer!!.setDisplay(null)
//        mMediaPlayer!!.release()
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
        return mMediaPlayer!!
    }

    override fun setListener(listener: VideoPlayerListener?) {
        this.listener = listener
        if (mMediaPlayer != null) {
            mMediaPlayer!!.setOnPreparedListener(listener)
        }
    }

    /**
     * -------======--------- 下面封装了一下控制视频的方法
     */

    override fun start() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.start()
        }
    }

    override fun release() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.reset()
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    override fun pause() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.pause()
        }
    }

    override fun getcurrentPosition(): Long {
        return if (mMediaPlayer != null) {
            mMediaPlayer!!.currentPosition
        } else {
            0
        }
    }

    override fun getDuration(): Long {
        return if (mMediaPlayer != null) {
            mMediaPlayer!!.duration
        } else {
            0
        }
    }

    override fun stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.stop()
        }
    }

    override fun reset() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.reset()
        }
    }

    override fun start(position: Long) {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.seekTo(position)
        }
    }

    override fun seekTo(position: Long) {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.seekTo(position)
        }
    }

    override fun restart() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.seekTo(0)
        }
    }

    override fun isPlaying(): Boolean {
        return if (mMediaPlayer != null) {
            mMediaPlayer!!.isPlaying
        } else {
            false
        }
    }

    override fun isPaused(): Boolean {
        return !isPlaying()
    }

    override fun isError(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isCompleted(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}