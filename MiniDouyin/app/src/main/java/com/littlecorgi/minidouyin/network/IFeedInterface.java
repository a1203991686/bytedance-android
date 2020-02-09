package com.littlecorgi.minidouyin.network;

import com.littlecorgi.minidouyin.bean.OngoingMovies;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 首页的Feed流的Retrofit借口
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-08 22:16
 */
public interface IFeedInterface {
    @GET("Showtime/LocationMovies.api?locationId=290")
    Call<OngoingMovies> getMovie();
}
