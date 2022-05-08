package exerc4

abstract class Quadrilatero(
    protected var base: Int,
    protected var altura: Int,
    private var lado3: Int,
    private var lado4: Int
) : FormaGeometrica {

    override fun exibirDados() {
        println("Os dados do Quadrilátero é: $base, $altura")
    }

    override fun calcularPerimetro(): Double {
        println("O perímetro do quadrilátero é ")
        return base + altura + lado3 + lado4 + 0.0
    }
}