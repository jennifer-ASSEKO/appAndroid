package com.example.appandroid

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    private lateinit var bouton: Button
    private lateinit var textView1 : TextView
    private lateinit var textView2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView1 = findViewById(R.id.textView2)
        textView2 = findViewById(R.id.textView3)
        val userName = intent.getStringExtra("EXTRA_NAME")
        val userPassword = intent.getStringExtra("EXTRA_PASSWORD")

        textView1.text = userName
        textView2.text = userPassword

         bouton = findViewById(R.id.buttonRetour)
         bouton.setOnClickListener {
             val firstActivity=Intent(this, MainActivity2::class.java)
             startActivity(firstActivity)
             finish()
    }


        }
}










