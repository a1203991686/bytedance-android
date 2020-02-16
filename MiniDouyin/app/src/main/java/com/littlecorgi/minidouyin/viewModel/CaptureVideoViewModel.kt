package com.littlecorgi.minidouyin.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.littlecorgi.minidouyin.Event

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-16 09:49
 */
class CaptureVideoViewModel : ViewModel() {

    private val _startCaptureClickEvent = MutableLiveData<Event<Unit>>()
    val startCaptureClickEvent: LiveData<Event<Unit>> = _startCaptureClickEvent


}