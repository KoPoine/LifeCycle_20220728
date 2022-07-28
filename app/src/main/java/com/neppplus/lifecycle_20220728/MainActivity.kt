package com.neppplus.lifecycle_20220728

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Main액티비티", "onCreate")

        val goBtn = this.findViewById<Button>(R.id.goBtn)

        goBtn.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main액티비티", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main액티비티", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main액티비티", "onDestroy")
    }
}