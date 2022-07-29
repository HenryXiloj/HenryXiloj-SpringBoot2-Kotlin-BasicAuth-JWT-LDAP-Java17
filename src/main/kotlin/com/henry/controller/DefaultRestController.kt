package com.henry.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal
import java.util.*


@RestController
class DefaultRestController {
    @GetMapping("/principal")
    fun user(principal: Principal): Principal {
        return principal
    }

    @GetMapping("/users")
    fun hello(principal: Principal): Map<String, String>? {
        return Collections.singletonMap("response", "Hello ${principal.name}")
    }

}