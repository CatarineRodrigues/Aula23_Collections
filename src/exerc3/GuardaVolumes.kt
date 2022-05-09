package exerc3

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

    fun devolverPecas(numero: Int) {
        println("----------------------")

        println("Foi removida a peça de número $numero")
        dicionario.remove(numero)
        println("----------------------")
    }

}