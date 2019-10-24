package com.example.data.remote

import com.example.data.model.LoginData
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface Connect {
    @POST("/connect")
    fun connect(
        @Query ("client_id") clientId: String,
        @Query ("redirect_uri") redirectUri: String
    ): Flowable<Response<LoginData?>>
}