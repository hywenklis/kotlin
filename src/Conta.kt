class Conta(
    var titular: String,
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