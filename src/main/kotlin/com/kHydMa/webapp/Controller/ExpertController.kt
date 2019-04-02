package com.kHydMa.webapp.Controller
import com.kHydMa.webapp.Service.ExpertService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*



@RestController
class ExpertController {

    @Autowired
    lateinit var service:ExpertService
}

//    region get and post
//    @GetMapping("/expert")
//    fun get(): List<Expert> {
//        return listOf(Expert(1,"0798654312","Hbow arrow","man",25,"Draria",2,4.5,null,listOf(
//                Service("plomberie", "wc"),
//                Service("Infermerie", "Pansement"),
//                Service("Infermerie", "Pansement"))))
//
//    }
//
//    @PostMapping("/expert")
//    fun post(@RequestBody expert: Expert): Expert {
//        return expert
//    }
//    endregion