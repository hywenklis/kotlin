package br.com.alura.bytebank.modelo.abstrato

import br.com.alura.bytebank.modelo.interfaces.Autenticavel

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: Int
) : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}