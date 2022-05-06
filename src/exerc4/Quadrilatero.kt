package exerc4

abstract class Quadrilatero(
    lado1: Int,
    lado2: Int,
    lado3: Int,
    lado4: Int
) : FormaGeometrica {

    var base = lado1
    var altura = lado2
    val lado3 = lado3
    val lado4 = lado4

    override fun calcularPerimetro(): Double {
        println("O perímetro da forma é ")
        return base + altura + lado3 + lado4 + 0.0
    }
}

/*● Uma classe abstrata para representar quadriláteros.
Seu construtor deve receber os tamanhos dos 4 lados e o
método de cálculo do perímetro já pode ser implementado;*/