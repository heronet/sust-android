package com.heronet.sust.feature.campus.presentation.common.employee

import com.heronet.sust.feature.campus.domain.model.Employee

data class EmployeesState(
    val isLoading: Boolean = false,
    val employees: List<Employee> = emptyList(),
    val error: String = ""
)