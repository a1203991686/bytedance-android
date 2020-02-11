package com.littlecorgi.minidouyin.view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.littlecorgi.minidouyin.R
import com.littlecorgi.minidouyin.VideoPlayActivity
import com.littlecorgi.minidouyin.bean.OngoingMovies.MsBean
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerIJK

/**
 * {MainActivity}中用于feed流展示的RecyclerView的Adapter
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-08 20-49
 */
class RecyclerAdapter(private val mContext: Context, private var mMsBeans: ArrayList<MsBean>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val isPlaying = false
    fun startVideo() {}
    fun setData(msBeans: List<MsBean>) {
        if (msBeans != null) {
            mMsBeans.clear()
            mMsBeans.addAll(msBeans)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.item_rv_feed, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(mContext).load(mMsBeans[position].img).centerCrop().into(holder.mImageView)
        holder.mTvAuthor.text = "@" + mMsBeans[position].aN1
        holder.mTvContext.text = mMsBeans[position].commonSpecial
        holder.mImageView.setOnClickListener {
            val intent = Intent(mContext, VideoPlayActivity::class.java)
            intent.putExtra("VideoUri", mMsBeans[position].movieType)
            mContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return mMsBeans.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mImageView: ImageView
        var mTvAuthor: TextView
        var mTvContext: TextView
        var mIjkPlayer: VideoPlayerIJK
        var mIvPause: ImageView

        init {
            mImageView = itemView.findViewById(R.id.iv_feed)
            mTvAuthor = itemView.findViewById(R.id.tv_author)
            mTvContext = itemView.findViewById(R.id.tv_context)
            mIjkPlayer = itemView.findViewById(R.id.ijkPlayer)
            mIvPause = itemView.findViewById(R.id.btn_pause)
        }
    }

}