package exercicio1e2

fun main(){
    val listaExercicio1 = mutableListOf<Int>()
    listaExercicio1.add(1)
    listaExercicio1.add(5)
    listaExercicio1.add(5)
    listaExercicio1.add(6)
    listaExercicio1.add(7)
    listaExercicio1.add(8)
    listaExercicio1.add(8)
    listaExercicio1.add(8)
    println(listaExercicio1)

    val listaExercicio2 = mutableSetOf<Int>()
    listaExercicio2.addAll(listaExercicio1)
    println(listaExercicio2)
}


/*List : Mostra todos os elementos da lista
* Set: Mostra elementos na lista sem repetir. Se houver dois numeros iguais por exempro, mostrará
* apenas uma vez */