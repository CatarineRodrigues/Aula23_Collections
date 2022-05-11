package exerc3

class Roupa(
    override val marca: String = "",
    override val modelo: String = ""
) : Peca() {
    override fun retirada(numero: Int) {}

    fun criarRoupaNova() {
        println("Digite a marca da roupa que deseja guardar")
        val marca1 = readln()
        println("Digite o modelo da roupa que deseja guardar")
        val modelo1 = readln()
        val roupa = Roupa(marca1, modelo1)
        val roupasGuardadas = ArrayList<Peca>()
        roupasGuardadas.add(roupa)
        println(GuardaVolumes().guardarPecas(roupasGuardadas))
    }
}