package exercicio3

import kotlin.system.exitProcess

class Menu {
    private val objetoInfo = Info()
    private val objetoGuardaVolumes = GuardaVolumes()

    fun miniMenu(){
        println("-------------------------------------------")
        println("O que deseja fazer?")
        println("[1] Guardar meus pertences")
        println("[2] Ver meus pertences guardados")
        println("[3] Retirar meus pertences")
        println("[4] Sair")
        println("-------------------------------------------")

        when (readln()){
            "1" -> {
                val numeroID = objetoGuardaVolumes.guardarPecas(objetoInfo.pegarInfoPeca())
                println("O número de identificação de seus objetos é: $numeroID")
                miniMenu()
            }

            "2" -> {
                println("-------------------------------------------")
                print("Insira o número de identificação: ")
                val numeroID = readln().toInt()
                objetoGuardaVolumes.mostrarPecas(numeroID)
                miniMenu()
            }
            "3" -> {
                println("-------------------------------------------")
                print("Insira o número de identificação: ")
                val numeroID = readln().toInt()
                objetoGuardaVolumes.devolverPecas(numeroID)
                miniMenu()
            }
            "4" -> exitProcess(0)
            else -> {
                println("Escolha inválida, tente novamente")
                miniMenu()
            }
        }
    }
}