package com.example.sorigureum.presentation.ui.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sorigureum.R
import com.example.sorigureum.presentation.ui.login.LoginActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startActivity<LoginActivity>()
        finish()
    }
}
