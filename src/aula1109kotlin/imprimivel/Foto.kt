package aula1109kotlin.imprimivel

class Foto(override val nome: String) : Imprimivel {
    override val tipoDocumento = "selfie"
    override fun imprimir(){
        println("Eu sou uma $tipoDocumento. Nome: $nome.")
    }

}