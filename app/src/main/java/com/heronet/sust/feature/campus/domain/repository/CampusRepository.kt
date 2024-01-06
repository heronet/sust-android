package com.heronet.sust.feature.campus.domain.repository

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Employee

interface CampusRepository {
    suspend fun getDepartmentEmployees(id: Long): List<Employee>

    suspend fun getDepartments(): List<Department>

    suspend fun addDepartment(department: Department)

    suspend fun addEmployee(employee: Employee)
}