package com.example.data.remote

import com.example.data.model.LoginData
import io.reactivex.Flowable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Connect {
    @FormUrlEncoded
    @POST("/connect")
    fun connect(
        @Field("client_id") clientId: String,
        @Field("redirect_uri") redirectUri: String,
        @Field("response_type") responseType: String,
        @Field("display") display: String,
        @Field("state") state: String
    ): Flowable<LoginData>
}