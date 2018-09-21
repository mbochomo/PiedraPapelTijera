package cum.unex.es.piedrapapeltijera

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*
import java.util.Random
val random = Random()
class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val bundle = intent.extras
        val num = bundle.get("jugada")

        val maq = rand(0,3)
        jugadamaquina(maq)
        if (num == 0){
            juegatijeras(maq)
        }
        else if (num == 1){
            juegapiedra(maq)
        }
        else if (num == 2){
            juegapapel(maq)
        }
        btnaceptar.setOnClickListener(){
            finish()
        }

    }

    fun juegapiedra (maq: Int){
        if (maq == 1){
            resultado.setTextColor(resources.getColor(R.color.amarillo))
            resultado.text = "Empate"
        }
        else if (maq == 2){
            resultado.setTextColor(resources.getColor(R.color.rojo))
            resultado.text = "¡Has perdido!"
        }
        else if (maq == 0){
            resultado.setTextColor(resources.getColor(R.color.verde))
            resultado.text = "¡Has ganado!"
        }
    }
    fun juegatijeras(maq: Int){
        if (maq == 0){
            resultado.setTextColor(resources.getColor(R.color.amarillo))
            resultado.text = "Empate"
        }
        else if (maq == 1){
            resultado.setTextColor(resources.getColor(R.color.rojo))
            resultado.text = "¡Has perdido!"
        }
        else if (maq == 2){
            resultado.setTextColor(resources.getColor(R.color.verde))
            resultado.text = "¡Has ganado!"
        }
    }
    fun juegapapel(maq: Int){
        if (maq == 2){
            resultado.setTextColor(resources.getColor(R.color.amarillo))
            resultado.text = "Empate"
        }
        else if (maq == 0){
            resultado.setTextColor(resources.getColor(R.color.rojo))
            resultado.text = "¡Has perdido!"
        }
        else if (maq == 1){
            resultado.setTextColor(resources.getColor(R.color.verde))
            resultado.text = "¡Has ganado!"
        }
    }
    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
    fun jugadamaquina(num: Int){
        if (num == 0){
            jugada.text = "La máquina juega: TIJERAS"
        }
        else if (num == 1){
            jugada.text = "La máquina juega: PIEDRA"
        }
        else if (num == 2){
            jugada.text = "La máquina juega: PAPEL"
        }
        else{
            jugada.text = "Número generado "+num.toString()
        }

    }
}
