package com.example.sorigureum.ui.ui.base

import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity: DaggerAppCompatActivity(), BaseContract.View {

    private lateinit var presenter: BaseContract.Presenter<*>

    override fun setPresenter(presenter: BaseContract.Presenter<*>) {
        this.presenter = presenter
    }
}