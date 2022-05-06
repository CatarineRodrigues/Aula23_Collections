package exerc4

class Quadrado(
    lado1: Int,
    lado2: Int,
    lado3: Int,
    lado4: Int
) : Quadrilatero(lado1, lado2, lado3, lado4), FormaGeometrica {

    override fun calcularArea(): Double {
        println("O tamanho da área do Quadrado de lado $base é:")
        return base * base * 1.0
    }
}