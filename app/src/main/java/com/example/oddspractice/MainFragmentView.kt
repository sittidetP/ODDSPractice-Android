package com.example.oddspractice

import com.example.oddspractice.model.MainData

interface MainFragmentView {
    fun changeColorText()
    fun navToNextPage(data: MainData)
}