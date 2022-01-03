package me.dio.bootcamp.diobank


class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override fun calculoBonus(): Double = salario * 0.1

    override fun toString(): String =
        """
           Nome: $nome
           CPF: $cpf
           Salario: $salario
           Bonus: ${calculoBonus()}            
        """.trimIndent()


}


