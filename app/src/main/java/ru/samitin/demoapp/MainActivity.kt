package ru.samitin.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(),Fragment.OnClickButton {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onClick(id: Int) {
        super.onClick(id)
        Toast.makeText(this,"dfgg",Toast.LENGTH_SHORT).show()
       // val intent = Intent(this, Activity2::class.java)
        //startActivity(intent)
        /*
        when (id){
        R.id.button1,
        R.id.button2,
        R.id.button3,
        R.id.button4 ,
        R.id.button5->startActivity(intent)
        }*/
    }
}