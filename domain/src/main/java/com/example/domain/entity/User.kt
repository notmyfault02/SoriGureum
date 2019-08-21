package com.example.domain.entity

import com.google.gson.annotations.SerializedName

data class User(
    var id: String,
    var username: String,
    @SerializedName("avatar_url")
    var avatarUrl: String
)