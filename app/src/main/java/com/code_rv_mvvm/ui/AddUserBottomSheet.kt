package com.code_rv_mvvm.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.code_rv_mvvm.R
import com.code_rv_mvvm.databinding.AddUserBottomSheetBinding
import com.code_rv_mvvm.viewmodel.SaveUserDataSource
import com.code_rv_mvvm.viewmodel.HomeViewModel
import com.code_rv_mvvm.viewmodel.UserAddViewModelFactory
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddUserBottomSheet : BottomSheetDialogFragment() {

    private lateinit var binding: AddUserBottomSheetBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.add_user_bottom_sheet, container, false)

//        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val dataSource = SaveUserDataSource(requireContext())
        viewModel = ViewModelProvider(this, UserAddViewModelFactory(dataSource)).get(HomeViewModel::class.java)
        binding.homeViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        // Dismiss BottomSheetDialogFragment when user click on Cancel button
        binding.btnCancel.setOnClickListener {
            dismiss()
        }
    }

    companion object {
        const val TAG = "ModalBottomSheet"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
    }


}