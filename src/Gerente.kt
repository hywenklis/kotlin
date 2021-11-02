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