package exercicio4

import exercicio4.formas.*

class Execucao {
    private val listaFormas : ArrayList<Forma> = ArrayList()
    private lateinit var objetoForma : Forma

    private var forma = ""
        set(forma) {
            if (
                forma != "C" && forma != "c"
                && forma != "Q" && forma != "q"
                && forma != "R" && forma != "r"
            ) {
                println("Escolha inválida. Tente novamente")
                pegarForma()
            } else {
                field = forma
            }
        }

    private fun pegarForma(): String {
        println("-------------------------------------")
        println("Qual forma deseja criar?")
        println("[C] Círculo")
        println("[Q] Quadrado")
        println("[R] Retângulo")
        println("-------------------------------------")
        forma = readln()
        println("-------------------------------------")

        return forma
    }

    fun calcularEMostrar() {
        println("-------------------------------------")
        print("Insira quantas formas deseja criar: ")
        val qntd = readln().toInt()
        println("-------------------------------------")

        for (contador in 1..qntd) {
            when(pegarForma()){
                "C", "c" -> {
                    val raio = pedirAtributos("Insira o valor do raio do círculo: ")
                    objetoForma = Circulo(raioParametro = raio)
                    mostrarResultado("Círculo", raio, 0.0, objetoForma.calcularPerimetro(), objetoForma.calcularArea())
                }
                "R", "r" -> {
                    val lado = pedirAtributos("Insira o valor do lado do retângulo: ")
                    println("--------------------------------------")
                    val altura = pedirAtributos("Insira o valor da altura do retângulo: ")
                    objetoForma = Retangulo(ladoParametro = lado, alturaParametro = altura)
                    mostrarResultado("Retângulo", lado, altura, objetoForma.calcularPerimetro(), objetoForma.calcularArea())
                }
                "Q", "q" -> {
                    val lado = pedirAtributos("Insira o valor do lado do quadrado: ")
                    objetoForma = Quadrado(ladoParametro = lado)
                    mostrarResultado("Quadrado", lado, lado, objetoForma.calcularPerimetro(), objetoForma.calcularArea())
                }
            }
            println("-------------------------------------")
            adicionarFormaLista(objetoForma)
        }
    }

    private fun mostrarResultado(forma : String, primeiroAtributo : Double, segundoAtributo : Double, area : Double, perimetro : Double){
        println("-------------------------------------")
        println("Forma: $forma")
        println("Lado ou raio: $primeiroAtributo")
        println("Altura (Se necessário): $segundoAtributo")
        println("Perimetro: $perimetro")
        println("Área: $area")
        println("-------------------------------------")
    }

    private fun adicionarFormaLista(objeto : Forma){
        listaFormas.add(objeto)
    }

    fun mostrarFormasLista(){
        println("----------LISTA--DE--FORMAS----------")

        listaFormas.forEach{ forma ->
            mostrarResultado(forma.mostrarForma(), forma.mostrarPrimeiroAtributo(), forma.mostrarSegundoAtributo(),forma.calcularArea(), forma.calcularPerimetro())
        }
    }

    private fun pedirAtributos(texto : String): Double {
        print(texto)
        return readln().toDouble()
    }
}