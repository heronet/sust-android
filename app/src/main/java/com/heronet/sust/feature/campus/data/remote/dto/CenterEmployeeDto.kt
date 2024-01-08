package com.heronet.sust.feature.campus.data.remote.dto

import com.heronet.sust.feature.campus.domain.model.CenterEmployee

data class CenterEmployeeDto(
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val centerName: String
)

fun CenterEmployeeDto.toCenterEmployee() = CenterEmployee(
    name,
    jobTitle,
    phone,
    email,
    centerName
)