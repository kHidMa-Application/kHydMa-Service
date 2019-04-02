package com.kHydMa.webapp.Controller
import com.kHydMa.webapp.Service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @Autowired
    lateinit var service: CustomerService
}