import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    println("Bem vindo ao ByteBank")

    val hywenklis = Analista(
        nome = "hywenklis",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${hywenklis.nome}")
    println("cpf ${hywenklis.cpf}")
    println("salario ${hywenklis.salario}")
    println("Bonificação ${hywenklis.bonificacao}")

    println()

    println("Bem vindo ao ByteBank")

    val maria = Gerente(
        nome = "Maria",
        cpf = "111.111.111-11",
        salario = 3000.0,
        senha = 123
    )

    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("Bonificação ${maria.bonificacao}")

    if (maria.autentica(123)) {
        println("Autenticado!")
    } else {
        println("Não autenticado!")
    }

    println()

    println("Bem vindo ao ByteBank")

    val herbert = Diretor(
        nome = "Herbert",
        cpf = "111.111.111-11",
        salario = 6000.0,
        senha = 1234,
        plr = 200.0
    )

    println("nome ${herbert.nome}")
    println("cpf ${herbert.cpf}")
    println("salario ${herbert.salario}")
    println("Bonificação ${herbert.bonificacao}")
    println("plr ${herbert.plr}")

    if (herbert.autentica(1234)) {
        println("Autenticado!")
    } else {
        println("Não autenticado!")
    }

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(hywenklis)
    calculadora.registra(maria)
    calculadora.registra(herbert)

    println("Total de bonificação é: ${calculadora.total}")
}