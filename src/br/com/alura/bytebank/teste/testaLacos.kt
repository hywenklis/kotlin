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