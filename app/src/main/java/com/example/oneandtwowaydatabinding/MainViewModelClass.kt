package com.example.oneandtwowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModelClass: ViewModel() {

    val quoteLiveData = MutableLiveData("abcd")
    fun updateQuotes(){

        quoteLiveData.value="xyz"

    }
}