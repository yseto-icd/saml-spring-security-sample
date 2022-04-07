package com.example.demo.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun root(): String {
        return "this is root"
    }
    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }
    @GetMapping("/dontneed")
    fun dontneed(): String {
        return "dont need authorize"
    }
}
