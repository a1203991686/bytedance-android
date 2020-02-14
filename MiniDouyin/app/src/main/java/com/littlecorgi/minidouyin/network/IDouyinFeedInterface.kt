package com.littlecorgi.minidouyin.network

import com.littlecorgi.minidouyin.bean.douyinfeed.DouyinFeedBean
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-13 19:23
 */
interface IDouyinFeedInterface {
    @GET("aweme/v1/feed/?type=0&max_cursor=0&min_cursor=0&count=6&volume=0.06666666666666667&pull_type=0&need_relieve_aweme=0&filter_warn=0&req_from=enter_auto&is_cold_start=1&longitude=116.321904&latitude=39.968061&address_book_access=2&gps_access=1&cached_item_num=0&last_ad_show_interval=-1&mac_address=DC%3AEF%3ACA%3A5A%3A41%3A53&discard_cids=1658210583927864")
    fun getDouyinFeed(@Query("_rticket") _rticket: String, @Query("ts") ts:String): retrofit2.Call<DouyinFeedBean>
}