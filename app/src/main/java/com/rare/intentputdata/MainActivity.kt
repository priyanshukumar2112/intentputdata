package com.rare.intentputdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etname : EditText
    lateinit var etclass : EditText
    lateinit var etaboutyou : EditText
    lateinit var btnnext : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etname = findViewById(R.id.etname)
        etclass = findViewById(R.id.etclass)
        etaboutyou = findViewById(R.id.etaboutyou)
        btnnext = findViewById(R.id.btnnext)

        btnnext.setOnClickListener {

            if (etname.text.toString().trim().isEmpty()) {
                etname.error = "Enter your name"
            }
            else if (etclass.text.toString().trim().isEmpty()) {
                etclass.error = "Enter your class"
            }
            else if (etaboutyou.text.toString().trim().isEmpty()) {
                etaboutyou.error = "Enter somting About You"
            }
            else {
                val intent = Intent(this, showdetail::class.java)
                intent.putExtra("name",etname.text.toString())
                intent.putExtra("batch",etclass.text.toString())
                intent.putExtra("about",etaboutyou.text.toString())
                startActivity(intent)
            }
        }



    }
}