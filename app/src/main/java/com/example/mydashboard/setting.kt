package com.example.mydashboard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ActionMenuView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        var TextView = findViewById<TextView>(R.id.help)
        TextView.setOnClickListener {
            val inte = Intent(this, helpme::class.java)
            startActivity(inte)
        }



        var Button=findViewById<Button>(R.id.rate)

        Button.setOnClickListener {
            val url="https://knowyourmeme.com/memes/this-isnt-even-my-final-form"
            val i=Intent(Intent.ACTION_VIEW)
            i.data=Uri.parse(url)
            startActivity(i)



        }
    }
}