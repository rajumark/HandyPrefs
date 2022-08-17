package raju.shingadiya.samplesharedpreferences

import android.content.Context
import android.view.View
import android.widget.Toast


infix fun View.click(onClick:()->Unit){
    setOnClickListener { onClick() }
}

infix fun Context.toast(message:String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}