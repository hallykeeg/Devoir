package com.example.devoir

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_custom.*
import kotlin.system.exitProcess

class Custom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)
        val paysArray = arrayListOf<String>("Algérie","Brésil","Barbade","Argentine","Venezuela","Ste-Lucie","Guinée","Sénégal")
        val capitalArray = arrayListOf<String>("Alger","Brasilia","Bridge","LeCaire", "BuenosAires","Caracas","Castries","Conakry","Dakar")
        val anneeArray = arrayListOf<Int>(1950,1250,1955,1899,1900,1963,1895,1795,1500)
        val customAdapter = CustomAdapter(this,paysArray,capitalArray ,anneeArray)
        custom_listview.adapter = customAdapter
        custom_listview.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            Toast.makeText(this, "Clic: $itemAtPos ", Toast.LENGTH_LONG).show()
        }
        exit_btn.setOnClickListener {
            finish();
            exitProcess(0);
        }

    }
}