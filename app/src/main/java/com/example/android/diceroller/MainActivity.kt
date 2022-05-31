package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"
        rollButton.setOnClickListener {rollDice(resultText)}
    }

    private fun rollDice(resultText: TextView) {
        val ramdomInt = (1..100).random()
        resultText.text = ramdomInt.toString()
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}