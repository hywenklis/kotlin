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

    println()

    println("Bem vindo ao ByteBank")

    val maria = Gerente(
        nome = "Maria",
        cpf = "111.111.111-11",
        salario = 3000.0,
        senha = 123
    )

    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("Bonificação ${maria.bonificacao()}")

    if (maria.autentica(123)) {
        println("Autenticado!")
    } else {
        println("Não autenticado!")
    }

}