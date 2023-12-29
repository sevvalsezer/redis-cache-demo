package com.beyzasezer.rediscachedemo.model

import java.io.Serializable

data class Product(
    val id: Long? = null,
    val name: String? = null,
    val price: Double? = null
) : Serializable
