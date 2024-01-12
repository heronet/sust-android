package com.heronet.sust.feature.campus.domain.usecase

data class CampusUseCases(
    val getSchools: GetSchools,
    val getDepartments: GetDepartments,
    val getEmployees: GetEmployees,
    val addEmployee: AddEmployee,
    val getHalls: GetHalls,
    val getOffices: GetOffices,
    val getCenters: GetCenters,
)
