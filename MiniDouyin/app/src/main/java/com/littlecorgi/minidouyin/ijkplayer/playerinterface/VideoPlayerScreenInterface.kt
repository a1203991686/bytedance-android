package com.littlecorgi.minidouyin.ijkplayer.playerinterface

/**
 * 负责播放模式切换和销毁逻辑的接口
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-14 10:55
 */
interface VideoPlayerScreenInterface {

    /**------------------以下方法是销毁视频播放器资源---------------------------- */
    /**
     * 此处只释放播放器（如果要释放播放器并恢复控制器状态需要调用[.release]方法）
     * 不管是全屏、小窗口还是Normal状态下控制器的UI都不恢复初始状态
     * 这样以便在当前播放器状态下可以方便的切换不同的清晰度的视频地址
     */
    fun releasePlayer()

    /**
     * 释放INiceVideoPlayer，释放后，内部的播放器被释放掉，同时如果在全屏、小窗口模式下都会退出
     * 并且控制器的UI也应该恢复到最初始的状态.
     */
    fun release()
}