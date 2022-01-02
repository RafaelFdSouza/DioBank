package me.dio.bootcamp.diobanktest

import me.dio.bootcamp.diobank.Banco

fun main() {
    val dioBank = Banco(nome = "DioBank", numero = 12)
    println(dioBank.bancoInfo())

}
