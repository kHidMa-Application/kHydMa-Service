package com.kHydMa.webapp.Service
import com.kHydMa.webapp.Model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerService:CrudRepository<Customer,Int> {
}