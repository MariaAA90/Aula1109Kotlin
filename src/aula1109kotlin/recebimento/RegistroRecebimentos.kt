package aula1109kotlin.recebimento

class RegistroRecebimentos() {
    val listaRecebimentos = mutableListOf<IRecebivel>()

    fun adicionarRecebimento(vararg r: IRecebivel){
        listaRecebimentos.addAll(r)
    }

    fun apresentarRecebimentos(){
        for (recebimento in listaRecebimentos){
            println("$recebimento - Valor Total: ${recebimento.totalizarReceita()}")
        }
    }
}