package exercicio3

class Peca (
    private val objeto : String,
    private val marca : String,
    private val modelo : String
        ) {
    fun retirada(){
        println("-------------------------------------------")
        println("Objeto: $objeto")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("-------------------------------------------")
    }
}