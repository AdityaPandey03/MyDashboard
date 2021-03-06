package com.example.mydashboard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ActionMenuView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class setting : AppCompatActivity() {

    lateinit var TextView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        TextView = findViewById<TextView>(R.id.help)
        TextView.setOnClickListener {
            val inte = Intent(this, helpme::class.java)
            startActivity(inte)
        }

        TextView = findViewById<TextView>(R.id.invite)
        TextView.setOnClickListener {
            val ie = Intent(this, invite::class.java)
            startActivity(ie)
        }



        TextView=findViewById<TextView>(R.id.rate)
        TextView.setOnClickListener {
            val url="https://knowyourmeme.com/memes/this-isnt-even-my-final-form"
            val i=Intent(Intent.ACTION_VIEW)
            i.data=Uri.parse(url)
            startActivity(i)



        }

        TextView=findViewById<TextView>(R.id.about)
        TextView.setOnClickListener {
            val inten=Intent(this,aboutus::class.java)
            startActivity(inten)
        }
    }
}