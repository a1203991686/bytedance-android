package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import chapter.android.aweme.ss.com.homework.model.Tips;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Tips> mTipsArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        for (int i = 0; i < 20; i++) {
            mTipsArrayList.add(new Tips("" + i, i + ""));
        }

        mRecyclerView = findViewById(R.id.rv_list);
        RecyclerAdapter mRecyclerAdapter = new RecyclerAdapter(this, mTipsArrayList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerAdapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(Exercises3.this, position + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        });
        mRecyclerView.setAdapter(mRecyclerAdapter);
    }

}
