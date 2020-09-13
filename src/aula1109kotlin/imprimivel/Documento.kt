package aula1109kotlin.imprimivel

class Documento(override val nome: String) : Imprimivel {
    override val tipoDocumento = "documento Word"
    override fun imprimir(){
        println("Eu sou um $tipoDocumento. Nome: $nome.")
    }

}