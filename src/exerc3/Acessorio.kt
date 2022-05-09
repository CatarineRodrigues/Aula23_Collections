package exerc3

class Acessorio(
    override val marca: String = "",
    override val modelo: String = ""
) : Peca() {
    override fun retirada(numero: Int) {}
}