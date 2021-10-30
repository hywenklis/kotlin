class Diretor(
    val senha: Int,
    val plr: Double,
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = salario * 0.3


    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}