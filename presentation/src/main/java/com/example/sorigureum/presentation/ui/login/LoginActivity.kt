package com.example.sorigureum.presentation.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sorigureum.BuildConfig
import com.example.sorigureum.R
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_login_btn.onClick {
            val intent = Intent(this@LoginActivity, WebAuthActivity::class.java)

            intent.putExtra(WebAuthActivity.CONNECT_DATA, generateUrl())
            intent.putExtra(WebAuthActivity.REDIRECT_URI, BuildConfig.REDIRECT_URI)

            startActivity(intent)
        }
    }

    private fun generateUrl(): String =
        "https:www.soundcloud.com/connect?client_id=${BuildConfig.CLIENT_ID}" +
                "&redirect_uri=${BuildConfig.REDIRECT_URI}" +
                "&response_type=code&scope=non-expiring&display=popup&state=asdf"
}
