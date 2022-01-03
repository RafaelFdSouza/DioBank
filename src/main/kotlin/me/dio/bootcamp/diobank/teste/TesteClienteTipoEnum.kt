package me.dio.bootcamp.diobank.teste

import me.dio.bootcamp.diobank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
}
