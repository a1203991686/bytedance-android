package com.littlecorgi.minidouyin.ijkplayer

import com.littlecorgi.minidouyin.ijkplayer.view.IjkVideoPlayer

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-14 11:06
 */
class VideoPlayerManager {
    private var mVideoPlayer: IjkVideoPlayer? = null

    /**
     * 构造方法，避免直接new
     */
    private fun VideoPlayerManager() { //避免初始化
    }


    companion object {
        /**
         * 用volatile关键字修饰对象
         * 为何要确保只有一个对象，为了保证任何时候有且只有一个视频播放，尤其是在列表中播放
         */
        @Volatile
        private var sInstance: VideoPlayerManager? = null

        /**
         * 一定要使用单例模式，保证同一时刻只有一个视频在播放，其他的都是初始状态
         * 单例模式
         * @return          VideoPlayerManager对象
         */
        fun instance(): VideoPlayerManager? {
            if (sInstance == null) {
                synchronized(VideoPlayerManager::class.java) {
                    if (sInstance == null) {
                        sInstance = VideoPlayerManager()
                    }
                }
            }
            return sInstance
        }
    }

    /**
     * 获取对象
     * @return          VideoPlayerManager对象
     */
    fun getCurrentVideoPlayer(): IjkVideoPlayer? {
        return mVideoPlayer
    }

    /**
     * 设置VideoPlayer
     * @param videoPlayer       VideoPlayerManager对象
     */
    fun setCurrentVideoPlayer(videoPlayer: IjkVideoPlayer) {
        if (mVideoPlayer !== videoPlayer) {
//            releaseVideoPlayer()
            mVideoPlayer = videoPlayer
        }
    }

    /**
     * 当视频正在播放或者正在缓冲时，调用该方法暂停视频
     */
    fun suspendVideoPlayer() {
        if (mVideoPlayer != null) {
            if (mVideoPlayer!!.isPlaying()) {
                mVideoPlayer!!.pause()
            }
        }
    }


    /**
     * 当视频暂停时或者缓冲暂停时，调用该方法重新开启视频播放
     */
    fun resumeVideoPlayer() {
        if (mVideoPlayer != null) {
            if (mVideoPlayer!!.isPaused()) {
                mVideoPlayer!!.restart()
            }
        }
    }


    /**
     * 释放，内部的播放器被释放掉，同时如果在全屏、小窗口模式下都会退出
     */
    fun releaseVideoPlayer() {
        if (mVideoPlayer != null) {
            mVideoPlayer!!.stop()
            mVideoPlayer!!.release()
            mVideoPlayer = null
        }
    }
}