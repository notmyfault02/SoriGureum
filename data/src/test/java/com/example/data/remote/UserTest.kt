package com.example.data.remote

import com.example.data.BuildConfig
import com.google.gson.JsonObject
import org.junit.After
import org.junit.Before
import org.junit.Test

class UserTest {
    private lateinit var retrofitProvider: RetrofitProvider
    private lateinit var json: JsonObject
    @Before
    fun initialize() {
        println("start")
        retrofitProvider = RetrofitProvider

    }

    @Test
    fun getUser() {
        retrofitProvider.api.getUser().subscribe ( {
            println(it.id)
            println(it)
            println(it.track_count)
        }, {
            print(it.message)
        }
        )
    }

    @Test
    fun connectTest() {
        retrofitProvider.connect.connect(
            "${BuildConfig.CLIENT_ID}",
            "ddd",
            "TOKEN",
            "sss",
            "sss"
        ).subscribe( {
            println("okay")
            println(it.token)
        }, {
            println("fail")
            println(it.localizedMessage)
        })
    }

    @Test
    fun getToken() {
        json = JsonObject().apply {
            addProperty("client_id", "${BuildConfig.CLIENT_ID}")
            addProperty("client_secret", "hello")
            addProperty("redirect_uri", "")
            addProperty("grant_type", "authrization_code")
            addProperty("code", "")
        }

        retrofitProvider.api.getToken(json).subscribe( {
            println(it.body())
        }, {
            println(it.localizedMessage)
        })
    }

    @Test
    fun getTrack() {
//        retrofitProvider.api.getTrack().subscribe( {
//            println(it)
//        }, {
//            println("error")
//            println(it.message)
//        })
    }

    @After
    fun finish() {
        println("finish")
    }
}