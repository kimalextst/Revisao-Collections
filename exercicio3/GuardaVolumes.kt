package exercicio3

class GuardaVolumes (){
    private var numeroIdentificacao = 0
    private val objetos = HashMap<Int, Peca>()

    fun guardarPecas(objetoPeca: Peca): Int {
        numeroIdentificacao++

        objetos[numeroIdentificacao] = objetoPeca
        return numeroIdentificacao
    }

    fun mostrarPecas(numero : Int){
        if(objetos.containsKey(numero)){
            println(objetos[numero]?.retirada())
        } else {
            println("-------------------------------------------")
            println("Objeto não encontrado")
            println("-------------------------------------------")
        }
    }

    fun devolverPecas(numero: Int){
        if(objetos.containsKey(numero)){
            objetos.remove(numero)
            println("-------------------------------------------")
            println("Objeto retirado com sucesso")
            println("-------------------------------------------")
        } else {
            println("-------------------------------------------")
            println("Objeto não encontrado")
            println("-------------------------------------------")
        }
    }
}

/*
Criar o método mostrarPecas() na Classe
GuardaVolumes, que imprime na tela todas as peças que
estão no guarda-volumes, junto com o número
correspondente

○ Criar o método mostrarPecas(numero: Int) na classe
GuardaVolumes, que imprima as peças que estão
associadas ao número recebido

○ Criar o método devolverPecas(numero: Int) na Classe
GuardaVolumes, que remova a lista de peças que esta
associada ao número recebido.

● No arquivo Main, criar um cenário em que alguém guarda
duas peças, recebe o código e depois retira suas peças.

● Observação: o sistema deverá ser dinâmico, ou seja o usuário
irá inserir as iformações necessárias.*/