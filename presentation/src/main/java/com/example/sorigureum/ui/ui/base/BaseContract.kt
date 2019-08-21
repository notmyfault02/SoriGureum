package com.example.sorigureum.ui.ui.base

interface BaseContract {

    interface Presenter<T> {

    }

    interface View {
        fun setPresenter(presenter: Presenter<*>)
    }
}