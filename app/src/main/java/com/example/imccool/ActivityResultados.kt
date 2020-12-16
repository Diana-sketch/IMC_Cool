package com.example.imccool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultados.*




class ActivityResultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        val intencion = intent
        val imc = intencion.getFloatExtra("imc", 0.0F)

        tvResultadoImc.text = "$imc"
        btnRegrsar.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
    fun interpretaImc(imc:Float, edad:Int, sexo:String){
        var estatus:String = ""
        var mensajeRango:String = ""
        var rango:String = ""
        var mensaje:String = ""

        if(sexo=="f"){
            when(edad){
                in 19..24->{
                    when(imc){
                        in 18.9 .. 22.1->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "21.2 - 25%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 21.2 .. 25.0->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "21.2 - 25%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 25.1 .. 29.6->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "21.2 - 25%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 25..29->{
                    when(imc){
                        in 18.9 .. 22.0->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "21.1 - 25.4%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 22.1 .. 25.4->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.1 - 25.4%"
                            mensaje ="Tu cuepo entra en lo normal. Buen trabajo!!"
                        }
                        in 25.5 .. 29.8->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.1 - 25.4%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 30..34->{
                    when(imc){
                        in 19.7 .. 22.7->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.8 - 26.4%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 22.8 .. 26.4->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.8 - 26.4%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 26.5 .. 30.5->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.8 - 26.4%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 35..39->{
                    when(imc){
                        in 21.0 .. 24.0->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "24.1 - 17.7%"
                            mensaje = "Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 24.1 .. 27.7->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "24.1 - 17.7%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 27.8 .. 31.5->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "24.1 - 17.7%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 40..44->{
                    when(imc){
                        in 22.6 .. 25.6->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "25.7 - 29.3%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 25.7 .. 29.3->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "25.7 - 29.3%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 29.4 .. 32.8->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "25.7 - 29.3%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 45..49->{
                        when(imc){
                            in 24.3 .. 27.3->{
                                estatus = "Optimo"
                                mensajeRango = "Rango normal IMC:"
                                rango = "27.4 - 30.9%"
                                mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                            }
                            in 27.4 .. 30.9->{
                                estatus = "Bueno"
                                mensajeRango = "Rango normal IMC:"
                                rango = "27.4 - 30.9%"
                                mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                            }
                            in 31.0 .. 34.1->{
                                estatus = "Malo (Oebbesidad)"
                                mensajeRango = "Rango normal IMC:"
                                rango = "27.4 - 30.9%"
                                mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                            }

                        }
                }
                in 50..54->{
                    when(imc){
                        in 26.6 .. 29.7->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "29.8 - 33.1%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 29.8 .. 33.1->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "29.8 - 33.1%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 33.2 .. 36.2->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "29.8 - 33.1%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 55..59->{
                    when(imc){
                        in 27.4 .. 30.7->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "30.8 - 34.0%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 30.8 .. 34.0->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "30.8 - 34.0%"
                            mensaje ="Tu cuepo entra en lo normal. Buen trabajo!!"
                        }
                        in 34.1 .. 37.3->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "30.8 - 34.0%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
            }
        }else if(sexo=="m"){
            when(edad){
                in 19..24->{
                    when(imc){
                        in 10.8 .. 14.9->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "15.0 - 19.0%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 15.0 .. 19.0->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "15.0 - 19.0%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 19.1 .. 23.3->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "15.0 - 19.0%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 25..29->{
                    when(imc){
                        in 12.8 .. 16.5->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "16.6 - 20.3%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 16.6 .. 20.3->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "16.6 - 20.3%"
                            mensaje ="Tu cuepo entra en lo normal. Buen trabajo!!"
                        }
                        in 20.4 .. 24.4->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "16.6 - 20.3%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 30..34->{
                    when(imc){
                        in 14.5 .. 18.0->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "18.1 - 21.5%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 18.1 .. 21.5->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "18.1 - 21.5%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 21.6 .. 25.2->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "18.1 - 21.5%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 35..39->{
                    when(imc){
                        in 16.1 .. 19.4->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "19.5 - 22.6%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 19.5 .. 22.6->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "19.5 - 22.6%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 22.7 .. 26.1->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "19.5 - 22.6%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 40..44->{
                    when(imc){
                        in 17.5 .. 20.5->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "20.6 - 23.6%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 20.6 .. 23.6->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "20.6 - 23.6%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 23.7 .. 26.9->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "20.6 - 23.6%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 45..49->{
                    when(imc){
                        in 18.6 .. 21.5->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "21.6 - 24.5%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 21.6 .. 24.5->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "21.6 - 24.5%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 24.6 .. 27.6->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "21.6 - 24.5%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 50..54->{
                    when(imc){
                        in 19.8 .. 22.7->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.8 - 25.6%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 22.8 .. 25.6->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.8 - 25.6%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 25.6 .. 28.7->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "22.8 - 25.6%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }

                    }
                }
                in 55..59->{
                    when(imc){
                        in 20.2 .. 23.2->{
                            estatus = "Optimo"
                            mensajeRango = "Rango normal IMC:"
                            rango = "23.3 - 26.2%"
                            mensaje ="Tu tienes un buen cuerpo, peso. Buen trabajo!!"
                        }
                        in 23.3 .. 26.2->{
                            estatus = "Bueno"
                            mensajeRango = "Rango normal IMC:"
                            rango = "23.3 - 26.2%"
                            mensaje ="Tu cuepo entra enlonormal. Buen trabajo!!"
                        }
                        in 26.3 .. 29.3->{
                            estatus = "Malo (Oebbesidad)"
                            mensajeRango = "Rango normal IMC:"
                            rango = "23.3 - 26.2%"
                            mensaje ="Tu cuerpo esta mal. tu puedes sigue trabajando!!"
                        }
                    }
                }
            }
        }
        tvEstatus.text = "$estatus"
        tvMensajeRango.text = "$mensajeRango"
        tvRango.text = "$rango"
        tvMensaje.text = "$mensaje"
    }
}