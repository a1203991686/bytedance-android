package com.littlecorgi.minidouyin.ijkplayer.playerinterface

/**
 * 负责player准备状态的接口
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-14 10:53
 */
interface VideoPlayerPropertyInterface {
    /**
     * seek到制定的位置继续播放
     *
     * @param pos 播放位置
     */
    fun seekTo(pos: Long)

    /**
     * 开始播放时，是否从上一次的位置继续播放
     *
     * @param continueFromLastPosition true 接着上次的位置继续播放，false从头开始播放
     */
    fun continueFromLastPosition(continueFromLastPosition: Boolean)

    /**
     * 获取当前播放状态
     *
     * @return  播放状态
     */
    fun getPlayType(): Int

    /**
     * 获取视频总时长，毫秒
     *
     * @return 视频总时长ms
     */
    fun getDuration(): Long

    /**
     * 获取当前播放的位置，毫秒
     *
     * @return 当前播放位置，ms
     */
    fun getCurrentPosition(): Long

    /**
     * 获取播放速度
     *
     * @param speed 播放速度
     * @return      播放速度
     */
    fun getSpeed(speed: Float): Float
}