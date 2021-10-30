fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("Joao", 1002)
    contaJoao.titular = "joao"
    var contaMaria = Conta("Maria", 1003)
    contaJoao.titular = "Maria"
    contaJoao.titular = "Joao"

    println("Titular conta Joao ${contaJoao.titular}")
    println("Titular conta Maria ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}