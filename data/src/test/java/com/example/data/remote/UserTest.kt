package com.example.data.remote

import org.junit.After
import org.junit.Before
import org.junit.Test

class UserTest {
    private lateinit var retrofitProvider: RetrofitProvider
    @Before
    fun initialize() {
        println("start")
        retrofitProvider = RetrofitProvider
    }

    @Test
    fun getUser() {
        retrofitProvider.api.getUser().subscribe ( {
            println(it.id)
            println(it.track_count)
        }, {
            print(it.message)
        }
        )
    }

    @After
    fun finish() {
        println("finish")
    }
}