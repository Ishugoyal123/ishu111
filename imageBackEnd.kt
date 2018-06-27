package com.ankit.firstapp
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_trya.*

class trya : AppCompatActivity() {

    var clicked: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trya)

        imageView.visibility = View.INVISIBLE

        button1.setOnClickListener {
            button1.text = "Hide Image"
            imageView.visibility = View.VISIBLE

            if (clicked)
            {
                button1.text = "SHOW Image"
                imageView.visibility = View.INVISIBLE
            }

            clicked = !clicked
        }
    }
}

