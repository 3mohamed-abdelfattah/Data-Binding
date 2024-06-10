package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val color = MutableLiveData<MyColors>()
    val loading = MutableLiveData<Boolean>(true)


    fun changeColor() {
        color.postValue(MyColors.entries.random())
    }

    fun stopLoading() {
        loading.postValue(false)
    }

    fun combinedFunction() {
        changeColor()
        stopLoading()
    }

}