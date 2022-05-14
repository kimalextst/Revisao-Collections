package exercicio5

class Dicionario {

    val objetos = HashMap<String, String>()

    fun dicionario() {
        println("-------------------------------------")
        println("Deseja adicionar quantas combinações?")
        val qntd = readln().toInt()
        println("-------------------------------------")
        println("===========================")

        for (contador in 1.. qntd) {
            print("Digite o objeto: ")
            val objeto = readln()

            print("Digite a cor relacionada: ")
            val cor = readln()
            println("===========================")

            objetos[objeto] = cor
        }
    }
}