package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
/*        val countUp: Button = findViewById(R.id.count_up)
        countUp.setOnClickListener{countUp()}*/
    }

/*    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }else{
            var temp = resultText.text.toString().toInt()

            if(temp < 6){
                temp += 1
                resultText.text = temp.toString()
            }
        }
    }*/

    private fun rollDice(){
        val randomInt = (1..6).random()

/*        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()*/

//        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }




}
