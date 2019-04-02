package com.kHydMa.webapp.Service

import com.kHydMa.webapp.Model.Expert
import org.springframework.data.repository.CrudRepository

interface ExpertService:CrudRepository<Expert,Int> {
}