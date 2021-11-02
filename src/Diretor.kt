class Diretor(
    val plr: Double,
    nome: String,
    cpf: String,
    senha: Int,
    salario: Double
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double get() = salario + plr

}