package com.training.toastlibrary

import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


public class ToasterMessage {
    public fun show(context: Context, message: String?) {
        var inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val layout: View = inflater.inflate(
            R.layout.custom_toast,
            (context as Activity)!!.findViewById(R.id.custom_toast_layout_id) as ViewGroup?
        )

        val text = layout.findViewById<View>(R.id.text) as TextView
        text.text = "Custom Library!"

        val toast = Toast(context)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.setView(layout)
        toast.show()
    }
}