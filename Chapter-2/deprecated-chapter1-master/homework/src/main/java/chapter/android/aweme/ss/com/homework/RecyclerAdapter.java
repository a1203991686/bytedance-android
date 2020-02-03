package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import chapter.android.aweme.ss.com.homework.model.Tips;
import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

/**
 * @Description
 * @author: Tian Weikang
 * @email: tianweikang.corgi@bytedance.com
 * @date: 2020-02-03 17-29
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<Tips> mTipsArrayList;
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;

    public RecyclerAdapter(Context context, ArrayList<Tips> tips) {
        mContext = context;
        mTipsArrayList = tips;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.im_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        viewHolder.mTitle.setText(mTipsArrayList.get(i).getTitle());
        viewHolder.mDescription.setText(mTipsArrayList.get(i).getDescription());
        // item click
        if (mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnItemClickListener.onItemClick(viewHolder.itemView, i);
                }
            });
        }

        // item long click
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mOnItemClickListener.onItemLongClick(viewHolder.itemView, i);
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTipsArrayList.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public CircleImageView mCircleImageView;
        public TextView mTitle;
        public TextView mDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mCircleImageView = itemView.findViewById(R.id.rv_list);
            mTitle = itemView.findViewById(R.id.tv_title);
            mDescription = itemView.findViewById(R.id.tv_description);
        }
    }
}
