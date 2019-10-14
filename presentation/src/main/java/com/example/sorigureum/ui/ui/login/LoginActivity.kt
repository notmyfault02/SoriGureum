package com.example.sorigureum.ui.ui.login

import android.os.Bundle
import com.example.sorigureum.R
import com.example.sorigureum.ui.ui.base.BaseActivity

class LoginActivity: BaseActivity(), LoginContract.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
