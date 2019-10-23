package com.example.data.remote

import com.example.data.BuildConfig
import com.example.data.model.TrackData
import com.example.data.model.UserData
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("/users/${BuildConfig.USER_ID}?client_id=${BuildConfig.CLIENT_ID}")
    fun getUser(): Single<UserData>

    @GET("/users/${BuildConfig.USER_ID}/favorites?client_id=${BuildConfig.CLIENT_ID}")
    fun getFavorites(): Flowable<MutableList<TrackData>>

    @GET("/tracks/{track_id}/stream?client_id=${BuildConfig.CLIENT_ID}}")
    fun getTrack(@Path ("track_id") trackId: Int): Flowable<Response<Any>>
}
