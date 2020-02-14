package com.littlecorgi.minidouyin.bean.douyinfeed

import com.littlecorgi.minidouyin.Result
import com.littlecorgi.minidouyin.network.IFeedInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.net.ConnectException


/**
 *
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-12 16:10zx
 */
class DefaultOngoingMovieRepository : OngoingMovieRepository {

    /**
     * 通过Retrofit去网络获取数据
     *
     * @注 此方法实现为同步获取数据，所以调用此方法时最后在子线程或者IO协程中调用!!!
     */
    override suspend fun getOngoingMovies(): Result<OngoingMovies> {
//        val client = OkHttpClient.Builder()
//                .addInterceptor { chain ->
//                    val builder: Request.Builder = chain.request().newBuilder()
//                    val cookieStrs = arrayListOf(
//                            "d_ticket=533a920eec42b14b1582285d19c36fcba5a4f",
//                            "odin_tt=09420f401c0a384552fbb23fd5eb8bdf665cd12e5a29a1710fa9a8b67d3e781fe76cedaa6d0f097bba2587fb2a9d3323",
//                            "msh=Mqm_ndhZHK4yoH6HC0OpnXr-RAg",
//                            "uid_tt=ce4fed1e8d57bc45b44283a58c5b96a2",
//                            "sid_tt=3ac8b9b949251376ad2065963ae6b30f",
//                            "sessionid=3ac8b9b949251376ad2065963ae6b30f",
//                            "sid_guard=3ac8b9b949251376ad2065963ae6b30f%7C1581503425%7C5184000%7CSun%2C+12-Apr-2020+10%3A30%3A25+GMT",
//                            "uid_tt_ss=ce4fed1e8d57bc45b44283a58c5b96a2",
//                            "sessionid_ss=3ac8b9b949251376ad2065963ae6b30f",
//                            "install_id=99237183259",
//                            "ttreq=1\$5843e5ff7b2233bf28986213659a57936472526b"
//                    )
//                    for (cookie in cookieStrs) {
//                        builder.addHeader("Cookie", "")
//                        Log.v("OkHttp", "Adding Header: $cookie")
//                    }
//                    return@addInterceptor chain.proceed(builder.build())
//                } //这部分
//                .build()
//        val retrofit = Retrofit.Builder()
//                .baseUrl("https://aweme-hl.snssdk.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
//                .build()
//        val iDouyinFeedInterface = retrofit.create(IDouyinFeedInterface::class.java)
//        val call = iDouyinFeedInterface.getDouyinFeed("${System.currentTimeMillis()}667", System.currentTimeMillis().toString())


        val retrofit = Retrofit.Builder()
                .baseUrl("https://api-m.mtime.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val iFeedInterface = retrofit.create(IFeedInterface::class.java)
        val call = iFeedInterface.getMovie()
        return try {
            val response = call.execute()
//            Log.d("OngoingMovieRepository", "getOngoingMovies ${response.body()!!.status_code}")
            Result.Success(response.body()!!)
        } catch (e: ConnectException) {
            Result.Error(e)
        } catch (e: IOException) {
            Result.Error(e)
        }
    }

}