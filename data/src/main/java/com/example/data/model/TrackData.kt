package com.example.data.model

import com.google.gson.annotations.SerializedName

data class TrackData(
    val id: Int,
    val created_at: String,
    val user_id: Int,
    val user: UserData,
    var title: String,
    val permalink: String,
    val permalink_url: String,
    val uri: String,
    var sharing: String,
    var embeddable_by: String,
    var purchase_url: String,
    val artwork_url: String,
    var description: String,
    val label: UserData,
    var genre: String,
    var tag_list: List<String>,
    var label_id: Int,
    var label_name: String,
    var release_day: Int,
    var release_month: Int,
    var release_year: Int,
    var streamable: Boolean,
    var downloadable: Boolean,
    val state: String,
    var license: String,
    var track_type: String,
    val waveform_url: String,
    val download_url: String,
    val stream_url: String,
    var video_url: String,
    var bpm: Int,
    var commentable: Boolean,
    var isrc: String,
    @SerializedName("key-signature")
    var keySignature: String,
    val comment_count: Int,
    val download_count: Int,
    val playback_count: Int,
    val favoritings_count: Int,
    val original_format: String,
    val original_content_size: Int,
    val user_favorite: Boolean
) {

}