package aula1109kotlin.contas

class ContaPoupanca(override val cliente: Cliente, override var saldo: Double) : Conta {
    val taxaJuros = 0.005

    override fun sacar(valor: Double) {
        if (saldo >= valor) {
            println("Saque realizado")
            saldo -= valor
        }
        else {
            println("Saldo insuficiente")
        }
    }

    fun recolherJuros() {
        saldo += saldo * taxaJuros
        println("Os juros foram recolhidos")
    }
}