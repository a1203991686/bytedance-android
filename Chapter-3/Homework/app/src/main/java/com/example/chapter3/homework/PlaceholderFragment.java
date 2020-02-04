package com.example.chapter3.homework;


import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

public class PlaceholderFragment extends Fragment {

    private LottieAnimationView mLoadingAnimationView;
    private ListView mFriendList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO ex3-3: 修改 fragment_placeholder，添加 loading 控件和列表视图控件
        View view = inflater.inflate(R.layout.fragment_placeholder, container, false);
        mLoadingAnimationView = view.findViewById(R.id.loading_animator);
        mFriendList = view.findViewById(R.id.friend_list);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final List<String> adapterData = new ArrayList<>();
        //存放要显示的数据
        for (int i = 0; i < 20; i++) {
            adapterData.add("好友" + i);
        }
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, adapterData);

        getView().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 这里会在 5s 后执行
                // TODO ex3-4：实现动画，将 lottie 控件淡出，列表数据淡入
                mFriendList.setAdapter(adapter);
                //设置内容View的Alpha值为0,可见性为VISIABLE
                mFriendList.setAlpha(0f);
                mFriendList.setVisibility(View.VISIBLE);

                // 设置内容View的动画效果
                mFriendList.animate()
                        .alpha(1f)
                        .setDuration(1000)
                        .setListener(null);

                // 当动画结束时，设置载入View的可见性为GONE.
                mLoadingAnimationView.animate()
                        .alpha(0f)
                        .setDuration(1000)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                mLoadingAnimationView.setVisibility(View.GONE);
                            }
                        });
            }
        }, 5000);
    }
}
