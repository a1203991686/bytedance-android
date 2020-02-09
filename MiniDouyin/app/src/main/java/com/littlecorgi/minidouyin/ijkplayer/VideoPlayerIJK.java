package com.littlecorgi.minidouyin.ijkplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-06 10-08
 */
public class VideoPlayerIJK extends FrameLayout {

    private static final String TAG = VideoPlayerIJK.class.getSimpleName();
    /**
     * 由ijkplayer提供，用于播放视频，需要给他传入一个surfaceView
     */
    private IMediaPlayer mMediaPlayer = null;

    private boolean hasCreateSurfaceView = false;

    private boolean mIsFullScreen = false;

    /**
     * 表示视频初始高度
     */
    private int mInitHeight = 0;
    private int mWidthPixels;

    /**
     * 视频文件地址
     */
    private String mPath = "";
    private int resId = 0;

    private SurfaceView surfaceView;

    private VideoPlayerListener listener;
    private Context mContext;

    public VideoPlayerIJK(@NonNull Context context) {
        super(context);
        initVideoView(context);
    }

    public VideoPlayerIJK(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initVideoView(context);
    }

    public VideoPlayerIJK(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initVideoView(context);
    }

    private void initVideoView(Context context) {
        mContext = context;
        setFocusable(true);
    }

    /**
     * 设置视频地址。
     * 根据是否第一次播放视频，做不同的操作。
     *
     * @param path the path of the video.
     */
    public void setVideoPath(String path) {
        mPath = path;
        createSurfaceView();
        load();
    }

    public void setVideoResource(int resourceId) {
        resId = resourceId;
        createSurfaceView();
        load(resId);
    }

    /**
     * 新建一个surfaceview
     */
    private void createSurfaceView() {
        if (hasCreateSurfaceView) {
            return;
        }
        //生成一个新的surface view
        surfaceView = new SurfaceView(mContext);
        surfaceView.getHolder().addCallback(new PlayerSurfaceCallback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                , ViewGroup.LayoutParams.MATCH_PARENT);
        surfaceView.setLayoutParams(layoutParams);
        this.addView(surfaceView);
        hasCreateSurfaceView = true;
    }

    /**
     * surfaceView的监听器
     */
    private class PlayerSurfaceCallback implements SurfaceHolder.Callback {
        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            //surfaceview创建成功后，加载视频
            //给mediaPlayer设置视图
            mMediaPlayer.setDisplay(holder);
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {
        }
    }

    /**
     * 加载视频
     */
    private void load() {
        //每次都要重新创建IMediaPlayer
        createPlayer();
        try {
//            mMediaPlayer.setDataSource(mPath);
            Uri mUri = Uri.parse(mPath);
            String scheme = mUri.getScheme();
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
//                    (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase("file"))) {
//                IMediaDataSource dataSource = new FileMediaDataSource(new File(mUri.toString()));
//                mMediaPlayer.setDataSource(dataSource);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
                mMediaPlayer.setDataSource(mContext, mUri, null);
            } else {
                mMediaPlayer.setDataSource(mUri.toString());
            }
//                mMediaPlayer.setDataSource(mContext, Uri.parse(mPath), null);
            mMediaPlayer.prepareAsync();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载视频
     */
    private void load(int resourceId) {
        //每次都要重新创建IMediaPlayer
        createPlayer();
        AssetFileDescriptor fileDescriptor = mContext.getResources().openRawResourceFd(resourceId);
        RawDataSourceProvider provider = new RawDataSourceProvider(fileDescriptor);
        mMediaPlayer.setDataSource(provider);
        mMediaPlayer.prepareAsync();
    }

    /**
     * 创建一个新的player
     */
    private void createPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
            mMediaPlayer.setDisplay(null);
            mMediaPlayer.release();
        }
        IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer();
//        ijkMediaPlayer.native_setLogLevel(IjkMediaPlayer.IJK_LOG_DEBUG);

        //开启硬解码
        ijkMediaPlayer.setOption(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "mediacodec", 1);

        mMediaPlayer = ijkMediaPlayer;
        ((IjkMediaPlayer) mMediaPlayer).setSpeed(3f);
        if (listener != null) {
            mMediaPlayer.setOnPreparedListener(listener);
            mMediaPlayer.setOnInfoListener(listener);
            mMediaPlayer.setOnSeekCompleteListener(listener);
            mMediaPlayer.setOnBufferingUpdateListener(listener);
            mMediaPlayer.setOnErrorListener(listener);
        }
    }


    public void setListener(VideoPlayerListener listener) {
        this.listener = listener;
        if (mMediaPlayer != null) {
            mMediaPlayer.setOnPreparedListener(listener);
        }
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (mInitHeight == 0) {
            mInitHeight = getHeight();
            Log.d(TAG, "onLayout: " + mInitHeight);
            mWidthPixels = getResources().getDisplayMetrics().widthPixels;
        }
    }

    /**
     * -------======--------- 下面封装了一下控制视频的方法
     */

    public void firstStart() {
        if (mMediaPlayer != null) {

        }
    }

    public void start() {
        if (mMediaPlayer != null) {
            mMediaPlayer.start();
        }
    }

    public void release() {
        if (mMediaPlayer != null) {
            mMediaPlayer.reset();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    public void pause() {
        if (mMediaPlayer != null) {
            mMediaPlayer.pause();
        }
    }

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
        }
    }


    public void reset() {
        if (mMediaPlayer != null) {
            mMediaPlayer.reset();
        }
    }


    public long getDuration() {
        if (mMediaPlayer != null) {
            return mMediaPlayer.getDuration();
        } else {
            return 0;
        }
    }


    public long getCurrentPosition() {
        if (mMediaPlayer != null) {
            return mMediaPlayer.getCurrentPosition();
        } else {
            return 0;
        }
    }

    public boolean isPlaying() {
        if (mMediaPlayer != null) {
            return mMediaPlayer.isPlaying();
        }
        return false;
    }

    public void seekTo(long l) {
        if (mMediaPlayer != null) {
            mMediaPlayer.seekTo(l);
        }
    }

    public void changeScreen(Context context) {
        AppCompatActivity mActivity = (AppCompatActivity) context;
        mContext = context;
        Log.d(TAG, "changeScreen: " + mActivity.getRequestedOrientation());
        if (mActivity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//        if (mActivity.getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
//            mFullScreen.setSelected(false);
//            mIsFullScreen = false;
            mIsFullScreen = true;
            Log.d(TAG, "changeScreen: LAND");
//            mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//            mActivity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//            setScreenBar();
        } else {
//            mFullScreen.setSelected(true);
//            mIsFullScreen = true;
            mIsFullScreen = false;
            //设置全屏
//            mActivity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            Log.d(TAG, "changeScreen: PORT");
//            mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//            setScreenBar();
//            mBottomLayout.setVisibility(View.VISIBLE);
        }
        changeHeight();
    }

    private void changeHeight() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (mIsFullScreen) {
            // 高度扩展为横向全屏
            layoutParams.height = mWidthPixels;
            layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT;
        } else {
            layoutParams.height = 630;
//            layoutParams.height = mInitHeight;
            layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        }
        setLayoutParams(layoutParams);
    }
}

