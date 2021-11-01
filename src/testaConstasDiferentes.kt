fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Herbert",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Maria",
        numero = 1001
    )

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)

    println("Saldo da conta poupança: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente: ${contaCorrente.saldo}")
}