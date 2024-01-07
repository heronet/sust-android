package com.heronet.sust.feature.campus.domain.repository

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.model.Hall
import com.heronet.sust.feature.campus.domain.model.School

interface CampusRepository {
    fun getSchools(): List<School>
    fun getDepartments(school: String): List<Department>
    suspend fun getEmployees(affiliation: String): List<Employee>
    suspend fun addEmployee(employee: Employee)

    fun getHalls(): List<Hall>
}