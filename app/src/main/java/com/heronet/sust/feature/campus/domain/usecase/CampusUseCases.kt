package com.heronet.sust.feature.campus.domain.usecase

data class CampusUseCases(
    val getSchools: GetSchools,
    val getDepartments: GetDepartments,
    val getCenterEmployees: GetCenterEmployees,
    val addSchoolEmployee: AddSchoolEmployee,
    val getHalls: GetHalls,
    val getOffices: GetOffices,
    val getCenters: GetCenters,
)
