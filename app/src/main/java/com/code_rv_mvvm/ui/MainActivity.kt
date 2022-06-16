package com.code_rv_mvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.code_rv_mvvm.R
import com.code_rv_mvvm.databinding.ActivityMainBinding
import com.code_rv_mvvm.viewmodel.HomeViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        binding.homeViewModel = viewModel
        // Specify the fragment view as the lifecycle owner of the binding.
        // This is used so that the binding can observe LiveData updates
        binding.lifecycleOwner = this


    }

    override fun onResume() {
        super.onResume()
        binding.addUserFloatBtn.setOnClickListener {
            val modalBottomSheet = AddUserBottomSheet()
            modalBottomSheet.show(supportFragmentManager, AddUserBottomSheet.TAG)
        }

       
    }
}