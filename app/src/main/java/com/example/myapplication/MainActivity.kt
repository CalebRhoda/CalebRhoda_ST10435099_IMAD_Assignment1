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
    private lateinit var resultTextView: TextView
    private lateinit var clearButton: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // referencing the ids for the app text in the xml file
        ageEditText = findViewById(R.id.ageEditText)
        generateButton = findViewById(R.id.generateButton)
        resultTextView = findViewById(R.id.resultTextView)
        clearButton = findViewById(R.id.clearButton)

        // clears the text in the result box and in the age text box
        clearButton.setOnClickListener {
            resultTextView.text = ""
            ageEditText.text.clear()
        }
        // finding the age using the generate button
        generateButton.setOnClickListener {// the generate button waits to be clicked to run the following statements
            val age = ageEditText.text.toString().toIntOrNull()
            if (age != null) { // checks if there is a valid integer in the age text box
                val historicalFigure = getHistoricalFigure(age) // creates variable for the historical figure
                resultTextView.text = historicalFigure ?: "No historical figure found" // if the selected integer doesn't exist in the list
            } else {
                resultTextView.text = "Please enter a valid age" // no valid integer found
            }
            // checks if the inputted integer is greater than 100 or less than 20
            if (age!! <= 20) {
                val historicalFigure = getHistoricalFigure(age)
                resultTextView.text = historicalFigure ?: "Not within range (Too small)"
            } else {
                if (age >= 100) {
                    val historicalFigure = getHistoricalFigure(age)
                    resultTextView.text = historicalFigure ?: "Not within range (Too big)"
                }
            }
        }
    }
    // creating a private function for a list of historical figures stored in the code
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
        return historicalFigures[age] // runs the function
    }
}
