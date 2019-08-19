package com.example.domain

import io.reactivex.Flowable

abstract class UseCase<T, E> {
    abstract fun createSingle(data: T): Flowable<E>
}