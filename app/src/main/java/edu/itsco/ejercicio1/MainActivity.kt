package edu.itsco.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var txt_digito1:EditText
    lateinit var txt_digito2:EditText
    lateinit var lbmensaje:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_digito1=findViewById(R.id.txt_digito1)
        txt_digito2=findViewById(R.id.txt_digito2)
        lbmensaje=findViewById(R.id.lbmensaje)
        val boton:Button=findViewById(R.id.btn_click)

        boton.setOnClickListener{ view ->
            var numero1:Int=txt_digito1.text.toString().toInt()
            var numero2:Int=txt_digito2.text.toString().toInt()
            if(numero1>numero2){
                lbmensaje.text="El mayor es: $numero1"
            }
            else{
                lbmensaje.text="El mayor es: $numero2"
            }
        }
    }

}