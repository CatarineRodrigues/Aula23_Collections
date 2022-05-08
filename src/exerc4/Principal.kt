package exerc4

fun main() {
    val listaFormas = mutableListOf<FormaGeometrica>()
    println("Quantas formas você deseja criar?")
    val qnt = readln().toInt()
    var i = 0
    while (i < qnt) {
        println("Deseja criar um quadrado, um retângulo ou um círculo?")
        when (readln().lowercase()) {
            "quadrado" -> {
                println("Insira o valor do lado do quadrado")
                val lado = readln().toInt()
                listaFormas.add(Quadrado(lado, lado, lado, lado))
            }
            "retângulo", "retangulo" -> {
                println("Insira o valor da base do retângulo")
                val base = readln().toInt()
                println("Insira o valor da altura do retângulo")
                val altura = readln().toInt()
                listaFormas.add(Retangulo(base, altura, base, altura))
            }
            "círculo", "circulo" -> {
                println("Insira o valor do raio do círculo")
                val raio = readln().toInt()
                listaFormas.add(Circulo(raio))
            }
            else -> {
                println("Desculpe forma não reconhecida, tente digitar 'quadrado', 'retângulo' ou 'círculo'")
                i--
            }
        }
        i++
    }

    listaFormas.forEach {
        it.exibirDados()
        println(it.calcularArea())
        println(it.calcularPerimetro())
        println("-------------------------")
    }

}