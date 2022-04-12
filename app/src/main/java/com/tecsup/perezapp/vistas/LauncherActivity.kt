package com.tecsup.perezapp.vistas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.perezapp.R
import com.tecsup.perezapp.vistas.HomeActivity


class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val actionBar = supportActionBar
        actionBar?.hide()

        Handler(Looper.getMainLooper()).
        postDelayed({

            startActivity(Intent(this, HomeActivity::class.java))
            finish()

        }, 3000)

    }

}