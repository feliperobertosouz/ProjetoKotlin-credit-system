package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Address
import me.dio.credit.application.system.entity.Customer
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto (
    @field:NotEmpty(message = "Invalid input") val firstName: String,
    @field:NotEmpty(message = "Invalid input")val lastName: String,

    @field:NotEmpty(message = "Invalid input")
    @CPF(message = "This is a invalid cpf")
    val cpf: String,
    @field:NotNull val income: BigDecimal,
    @field:NotEmpty(message = "Invalid input")
    @Email(message = "This is a invalid email")
    val email: String,
    @field:NotEmpty(message = "Invalid input")val password: String,
    val zipCode: String,
    val street: String
){

    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(this.zipCode,this.street)


    )
}