package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.interfaces.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação!")
        }
    }
}
