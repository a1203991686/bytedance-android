package com.littlecorgi.minidouyin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.littlecorgi.minidouyin.R
import com.littlecorgi.minidouyin.bean.douyinfeed.OngoingMovies
import com.littlecorgi.minidouyin.ijkplayer.VideoPlayerListener
import com.littlecorgi.minidouyin.ijkplayer.view.IjkVideoPlayer

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-14 17:31
 */
class OngoingMovieRvAdapter(private val context: Context, var items: ArrayList<OngoingMovies.MsBean>) : RecyclerView.Adapter<OngoingMovieRvAdapter.ViewHolder>() {

    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        public var imageView: ImageView = itemView.findViewById(R.id.iv_feed)
        public var tvAuthor: TextView = itemView.findViewById(R.id.tv_author)
        public var tvContent: TextView = itemView.findViewById(R.id.tv_context)
        public var ijkplayer: IjkVideoPlayer = itemView.findViewById(R.id.ijkPlayer)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv_feed, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvAuthor.text = items[position].aN1
        holder.tvContent.text = items[position].commonSpecial

        holder.ijkplayer.mVideoPlayerSurfaceView!!.mIjkPlayerController.setListener(VideoPlayerListener())
        holder.ijkplayer.load("http://lf1-hscdn-tos.pstatp.com/obj/developer-baas/baas/tt7217xbo2wz3cem41/a8efa55c5c22de69_1560563154288.mp4")
        holder.ijkplayer.visibility = View.VISIBLE
        holder.imageView.visibility = View.GONE
    }
}