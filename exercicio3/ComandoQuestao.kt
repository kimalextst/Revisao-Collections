package exercicio3

/*SaveTheRoupa S.A.

A SaveTheRoupa S.A. é uma empresa que deseja implementar um
sistema informatizado de guarda-volumes de nível mundial. O
sistema permite que uma pessoa guarde seus pertences no
guarda-volumes e depois os retire de maneira simples, bastando
apenas apresentar o número de identificação recebido.
Os pertences são representados no sistema por algo abstrato
chamado peça, que tem marca e modelo.

● Criar a classe abstrata Peca, que contenha os atributos marca e
modelo, ambas de tipo String e um método abstrato chamado
retirada.

● Criar a classe GuardaVolumes, que contenha como atributo
um dicionário e um contador que será utilizado como
identificador. As chaves do dicionário serão Integer e, como
valor, haverá uma lista de peças

○ Criar o método guardarPecas(listaDePeca:
ArrayList<Peca>): Int na Classe GuardaVolumes, que
recebe uma lista de peças adiciona essa lista de peças
em nosso dicionário e retorna o número de identificação,
ou seja, a chave do dicionário onde guardamos as peças,
que neste caso é o nosso contador

○ Criar o método mostrarPecas() na Classe
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