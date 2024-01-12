package com.heronet.sust.feature.campus.presentation.center

import com.heronet.sust.feature.campus.domain.model.Employee

data class CenterEmployeesState(
    val isLoading: Boolean = false,
    val centerEmployees: List<Employee> = emptyList(),
    val error: String = ""
)
