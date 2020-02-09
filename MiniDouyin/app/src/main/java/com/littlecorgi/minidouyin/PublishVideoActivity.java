package com.littlecorgi.minidouyin;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.bumptech.glide.Glide;
import com.littlecorgi.minidouyin.bean.PostVideoResponse;
import com.littlecorgi.minidouyin.network.IPostVideoInterface;
import com.littlecorgi.minidouyin.utils.ResourceUtils;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author tianweikang
 */
public class PublishVideoActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 1;
    private static final int PICK_VIDEO = 2;
    private static final int GRANT_PERMISSION = 3;
    private static final String TAG = PublishVideoActivity.class.getSimpleName();

    private Button mBtn;
    private ImageView mImageView;
    public Uri mSelectedImage;
    private Uri mSelectedVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_video);

        mBtn = findViewById(R.id.button);
        mImageView = findViewById(R.id.imageView);

        initBtns();
    }

    private void initBtns() {
        mBtn.setOnClickListener(v -> {
            String s = mBtn.getText().toString();
            if (getString(R.string.select_an_image).equals(s)) {
                if (requestReadExternalStoragePermission("select an image")) {
                    chooseImage();
                }
            }
//            else if (getString(R.string.select_a_video).equals(s)) {
//                if (requestReadExternalStoragePermission("select a video")) {
//                    chooseVideo();
//                }
//            }
            else if (getString(R.string.post_it).equals(s)) {
                if (mSelectedVideo != null && mSelectedImage != null) {
                    postVideo();
                } else {
                    throw new IllegalArgumentException("error data uri, mSelectedVideo = " + mSelectedVideo + ", mSelectedImage = " + mSelectedImage);
                }
            } else if ((getString(R.string.success_try_refresh).equals(s))) {
                mBtn.setText(R.string.select_an_image);
            }
        });
    }

    private boolean requestReadExternalStoragePermission(String explanation) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.READ_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "You should grant external storage permission to continue " + explanation, Toast.LENGTH_SHORT).show();
            } else {
                ActivityCompat.requestPermissions(this, new String[]{
                        Manifest.permission.READ_EXTERNAL_STORAGE
                }, GRANT_PERMISSION);
            }
            return false;
        } else {
            return true;
        }
    }

    public void chooseImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
    }

    public void chooseVideo() {
        Intent intent = new Intent();
        intent.setType("video/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Video"), PICK_VIDEO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult() called with: requestCode = [" + requestCode + "], resultCode = [" + resultCode + "], data = [" + data + "]");
        if (resultCode == RESULT_OK && null != data) {
            if (requestCode == PICK_IMAGE) {
                mSelectedImage = data.getData();
                Log.d(TAG, "selectedImage = " + mSelectedImage);
                mBtn.setText(R.string.select_a_video);
            } else if (requestCode == PICK_VIDEO) {
                mSelectedVideo = data.getData();
                Log.d(TAG, "mSelectedVideo = " + mSelectedVideo);
                mBtn.setText(R.string.post_it);
            }
        }
    }

    private MultipartBody.Part getMultipartFromUri(String name, Uri uri) {
        // if NullPointerException thrown, try to allow storage permission in system settings
        File f = new File(ResourceUtils.getRealPath(this, uri));
        RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), f);
        return MultipartBody.Part.createFormData(name, f.getName(), requestFile);
    }

    private void postVideo() {
        mBtn.setText("POSTING...");
        mBtn.setEnabled(false);

        // TODO-C2 (6) Send Request to post a video with its cover image
        // if success, make a text Toast and show
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.zhangshuo.fun/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IPostVideoInterface postVideoInterface = retrofit.create(IPostVideoInterface.class);
//        MultipartBody.Part video = getMultipartFromUri("video", mSelectedVideo);
//        MultipartBody.Part image = getMultipartFromUri("cover_image", mSelectedImage);
//        List<MultipartBody.Part> parts = new ArrayList<>();
//        parts.add(video);
//        parts.add(image);

        MultipartBody.Part image = getMultipartFromUri("image", mSelectedImage);

        Call<PostVideoResponse> uploadCall = postVideoInterface.uploadOneFile(image);
        uploadCall.enqueue(new Callback<PostVideoResponse>() {
            @Override
            public void onResponse(Call<PostVideoResponse> call, Response<PostVideoResponse> response) {
                Toast.makeText(PublishVideoActivity.this, "success", Toast.LENGTH_SHORT).show();
                if (response.body() != null) {
                    Glide.with(PublishVideoActivity.this).load(response.body().getData().getUrl()).into(mImageView);
                }
            }

            @Override
            public void onFailure(Call<PostVideoResponse> call, Throwable t) {
                Toast.makeText(PublishVideoActivity.this, "fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
