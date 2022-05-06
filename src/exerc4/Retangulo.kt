package exerc4

class Retangulo(
    lado1: Int,
    lado2: Int,
    lado3: Int,
    lado4: Int
) : Quadrilatero(lado1, lado2, lado3, lado4), FormaGeometrica {

    override fun calcularArea(): Double {
        println("O tamanho da área do Retângulo de lado $base e altura $altura é:")
        return base * altura * 1.0
    }
}
/*● Classes para representar retângulos e quadrados. A primeira deve receber o tamanho da base e da
altura no construtor, enquanto a segunda deve receber apenas o tamanho do lado;*/