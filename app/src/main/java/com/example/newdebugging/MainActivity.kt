package com.example.newdebugging

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        division()
    }
    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }
}