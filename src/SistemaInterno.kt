class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("bem vindo ao ByteBank ${admin.nome}")
        } else {
            println("Falha na autenticação!")
        }
    }
}
