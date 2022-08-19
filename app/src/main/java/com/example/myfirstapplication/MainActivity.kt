package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/*
 - Clase MainActivity hereda de la clase AppCompat Activity.
 - La clase tiene que tener el mismo nombre que el archivo con el que se está trabajando.
 -
*/

class MainActivity : AppCompatActivity() {

    // Palabra reservada: override, fun (function); Método onCreate, initializa la app, le damos como parámetro Bundle (la última foto que tengas de esta actividad).
    override fun onCreate(savedInstanceState: Bundle?) {
        // Super es función que está definida a nivel de principal, no de la clase.
        super.onCreate(savedInstanceState)
        // R = recursos, folder en el que se encuentra el xml, y el archivo del xml.
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.button)
        val myEditText : EditText = findViewById<EditText>(R.id.EditText1)
        val myTextView : TextView = findViewById<TextView>(R.id.textView)

        var myString : String

        myButton.setOnClickListener{
            myString = myEditText.text.toString()

            if (myString == ""){

            } else {

            }

            // myTextView.text = myString
        }
    }
}