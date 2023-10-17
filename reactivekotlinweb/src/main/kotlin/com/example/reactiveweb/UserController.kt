package com.example.reactiveweb

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@RestController
@RequestMapping("/users")
class UserController {

    @GetMapping
    fun getUsers(): Mono<List<String>> {
        //return Mono.just("")
        return listOf<String>("Subramanian", "Murugan").toMono()
    }

    @GetMapping("/coroutine")
    suspend fun getValue(): List<String> {
        delay(10000L)
        return listOf<String>("Subramanian", "Murugan");
    }
}