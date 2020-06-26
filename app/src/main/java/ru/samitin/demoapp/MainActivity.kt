package ru.samitin.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Toast

class MainActivity() : AppCompatActivity(),Fragment.OnClickButton {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onClick(id: Int) {
        super.onClick(id)
        Toast.makeText(this,"$id",Toast.LENGTH_SHORT).show()
        val frag2=Fragment2()
       supportFragmentManager.beginTransaction()
       .replace(R.id.fragment,frag2)
       .addToBackStack(frag2.tag).commit()

    }
}