package com.code_rv_mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class HomeViewModel : ViewModel() {

    //variable that will listen to user's input
    var _userNameInput = MutableLiveData<String>()
    var _userEmailInput = MutableLiveData<String>()
    var _score = MutableLiveData<String>()
    var isChecked = MutableLiveData<Boolean>()

    private val username: LiveData<String>
        get() = _userNameInput

    private val userEmail: LiveData<String>
        get() = _userEmailInput



    fun addUser() {
        val userNames: String? = username.value
        val userEmails: String? = userEmail.value

        if (userNames == null) {
            println("Enter your Username")
            return
        } else if (userEmails == null) {
            println("Enter your email")
            return
        } else {

            println(userEmails)

        }
    }
}