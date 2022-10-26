package com.example.homework3_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {


    var number1 = 0
    var number2 = 0
    var amal = 0
    var javob = 0

    var foykiritganjavob = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tugma.setOnClickListener{
           foykiritganjavob = edit.text.toString().toDouble().toInt()
            edit.text.clear()
            if (foykiritganjavob==javob){
                Toast.makeText(this,"To'g'ri",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Notto'g'ri",Toast.LENGTH_SHORT).show()
            }
            random()
        }
    }

    fun random(){
        number1 = java.util.Random().nextInt(20)
        number2 = java.util.Random().nextInt(20)

        amal = java.util.Random().nextInt(4)

        ekrangachiqar()
    }

    fun ekrangachiqar(){
        when(amal){
            0->{
                javob=number1+number2
                txt_1.text = "$number1 + $number2 = "
            }
            1->{
                javob=number1-number2
                txt_1.text = "$number1 - $number2 = "
            }
            2->{
                javob=number1*number2
                txt_1.text = "$number1 * $number2 = "
            }
            3->{
                try {
                    javob=number1/number2
                    txt_1.text = "$number1 / $number2 = "
                }catch (e:Exception){
                    random()
                }
            }
        }
    }
}