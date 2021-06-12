package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name=intent.getStringExtra("name")
        val birthdayGreetingActivity = findViewById<TextView>(R.id.birthdayGreetings)
        birthdayGreetingActivity.text="Happy birthday\n$name!"

    }
}