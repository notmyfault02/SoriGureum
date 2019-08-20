package com.example.data.remote

import com.example.data.entity.UserData
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Path

interface API {
    @GET("/oauth2/token")
    fun getToken(
        @Field("access_token") access_token: String
    ): Flowable<Response<String>>

    @GET("/{users}")
    fun getUser(@Path ("users") users: String): Flowable<Response<UserData>>
}
