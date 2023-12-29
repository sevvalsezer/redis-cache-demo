package com.beyzasezer.rediscachedemo.controller

import com.beyzasezer.rediscachedemo.model.Product
import jakarta.annotation.PostConstruct
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController {

    val products = hashMapOf<String, Product>()

    @PostConstruct
    fun addProducts() {
        products["1"] = Product(id = 1L, "Product 1", 20.00)
        products["2"] = Product(id = 2L, "Product 2", 45.00)
        println(products.values)
    }

    @GetMapping
    @Cacheable(cacheNames = ["products"], key = "#root.methodName")
    fun getProducts(): List<Product> {
        println("Method invoked for get all products")
        return products.values.toList()
    }

    @Cacheable(cacheNames = ["products"], key = "#root.methodName + #id")
    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: String): Product {
        println("Method invoked for get product by id:$id")
        return products.getOrDefault(id, Product())
    }
}
