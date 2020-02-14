package com.littlecorgi.minidouyin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.littlecorgi.minidouyin.bean.douyinfeed.DefaultOngoingMovieRepository
import com.littlecorgi.minidouyin.bean.publishvideo.DefaultPublishVideoRepository
import com.littlecorgi.minidouyin.viewModel.MainActivityViewModel
import com.littlecorgi.minidouyin.viewModel.PublishVideoViewModel

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-13 15:48
 */
class ViewModelFactory : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(
                    ongoingMovieRepository = DefaultOngoingMovieRepository()
            ) as T
        } else if (modelClass.isAssignableFrom(PublishVideoViewModel::class.java)) {
            return PublishVideoViewModel(
                    publishVideoRepository = DefaultPublishVideoRepository()
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}