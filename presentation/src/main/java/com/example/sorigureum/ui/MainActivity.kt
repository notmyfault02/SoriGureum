package com.example.sorigureum.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.sorigureum.R
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_login_btn.onClick {
            Log.d("loginbtn", "hello")
        }
    }
}
