package com.littlecorgi.minidouyin.view.capturevideo

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.hardware.Camera
import android.hardware.Camera.CameraInfo
import android.hardware.Camera.PictureCallback
import android.media.CamcorderProfile
import android.media.MediaRecorder
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.littlecorgi.minidouyin.R
import com.littlecorgi.minidouyin.view.publishvideo.PublishVideoActivity
import com.littlecorgi.minidouyin.utils.Utils
import java.io.FileOutputStream
import java.io.IOException
import kotlin.math.abs
import kotlin.math.min

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-06 15:21
 */
class CaptureVideoActivity : AppCompatActivity() {
    private var mSurfaceView: SurfaceView? = null
    private var mCamera: Camera? = null
    private var CAMERA_TYPE = CameraInfo.CAMERA_FACING_BACK
    private var isRecording = false
    private var isFacing = false
    private var isPausing = false
    private var rotationDegree = 0
    private var mCameraId = 0
    override fun onPause() {
        super.onPause()
        releaseCameraAndPreview()
    }

    override fun onResume() {
        super.onResume()
        mCamera = getCamera(mCameraId)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_capture_video)
        if (checkCameraHardware(this)) {
            val cameraNums = Camera.getNumberOfCameras()
            for (i in 0 until cameraNums) {
                val info = CameraInfo()
                Camera.getCameraInfo(i, info)
                if (info.facing == CameraInfo.CAMERA_FACING_BACK) {
                    mCamera = getCamera(i)
                    mCameraId = i
                    break
                }
            }
            Log.d(TAG, "onCreate: $cameraNums")
        } else {
            finish()
        }
        mSurfaceView = findViewById(R.id.img)
        val surfaceHolder = mSurfaceView!!.holder
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS)
        surfaceHolder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceCreated(surfaceHolder: SurfaceHolder) {
                startPreview(surfaceHolder)
            }

            override fun surfaceChanged(surfaceHolder: SurfaceHolder, i: Int, i1: Int, i2: Int) {}
            override fun surfaceDestroyed(surfaceHolder: SurfaceHolder) {}
        })
        findViewById<View>(R.id.btn_record).setOnClickListener {
            if (isRecording) {
                mMediaRecorder!!.stop() // stop the recording
                releaseMediaRecorder() // release the MediaRecorder object
                mCamera!!.lock() // take camera access back from MediaRecorder
                // inform the user that recording has stopped
                (findViewById<View>(R.id.btn_record) as TextView).text = "Capture"
                isRecording = false
            } else { //                isRecording = true;
                if (prepareVideoRecorder()) { // Camera is available and unlocked, MediaRecorder is prepared,
// now you can start recording
                    mMediaRecorder!!.start()
                    // inform the user that recording has started
                    (findViewById<View>(R.id.btn_record) as TextView).text = "Stop"
                    isRecording = true
                    Log.d(TAG, "onCreate: 开始录制")
                } else { // prepare didn't work, release the camera
                    releaseMediaRecorder()
                    Log.d(TAG, "onCreate: 录制失败：VideoRecorder未就绪")
                    // inform user
                }
            }
        }
        findViewById<View>(R.id.btn_facing).setOnClickListener { v: View? ->
            if (isFacing) {
                for (i in 0 until Camera.getNumberOfCameras()) {
                    val info = CameraInfo()
                    Camera.getCameraInfo(i, info)
                    if (info.facing == CameraInfo.CAMERA_FACING_BACK) {
                        releaseCameraAndPreview()
                        mCamera = getCamera(i)
                    }
                }
                isFacing = false
            } else {
                for (i in 0 until Camera.getNumberOfCameras()) {
                    val info = CameraInfo()
                    Camera.getCameraInfo(i, info)
                    if (info.facing == CameraInfo.CAMERA_FACING_FRONT) {
                        releaseCameraAndPreview()
                        mCamera = getCamera(i)
                    }
                }
                isFacing = true
            }
            startPreview(surfaceHolder)
        }
        findViewById<View>(R.id.btn_zoom).setOnClickListener {
            val params = mCamera!!.parameters
            val focusModes = params.supportedFocusModes
            if (focusModes.contains(Camera.Parameters.FOCUS_MODE_AUTO)) {
                Log.d(TAG, "onCreate: 自动对焦功能可用")
                // Autofocus mode is supported
// set the focus mode
                params.focusMode = Camera.Parameters.FOCUS_MODE_CONTINUOUS_VIDEO
                params.flashMode = Camera.Parameters.FLASH_MODE_AUTO
                // set Camera parameters
                mCamera!!.parameters = params
            }
        }
        findViewById<View>(R.id.btn_pause).setOnClickListener {
            if (!isRecording) {
                return@setOnClickListener
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                if (isPausing) {
                    mMediaRecorder!!.resume()
                    (findViewById<View>(R.id.btn_pause) as TextView).text = "Pause"
                    isPausing = false
                } else {
                    isPausing = true
                    mMediaRecorder!!.pause()
                    (findViewById<View>(R.id.btn_pause) as TextView).text = "Pausing"
                }
            }
        }
        findViewById<View>(R.id.btn_publish_video).setOnClickListener { v: View? -> startActivity(Intent(this, PublishVideoActivity::class.java)) }
    }

    private fun checkCameraHardware(context: Context): Boolean {
        return if (context.packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            true
        } else {
            Toast.makeText(this, "对不起，您的设备不支持Camera", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun getCamera(position: Int): Camera {
        CAMERA_TYPE = position
        if (mCamera != null) {
            releaseCameraAndPreview()
        }
        val cam = Camera.open(position)
        rotationDegree = getCameraDisplayOrientation(position)
        cam.setDisplayOrientation(rotationDegree)
        return cam
    }

    private fun getCameraDisplayOrientation(cameraId: Int): Int {
        val info = CameraInfo()
        Camera.getCameraInfo(cameraId, info)
        val rotation = windowManager.defaultDisplay
                .rotation
        var degrees = 0
        when (rotation) {
            Surface.ROTATION_0 -> degrees = 0
            Surface.ROTATION_90 -> degrees = DEGREE_90
            Surface.ROTATION_180 -> degrees = DEGREE_180
            Surface.ROTATION_270 -> degrees = DEGREE_270
            else -> {
            }
        }
        var result: Int
        if (info.facing == CameraInfo.CAMERA_FACING_FRONT) {
            result = (info.orientation + degrees) % DEGREE_360
            result = (DEGREE_360 - result) % DEGREE_360 // compensate the mirror
        } else { // back-facing
            result = (info.orientation - degrees + DEGREE_360) % DEGREE_360
        }
        return result
    }

    private fun releaseCameraAndPreview() {
        mCamera!!.stopPreview()
        mCamera!!.release()
        mCamera = null
    }

    var size: Camera.Size? = null
    private fun startPreview(holder: SurfaceHolder) {
        try {
            mCamera!!.setPreviewDisplay(holder)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        mCamera!!.startPreview()
    }

    private var mMediaRecorder: MediaRecorder? = null
    private fun prepareVideoRecorder(): Boolean {
        mMediaRecorder = MediaRecorder()
        // Step 1: Unlock and set camera to MediaRecorder
        mCamera!!.unlock()
        mMediaRecorder!!.setCamera(mCamera)
        // Step 2: Set sources
        mMediaRecorder!!.setAudioSource(MediaRecorder.AudioSource.CAMCORDER)
        mMediaRecorder!!.setVideoSource(MediaRecorder.VideoSource.CAMERA)
        // Step 3: Set a CamcorderProfile (requires API Level 8 or higher)
        mMediaRecorder!!.setProfile(CamcorderProfile.get(CamcorderProfile.QUALITY_HIGH))
        // Step 4: Set output file
        mMediaRecorder!!.setOutputFile(Utils.getOutputMediaFile(Utils.MEDIA_TYPE_VIDEO).toString())
        // Step 5: Set the preview output
        mMediaRecorder!!.setPreviewDisplay(mSurfaceView!!.holder.surface)
        // Step 6: Prepare configured MediaRecorder
        try {
            mMediaRecorder!!.prepare()
        } catch (e: IllegalStateException) {
            Log.d(TAG, "IllegalStateException preparing MediaRecorder: " + e.message)
            releaseMediaRecorder()
            return false
        } catch (e: IOException) {
            Log.d(TAG, "IOException preparing MediaRecorder: " + e.message)
            releaseMediaRecorder()
            return false
        }
        return true
    }

    private fun releaseMediaRecorder() {
        if (mMediaRecorder != null) {
            mMediaRecorder!!.reset() // clear recorder configuration
            mMediaRecorder!!.release() // release the recorder object
            mMediaRecorder = null
            mCamera!!.lock() // lock camera for later use
        }
    }

    private val mPicture = PictureCallback label@{ data: ByteArray?, camera: Camera? ->
        val pictureFile = Utils.getOutputMediaFile(Utils.MEDIA_TYPE_IMAGE) ?: return@label
        try {
            val fos = FileOutputStream(pictureFile)
            fos.write(data!!)
            fos.close()
        } catch (e: IOException) {
            Log.d("mPicture", "Error accessing file: " + e.message)
        }
        mCamera!!.startPreview()
    }

    private fun getOptimalPreviewSize(sizes: List<Camera.Size>?, w: Int, h: Int): Camera.Size? {
        val aspectTolerance = 0.1
        val targetRatio = h.toDouble() / w
        if (sizes == null) {
            return null
        }
        var optimalSize: Camera.Size? = null
        var minDiff = Double.MAX_VALUE
        val targetHeight = min(w, h)
        for (size in sizes) {
            val ratio = size.width.toDouble() / size.height
            if (abs(ratio - targetRatio) > aspectTolerance) {
                continue
            }
            if (abs(size.height - targetHeight) < minDiff) {
                optimalSize = size
                minDiff = abs(size.height - targetHeight).toDouble()
            }
        }
        if (optimalSize == null) {
            minDiff = Double.MAX_VALUE
            for (size in sizes) {
                if (abs(size.height - targetHeight) < minDiff) {
                    optimalSize = size
                    minDiff = abs(size.height - targetHeight).toDouble()
                }
            }
        }
        return optimalSize
    }

    companion object {
        private val TAG = CaptureVideoActivity::class.java.simpleName
        private const val DEGREE_90 = 90
        private const val DEGREE_180 = 180
        private const val DEGREE_270 = 270
        private const val DEGREE_360 = 360
    }
}