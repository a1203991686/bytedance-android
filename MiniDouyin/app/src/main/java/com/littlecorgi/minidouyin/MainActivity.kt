package com.littlecorgi.minidouyin

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.littlecorgi.minidouyin.MainActivity
import com.littlecorgi.minidouyin.bean.OngoingMovies
import com.littlecorgi.minidouyin.bean.OngoingMovies.MsBean
import com.littlecorgi.minidouyin.network.IFeedInterface
import com.littlecorgi.minidouyin.view.RecyclerAdapter
import com.yc.pagerlib.recycler.OnPagerListener
import com.yc.pagerlib.recycler.PagerLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import tv.danmaku.ijk.media.player.IjkMediaPlayer
import java.util.*

/**
 * @author tianweikang
 */
class MainActivity : AppCompatActivity() {
    private lateinit var mRecyclerView: RecyclerView
    private val mMsBeans = ArrayList<MsBean>()
    private lateinit var mAdapter: RecyclerAdapter
    private val mBtnCaptureVideo: ImageView? = null
    private val isFirstPlay = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView = findViewById(R.id.rv_feed)
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
        initRecyclerView()
    }

    private fun initRecyclerView() {
        mRecyclerView.setItemViewCacheSize(0)
        mRecyclerView.setRecyclerListener { holder: RecyclerView.ViewHolder ->
            Log.d(TAG, "initRecyclerView: 翻页了")
            (holder as RecyclerAdapter.ViewHolder).mIjkPlayer.stop()
            holder.mIjkPlayer.release()
        }
        val viewPagerLayoutManager = PagerLayoutManager(
                this, OrientationHelper.VERTICAL)
        viewPagerLayoutManager.setOnViewPagerListener(object : OnPagerListener {
            override fun onInitComplete() {
                println("OnPagerListener---onInitComplete--" + "初始化完成")
            }

            override fun onPageRelease(isNext: Boolean, position: Int) {
                println("OnPagerListener---onPageRelease--$position-----$isNext")
            }

            override fun onPageSelected(position: Int, isBottom: Boolean) {
                println("OnPagerListener---onPageSelected--$position-----$isBottom")
            }
        })
        mRecyclerView.layoutManager = viewPagerLayoutManager
        mAdapter = RecyclerAdapter(this, mMsBeans)
        mRecyclerView.adapter = mAdapter
    }

    private fun requestOngoingMovies() {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api-m.mtime.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val iFeedInterface = retrofit.create(IFeedInterface::class.java)
        val call = iFeedInterface.getMovie()
        call.enqueue(object : Callback<OngoingMovies?> {
            override fun onResponse(call: Call<OngoingMovies?>, response: Response<OngoingMovies?>) {
                mAdapter.setData(response.body()!!.ms!!)
                Toast.makeText(this@MainActivity, "获取成功", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<OngoingMovies?>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Feed流加载失败：首页列表网络获取失败", Toast.LENGTH_SHORT).show()
                t.printStackTrace()
            }
        })
    }

    override fun onPause() {
        super.onPause()
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