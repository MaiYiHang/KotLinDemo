package com.example.core

import android.app.Application
import android.content.Context

class BaseApplication:Application() {
    //静态对象以及函数的第三种声明方式
    companion object{

        private lateinit var currentApplication:Context

        @JvmStatic
        fun currentApplication():Context{
            return currentApplication
        }
    }

    override fun onCreate() {
        super.onCreate()
        currentApplication = this
    }
}