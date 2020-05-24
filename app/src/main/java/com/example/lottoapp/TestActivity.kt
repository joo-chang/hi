package com.example.lottoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        button9.setOnClickListener{
            val intent = Intent(this@TestActivity, MainActivity::class.java)

            startActivity(intent)
        }

        button10.setOnClickListener{
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)

            startActivity(intent)
        }
        button11.setOnClickListener{
            val intent = Intent(this@TestActivity, NameActivity::class.java)

            startActivity(intent)
        }
        button12.setOnClickListener{
            val intent = Intent(this@TestActivity, ResultActivity::class.java)

            startActivity(intent)
        }

    }

    fun goConstellation(view: View){
        val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
        startActivity(intent)
    }

    fun callweb(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
        startActivity(intent)
    }
}
