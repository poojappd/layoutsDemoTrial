package com.example.layoutsdemotrial

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        listView = findViewById(R.id.ListViewId)
        val arrayValues = resources.getStringArray(R.array.listViewValues)
        val arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, arrayValues )
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Log.e(TAG, "Clicked item $view $position $parent $id")
        }
        listView.adapter = arrayAdapter

    }

}