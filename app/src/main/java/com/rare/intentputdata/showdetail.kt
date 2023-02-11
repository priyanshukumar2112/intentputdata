package com.rare.intentputdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class showdetail : AppCompatActivity() {

    lateinit var sdtvname : TextView
    lateinit var sdtvclass : TextView
    lateinit var sdtvabout : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showdetail)

        sdtvname = findViewById(R.id.sdtvname)
        sdtvclass = findViewById(R.id.sdtvclass)
        sdtvabout = findViewById(R.id.sdtvabout)


        intent?.let {
            val name = intent.getStringExtra("name")
            sdtvname.setText(name)
            val batch = intent.getStringExtra("batch")
            sdtvclass.setText(batch)
            val about = intent.getStringExtra("about")
            sdtvabout.setText(about)
        }
    }
    }
