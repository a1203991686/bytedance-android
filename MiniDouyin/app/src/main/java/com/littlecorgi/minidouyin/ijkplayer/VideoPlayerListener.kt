package com.littlecorgi.minidouyin.ijkplayer

import tv.danmaku.ijk.media.player.IMediaPlayer

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-06 10-09
 */
class VideoPlayerListener : IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnSeekCompleteListener {
    override fun onBufferingUpdate(iMediaPlayer: IMediaPlayer, i: Int) {
        println(i)
    }

    override fun onCompletion(iMediaPlayer: IMediaPlayer) {}
    override fun onError(iMediaPlayer: IMediaPlayer, i: Int, i1: Int): Boolean {
        return false
    }

    override fun onInfo(iMediaPlayer: IMediaPlayer, i: Int, i1: Int): Boolean {
        return false
    }

    override fun onPrepared(iMediaPlayer: IMediaPlayer) { //        iMediaPlayer.start();
//        iMediaPlayer.pause();
    }

    override fun onSeekComplete(iMediaPlayer: IMediaPlayer) {}
    override fun onVideoSizeChanged(iMediaPlayer: IMediaPlayer, i: Int, i1: Int, i2: Int, i3: Int) {}
}