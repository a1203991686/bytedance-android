package com.littlecorgi.minidouyin.ijkplayer.view

import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.ViewGroup
import com.littlecorgi.minidouyin.ijkplayer.controller.IjkPlayerController
import tv.danmaku.ijk.media.player.IMediaPlayer

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-14 15:37
 */
class VideoPlayerSurfaceView(private val mIjkVideoPlayer: IjkVideoPlayer) {
    lateinit var mIjkPlayerController: IjkPlayerController
    private var mMediaPlayer: IMediaPlayer? = null

    private var surfaceView: SurfaceView? = null
    private var hasCreateSurfaceView: Boolean = false

    init {
        mIjkPlayerController = IjkPlayerController(mIjkVideoPlayer.context)
        mMediaPlayer = mIjkPlayerController.createPlayer()
    }

    /**
     * 新建一个SurfaceView
     */
    fun createSurfaceView(): SurfaceView? {
        if (hasCreateSurfaceView) {
            return null
        }
        //生成一个新的surface view
        surfaceView = SurfaceView(mIjkVideoPlayer.context)
        surfaceView!!.holder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {
            }

            override fun surfaceDestroyed(holder: SurfaceHolder?) {
            }

            override fun surfaceCreated(holder: SurfaceHolder?) {
                //SurfaceView创建成功后，加载视频
                //给mediaPlayer设置视图
                mMediaPlayer!!.setDisplay(holder)
            }
        })
        val layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                , ViewGroup.LayoutParams.MATCH_PARENT)
        surfaceView!!.layoutParams = layoutParams
        hasCreateSurfaceView = true
        return surfaceView!!
    }
}