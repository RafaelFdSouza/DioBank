package me.dio.bootcamp.diobank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) :
    Funcionario(nome, cpf, salario), Logavel {
    override fun calculoBonus(): Double = salario * 0.15

    override fun login(): Boolean = "senha123" ==senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Bonus: ${calculoBonus()}
        
    """.trimIndent()
}