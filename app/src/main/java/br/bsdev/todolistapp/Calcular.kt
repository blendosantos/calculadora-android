package br.bsdev.todolistapp

@Suppress("SpellCheckingInspection")
class Calcular(private val valor1 : Double, private val valor2 : Double) {

    fun somar(): Double {
        return valor1 + valor2
    }

    fun subitrair(): Double {
        return valor1 - valor2
    }

    fun multiplicar(): Double {
        return valor1 * valor2
    }

    fun dividir(): Double {
        return valor1 / valor2
    }
}