package com.example.counter09

import com.example.counter09.models.CounterModel
import com.example.counter09.presenter.Presenter

class Injector {

    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getCounterModel(): CounterModel {
            return CounterModel()
        }
    }
}