package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val color = MutableLiveData<MyColors>()

    fun changeColor() {
        color.postValue(MyColors.values().random())
    }
}