package br.com.alura.bytebank.modelo.abstrato

import br.com.alura.bytebank.modelo.Cliente

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object{
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }

    }

    abstract fun saca(valor: Double)

    fun tranfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}