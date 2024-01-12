package com.heronet.sust.feature.campus.presentation.school.departments

import com.heronet.sust.feature.campus.domain.model.Employee

data class DepartmentEmployeesState(
    val isLoading: Boolean = false,
    val employees: List<Employee> = emptyList(),
    val error: String = ""
)