package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.abstrato.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

}