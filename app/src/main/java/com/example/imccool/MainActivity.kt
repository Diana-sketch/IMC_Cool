package com.example.imccool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var edad:Int = 25
    var peso:Int =  75
    var altura:Int = 180
    var sexo:String = "hola"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekAltura.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if(p1 <=100){
                    seekAltura.setProgress(100)
                    tvAltura.text = "100"
                    altura =100
                }else{
                    tvAltura.text = "$p1"
                    altura = p1
                }

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        btnPesoMenos.setOnClickListener(this)
        btnPesoMas.setOnClickListener(this)
        btnEdadMenos.setOnClickListener(this)
        btnEdadMas.setOnClickListener(this)
        imBtnHombre.setOnClickListener(this)
        imBtnMujer.setOnClickListener(this)
        btnCalcular.setOnClickListener(this)
        tvPeso.text ="$peso"
        tvAltura.text = "$altura"

    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btnPesoMenos->{
                peso--
                tvPeso.text = "$peso"
            }
            R.id.btnPesoMas->{
                peso++
                tvPeso.text = "$peso"
            }
            R.id.btnEdadMenos->{
                edad--
                tvEdad.text ="$edad"
            }
            R.id.btnEdadMas->{
                edad++
                tvEdad.text = "$edad"
            }
            R.id.imBtnHombre->sexo="m"
            R.id.imBtnMujer->sexo = "f"
            R.id.btnCalcular->{
                val imc = calcularIMC(peso, altura)
                val intencion = Intent(this,ActivityResultados::class.java)
                intencion.putExtra("imc", imc)
                intencion.putExtra("gender", sexo)
                intencion.putExtra("age", edad)
                startActivity(intencion)
            }
        }
    }
    fun calcularIMC(peso:Int, altura:Int):Float{
        val pesoF = peso.toFloat()
        val alturaF = altura.toFloat()/100
        var imc = pesoF/(alturaF*alturaF)
        return imc.toFloat()
    }
}