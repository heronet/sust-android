package com.heronet.sust.feature.campus.usecase

data class CampusUseCases(
    val getDepartmentEmployees: GetDepartmentEmployees,
    val getDepartments: GetDepartments,
    val addDepartment: AddDepartment,
    val addEmployee: AddEmployee
)
