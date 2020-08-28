package com.example.devoir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pays = listOf("Haiti","Bolivie", "Colombie","Jamaique", "Ste Lucie","Guadeloupe","Barbade","Guyane")
        listview.adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1,pays)
        next_btn.setOnClickListener {
            val intent = Intent(this, Custom::class.java)
            startActivity(intent)
            finish()
        }
        listview.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            Toast.makeText(this, "Clic: $itemAtPos ", Toast.LENGTH_LONG).show()
        }
    }
}