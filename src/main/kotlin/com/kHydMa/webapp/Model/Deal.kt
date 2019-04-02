package com.kHydMa.webapp.Model

import java.math.BigDecimal

 data class Deal(
         val customer: Customer,
         val expert: Expert,
         val service:Pair<String,String?>,//<service, detail + pose/age + amount>
         val price:BigDecimal,
         val time:String,
         val booking:String?
                    )




