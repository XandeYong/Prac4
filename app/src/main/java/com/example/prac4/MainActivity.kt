package com.example.prac4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.toColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.boxOne)
        val boxTwoText: TextView = findViewById(R.id.boxTwo)
        val boxThreeText = findViewById<TextView>(R.id.boxThree)
        val boxFourText = findViewById<TextView>(R.id.boxFour)
        val boxFiveText = findViewById<TextView>(R.id.boxFive)

        val mainLayout = findViewById<View>(R.id.mainLayout)


        val clickableView: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, mainLayout
            )

        for (item in clickableView) {
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {

        when(view.id) {
            R.id.boxOne -> view.setBackgroundColor(Color.BLUE)
            R.id.boxTwo -> view.setBackgroundColor(Color.GREEN)
            R.id.boxThree -> view.setBackgroundColor(Color.CYAN)
            R.id.boxFour -> view.setBackgroundColor(Color.MAGENTA)
            R.id.boxFive -> view.setBackgroundColor(Color.YELLOW)
            else -> view.setBackgroundColor(Color.GRAY)
        }
    }
}