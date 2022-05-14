package exercicio4.formas

class Retangulo (
    private val ladoParametro : Double,
    private val alturaParametro : Double
        ) : Quadrilateros(ladoParametro, ladoParametro, alturaParametro, alturaParametro){

    private var forma : String = "Retângulo"

    override fun mostrarPrimeiroAtributo(): Double {
        return ladoParametro
    }

    override fun mostrarSegundoAtributo(): Double {
        return alturaParametro
    }

    override fun mostrarForma(): String {
        return forma
    }

    override fun calcularArea(): Double {
        return ladoParametro * alturaParametro
    }

    override fun calcularPerimetro(): Double {
        return super.calcularPerimetro()
    }
}