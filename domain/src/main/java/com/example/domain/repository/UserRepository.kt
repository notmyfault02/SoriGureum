package com.example.domain.repository

import com.example.domain.entity.UserEntity
import io.reactivex.Flowable

interface UserRepository {
    fun getUser(): Flowable<UserEntity>
}