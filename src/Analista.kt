class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {


    override val bonificacao: Double get() = salario * 0.1

}