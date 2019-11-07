package com.hfad.catchat

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class FeedbackActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        val toolbar=findViewById<Toolbar>(R.id.toolbar)
//        setSupportActionBar(toolbar)
    }
}