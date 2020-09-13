package aula1109kotlin.imprimivel

fun main(){
    val foto = Foto("Foto tirada no shopping")
    val documento = Documento("Exercício da aula")
    val contrato = Contrato("Contrato de compra e venda")
    val impressora = Impressora()

    impressora.adicionarNaLista(foto, documento, contrato)

    impressora.imprimirTudo()
}

