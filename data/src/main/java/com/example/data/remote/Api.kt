package com.example.data.remote

import com.example.domain.BuildConfig
import com.example.domain.entity.User
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.GET

interface Api {

    @GET("/oauth2/token")
    fun getToken(@Field("access_token") access_token: String): Flowable<Response<String>>

    @GET("/users/${BuildConfig.USER_ID}?client_id=${BuildConfig.CLIENT_ID}")
    fun getUser(): Single<User>
}
