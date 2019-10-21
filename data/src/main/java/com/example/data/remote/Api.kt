package com.example.data.remote

import com.example.data.BuildConfig
import com.example.data.model.TrackData
import com.example.data.model.UserData
import com.google.gson.JsonObject
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {

    @POST("/oauth2/token")
    fun getToken(
        @Body body: JsonObject
    ): Flowable<Response<String>>

    @GET("/users/${BuildConfig.USER_ID}?client_id=${BuildConfig.CLIENT_ID}")
    fun getUser(): Flowable<UserData>

    @GET("/users/${BuildConfig.USER_ID}/favorites?client_id=${BuildConfig.CLIENT_ID}")
    fun getTrack(): Flowable<MutableList<TrackData>>
}
