package com.beyzasezer.rediscachedemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class RedisCacheDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(RedisCacheDemoApplication::class.java, *args)
}
