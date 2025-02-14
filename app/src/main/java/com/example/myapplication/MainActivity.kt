package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var btn1: Button? = null
        var btn2: Button? = null
        var btn3: Button? = null
        var btn5: Button? = null
        var et1: EditText?=null
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn1=findViewById(R.id.btn1)
        btn1?.setOnClickListener {
            var intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
        btn2=findViewById(R.id.btn2)
        btn2?.setOnClickListener {
            var intent=Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:93872977"))
            startActivity(intent)
        }
        btn3=findViewById(R.id.btn3)
        btn3?.setOnClickListener{
           var intent=Intent(Intent.ACTION_SEND)
            intent.setData(Uri.parse("mailTo:anguralrahul511@gmail.com"))
            intent.setType("text")
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("anguralrahul511@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT,"SEND")
            startActivity(intent)
        }

        et1=findViewById(R.id.et)
        btn5=findViewById(R.id.btn5)
        btn5?.setOnClickListener {
            var but=Intent(this,MainActivity2::class.java)
            but.putExtra("data",et1?.text.toString())
            startActivity(but)
        }
        }

    }


