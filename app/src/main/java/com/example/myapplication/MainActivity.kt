package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    // declaration of variables to be used later
    private lateinit var ageEditText: EditText
    private lateinit var generateButton: Button
    private lateinit var outputText: TextView
    private lateinit var clearButton: Button

    @SuppressLint("Se" + "tTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // referencing the ids for the app text in the xml file
        ageEditText = findViewById(R.id.ageEditText)
        generateButton = findViewById(R.id.generateButton)
        outputText = findViewById(R.id.resultTextView)
        clearButton = findViewById(R.id.clearButton)

        // clears the text in the result box and in the age text box
        clearButton.setOnClickListener {
            outputText.text = ""
            ageEditText.text.clear()
        }
        // finding the age using the generate button
        generateButton.setOnClickListener {
            val ageStr = ageEditText.text.toString()
            if (ageStr.isNotEmpty()) {
                val age = ageStr.toIntOrNull()
                if (age != null) {
                    val historicalFigure = getHistoricalFigure(age)
                    outputText.text = historicalFigure ?: "No historical figure found"

                    // Check if the inputted integer is greater than 100 or less than 20
                    if (age <= 20) {
                        outputText.text = "Not within range (Too small)"
                    } else if (age >= 100) {
                        outputText.text = "Not within range (Too big)"
                    }
                }
            } else {
                outputText.text = "Please enter an age"
            }
        }
    }
    // creates a module for a list of historical figures stored in the code
    private fun getHistoricalFigure(age: Int): String? { // creates a function for getting the historical figure
        val historicalFigures = mapOf( // creating a variable for a list of strings to use to get a string for an inputted number
            84 to "You are the same age as Thomas Edison",
            95 to "You are the same age as Nelson Mandela",
            27 to "You are the same age as Kurt Cobain",
            36 to "You are the same age as Bob Marley",
            63 to "You are the same age as Robin Williams",
            74 to "You are the same age as Muhammad Ali",
            52 to "You are the same age as Confucius",
            39 to "You are the same age as Martin Luther King Jr",
            71 to "You are the same age as Socrates",
            25 to "You are the same age as Tupac Shakur",
        )
        return historicalFigures[age] // returns the module
    }
}
