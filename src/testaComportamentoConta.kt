fun testaComportamentoConta() {
    val conta1 = ContaCorrente(numero = 1000, titular = "Herbert")
    conta1.deposita(200.0)

    val conta2 = ContaPoupanca("Maria", 1001)
    conta2.deposita(300.0)

    val conta3 = ContaSalario("Hywenklis", 1003)
    conta3.deposita(300.0)

    println(conta1.titular)
    println(conta1.numero)
    println(conta1.saldo)

    println(conta2.titular)
    println(conta2.numero)
    println(conta2.saldo)

    println("Depositando na conta do ${conta1.titular}")
    conta1.deposita(50.0)
    println(conta1.saldo)
    println()

    println("Depositando na conta da ${conta2.titular}")
    conta2.deposita(70.0)
    println(conta2.saldo)

    println()

    println("Sacando da conta do ${conta1.titular}")
    conta1.saca(250.0)
    println(conta1.saldo)
    println()

    println("Sacando na conta da ${conta2.titular}")
    conta2.saca(250.0)
    println(conta2.saldo)
    println()

    println("Transferindo da conta da [${conta2.titular}] para a conta do [${conta1.titular}]")
    if (conta2.tranfere(100.0, conta1)) {
        println("Transferência com sucesso!")
    } else {
        println("Trasnferência falhou!")
    }
    println()

    println("Saldo da conta do ${conta1.titular}")
    println(conta1.saldo)

}