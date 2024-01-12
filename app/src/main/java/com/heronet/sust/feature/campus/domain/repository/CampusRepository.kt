package com.heronet.sust.feature.campus.domain.repository

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.util.CampusCategory
import com.heronet.sust.feature.common.Resource
import kotlinx.coroutines.flow.Flow

interface CampusRepository {
    fun getSchools(): List<CampusCategory>
    fun getDepartments(school: String): List<Department>
    fun getDepartmentEmployees(department: String): Flow<Resource<List<Employee>>>
    suspend fun addDepartmentEmployee(employee: Employee)

    suspend fun getCenterEmployees(centerName: String): List<Employee>

    fun getHalls(): List<CampusCategory>

    fun getOffices(): List<CampusCategory>
    fun getCenters(): List<CampusCategory>
}