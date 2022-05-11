package exerc3

import kotlin.system.exitProcess

class GuardaVolumes {

    var contador: Int = 0
    val dicionario = mutableMapOf<Int, ArrayList<Peca>>()

    fun guardarPecas(listaDePeca: ArrayList<Peca>): Int {
        contador++
        dicionario[contador] = (listaDePeca)
        return contador
    }

    fun mostrarPecas() {

        println("Verificar peças salvas")
        dicionario.forEach { chave, valor ->
            println("A chave $chave corresponde aos itens")
            valor.forEach {
                println("Marca ${it.marca} e modelo ${it.modelo}")
            }
        }
    }

    fun mostrarPecas(chave: Int) {
        dicionario[chave]!!.forEach { _ ->
            println(dicionario[chave])
        }
    }

    fun devolverPecas() {
        try {
            println("Digite o código da peça que deseja remover")
            val numero = readln().toInt()
            println("----------------------")
            println("Foi removida a peça de número $numero")
            dicionario.remove(numero)
            println("----------------------")

        } catch (exception: Exception) {
            println("Causa: ${exception.cause}")
            println("Mensagem: ${exception.message}")
            println("Para sair aperte '1', para voltar pressione qualquer tecla")
            when (readln()) {
                "1" -> {
                    println("Obrigado por usar nosso sistema!")
                    exitProcess(0)
                }
                else -> println("Retornando ao Menu Principal")
            }
        }
    }

    fun guardarPecas(subMenu: String) {
        when (subMenu) {
            "1" -> Roupa().criarRoupaNova()
            "2" -> Acessorio().criarAcessorioNovo()
        }
    }
}

/*} */