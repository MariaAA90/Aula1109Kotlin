package aula1109kotlin.recebimento

class Servico(val descricao: String, val horas: Int, val precoHora: Double) : IRecebivel {
    override fun totalizarReceita(): Double {
        return horas * precoHora
    }

    override fun toString(): String {
        return "Serviço $descricao; preço por hora $precoHora; horas $horas"
    }
}