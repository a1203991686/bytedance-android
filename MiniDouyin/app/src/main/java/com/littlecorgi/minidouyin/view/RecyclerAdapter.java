package com.littlecorgi.minidouyin.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.littlecorgi.minidouyin.R;
import com.littlecorgi.minidouyin.VideoPlayActivity;
import com.littlecorgi.minidouyin.bean.OngoingMovies;
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerIJK;

import java.util.List;

/**
 * {MainActivity}中用于feed流展示的RecyclerView的Adapter
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-08 20-49
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context mContext;
    private List<OngoingMovies.MsBean> mMsBeans;
    private boolean isPlaying;

    public RecyclerAdapter(Context context, List<OngoingMovies.MsBean> msBeans) {
        mContext = context;
        mMsBeans = msBeans;
    }

    public void startVideo() {

    }

    public void setData(List<OngoingMovies.MsBean> msBeans) {
        if (msBeans != null) {
            mMsBeans.clear();
            mMsBeans.addAll(msBeans);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_rv_feed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(mContext).load(mMsBeans.get(position).getImg()).centerCrop().into(holder.mImageView);
        holder.mTvAuthor.setText("@" + mMsBeans.get(position).getAN1());
        holder.mTvContext.setText(mMsBeans.get(position).getCommonSpecial());

        holder.mImageView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, VideoPlayActivity.class);
            intent.putExtra("VideoUri", mMsBeans.get(position).getMovieType());
            mContext.startActivity(intent);
        });
//        holder.mIjkPlayer.setListener(new VideoPlayerListener());
//        holder.mIjkPlayer.setVideoResource(R.raw.bytedance);
//        isPlaying = true;
//        holder.mIvPause.setVisibility(View.INVISIBLE);
//        holder.mIjkPlayer.setVisibility(View.VISIBLE);
//        holder.mIjkPlayer.setOnClickListener(v -> {
//            if (isPlaying) {
//                holder.mIjkPlayer.pause();
//                isPlaying = false;
//                holder.mIvPause.setVisibility(View.VISIBLE);
//            } else {
//                holder.mIjkPlayer.start();
//                isPlaying = true;
//                holder.mIvPause.setVisibility(View.INVISIBLE);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mMsBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTvAuthor;
        public TextView mTvContext;
        public VideoPlayerIJK mIjkPlayer;
        public ImageView mIvPause;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.iv_feed);
            mTvAuthor = itemView.findViewById(R.id.tv_author);
            mTvContext = itemView.findViewById(R.id.tv_context);
            mIjkPlayer = itemView.findViewById(R.id.ijkPlayer);
            mIvPause = itemView.findViewById(R.id.btn_pause);
        }
    }
}
