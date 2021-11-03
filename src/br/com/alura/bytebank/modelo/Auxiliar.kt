package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.abstrato.Funcionario

class Auxiliar(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {


    override val bonificacao: Double get() = salario * 0.05

}