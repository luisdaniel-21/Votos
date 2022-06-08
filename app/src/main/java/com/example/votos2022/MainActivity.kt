package com.example.votos2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var votosPan : Int=0
    var votosAlianza : Int=0
    var votosPrd : Int=0
    var votosPri : Int=0
    var votosPt : Int=0
    var votosVerde : Int=0
    var suma : Int=0
    var porcentajePaan : Int=0
    var porcentajeAlianzaa : Int=0
    var porcentajePrd : Int=0
    var porcentajePri : Int=0
    var porcentajePt : Int=0
    var porcentajeVerde : Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnPan(view: View) {
        this.votosPan++
    }
    fun btnAlianza(view: View) {
        this.votosAlianza++
    }
    fun btnPri(view: View) {
        this.votosPri++
    }
    fun btnVerde(view: View) {
        this.votosVerde++
    }
    fun btnPt(view: View) {
        this.votosPt++
    }
    fun btnPrd(view: View) {
        this.votosPrd++
    }
    fun btnResultados(view: View) {
        Toast.makeText(this, "Mostrando resultados", Toast.LENGTH_LONG).show()
        val resultados : Intent = Intent(this, ResultadosVotos::class.java)

        resultados.putExtra("votosPan",votosPan)
        resultados.putExtra("votosAlianza",votosAlianza)
        resultados.putExtra("votosPrd",votosPrd)
        resultados.putExtra("votosPri",votosPri)
        resultados.putExtra("votosPt",votosPt)
        resultados.putExtra("votosVerde",votosVerde)

        this.suma=votosPan+votosAlianza+votosPrd+votosPri+votosPt+votosVerde
        resultados.putExtra("suma",suma)

        this.porcentajePaan=votosPan*100/suma
        resultados.putExtra("porcentajePaan",porcentajePaan)

        this.porcentajeAlianzaa=votosAlianza*100/suma
        resultados.putExtra("porcentajeAlianzaa",porcentajeAlianzaa)

        this.porcentajePrd=votosPrd*100/suma
        resultados.putExtra("porcentajePrd",porcentajePrd)

        this.porcentajePri=votosPri*100/suma
        resultados.putExtra("porcentajePri",porcentajePri)

        this.porcentajePt=votosPt*100/suma
        resultados.putExtra("porcentajePt",porcentajePt)

        this.porcentajeVerde=votosVerde*100/suma
        resultados.putExtra("porcentajeVerde",porcentajeVerde)

        startActivity(resultados)


    }
}
