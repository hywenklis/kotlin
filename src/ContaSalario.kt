class ContaSalario(
    val titular: String,
    val numero: Int,
): ContaEspecial {
    var saldo = 0.0
        protected set

    override fun saca(valor: Double) {
        if(saldo >= valor) {
            saldo -= valor
        }
    }

    override fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

}
