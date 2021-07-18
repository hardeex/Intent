package com.hardextech.inent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    // assigning variables
    private lateinit var evFirstName: EditText
    private lateinit var evLastName: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Declaring the variables
        evFirstName = findViewById(R.id.evfirstName)
        evLastName = findViewById(R.id.evlastName)
        button = findViewById(R.id.button)


        //button.isEnabled = !(evFirstName.text.isEmpty() || evLastName.text.isEmpty())


        // Enabling the SUBMIT button
        button.setOnClickListener {

            if (evFirstName.text.isEmpty()) evFirstName.error =
                "First Name can not be left empty" else if (evLastName.text.isEmpty()) evLastName.error =
                "Last Name must be fill"

            // A when statement can be used in place of the if statement

            else {

                // One way of transferring the data from one activity to another is:
                intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("firstName", evFirstName.text.toString())
                intent.putExtra("lastName", evLastName.text.toString())
                startActivity(intent)

                /*
                Another method of code and will liberate same result is given below

                startActivity(Intent(this, SecondActivity::class.java)
                    .putExtra("firstName", evFirstName.text.toString())
                    .putExtra("lastName", evLastName.text.toString()))
                 */
            }


        }


    }

}