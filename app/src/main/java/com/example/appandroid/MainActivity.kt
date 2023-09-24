package com.example.appandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


    class MainActivity : AppCompatActivity() {
        private lateinit var button2: Button
        private lateinit var button: Button
        private lateinit var editText :EditText
        private lateinit var edPass : EditText

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Log.v("$", "lala")
            button = findViewById(R.id.button1)
            button2 = findViewById(R.id.button2)


            button2.setOnClickListener{

                Toast.makeText(this, "quitter l'application", Toast.LENGTH_SHORT).show()
            }



            button.setOnClickListener {
                 editText = findViewById(R.id.simpleEditText)
                 edPass = findViewById(R.id.mot_de_passe)

            startActivity(Intent(this, MainActivity2::class.java)
                .putExtra("EXTRA_NAME",  editText.text.toString())
                .putExtra("EXTRA_PASSWORD", edPass.text.toString())
            )
        }

    }






    }







