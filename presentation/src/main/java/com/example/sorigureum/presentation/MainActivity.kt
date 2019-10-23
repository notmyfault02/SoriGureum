package com.example.sorigureum.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.sorigureum.R
import com.example.sorigureum.presentation.ui.user.UserActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_login_btn.onClick {
            Log.d("loginbtn", "hello")
            startActivity<UserActivity>()
        }
    }
}
