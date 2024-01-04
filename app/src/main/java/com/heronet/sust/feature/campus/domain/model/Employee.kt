package com.heronet.sust.feature.campus.domain.model

data class Employee(
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val website: String? = null
)
