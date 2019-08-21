package com.example.data.remote.entity

import com.google.gson.annotations.SerializedName

data class UserData(
    var id: String,
    var username: String,
    @SerializedName("avatar_url")
    var avatarUrl: String
)