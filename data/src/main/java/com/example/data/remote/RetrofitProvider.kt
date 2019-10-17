package com.example.data.remote

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {
    private const val API_BASE_URL = "http://api.soundcloud.com"
    private const val CONNECT_URL = "https://soundcloud.com"
    var api: Api
    var connect: Connect

    init {
        val retrofit = initRetrofit()
        api = retrofit.create(Api::class.java)
        connect = retrofit.create(Connect::class.java)
    }

    fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
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