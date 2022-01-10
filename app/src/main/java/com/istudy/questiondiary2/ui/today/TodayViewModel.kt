package com.istudy.questiondiary2.ui.today

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodayViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "2022년 1월 8일"
    }
    val text: LiveData<String> = _text
}