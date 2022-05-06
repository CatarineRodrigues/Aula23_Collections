/*2. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos ao conjunto
vazio: {1,5,5,6,7,8,8,8}. Imprimir o resultado na tela. Qual é a diferença entre este exercício
e o anterior?*/

fun main() {
    val lista = mutableSetOf<Int>()
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

