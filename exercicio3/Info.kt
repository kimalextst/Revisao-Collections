package exercicio3

class Info {
    private lateinit var objetoPeca : Peca

    fun pegarInfoPeca(): Peca {
        println("-------------------------------------------")
        println("Qual o tipo de objeto que deseja guardar?")
        println("-------------------------------------------")
        val objeto = readln()
        println("-------------------------------------------")
        println("Qual a marca do objeto que deseja guardar?")
        println("-------------------------------------------")
        val marca = readln()
        println("-------------------------------------------")
        println("Qual o modelo do objeto que deseja guardar?")
        println("-------------------------------------------")
        val modelo = readln()
        println("-------------------------------------------")

        objetoPeca = Peca(objeto, marca, modelo)

        return objetoPeca
    }
}