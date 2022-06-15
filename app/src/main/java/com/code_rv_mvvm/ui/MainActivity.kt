package com.code_rv_mvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.code_rv_mvvm.R
import com.code_rv_mvvm.databinding.ActivityMainBinding
import com.code_rv_mvvm.viewmodel.SaveUserDataSource
import com.code_rv_mvvm.viewmodel.HomeViewModel
import com.code_rv_mvvm.viewmodel.UserAddViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //  viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        val dataSource = SaveUserDataSource(applicationContext)
        viewModel = ViewModelProvider(this, UserAddViewModelFactory(dataSource)).get(HomeViewModel::class.java)
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

        viewModel.loginSuccess.observe(this, Observer {
            println("Data is Saved successfully $it")
        })

        viewModel.loginFailedMessage.observe(this, Observer {
            //showToast(applicationContext, it)
            println("Data is not Saved $it")
        })
    }
}