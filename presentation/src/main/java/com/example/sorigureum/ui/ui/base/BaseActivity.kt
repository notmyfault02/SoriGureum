package com.example.sorigureum.ui.ui.base

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity(), BaseContract.View {

    private lateinit var presenter: BaseContract.Presenter<*>

    override fun setPresenter(presenter: BaseContract.Presenter<*>) {
        this.presenter = presenter
    }
}