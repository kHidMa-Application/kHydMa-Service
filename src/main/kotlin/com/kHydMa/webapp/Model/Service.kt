package com.kHydMa.webapp.Model

import javax.persistence.Embeddable
import javax.persistence.Entity

@Entity
@Embeddable
class Service(val type:String,val name:String)