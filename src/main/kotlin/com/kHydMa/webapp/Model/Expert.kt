package com.kHydMa.webapp.Model
import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Expert(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
                val id: Int,
                val phone: String,
                val name: String,
                val gender: String,
                val age: Int,
                val address: String,
                val totalDeals:Int,
                val rate: Double,

//              var location: Map<BigDecimal, BigDecimal>?,
        @ElementCollection
        @OneToMany(fetch=FetchType.LAZY, cascade = arrayOf(CascadeType.ALL), mappedBy="location")
        @JoinColumn(name = "name")
                var services: Collection<Service>
        )