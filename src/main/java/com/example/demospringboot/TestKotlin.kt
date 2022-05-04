package com.example.demospringboot

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestKotlin {

    companion object {
        val logger: Logger = LoggerFactory.getLogger(TestKotlin::class.java)
    }

    init {
        logger.info("This started")
    }

    @GetMapping
    fun test(): String {
        return "hi"
    }

}