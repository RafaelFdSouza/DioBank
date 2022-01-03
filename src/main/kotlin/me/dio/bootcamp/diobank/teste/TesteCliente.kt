package me.dio.bootcamp.diobank.teste

import me.dio.bootcamp.diobank.Cliente
import me.dio.bootcamp.diobank.ClienteTipo

fun main() {
    val maria = Cliente(
        "Maria",
        "111.222.333-44",
        ClienteTipo.PF,
        "123456"
    )

    println(maria)
    TesteAutenticacao().autentica(maria)
}