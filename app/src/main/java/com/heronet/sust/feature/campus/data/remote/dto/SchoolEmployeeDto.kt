package com.heronet.sust.feature.campus.data.remote.dto

data class SchoolEmployeeDto(
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val website: String? = null,
    val departmentName: String
)
