package com.example.sorigureum.presentation.ui.user

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.sorigureum.R
import com.example.sorigureum.databinding.ActivityUserBinding
import com.example.sorigureum.presentation.ui.base.BaseActivity

class UserActivity : BaseActivity<ActivityUserBinding>() {

    override val layoutId: Int
        get() = R.layout.activity_user

    private val viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(UserViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = viewModel
        viewModel.getUser()
    }
}
