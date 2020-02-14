package com.littlecorgi.minidouyin.ijkplayer.playerinterface

import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerListener
import tv.danmaku.ijk.media.player.IMediaPlayer

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-14 10:59
 */
interface VideoPlayerStateInterface {
    /**
     * 设置视频Url，以及headers
     *
     * @param url           视频地址，可以是本地，也可以是网络视频
     * @param headers       请求header.
     */
    fun load(mPath: String)

    fun load(resourceId: Int)

    /**
     * 创建MediaPlayer
     */
    fun createPlayer(): IMediaPlayer

    /**
     * 设置监听
     */
    fun setListener(listener: VideoPlayerListener?)

    /**
     * 开始播放
     */
    fun start()

    /**
     * 从指定的位置开始播放
     *
     * @param position      播放位置
     */
    fun start(position: Long)

    /**
     * 跳转到指定位置
     */
    fun seekTo(position: Long)

    /**
     * 重新播放，播放器被暂停、播放错误、播放完成后，需要调用此方法重新播放
     */
    fun restart()

    /**
     * 暂停播放
     */
    fun pause()

    /**
     * 停止播放
     */
    fun stop()

    /**
     * 重置
     */
    fun reset()

    /**
     * 释放
     */
    fun release()

    /**
     *  获取当前进度
     */
    fun getcurrentPosition(): Long

    /**
     * 获取总长度
     */
    fun getDuration(): Long

    /**------------------以下9个方法是播放器在当前的播放状态---------------------------- */
    fun isPlaying(): Boolean

    fun isPaused(): Boolean
    fun isError(): Boolean
    fun isCompleted(): Boolean
}