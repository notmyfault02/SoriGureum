package com.example.sorigureum.ui.ui.user

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.data.remote.RetrofitProvider

class UserViewModel: ViewModel() {

    var userId = MutableLiveData<String>()
    var userProfile = MutableLiveData<String>()

    fun getUser() {
        RetrofitProvider.api.getUser().subscribe( {
            userId.value = it.username
            userProfile.value = it.avatar_url
        }, {
            Log.d("getUser", it.message)
        })
    }
}