package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_chatroom, null);
        setContentView(view);
        int viewCount = getViewCount(view);
        mTextView = findViewById(R.id.tv_content_info);
        mTextView.setText(new StringBuilder().append(viewCount).append("个"));
        System.out.println("View count = " + viewCount);

    }

    public static int getViewCount(View view) {
        int count = 0;

        if (null == view) {
            return 0;
        }

        if (view instanceof ViewGroup) {
            count++;
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                View child = ((ViewGroup) view).getChildAt(i);
                if (child instanceof ViewGroup) {
                    count += getViewCount(child);
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}
