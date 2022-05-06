/*1. Definir e inicializar uma nova lista vazia. Adicionar os seguintes
elementos à lista vazia: [1,5,5,6,7,8,8,8]. Imprimir o resultado na tela.*/

fun main() {
    val lista = mutableListOf<Int>()
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)
    println(lista)
}