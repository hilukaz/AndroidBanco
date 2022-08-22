package com.example.bancodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val N:EditText=findViewById(R.id.Nome)//setando variáveis
        val E:EditText=findViewById(R.id.Ende)
        val B:EditText=findViewById(R.id.Bair)
        val C:EditText=findViewById(R.id.Cep)

        val Cadastro:Button=findViewById(R.id.butto)

        Cadastro.setOnClickListener(){

        }
    }
}