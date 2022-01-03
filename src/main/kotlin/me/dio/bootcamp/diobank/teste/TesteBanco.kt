package me.dio.bootcamp.diobank.teste

import me.dio.bootcamp.diobank.Banco

fun main() {
    val dioBanco = Banco(nome = "DioBank", numero = 12)

    println(dioBanco.bancoInfo())

}