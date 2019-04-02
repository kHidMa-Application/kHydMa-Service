package com.kHydMa.webapp.Model
import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
                    val id : Int,
                    val name: String,
                    val gender: String,
                    val phone: String,
//        @ElementCollection
//                    var location: Map<BigDecimal,BigDecimal>?,
                    val rate: Double,
                    var totalSpend:BigDecimal)