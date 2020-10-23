package id.learn.android.moviecatalogue.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import id.learn.android.moviecatalogue.ui.home.HomeActivity
import id.learn.android.moviecatalogue.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Looper.myLooper()?.let {
            Handler(it).postDelayed({
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
                finish()
            }, 4000)
        }
    }
}