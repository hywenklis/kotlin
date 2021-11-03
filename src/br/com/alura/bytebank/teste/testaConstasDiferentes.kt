import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    val cliente1 = Cliente(nome = "Herbert", cpf = "111.111.111-11", senha = 1)
    val cliente2 = Cliente(nome = "Maria", cpf = "111.111.111-11", senha = 1)

    val contaCorrente = ContaCorrente(
        titular = cliente1,
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = cliente2,
        numero = 1001
    )

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)

    println("Saldo da conta poupança: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente: ${contaCorrente.saldo}")
}