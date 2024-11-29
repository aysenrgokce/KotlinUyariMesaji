package com.aysenurgokce.kotlinuyarmesaj

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)Toast 2)AlertDialog 3)Snackbar
        //Context
        //Activity Context -> this
        //Application Context -> applicationContext
        /*lambda
        val button = findViewById<Button>(R.id.uyarıButton)

        button.setOnClickListener{
            println("button clicked")
        }

        //interface
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
            }
        })*/


        Toast.makeText(this,"helloo",Toast.LENGTH_LONG).show()
    }
    fun uyarıButton(view: View){
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Title")
        alert.setMessage("message")
        alert.setPositiveButton("Yes", object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {//buradaki dialog-> dialoğun kendisini veriyor ,which->hangi butona tıkladığımızı veriyor
                // yes butonuna tıkladığımda ne olacak
                Toast.makeText(this@MainActivity,"Kaydet!",Toast.LENGTH_LONG).show()
            }
        })
        alert.setNegativeButton("No"){dialog , which ->

        }
        alert.show()

    }
}