package ru.samitin.demoapp

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

@Suppress("UNREACHABLE_CODE")
class Fragment() : Fragment()   {

   interface OnClickButton{
       fun onClick(id:Int){

       }
   }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView=inflater.inflate(R.layout.fragment,container,false)

        val btn1=rootView.findViewById<Button>(R.id.button1)
        val btn2=rootView.findViewById<Button>(R.id.button2)
        val btn3=rootView.findViewById<Button>(R.id.button3)
        val btn4=rootView.findViewById<Button>(R.id.button4)
        val btn5=rootView.findViewById<Button>(R.id.button5)
        val click=activity as OnClickButton
        btn1.setOnClickListener {
            click.onClick(btn1.id)
        }
        btn2.setOnClickListener{
            click.onClick(btn2.id)
        }
        btn3.setOnClickListener{
            click.onClick(btn2.id)
        }
        btn4.setOnClickListener{
            click.onClick(btn2.id)
        }
        btn5.setOnClickListener{
            click.onClick(btn2.id)
        }
        return rootView
    }


    }


