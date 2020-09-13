package aula1109kotlin.contas

class Cheque(val valor: Double, val bancoEmissor: String, val dataPagamento: String) {
    override fun toString(): String {
        return "cheque do banco $bancoEmissor no valor de R$ $valor na data $dataPagamento"
    }
}