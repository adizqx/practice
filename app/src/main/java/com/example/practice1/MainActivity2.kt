package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)

        var whileResult = intent.getStringExtra("key")
        var forResult = intent.getStringExtra("text")
//        var secondValue = intent.getStringExtra("index")

        textView.text = "$whileResult"
        textView2.text = "$forResult"
    }
}