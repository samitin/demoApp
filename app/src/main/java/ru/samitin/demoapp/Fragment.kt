package ru.samitin.demoapp

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

@Suppress("UNREACHABLE_CODE")
class Fragment() : Fragment() ,View.OnClickListener  {

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
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        return rootView
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
        val intent = Intent(activity, Activity2::class.java)
        startActivity(intent)
        /*val click = (activity as OnClickButton).also {
            it.onClick(v!!.id)
        }*/
    }
    }


