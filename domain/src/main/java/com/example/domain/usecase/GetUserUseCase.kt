package com.example.domain.usecase

import com.example.domain.base.UseCase
import com.example.domain.entity.UserEntity
import com.example.domain.repository.UserRepository
import io.reactivex.Flowable

class GetUserUseCase(private val userRepository: UserRepository):
    UseCase<Unit, UserEntity>(){

    override fun createSingle(data: Unit): Flowable<UserEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getUser() = createSingle(data = Unit)
}