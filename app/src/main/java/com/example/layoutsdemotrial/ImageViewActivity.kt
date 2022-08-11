package com.example.layoutsdemotrial

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class ImageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)
    }

    override fun onResume() {
        super.onResume()
        val im = findViewById<ImageView>(R.id.imgv1)
        im.setImageResource(R.drawable.ic_launcher_background)


    }
    fun boc(view:View){
        Log.e(TAG,"CLICKED")
    }
}