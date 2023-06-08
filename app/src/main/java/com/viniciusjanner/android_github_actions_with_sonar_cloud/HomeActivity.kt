package com.viniciusjanner.android_github_actions_with_sonar_cloud

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1500)
        setTheme(R.style.Theme_Main)
        setContentView(R.layout.activity_home)
    }
}
