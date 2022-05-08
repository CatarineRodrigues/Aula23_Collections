package exerc4

class Circulo(private val raio: Int) : FormaGeometrica {

    override fun exibirDados() {
        println("O raio do Círculo é: $raio")
    }

    override fun calcularArea(): Double {
        println("O tamanho da área do Circulo de raio $raio é:")
        return (3.14 * raio * raio)
    }

    override fun calcularPerimetro(): Double {
        println("O tamanho do perímetro do Circulo de raio $raio é:")
        return (2 * 3.14 * raio)
    }

}
