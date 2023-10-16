package me.dio.credit.application.system.entity

data class Customer(
    var firstName: String = "",
    var lastName: String = "",
    var cpf: String = "",
    var email: String = "",
    var address: Address = Address(),
    var credits: List<Credit> = listOf(),
    var id: Long? = null,
)