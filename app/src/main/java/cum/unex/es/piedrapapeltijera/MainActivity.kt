package cum.unex.es.piedrapapeltijera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tijerasbtn.setOnClickListener(){
            funcion(0)
        }
        piedrabtn.setOnClickListener(){
            funcion(1)
        }
        papelbtn.setOnClickListener(){
            funcion(2)
        }
    }
    fun funcion(numero: Int){
        val intent = Intent(this, Resultado::class.java)
        intent.putExtra("jugada", numero)
        startActivity(intent)
    }
}
