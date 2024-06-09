package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val userName = MutableLiveData<String>()

    fun changeData() {
        userName.postValue("This is Changed")
    }
}