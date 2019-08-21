package com.example.domain.repository

import io.reactivex.Flowable
import retrofit2.Response
import java.util.*

interface AccountRepository {
    fun login(email: String, password: String): Flowable<Response<HashMap<String, String>>>
}