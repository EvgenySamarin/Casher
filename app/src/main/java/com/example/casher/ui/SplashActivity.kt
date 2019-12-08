package com.example.casher.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * To show project preview logo, while app set basic parameters and load the dependencies
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}
