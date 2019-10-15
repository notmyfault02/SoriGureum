package com.example.data.remote

import com.example.data.BuildConfig
import com.example.data.model.TrackData
import com.example.data.model.UserData
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.GET

interface Api {

    @GET("/oauth2/token")
    fun getToken(@Field("access_token") access_token: String): Flowable<Response<String>>

    @GET("/users/${BuildConfig.USER_ID}?client_id=${BuildConfig.CLIENT_ID}")
    fun getUser(): Flowable<UserData>

    @GET("/tracks/{trackId}?client_id=${BuildConfig.CLIENT_ID}")
    fun getTrack(): Flowable<TrackData>
}
