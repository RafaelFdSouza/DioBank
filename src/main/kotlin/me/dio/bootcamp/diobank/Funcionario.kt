package me.dio.bootcamp.diobank


abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoBonus(): Double
}