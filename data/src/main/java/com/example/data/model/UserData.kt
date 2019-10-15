package com.example.data.model

import com.google.gson.annotations.SerializedName

data class UserData(
    val id: Int,
    val permalink: String,
    var username: String,
    val uri: String,
    val permalink_url: String,
    val avatar_url: String,
    val country: String,
    val full_name: String,
    val city: String,
    var description: String,
    @SerializedName("discogs-name")
    val discogsName: String,
    @SerializedName("myspace-name")
    val myspaceName: String,
    var website: String,
    @SerializedName("website-title")
    var websiteTitle: String,
    val online: Boolean,
    val track_count: Int,
    val playlist_count: Int,
    val followers_count: Int,
    val followings_count: Int,
    val public_favorites_count: Int
)