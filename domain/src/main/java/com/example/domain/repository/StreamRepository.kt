package com.example.domain.repository

import com.example.domain.entity.TrackEntity
import io.reactivex.Flowable

interface StreamRepository {
    fun getTrack(trackId: Int): Flowable<TrackEntity>
}