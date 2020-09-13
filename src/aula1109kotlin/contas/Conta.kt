package aula1109kotlin.contas

interface Conta {
    val cliente: Cliente
    var saldo: Double

    fun depositar(valor: Double) {
        println("Depósito realizado")
        saldo += valor
    }

    fun consultarSaldo() {
        println("O seu saldo é de R$ $saldo")
    }

    fun sacar(valor: Double)
}