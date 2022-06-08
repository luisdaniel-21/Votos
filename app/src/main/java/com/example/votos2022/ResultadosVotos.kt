package com.example.votos2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadosVotos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_votos)

        val resultados: Intent = intent
        val mostrarPan : TextView = findViewById(R.id.resultadosPan)
        val mostrarAlianza : TextView = findViewById(R.id.resultadosAlianza)
        val mostrarPrd : TextView = findViewById(R.id.resultadosPrd)
        val mostrarPri : TextView = findViewById(R.id.resultadosPri)
        val mostrarPt : TextView = findViewById(R.id.resultadosPt)
        val mostrarVerde : TextView = findViewById(R.id.resultadosVerde)
        val sumatotal : TextView = findViewById(R.id.sumaTotal)
        var porcentajePan : TextView = findViewById(R.id.porcentajePan)
        var porcentajeAlianza : TextView = findViewById(R.id.porcentajeAlianza)
        var TxtporcentajePrd : TextView = findViewById(R.id.porcentajePrd)
        var TxtporcentajePri : TextView = findViewById(R.id.porcentajePri)
        var TxtporcentajePt : TextView = findViewById(R.id.porcentajePt)
        var TxtporcentajeVerde : TextView = findViewById(R.id.porcentajeVerde)


        var votosPan: Int = resultados.getIntExtra("votosPan",0)
        mostrarPan.setText(votosPan.toString())

        var votosAlianza: Int = resultados.getIntExtra("votosAlianza",0)
        mostrarAlianza.setText(votosAlianza.toString())

        var votosPrd: Int = resultados.getIntExtra("votosPrd",0)
        mostrarPrd.setText(votosPrd.toString())

        var votosPri: Int = resultados.getIntExtra("votosPri",0)
        mostrarPri.setText(votosPri.toString())

        var votosPt: Int = resultados.getIntExtra("votosPt",0)
        mostrarPt.setText(votosPt.toString())

        var votosVerde: Int = resultados.getIntExtra("votosVerde",0)
        mostrarVerde.setText(votosVerde.toString())

        var suma: Int = resultados.getIntExtra("suma",0)
        sumatotal.setText(suma.toString())


        var porcentajePaan: Int = resultados.getIntExtra("porcentajePaan",0)
        porcentajePan.setText(porcentajePaan.toString())

        var porcentajeAlianzaa: Int = resultados.getIntExtra("porcentajeAlianzaa",0)
        porcentajeAlianza.setText(porcentajeAlianzaa.toString())

        var porcentajePrd: Int = resultados.getIntExtra("porcentajePrd",0)
        TxtporcentajePrd.setText(porcentajePrd.toString())

        var porcentajePri: Int = resultados.getIntExtra("porcentajePri",0)
        TxtporcentajePri.setText(porcentajePri.toString())

        var porcentajePt: Int = resultados.getIntExtra("porcentajePt",0)
        TxtporcentajePt.setText(porcentajePt.toString())

        var porcentajeVerde: Int = resultados.getIntExtra("porcentajeVerde",0)
        TxtporcentajeVerde.setText(porcentajeVerde.toString())




    }
}