package com.example.firstapp
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivityPizza : AppCompatActivity() {
    var pizza_size=""
    var pizza_type=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pizza)

        var order_btn=findViewById<Button>(R.id.order_btn)
        order_btn.setOnClickListener(View.OnClickListener {
            Toast.makeText (this,"you choose $pizza_size $pizza_type",Toast.LENGTH_SHORT).show()
        })
        Toast.makeText (this,"onCrete methode",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText (this,"onStart methode",Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText (this,"onResume methode",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText (this,"onPause methode",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText (this,"onStop methode",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.small_rb ->
                    if (checked) {
                        this.pizza_size = findViewById<RadioButton>(R.id.small_rb).getText().toString()
                        var img=findViewById<ImageView>(R.id.bg_img)
                        img.layoutParams.height=20
                        img.requestLayout()

                    }
                R.id.medium_rb ->
                    if (checked) {
                        this.pizza_size = findViewById<RadioButton>(R.id.medium_rb).getText().toString()
                        var img=findViewById<ImageView>(R.id.bg_img)
                        img.layoutParams.height=200
                        img.layoutParams.width=200
                        img.requestLayout()
                    }
                R.id.large_rb ->
                    if (checked) {
                        this.pizza_size = findViewById<RadioButton>(R.id.large_rb).getText().toString()
                        var img=findViewById<ImageView>(R.id.bg_img)
                        img.layoutParams.height=300
                        img.layoutParams.width=300
                        img.requestLayout()
                    }
            }
        }
    }



    fun onCheckBoxClicked(view: View) {
        if (view is CheckBox) {
            val checked = view.isChecked
            when (view.getId()) {
                R.id.onion_cb ->
                    if (checked) {
                        this.pizza_type=findViewById<CheckBox>(R.id.onion_cb).getText().toString()
                    }
                R.id.olives_cb ->
                    if (checked) {
                        this.pizza_type=findViewById<CheckBox>(R.id.olives_cb).getText().toString()
                    }
                R.id.tomatos_cb ->
                    if (checked) {
                        this.pizza_type=findViewById<CheckBox>(R.id.tomatos_cb).getText().toString()
                    }
            }
        }
    }
}