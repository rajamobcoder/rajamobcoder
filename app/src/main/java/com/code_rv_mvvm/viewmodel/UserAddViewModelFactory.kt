package com.code_rv_mvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class UserAddViewModelFactory(val loginDataSource: SaveUserDataSource) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(SaveUserDataSource::class.java)
            .newInstance(loginDataSource)
    }
}