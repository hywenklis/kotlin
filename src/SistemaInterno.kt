class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação!")
        }
    }
}
