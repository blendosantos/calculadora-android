package br.bsdev.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("SpellCheckingInspection")
class MainActivity : AppCompatActivity() {

    // Metodo para efetuar calculo quando preecionado o botão calcular
    private fun calcular(){
        // Pega dados da tela baseado no ID do campo
        val valor1 = txtNumber1.text.toString().toDouble()
        val valor2 = txtNumber2.text.toString().toDouble()
        val radio : RadioButton = findViewById(rdOpercao.checkedRadioButtonId)

        // Instancia a classe calcular passando os valores via construtor
        val calcular = Calcular(valor1, valor2)

        // Verifica qual operacao foi selecionada na tela e executa o metodo retornando o resultado da operacao
        var valorResultado = when (radio.text) {
            "Somar" -> calcular.somar()
            "Subitrair" -> calcular.subitrair()
            "Dividir" -> calcular.dividir()
            "Multiplicar" -> calcular.multiplicar()
            else -> 0.0
        }

        // Exibi o valor do resultado da operacao para a tela
        vlResultado.text = doubleToString(valorResultado)
    }

    private fun doubleToString(valor : Double) : String {
        var stringValor = valor.toString().split(".")
        if(stringValor.size > 1 && stringValor[1].toInt() != 0) {
            return stringValor[0] + "," + stringValor[1]
        }
        return stringValor[0]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Acionador doo metodo para efetuar o calculo
        btnCalcular.setOnClickListener {
            calcular()
        }
    }
}
