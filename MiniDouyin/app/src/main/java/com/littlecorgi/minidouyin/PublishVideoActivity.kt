package com.littlecorgi.minidouyin

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.bumptech.glide.Glide
import com.littlecorgi.minidouyin.PublishVideoActivity
import com.littlecorgi.minidouyin.bean.PostVideoResponse
import com.littlecorgi.minidouyin.network.IPostVideoInterface
import com.littlecorgi.minidouyin.utils.ResourceUtils
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File

/**
 * @author tianweikang
 */
class PublishVideoActivity : AppCompatActivity() {
    private lateinit var mBtn: Button
    private lateinit var mImageView: ImageView
    private var mSelectedImage: Uri? = null
    private var mSelectedVideo: Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publish_video)
        mBtn = findViewById(R.id.button)
        mImageView = findViewById(R.id.imageView)
        initBtns()
    }

    private fun initBtns() {
        mBtn.setOnClickListener {
            val s = mBtn.text.toString()
            if (getString(R.string.select_an_image) == s) {
                if (requestReadExternalStoragePermission("select an image")) {
                    chooseImage()
                }
            } else if (getString(R.string.post_it) == s) {
                if (mSelectedVideo != null && mSelectedImage != null) {
                    postVideo()
                } else {
                    throw IllegalArgumentException("error data uri, mSelectedVideo = $mSelectedVideo, mSelectedImage = $mSelectedImage")
                }
            } else if (getString(R.string.success_try_refresh) == s) {
                mBtn.setText(R.string.select_an_image)
            }
        }
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

    private fun getMultipartFromUri(name: String, uri: Uri?): MultipartBody.Part { // if NullPointerException thrown, try to allow storage permission in system settings
        val f = File(ResourceUtils.getRealPath(this, uri!!))
        val requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), f)
        return MultipartBody.Part.createFormData(name, f.name, requestFile)
    }

    private fun postVideo() {
        mBtn.text = "POSTING..."
        mBtn.isEnabled = false
        // TODO-C2 (6) Send Request to post a video with its cover image
// if success, make a text Toast and show
        val retrofit = Retrofit.Builder()
                .baseUrl("http://www.zhangshuo.fun/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val postVideoInterface = retrofit.create(IPostVideoInterface::class.java)
        //        MultipartBody.Part video = getMultipartFromUri("video", mSelectedVideo);
//        MultipartBody.Part image = getMultipartFromUri("cover_image", mSelectedImage);
//        List<MultipartBody.Part> parts = new ArrayList<>();
//        parts.add(video);
//        parts.add(image);
        val image = getMultipartFromUri("image", mSelectedImage)
        val uploadCall = postVideoInterface.uploadOneFile(image)
        uploadCall!!.enqueue(object : Callback<PostVideoResponse?> {
            override fun onResponse(call: Call<PostVideoResponse?>, response: Response<PostVideoResponse?>) {
                Toast.makeText(this@PublishVideoActivity, "success", Toast.LENGTH_SHORT).show()
                if (response.body() != null) {
                    Glide.with(this@PublishVideoActivity).load(response.body()!!.data!!.url).into(mImageView)
                }
            }

            override fun onFailure(call: Call<PostVideoResponse?>, t: Throwable) {
                Toast.makeText(this@PublishVideoActivity, "fail", Toast.LENGTH_SHORT).show()
            }
        })
    }

    companion object {
        private const val PICK_IMAGE = 1
        private const val PICK_VIDEO = 2
        private const val GRANT_PERMISSION = 3
        private val TAG = PublishVideoActivity::class.java.simpleName
    }
}