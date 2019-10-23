package com.example.sorigureum.presentation.ui.user

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.data.remote.RetrofitProvider

class UserViewModel: ViewModel() {

    var userName = MutableLiveData<String>()
    var userProfile = MutableLiveData<String>()

    val retrofit = RetrofitProvider

    @SuppressLint("CheckResult")
    fun getUser() {
        retrofit.api.getUser().subscribe( {
            userName.value = it.username
            userProfile.value = it.avatar_url
        }, {
            Log.d("getUser", it.message)
        })
    }
}