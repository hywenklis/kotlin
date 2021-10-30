fun main() {

    println("Bem vindo ao ByteBank")

    val hywenklis = Funcionario(
        nome = "hywenklis",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${hywenklis.nome}")
    println("cpf ${hywenklis.cpf}")
    println("salario ${hywenklis.salario}")
    println("Bonificação ${hywenklis.bonificacao()}")
}