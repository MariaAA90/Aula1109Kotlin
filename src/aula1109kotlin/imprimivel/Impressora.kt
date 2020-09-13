package aula1109kotlin.imprimivel

class Impressora {
    val listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionarNaLista(vararg imprimiveis: Imprimivel){
        listaImprimivel.addAll(imprimiveis)
    }

    fun imprimirTudo(){
        for (imprimivel: Imprimivel in listaImprimivel){
            imprimivel.imprimir()
        }
    }
}