package aula1109kotlin.contas

class ContaCorrente(override val cliente: Cliente, override var saldo: Double, var limiteChequeEspecial: Double) : Conta {

    fun depositarCheque(cheque: Cheque){
        saldo += cheque.valor
        println("Depositado $cheque")
    }

    override fun sacar(valor: Double) {
        if (saldo + limiteChequeEspecial >= valor) {
            println("Saque realizado")
            saldo -= valor
        }
        else {
            println("Saldo insuficiente")
        }
    }
}