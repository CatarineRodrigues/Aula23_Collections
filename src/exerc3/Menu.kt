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

    private fun subMenu(){
        println("----------------------------------------------")
        println("------ Qual peça que deseja adicionar? -------")
        println("---------------- 1 Roupa ---------------------")
        println("---------------- 2 Acessório -----------------")
        println("Digite uma tecla para voltar ao Menu Principal")
        println("----------------------------------------------")
        subMenu = readln()
    }

    private fun guardarPecas() {
        when (subMenu) {
            "1" -> {
                println("Digite a marca da roupa que deseja guardar")
                val marca1 = readln()
                println("Digite o modelo da roupa que deseja guardar")
                val modelo1 = readln()
                val roupa = Roupa(marca1, modelo1)
                val roupasGuardadas = ArrayList<Peca>()
                roupasGuardadas.add(roupa)
                println(guardaVolumes.guardarPecas(roupasGuardadas))
            }
            "2" -> {
                println("Digite a marca do acessório que deseja guardar")
                val marca1 = readln()
                println("Digite o modelo do acessório que deseja guardar")
                val modelo1 = readln()
                val acessorio = Acessorio(marca1, modelo1)
                val acessoriosGuardados = ArrayList<Peca>()
                acessoriosGuardados.add(acessorio)
                println(guardaVolumes.guardarPecas(acessoriosGuardados))
            }
        }
    }

    fun redirecionamentoDoMenu() {
        while (true) {
            try {
                menuPrincipal()
                when (opcaoMenuPrincipal) {
                    "1" -> {
                        subMenu()
                        guardarPecas()
                    }
                    "2" -> guardaVolumes.mostrarPecas()
                    "3" -> {
                        println("Digite o código da peça que deseja remover")
                        guardaVolumes.devolverPecas(readln().toInt())
                    }
                    "4" -> {
                        println("Obrigado por usar nosso sistema!")
                        exitProcess(0)
                    }
                    else -> println("Opção inválida")
                }
            } catch (exception: Exception) {
                println("Causa: ${exception.cause}")
                println("Mensagem: ${exception.message}")
                println("Para sair aperte '1', para voltar pressione qualquer tecla")
                when (readln()) {
                    "1" -> {
                        println("Obrigado por usar nosso sistema!")
                        exitProcess(0)
                    }
                    else -> println("Retornando ao Menu Principal")
                }
            }
        }
    }
}