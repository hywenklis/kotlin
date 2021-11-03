import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val cliente1 = Cliente(nome = "João", cpf = "111.111.111-11", senha = 1)
    val cliente2 = Cliente(nome = "Maria", cpf = "111.111.111-11", senha = 1)

    val contaJoao = ContaCorrente(cliente1, 1002)
    contaJoao.titular.nome = "joao"
    var contaMaria = ContaPoupanca(cliente2, 1003)
    contaJoao.titular.nome = "Maria"
    contaJoao.titular.nome = "Joao"

    println("Titular conta Joao ${contaJoao.titular}")
    println("Titular conta Maria ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}