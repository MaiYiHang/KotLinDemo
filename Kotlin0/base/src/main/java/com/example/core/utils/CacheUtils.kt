package com.example.core.utils

import android.content.Context
import android.content.SharedPreferences
import com.example.core.BaseApplication
import com.example.core.R


//Object首先定义一个类，然后自动创建一个该类的单例对象,
// 然后调用该类的函数以及字段时，都是通过该单例对象进行调用
object CacheUtils {
    private val context:Context = BaseApplication.currentApplication()

    private val SP:SharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name),Context.MODE_PRIVATE)

    fun save(key:String,value:String): Unit {
        SP.edit().putString(key,value).apply()
    }

    fun get(key: String?): String? {
        return SP.getString(key,null)
    }
}