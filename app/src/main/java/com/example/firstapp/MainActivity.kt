package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var xVal = findViewById<EditText>(R.id.x_value_ed);
        var yVal = findViewById<EditText>(R.id.y_value_ed)
        var addOperation = findViewById<Button>(R.id.add_btn)
        var sousOperation = findViewById<Button>(R.id.sous_btn)
        var multOperation = findViewById<Button>(R.id.mult_btn)
        var divOperation = findViewById<Button>(R.id.div_btn)
        var result = findViewById<TextView>(R.id.result_tv)
        addOperation.setOnClickListener(View.OnClickListener {
            var x = xVal.text.toString().toInt()
            var y = yVal.text.toString().toInt()
            var z=sum_a(x,y)
            result.text=z.toString()
        })
        sousOperation.setOnClickListener(View.OnClickListener {
            var x = xVal.text.toString().toInt()
            var y = yVal.text.toString().toInt()
            var z= x-y
            result.text=z.toString()
        })
        multOperation.setOnClickListener(View.OnClickListener {
            var x = xVal.text.toString().toInt()
            var y = yVal.text.toString().toInt()
            var z= x*y
            result.text=z.toString()
        })
        sousOperation.setOnClickListener(View.OnClickListener {
            var x = xVal.text.toString().toInt()
            var y = yVal.text.toString().toInt()
            var z= x-y
            result.text=z.toString()
        })
        divOperation.setOnClickListener(View.OnClickListener {
            var x = xVal.text.toString().toDouble()
            var y = yVal.text.toString().toDouble()
            if(x==0.0)
                result.text="dévision sur zero impossible"
            else{
                var z:Double= x/y
                result.text=z.toString()
            }


        })


    }
    fun sum_a(x:Int,y:Int):Int{
        return x+y
    }
}