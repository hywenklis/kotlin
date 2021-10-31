class Gerente : Funcionario {
    private val senha: Int

    constructor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
    ) : super(nome, cpf, salario) {
        this.senha = senha
    }


    override val bonificacao: Double get() = super.bonificacao + salario

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}