package com.example.mydashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {


    lateinit var ImageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        ImageView = findViewById<ImageView>(R.id.profile)
        ImageView.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)

        }


        val TextView= findViewById<TextView>(R.id.exitbt)
        TextView.setOnClickListener{
            moveTaskToBack(true)
            android.os.Process.killProcess(android.os.Process.myPid())
            exitProcess(1)
        }

        ImageView= findViewById<ImageView>(R.id.setting)
        ImageView.setOnClickListener {
            val intent=Intent(this,setting::class.java)
            startActivity(intent)
        }





        val setting=findViewById(R.id.funpalce)  as ImageView

        setting.setOnClickListener {
            Toast.makeText(this@MainActivity, "You will be redirected to the fun place", Toast.LENGTH_SHORT).show()
        }




    }

}