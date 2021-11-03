fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Herbert",
        cpf = "111.111.111-11",
        salario = 2000.0,
        senha = 2000
    )

    val diretor = Diretor(
        nome = "Maria",
        cpf = "222.222.222-22",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    val cliente = Cliente(nome = "Hywenklis", cpf = "333.333.333-33", senha = 3000)

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 2000)
    sistemaInterno.entra(diretor, 4000)
    sistemaInterno.entra(cliente, 3000)
}