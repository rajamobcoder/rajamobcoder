package com.code_rv_mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.code_rv_mvvm.model.User

class HomeViewModel(private val loginDataSource: SaveUserDataSource) : ViewModel() {

    //variable that will listen to user's input
    private var _userNameInput = MutableLiveData<String>()
    private var _userEmailInput = MutableLiveData<String>()

    val loginSuccess = MutableLiveData<Boolean>()
    val loginFailedMessage = MutableLiveData<String?>()


    val username: LiveData<String>
        get() = _userNameInput

     val userEmail: LiveData<String>
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
            val users = User(userNames, userEmails)
            println(users)

        }
    }


    fun saveUserData(name: String, email: String) {
        loginDataSource.save(name, email, object : SaveUserDataSource.SaveDataCallBack {
            override fun onSuccess() {
                loginSuccess.postValue(true)
            }

            override fun onError(message: String?) {

                loginFailedMessage.postValue(message)
            }
        })
    }

}