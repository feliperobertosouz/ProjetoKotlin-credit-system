package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Credit
import java.util.UUID

interface ICreditService {

    fun save(credit: Credit): Credit

    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit

    fun findAllByCustomerId(customerId: Long): List<Credit>


}