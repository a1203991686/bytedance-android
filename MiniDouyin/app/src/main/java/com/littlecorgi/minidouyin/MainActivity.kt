package com.littlecorgi.minidouyin

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_IDLE
import androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_SETTLING
import com.littlecorgi.minidouyin.adapter.OngoingMovieRvAdapter
import com.littlecorgi.minidouyin.databinding.ActivityMainBinding
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerManager
import com.littlecorgi.minidouyin.view.capturevideo.CaptureVideoActivity
import com.littlecorgi.minidouyin.viewModel.MainActivityViewModel
import com.yc.pagerlib.recycler.PagerLayoutManager
import tv.danmaku.ijk.media.player.IjkMediaPlayer


/**
 * @author tianweikang
 */
class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, ViewModelFactory()).get(MainActivityViewModel::class.java)

        findViewById<View>(R.id.btn_capture_video).setOnClickListener {
            if (Build.VERSION.SDK_INT > 22) {
                when {
                    ContextCompat.checkSelfPermission(this@MainActivity,
                            Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED -> { //先判断有没有权限 ，没有就在这里进行权限的申请
                        Log.d(TAG, "onCreate: 相机权限")
                        ActivityCompat.requestPermissions(this@MainActivity, arrayOf(Manifest.permission.CAMERA), PERMISSION_CAMERA_OK)
                    }
                    ContextCompat.checkSelfPermission(this@MainActivity,
                            Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED -> { //先判断有没有权限 ，没有就在这里进行权限的申请
                        Log.d(TAG, "onCreate: 麦克风权限")
                        ActivityCompat.requestPermissions(this@MainActivity, arrayOf(Manifest.permission.RECORD_AUDIO), PERMISSION_AUDIO_OK)
                    }
                    ContextCompat.checkSelfPermission(this@MainActivity,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED -> { //先判断有没有权限 ，没有就在这里进行权限的申请
                        Log.d(TAG, "onCreate: 存储权限")
                        ActivityCompat.requestPermissions(this@MainActivity, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), PERMISSION_WRITE_OK)
                    }
                    ContextCompat.checkSelfPermission(this@MainActivity,
                            Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED -> { //先判断有没有权限 ，没有就在这里进行权限的申请
                        Log.d(TAG, "onCreate: 读取文件权限")
                        ActivityCompat.requestPermissions(this@MainActivity, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), PERMISSION_READ_OK)
                    }
                    else -> { //说明已经获取到摄像头权限了 想干嘛干嘛
                        startActivity(Intent(this@MainActivity, CaptureVideoActivity::class.java))
                    }
                }
            } else { //这个说明系统版本在6.0之下，不需要动态获取权限。
            }
        }
        //加载native库
        try {
            IjkMediaPlayer.loadLibrariesOnce(null)
            IjkMediaPlayer.native_profileBegin("libijkplayer.so")
        } catch (e: Exception) {
            finish()
        }
        requestOngoingMovies()
        initRecycler()
    }

    private fun initRecycler() {
        binding.rvFeed.layoutManager = PagerLayoutManager(
                this, OrientationHelper.VERTICAL
        )
//        val adapter = RecyclerAdapter(this)
        val adapter = OngoingMovieRvAdapter(this, ArrayList())
        binding.rvFeed.adapter = adapter
//        binding.rvFeed.setItemViewCacheSize(1)
//        binding.rvFeed.setRecyclerListener { holder: RecyclerView.ViewHolder ->
//            Log.d(TAG, "initRecyclerView: 翻页了")
//            // 在此主要是去释放正在播放的ijkPlayer的资源，然后重新去加载新的视频
//            val videoPlayer: IjkVideoPlayer = (holder as OngoingMovieRvAdapter.ViewHolder).ijkplayer
//            if (videoPlayer === VideoPlayerManager.instance()!!.getCurrentVideoPlayer()) {
//                VideoPlayerManager.instance()!!.releaseVideoPlayer()
//            }
//        }
        var xValue: Int = 0
        var yValue: Int = 0
        binding.rvFeed.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                xValue = dx
                yValue = dy
            }

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                when (newState) {
                    SCROLL_STATE_SETTLING -> {
                        xValue = 0
                        yValue = 0
                    }
                    SCROLL_STATE_IDLE -> {
                        if (xValue < yValue) {
                            VideoPlayerManager.instance()!!.releaseVideoPlayer()
                        }
                    }
                    else -> {
                    }
                }
            }
        })
        subscribeUi(adapter)
    }

    private fun subscribeUi(adapter: OngoingMovieRvAdapter) {
        viewModel.movies.observe(this, androidx.lifecycle.Observer { movies ->
            adapter.items.clear()
            adapter.items.addAll(movies.ms!!)
            adapter.notifyDataSetChanged()
        })
        viewModel.errorToastText.observe(this, androidx.lifecycle.Observer { errorTerxt ->
            Toast.makeText(this, viewModel.errorToastText.value, Toast.LENGTH_SHORT).show()
        })
    }

    private fun requestOngoingMovies() {
        viewModel.requestMovies()
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            PERMISSION_CAMERA_OK -> {
                if (grantResults.size > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(this@MainActivity, "请手动打开相机权限", Toast.LENGTH_SHORT).show()
                }
            }
            PERMISSION_AUDIO_OK -> {
                if (grantResults.size > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(this@MainActivity, "请手动打开麦克风权限", Toast.LENGTH_SHORT).show()
                }
            }
            PERMISSION_WRITE_OK -> {
                if (grantResults.size > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(this@MainActivity, "请手动打开存储权限", Toast.LENGTH_SHORT).show()
                }
            }
            PERMISSION_READ_OK -> {
                if (grantResults.size > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(this@MainActivity, "请手动打开读取文件权限", Toast.LENGTH_SHORT).show()
                }
            }
            else -> {
            }
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
        private const val PERMISSION_CAMERA_OK = 100
        private const val PERMISSION_AUDIO_OK = 101
        private const val PERMISSION_WRITE_OK = 102
        private const val PERMISSION_READ_OK = 103
    }
}