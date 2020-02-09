package com.littlecorgi.minidouyin.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.littlecorgi.minidouyin.R;
import com.littlecorgi.minidouyin.bean.OngoingMovies;

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

    public RecyclerAdapter(Context context, List<OngoingMovies.MsBean> msBeans) {
        mContext = context;
        mMsBeans = msBeans;
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
    }

    @Override
    public int getItemCount() {
        return mMsBeans.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;
        private TextView mTvAuthor;
        private TextView mTvContext;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.iv_feed);
            mTvAuthor = itemView.findViewById(R.id.tv_author);
            mTvContext = itemView.findViewById(R.id.tv_context);
        }
    }
}
