package me.dio.bootcamp.diobank

class Pessoa {
    val nome: String = "Rafael"
    val cpf: String = "123.456.789-12"

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val rafael = Pessoa()
    println(rafael.pessoaInfo())

}