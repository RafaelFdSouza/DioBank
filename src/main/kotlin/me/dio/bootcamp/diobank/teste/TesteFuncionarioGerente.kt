package me.dio.bootcamp.diobank.teste

import me.dio.bootcamp.diobank.Gerente

fun main() {
    val joao = Gerente(
        "João",
        "222.333.444.55",
        7000.00,
        "senha123"
    )
    ImprimeRelatorioFuncionario.imprimir(joao)

    TesteAutenticacao().autentica(joao)
}