package com.example.constrantlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view : View) {
        val box_three_text : TextView = findViewById(R.id.box_three_text)
        val box_four_text : TextView = findViewById(R.id.box_four_text)
        val box_five_text : TextView = findViewById(R.id.box_five_text)
        when(view.id) {

            //Boxes using Color class colors the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.bgr)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text ->view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            //Button
            R.id.button ->box_three_text.setBackgroundResource(R.color.my_red)
            R.id.button2 -> box_four_text.setBackgroundResource(R.color.my_green)
            R.id.button3 -> box_five_text.setBackgroundResource(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val redButton = findViewById<Button>(R.id.button)
        val greenButton = findViewById<Button>(R.id.button2)
        val yellowButton = findViewById<Button>(R.id.button3)

        val rootConstraintlayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintlayout, redButton, greenButton, yellowButton)
        for(item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }
    }

}