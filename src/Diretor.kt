class Diretor(
    val senha: Int,
    val plr: Double,
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
//    fun bonificacao(): Double {
//        return salario * 0.3
//    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}