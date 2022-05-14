package exercicio5

fun main(){
    val objetoDicionario = Dicionario()
    objetoDicionario.dicionario()

    println("--------------------------")
    objetoDicionario.objetos.forEach{ map ->
        println("${map.key} - ${map.value}")
    }
    println("--------------------------")
}