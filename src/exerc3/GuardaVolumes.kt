package exerc3

/*○ Criar o método guardarPecas(listaDePeca: ArrayList<Peca>): Int na Classe GuardaVolumes, que
recebe uma lista de peças adiciona essa lista de peças em nosso dicionário e retorna o número de
identificação,ou seja, a chave do dicionário onde guardamos as peças, que neste caso é o nosso contador

○ Criar o método mostrarPecas() na Classe GuardaVolumes, que imprime na tela todas as peças que
estão no guarda-volumes, junto com o número correspondente
○ Criar o método mostrarPecas(numero: Int) na classe GuardaVolumes, que imprima as peças que estão
associadas ao número recebido
○ Criar o método devolverPecas(numero: Int) na Classe GuardaVolumes, que remova a lista de peças
que esta associada ao número recebido.*/

class GuardaVolumes(override val marca: String, override val modelo: String) : Peca() {

    var contador: Int = 0
    val dicionario = mutableMapOf<Int, ArrayList<Peca>>()

    fun guardaPecas(listaDePeca: ArrayList<Peca>): Int{
        contador++
        dicionario[contador] = (listaDePeca)
        return contador
    }
    fun mostrarPecas(){
        dicionario.forEach { chave, valor ->
            println("A  $chave corresponde aos itens $valor")
        }
    }

    fun mostrarPecas(chave: Int){
        dicionario[chave]!!.forEach { _ ->
            println(dicionario[chave])
        }
    }



    override fun retirada(numero: Int) {
        println("Foi removida a peça de número $numero")
        dicionario.remove(numero)
    }

}