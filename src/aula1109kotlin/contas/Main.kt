package aula1109kotlin.contas

fun main() {
    val cliente1 = Cliente(1234,"Armelin","333333","33333")
    val cliente2 = Cliente(4321,"Santos","44444","11111")
    val conta1 = ContaCorrente(cliente1, 10000.00, 500.00)
    val conta2 = ContaPoupanca(cliente2, 5000.00)
    val cheque = Cheque(300.00, "Caixa", "11/09/20")

    conta1.depositarCheque(cheque)
    conta2.depositar(145.68)
    conta2.recolherJuros()
    conta1.sacar(0.55)
    conta2.sacar(1000000000.00)
    conta1.consultarSaldo()
    conta2.consultarSaldo()
}