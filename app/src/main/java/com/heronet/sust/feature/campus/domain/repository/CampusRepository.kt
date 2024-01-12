package com.heronet.sust.feature.campus.domain.repository

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.util.CampusCategory
import com.heronet.sust.feature.common.Resource
import kotlinx.coroutines.flow.Flow

interface CampusRepository {
    fun getSchools(): List<CampusCategory>
    fun getDepartments(school: String): List<Department>
    fun getEmployees(workplaceType: String, workplaceTitle: String): Flow<Resource<List<Employee>>>
    suspend fun addEmployee(employee: Employee)

    fun getHalls(): List<CampusCategory>

    fun getOffices(): List<CampusCategory>
    fun getCenters(): List<CampusCategory>
}