package com.hardextech.inent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    // Declaring the variables
    private  lateinit var tvFirstName: TextView
    private  lateinit var tvLastName: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Initializing the variables
        tvFirstName=findViewById(R.id.tvFirstName)
        tvLastName=findViewById(R.id.tvLastName)


        // The getStringExtra string must be identical to the putExtra
        val firstName = intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")


       // The variable that store the actual data
        tvFirstName.text = "First Name: $firstName"
        tvLastName.text= "Last Name: $lastName"
    }
}