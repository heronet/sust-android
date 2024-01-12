package com.heronet.sust.feature.campus.data.remote.dto

import com.heronet.sust.feature.campus.domain.model.Employee

data class EmployeeDto(
    val id: String,
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val website: String? = null,
    val workplaceTitle: String
)

fun EmployeeDto.toEmployee() = Employee(
    id, name, jobTitle, phone, email, website, workplaceTitle
)
