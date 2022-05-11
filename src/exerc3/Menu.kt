package exerc3

import kotlin.system.exitProcess

class Menu {

    private lateinit var opcaoMenuPrincipal: String
    private lateinit var subMenu: String
    private val guardaVolumes = GuardaVolumes()

    private fun menuPrincipal() {
        println("-------------------------------------")
        println("---------- MENU PRINCIPAL -----------")
        println("---- 1 Guardar peças ----------------")
        println("---- 2 Verificar peças guardadas ----")
        println("---- 3 Remover peças ----------------")
        println("---- 4 Sair -------------------------")
        println("-------------------------------------")
        opcaoMenuPrincipal = readln()
    }

    private fun subMenu() {
        println("----------------------------------------------")
        println("------ Qual peça que deseja adicionar? -------")
        println("---------------- 1 Roupa ---------------------")
        println("---------------- 2 Acessório -----------------")
        println("Digite uma tecla para voltar ao Menu Principal")
        println("----------------------------------------------")
        subMenu = readln()
    }

    fun redirecionamentoDoMenu() {
        while (true) {
            menuPrincipal()
            when (opcaoMenuPrincipal) {
                "1" -> {
                    subMenu()
                    guardaVolumes.guardarPecas(subMenu)
                }
                "2" -> guardaVolumes.mostrarPecas()
                "3" -> guardaVolumes.devolverPecas()
                "4" -> {
                    println("Obrigado por usar nosso sistema!")
                    exitProcess(0)
                }
                else -> println("Opção inválida")
            }
        }
    }
}
