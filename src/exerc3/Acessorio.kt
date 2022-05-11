package exerc3

class Acessorio(
    override val marca: String = "",
    override val modelo: String = ""
) : Peca() {
    override fun retirada(numero: Int) {}

    fun criarAcessorioNovo() {
        println("Digite a marca do acessório que deseja guardar")
        val marca1 = readln()
        println("Digite o modelo do acessório que deseja guardar")
        val modelo1 = readln()
        val acessorio = Acessorio(marca1, modelo1)
        val acessoriosGuardados = ArrayList<Peca>()
        acessoriosGuardados.add(acessorio)
        println(GuardaVolumes().guardarPecas(acessoriosGuardados))
    }
}