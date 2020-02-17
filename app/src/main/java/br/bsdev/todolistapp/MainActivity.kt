package br.bsdev.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun calcular(){
        val valor1 = txtNumber1.getText().toString().toDouble()
        val valor2 = txtNumber2.getText().toString().toDouble()

        val calcular = Calcular()

        val radio : RadioButton = findViewById(rdOpercao.checkedRadioButtonId)

        var valorResultado = when (radio.text) {
            "Somar" -> calcular.somar(valor1, valor2)
            "Subitrair" -> calcular.subitrair(valor1, valor2)
            "Dividir" -> calcular.dividir(valor1, valor2)
            "Multiplicar" -> calcular.multiplicar(valor1, valor2)
            else -> 0.0
        }

        vlResultado.setText(valorResultado.toString());
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            calcular()
        }
    }
}
