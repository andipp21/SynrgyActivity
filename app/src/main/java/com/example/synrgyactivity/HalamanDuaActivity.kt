package com.example.synrgyactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_halaman_dua.*

class HalamanDuaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)

        Log.d(HalamanDuaActivity::class.simpleName, "onCreate() dijalankan")

        button2.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(HalamanDuaActivity::class.simpleName, "onStart() dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(HalamanDuaActivity::class.simpleName, "onResume() dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(HalamanDuaActivity::class.simpleName, "onRestart dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(HalamanDuaActivity::class.simpleName, "onPause dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(HalamanDuaActivity::class.simpleName, "onStop() dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(HalamanDuaActivity::class.simpleName, "onDestroy() dijalankan")
    }
}