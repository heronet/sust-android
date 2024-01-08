package com.heronet.sust.feature.campus.domain.repository

import com.heronet.sust.feature.campus.domain.model.CenterEmployee
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.SchoolEmployee
import com.heronet.sust.feature.campus.util.CampusCategory

interface CampusRepository {
    fun getSchools(): List<CampusCategory>
    fun getDepartments(school: String): List<Department>
    suspend fun getSchoolEmployees(department: String): List<SchoolEmployee>
    suspend fun addSchoolEmployee(schoolEmployee: SchoolEmployee)

    suspend fun getCenterEmployees(centerName: String): List<CenterEmployee>

    fun getHalls(): List<CampusCategory>

    fun getOffices(): List<CampusCategory>
    fun getCenters(): List<CampusCategory>
}