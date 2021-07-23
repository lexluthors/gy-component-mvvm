package guoyuan.szkingdom.android.module_home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity_main)
        HomeFragment.getUp()
    }
}