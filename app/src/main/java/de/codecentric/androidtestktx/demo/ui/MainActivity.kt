package de.codecentric.androidtestktx.demo.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.codecentric.androidtestktx.demo.R
import kotlinx.android.synthetic.main.activity_main.activityMainBtnOpenScroll as openScrollBtn

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    openScrollBtn.setOnClickListener {
      startActivity(Intent(this, DemoScrollableActivity::class.java))
    }
  }
}
