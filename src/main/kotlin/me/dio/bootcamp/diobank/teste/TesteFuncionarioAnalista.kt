package me.dio.bootcamp.diobank.teste

import me.dio.bootcamp.diobank.Analista
import me.dio.bootcamp.diobank.Funcionario


fun main() {
    val rafael = Analista("Rafael","123.456.789-01", 2500.00)
    ImprimeRelatorioFuncionario.imprimir(rafael)
}

