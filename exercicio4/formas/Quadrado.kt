package exercicio4.formas

class Quadrado (
    private val ladoParametro : Double,
) : Quadrilateros(ladoParametro, ladoParametro, ladoParametro, ladoParametro){

    private var forma : String = "Quadrado"

    override fun mostrarPrimeiroAtributo(): Double {
        return ladoParametro
    }

    override fun mostrarSegundoAtributo(): Double {
        return ladoParametro
    }

    override fun mostrarForma(): String {
        return forma
    }

    override fun calcularArea(): Double {
        return ladoParametro * ladoParametro
    }

    override fun calcularPerimetro(): Double {
        return super.calcularPerimetro()
    }
}