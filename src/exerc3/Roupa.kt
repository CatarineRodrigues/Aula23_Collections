package exerc3

class Roupa(
    override val marca: String = "",
    override val modelo: String = ""
) : Peca() {
    override fun retirada(numero: Int) {}
}