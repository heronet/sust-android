package com.heronet.sust.feature.campus.usecase

data class CampusUseCases(
    val getSchools: GetSchools,
    val getDepartments: GetDepartments,
    val addTeacher: AddTeacher,
    val getHalls: GetHalls,
    val getOffices: GetOffices,
    val getCenters: GetCenters
)
