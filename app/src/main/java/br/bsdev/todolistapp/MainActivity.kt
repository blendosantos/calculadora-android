package br.bsdev.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun calcular(){
        var txt1 : String = txtNumber1.getText().toString();
        var valor1 = txt1.toDouble()

        var txt2 : String = txtNumber2.getText().toString();
        var valor2 = txt2.toDouble()

        var valorResultado = 0.0;

        val calcular = Calcular()

        var id : Int = rdOpercao.checkedRadioButtonId
        val radio : RadioButton = findViewById(id)

        if(radio.text.equals("Dividir")) {
            valorResultado = calcular.dividir(valor1, valor2)
        } else if(radio.text.equals("Somar")) {
            valorResultado = calcular.somar(valor1, valor2)
        } else if(radio.text.equals("Multiplicar")){
            valorResultado = calcular.multiplicar(valor1, valor2)
        } else if(radio.text.equals("Subitrair")) {
            valorResultado = calcular.diminuir(valor1, valor2)
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
