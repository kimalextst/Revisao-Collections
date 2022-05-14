package exercicio4.formas

import exercicio4.formas.Forma

abstract class Quadrilateros (
    private val primeiroLado : Double,
    private val segundoLado : Double,
    private val primeiraAltura : Double,
    private val segundaAltura : Double
        ) : Forma {

    override fun calcularPerimetro(): Double {
        return primeiroLado + segundoLado + primeiraAltura + segundaAltura
    }

    override fun calcularArea(): Double {
        TODO("Not yet implemented")
    }
}