class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {


    override val bonificacao: Double get() = super.bonificacao + salario

}