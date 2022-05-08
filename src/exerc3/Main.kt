package exerc3

fun main() {

    var i = 0
    val pecasGuardadas = ArrayList<Peca>()
    println("Quantas peças deseja quardar?")
    val qnt = readln().toInt()
    while (i < qnt){
        println("Digite a marca da peça que deseja guardar")
        val marca1 = readln()
        println("Digite o modelo da peça que deseja guardar")
        val modelo1 = readln()
        val peca: Peca = GuardaVolumes(marca1, modelo1)

        pecasGuardadas.add(peca)
        GuardaVolumes(marca1, modelo1).guardaPecas(pecasGuardadas)
        println(GuardaVolumes(marca1, modelo1).contador)
        i++
    }


}