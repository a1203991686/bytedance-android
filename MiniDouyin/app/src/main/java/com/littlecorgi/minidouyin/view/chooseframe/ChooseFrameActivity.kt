package com.littlecorgi.minidouyin.view.chooseframe

import android.graphics.Bitmap
import android.media.MediaMetadataRetriever
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.littlecorgi.minidouyin.MainActivity
import com.littlecorgi.minidouyin.R
import com.littlecorgi.minidouyin.ViewModelFactory
import com.littlecorgi.minidouyin.databinding.ActivityChooseFrameBinding
import com.littlecorgi.minidouyin.viewModel.ChooseFrameViewModel
import java.util.concurrent.Executors

class ChooseFrameActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var mBinding: ActivityChooseFrameBinding
    private lateinit var mViewModel: ChooseFrameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_choose_frame)
        mViewModel = ViewModelProviders.of(this, ViewModelFactory()).get(ChooseFrameViewModel::class.java)



        val singleExecutor = Executors.newSingleThreadExecutor()
        singleExecutor.execute {

        }
    }


    fun getVideoFrame(path: String?, time: Long): Bitmap? {
        val timeUs = time * 1000
        val mmr = MediaMetadataRetriever()
        mmr.setDataSource(path)
        return mmr.getFrameAtTime(timeUs, MediaMetadataRetriever.OPTION_CLOSEST)
    }
}