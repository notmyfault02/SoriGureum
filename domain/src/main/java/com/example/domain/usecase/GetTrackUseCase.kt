package com.example.domain.usecase

import com.example.domain.base.UseCase
import com.example.domain.entity.TrackEntity
import com.example.domain.repository.StreamRepository
import io.reactivex.Flowable

class GetTrackUseCase(private val streamRepository: StreamRepository):
    UseCase<Int, TrackEntity>() {

    override fun createSingle(data: Int): Flowable<TrackEntity>
        =streamRepository.getTrack(data)


    fun getTrack(trackId: Int) = createSingle(trackId)
}