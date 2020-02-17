package com.littlecorgi.minidouyin.view.publishvideo

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.littlecorgi.minidouyin.R
import com.littlecorgi.minidouyin.ViewModelFactory
import com.littlecorgi.minidouyin.databinding.ActivityPublishVideoBinding
import com.littlecorgi.minidouyin.view.chooseframe.ChooseFrameActivity
import com.littlecorgi.minidouyin.viewModel.PublishVideoViewModel
import java.io.File

/**
 * @author tianweikang
 */
class PublishVideoActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var viewModel: PublishVideoViewModel
    private lateinit var mBinding: ActivityPublishVideoBinding

    private lateinit var mBtn: Button
    private lateinit var mImageView: ImageView
    private lateinit var mFile: File
    private lateinit var mFilePathString: String
    private var mSelectedImage: Uri? = null
    private var mSelectedVideo: Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_publish_video)
        viewModel = ViewModelProviders.of(this, ViewModelFactory()).get(PublishVideoViewModel::class.java)

        mFilePathString = intent.getStringExtra("VideoFile")!!
        mBinding.ijkPlayerPreview.setUp(mFilePathString, "")
        mBinding.ijkPlayerPreview.postDelayed({
            mBinding.ijkPlayerPreview.startVideo()
        }, 500)

        subscribeUI()
    }

    private fun subscribeUI() {
        viewModel.errorToastText.observe(this, Observer { text ->
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        })
        viewModel.postResponse.observe(this, Observer {
            TODO("API无法访问，如果可以访问再去具体实现")
        })
    }

    private fun requestReadExternalStoragePermission(explanation: String): Boolean {
        return if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                            Manifest.permission.READ_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "You should grant external storage permission to continue $explanation", Toast.LENGTH_SHORT).show()
            } else {
                ActivityCompat.requestPermissions(this, arrayOf(
                        Manifest.permission.READ_EXTERNAL_STORAGE
                ), GRANT_PERMISSION)
            }
            false
        } else {
            true
        }
    }

    private fun chooseImage() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE)
    }

    private fun chooseVideo() {
        val intent = Intent()
        intent.type = "video/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Video"), PICK_VIDEO)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d(TAG, "onActivityResult() called with: requestCode = [$requestCode], resultCode = [$resultCode], data = [$data]")
        if (resultCode == Activity.RESULT_OK && null != data) {
            if (requestCode == PICK_IMAGE) {
                mSelectedImage = data.data
                Log.d(TAG, "selectedImage = $mSelectedImage")
                mBtn.setText(R.string.select_a_video)
            } else if (requestCode == PICK_VIDEO) {
                mSelectedVideo = data.data
                Log.d(TAG, "mSelectedVideo = $mSelectedVideo")
                mBtn.setText(R.string.post_it)
            }
        }
    }


    private fun postVideo() {
        mBtn.text = "POSTING..."
        mBtn.isEnabled = false
        viewModel.postVideo(mSelectedImage!!, mSelectedVideo!!, this)
    }

    companion object {
        private const val PICK_IMAGE = 1
        private const val PICK_VIDEO = 2
        private const val GRANT_PERMISSION = 3
        private val TAG = PublishVideoActivity::class.java.simpleName
    }

    override fun onClick(v: View?) {
        val id = v!!.id
        when (id) {
            R.id.iv_back_to_capture -> {
                finish()
            }
            R.id.iv_finish_to_choose -> {
                val intent = Intent(
                        this,
                        ChooseFrameActivity::class.java
                )

                startActivity(intent)
            }
        }
    }
}