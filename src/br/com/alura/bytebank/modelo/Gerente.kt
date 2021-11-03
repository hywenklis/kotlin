package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.abstrato.FuncionarioAdmin

class Gerente : FuncionarioAdmin {
    constructor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
    ) : super(nome, cpf, salario, senha) {
    }


    override val bonificacao: Double get() = salario
}