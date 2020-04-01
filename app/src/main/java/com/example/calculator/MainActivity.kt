package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var number1 : Int = 0
    private var number2 : Int = 0
    private var resultNumb : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMultiplication.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (txtNumber1.text.isEmpty()){
            txtNumber1.error = "Field Cannot Blank"
        }
        else if (txtNumber2.text.isEmpty()){
            txtNumber2.error = "Field Cannot Blank"
        }
        else{
            number1 = txtNumber1.text.toString().toInt()
            number2 = txtNumber2.text.toString().toInt()
            when (v.id) {

                R.id.btnMultiplication -> {
                    resultNumb = Multiplication(number1, number2)
                    txtResult.setText(resultNumb.toString())
                }

            }
        }
    }
    private fun Multiplication(number1: Int, number2: Int) : Int {
        return number1 * number2
    }
    private fun additional(number1: Int, number2: Int) : Int {
        return number1 + number2
    }
}
