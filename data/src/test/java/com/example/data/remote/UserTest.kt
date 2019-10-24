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
    fun connect() {
        var body = JsonObject().apply {
            addProperty("client_id", BuildConfig.CLIENT_ID)
            addProperty("redirect_uri", BuildConfig.REDIRECT_URI)
        }
        retrofitProvider.api.connect(
            body
        ).subscribe( {
            println(it.headers())
        }, {
            println("error")
            println(it.localizedMessage)
        })
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
    fun getFavorites() {
        retrofitProvider.api.getFavorites("${BuildConfig.CLIENT_ID}").subscribe( {
            println(it)
        }, {
            println("error")
            println(it.message)
        })
    }

    @Test
    fun getTrack() {
        retrofitProvider.api.getTrack(483235065).subscribe( {
            println(it)
        }, {
            println("error")
            println(it.message)
        })
    }

    @Test
    fun getToken() {
        val jsonObject = JsonObject().apply {
            addProperty("client_id", BuildConfig.CLIENT_ID)
        }


        retrofitProvider.api.getToken(jsonObject).subscribe( {

        }, {

        })
    }

    @After
    fun finish() {
        println("finish")
    }
}