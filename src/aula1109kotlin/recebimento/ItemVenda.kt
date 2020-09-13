package aula1109kotlin.recebimento

class ItemVenda(val produto: String, val quantidade: Int, val valor: Double) : IRecebivel {
    override fun totalizarReceita(): Double {
        return quantidade * valor
    }

    override fun toString(): String {
        return "Produto $produto; quantidade $quantidade; valor unitário $valor"
    }
}