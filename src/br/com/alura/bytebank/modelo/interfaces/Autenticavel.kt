package br.com.alura.bytebank.modelo.interfaces

interface Autenticavel {

    fun autentica(senha: Int) : Boolean
}