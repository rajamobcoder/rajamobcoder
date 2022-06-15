package com.code_rv_mvvm.viewmodel

import android.content.Context

class SaveUserDataSource(private val context: Context) {

    interface SaveDataCallBack {
        fun onSuccess();
        fun onError(message: String?)
    }

    fun save(name: String, email: String, loginCallBack: SaveDataCallBack) {
        loginCallBack.onSuccess()
    }

}