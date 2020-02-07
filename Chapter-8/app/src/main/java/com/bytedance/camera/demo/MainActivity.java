package com.bytedance.camera.demo;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int PERMISSION_CAMERA_OK = 0;
    private static final int PERMISSION_AUDIO_OK = 1;
    private static final int PERMISSION_WRITE_OK = 2;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_picture).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, TakePictureActivity.class));
        });

        findViewById(R.id.btn_camera).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RecordVideoActivity.class));
        });

        findViewById(R.id.btn_custom).setOnClickListener(v -> {
            //todo 在这里申请相机、麦克风、存储的权限
            if (Build.VERSION.SDK_INT > 22) {
                if (ContextCompat.checkSelfPermission(MainActivity.this,
                        android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    //先判断有没有权限 ，没有就在这里进行权限的申请
                    Log.d(TAG, "onCreate: 相机权限");
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{android.Manifest.permission.CAMERA}, PERMISSION_CAMERA_OK);


                } else if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
                    //先判断有没有权限 ，没有就在这里进行权限的申请
                    Log.d(TAG, "onCreate: 麦克风权限");
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{android.Manifest.permission.RECORD_AUDIO}, PERMISSION_AUDIO_OK);

                } else if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    //先判断有没有权限 ，没有就在这里进行权限的申请
                    Log.d(TAG, "onCreate: 存储权限");
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_WRITE_OK);
                } else {
                    //说明已经获取到摄像头权限了 想干嘛干嘛
                    startActivity(new Intent(MainActivity.this, CustomCameraActivity.class));
                }
            } else {
                //这个说明系统版本在6.0之下，不需要动态获取权限。
            }
        });
    }

    private void requestCameraPermission(Context context) {

    }

    private void requestAudioPermission(Context context) {

    }

    private void requestWritePermission(Context context) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_CAMERA_OK: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(MainActivity.this, "请手动打开相机权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case PERMISSION_AUDIO_OK: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(MainActivity.this, "请手动打开麦克风权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case PERMISSION_WRITE_OK: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    Toast.makeText(MainActivity.this, "请手动打开存储权限", Toast.LENGTH_SHORT).show();
                }
                break;
            }

            default:
                break;
        }
    }

}
