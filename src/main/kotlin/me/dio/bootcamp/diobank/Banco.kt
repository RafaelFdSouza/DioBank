package me.dio.bootcamp.diobank

data class Banco(
    val nome:String = "DioBank",
    val numero: Int = 12
){
    fun bancoInfo() = "Banco: $nome - Número: $numero"
}
