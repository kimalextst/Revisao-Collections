package exercicio4.formas

const val PI = 3.14

class Circulo (val raioParametro : Double) : Forma {

    private var forma : String = "Círculo"

    override fun mostrarPrimeiroAtributo(): Double {
        return raioParametro
    }

    override fun mostrarSegundoAtributo(): Double {
        return 0.0
    }

    override fun mostrarForma(): String {
        return forma
    }

    override fun calcularArea(): Double {
        return PI * (raioParametro * raioParametro)
    }

    override fun calcularPerimetro(): Double {
        return 2 * PI * raioParametro
    }
}