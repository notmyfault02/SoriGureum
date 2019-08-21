package com.example.domain.usecase

import com.example.domain.base.UseCase
import com.example.domain.repository.AccountRepository
import io.reactivex.Flowable
import retrofit2.Response
import java.util.*

class LoginUseCase(private val accountRepository: AccountRepository):
    UseCase<LoginUseCase.Params, Response<HashMap<String, String>>>() {

    override fun createSingle(data: Params): Flowable<Response<HashMap<String, String>>>
        = accountRepository.login(data.email, data.password)


    fun login(params: Params) = createSingle(params)

    data class Params(
        val email: String,
        val password: String
    )
}