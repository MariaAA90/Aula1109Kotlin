package aula1109kotlin.imprimivel

class Contrato(override val nome: String) : Imprimivel {
    override val tipoDocumento = "contrato"
    override fun imprimir(){
        println("Sou um $tipoDocumento muito legal. Nome: $nome.")
    }

}