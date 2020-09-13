package aula1109kotlin.recebimento

fun main() {
    val itemVenda = ItemVenda("camisetas", 10, 50.00)
    val servico = Servico("Passar camisetas", 2, 15.00)
    val registroRecebimentos = RegistroRecebimentos()

    registroRecebimentos.adicionarRecebimento(itemVenda, servico)
    registroRecebimentos.apresentarRecebimentos()
}