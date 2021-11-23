package com.example.practice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var button2: Button
    val array = arrayListOf("A","B","C","D","E")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.et1)
        button = findViewById(R.id.btn1)
        button2 = findViewById(R.id.btn2)

        button.setOnClickListener{
            val text = editText.text.toString()
            val result = getValueUsingWhile(text)
            if (result == null) Toast.makeText(this, "NULL", Toast.LENGTH_SHORT).show()
            else {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("key",result)
            startActivity(intent)
            }
        }

        button2.setOnClickListener{
            val text = editText.text.toString()
            getValueUsingFor(text)
        }

    }
    fun getValueUsingWhile(text: String):String? {
        var index = 0
        while (index < array.size) {
            if (text == array[index]) {
                return "$text : $index"
            }
            ++index
        }
        return null
    }
    fun getValueUsingFor (text: String){
        for ((index,element) in array.withIndex()) {
            if (text == element) {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("text", "$element : $index")
                startActivity(intent)
            } else if (text.isNullOrEmpty()) Toast.makeText(this, "NULL", Toast.LENGTH_SHORT).show()
            }
        }
    }

