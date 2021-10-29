fun main() {

    println("Bem vindo ao ByteBank")

    val conta1 = Conta(conta = 1000, titular = "Herbert")
    conta1.deposita(200.0)

    val conta2 = Conta("Maria", 1001)
    conta2.deposita(300.0)

    println(conta1.titular)
    println(conta1.conta)
    println(conta1.saldo)

    println(conta2.titular)
    println(conta2.conta)
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

class Conta(
    val titular: String,
    val conta: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }

    }

    fun saca(valor: Double) {
        if (saldo >= valor)
            saldo -= valor
    }

    fun tranfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}


fun testaLacos() {
    var i = 1
    while (i < 5) {
        for (i in 5 downTo 1 step 2) {
            val titular: String = "Herbert $i"
            val numeroConta: Int = 1000 + i
            var saldo = i + 10.0

            println("titular: $titular")
            println("numero da conta: $numeroConta")
            println("saldo: $saldo")
            testaCondicao(saldo)
            println()

        }
        i++
    }
}

fun testaCondicao(saldo: Double) {

//    if (saldo > 0.0) {
//        println("Saldo positivo!")
//    } else if (saldo == 0.0) {
//        println("Saldo Neutro")
//    } else {
//        println("Saldo negativo")
//    }

    when {
        saldo > 0.0 -> println("Saldo positivo!")
        saldo == 0.0 -> println("Saldo Neutro")
        else -> println("Saldo negativo")
    }
}
