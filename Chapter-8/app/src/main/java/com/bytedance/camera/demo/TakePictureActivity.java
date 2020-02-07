package com.bytedance.camera.demo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.bytedance.camera.demo.utils.Utils;

import java.io.File;

public class TakePictureActivity extends AppCompatActivity {

    private static final String TAG = TakePictureActivity.class.getSimpleName();
    private ImageView imageView;
    private File imgFile;

    private static final int REQUEST_IMAGE_CAPTURE = 1;

    private static final int REQUEST_EXTERNAL_STORAGE = 101;
    private static final int REQUEST_EXTERNAL_CAMERA = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_picture);
        imageView = findViewById(R.id.img);
        findViewById(R.id.btn_picture).setOnClickListener(v -> {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                    || ContextCompat.checkSelfPermission(this,
                    Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                //todo 在这里申请相机、存储的权限
                ActivityCompat.requestPermissions(this,
                        new String[]{android.Manifest.permission.CAMERA}, REQUEST_EXTERNAL_CAMERA);
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_EXTERNAL_STORAGE);

            } else {
                takePicture();
            }
        });

    }

    private void takePicture() {
        //todo 打开相机
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        imgFile = Utils.getOutputMediaFile(Utils.MEDIA_TYPE_IMAGE);
        if (imgFile != null) {
            Uri fileUri =
                    FileProvider.getUriForFile(this, "com.bytedance.camera.demo", imgFile);
            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            setPic();
            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(imgFile)));
        }
    }

    private void setPic() {
        int targetW = imageView.getWidth();
        int targetH = imageView.getHeight();

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imgFile.getAbsolutePath(), options);
        Log.d(TAG, "setPic: " + imgFile.getAbsolutePath());
        int photoW = options.outWidth;
        int photeH = options.outHeight;

        int scaleFactor = Math.min(photeH / targetH, photoW / targetW);
        options.inJustDecodeBounds = false;
        options.inSampleSize = scaleFactor;
        options.inPurgeable = true;

        Bitmap bmp = BitmapFactory.decodeFile(imgFile.getAbsolutePath(), options);
        try {
            Bitmap rotateBmp = Utils.rotateImage(bmp, imgFile.getAbsolutePath());
            imageView.setImageBitmap(rotateBmp);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
        imageView.setImageBitmap(bmp);
        //todo 根据imageView裁剪

        //todo 根据缩放比例读取文件，生成Bitmap

        //todo 如果存在预览方向改变，进行图片旋转
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_EXTERNAL_STORAGE: {
                //todo 判断权限是否已经授予
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "已拥有存储权限", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "请手动打开存储权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case REQUEST_EXTERNAL_CAMERA: {
                //todo 判断权限是否已经授予
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "已拥有相机权限", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "请手动打开相机权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            default:
                break;
        }
    }
}
