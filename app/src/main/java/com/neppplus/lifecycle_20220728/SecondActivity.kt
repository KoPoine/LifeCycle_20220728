package com.neppplus.lifecycle_20220728

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("두 번째 액티비티", "onCreate")

        val backBtn = this.findViewById<Button>(R.id.backBtn)

        backBtn.setOnClickListener {
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("두 번째 액티비티", "onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("두 번째 액티비티", "onPause")
    }
}