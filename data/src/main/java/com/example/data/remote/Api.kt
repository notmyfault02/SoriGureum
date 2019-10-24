package com.example.data.remote

import com.example.data.BuildConfig
import com.example.data.model.LoginData
import com.example.data.model.TrackData
import com.example.data.model.UserData
import com.google.gson.JsonObject
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*

interface Api {
    @POST("/connect")
    fun connect(
        @Body body: JsonObject
    ): Flowable<Response<LoginData?>>

    @POST("/oauth2/token")
    fun getToken(@Body body: JsonObject): Flowable<Response<Any>>

    @GET("/users/${BuildConfig.USER_ID}?client_id=${BuildConfig.CLIENT_ID}")
    fun getUser(): Single<UserData>

    @GET("/users/${BuildConfig.USER_ID}/favorites")
    fun getFavorites(@Query("client_id") clientId: String): Flowable<MutableList<TrackData>>

    @GET("/tracks/{track_id}/stream?client_id=${BuildConfig.CLIENT_ID}")
    fun getTrack(
        @Path ("track_id") trackId: Int
    ): Flowable<Response<Any>>
}
