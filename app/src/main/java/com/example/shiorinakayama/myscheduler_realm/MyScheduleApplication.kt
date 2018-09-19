package com.example.shiorinakayama.myscheduler_realm

import android.app.Application
import io.realm.Realm

class MyScheduleApplication : Application(){
    override fun onCreate(){
        super.onCreate()
        Realm.init(this)
    }


}