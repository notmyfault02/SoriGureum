package com.example.data.remote

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {
    private const val API_BASE_URL = "https://api.soundcloud.com"
    private const val API_V2 = "https://api-v2.soundcloud.com"
    private const val CONNECT_URL = "https://soundcloud.com"
    var api: Api
    var apiV2: ApiVersion2
    var connect: Connect

    val gson = GsonBuilder().setLenient().create()

    init {
        val retrofit = initRetrofit()
        api = retrofit.create(Api::class.java)
        apiV2 = retrofit.create(ApiVersion2::class.java)
        connect = retrofit.create(Connect::class.java)
    }

    fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    }

    fun initConnector(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

}