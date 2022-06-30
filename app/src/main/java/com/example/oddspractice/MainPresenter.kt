package com.example.oddspractice

import com.example.oddspractice.model.MainData

class MainPresenter {
    lateinit var view: MainFragmentView
    var data = MainData("")

    fun attachView(view: MainFragmentView) {
        this.view = view
    }

    fun validateName(text: String) {
        if(text == "TaTar"){
            data = MainData(text)
            view.navToNextPage(data)
        }else{
            view.changeColorText()
        }
    }
}