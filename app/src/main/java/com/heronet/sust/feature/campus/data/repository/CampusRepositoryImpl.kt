package com.heronet.sust.feature.campus.data.repository

import com.heronet.sust.feature.campus.data.local.database.CampusDao
import com.heronet.sust.feature.campus.data.remote.CampusApi
import com.heronet.sust.feature.campus.data.remote.dto.toEmployee
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.util.CampusCategory
import com.heronet.sust.feature.campus.util.Constants
import javax.inject.Inject

class CampusRepositoryImpl @Inject constructor(
    private val dao: CampusDao,
    private val api: CampusApi
) : CampusRepository {
    override fun getSchools() = Constants.schools

    override fun getDepartments(school: String) =
        Constants.departments.filter { dept -> dept.school == school }

    override suspend fun getDepartmentEmployees(department: String): List<Employee> {
        return api.getEmployees(type =  "department", title = department).map { it.toEmployee() }
    }
    override suspend fun addDepartmentEmployee(employee: Employee) {
        dao.insertDepartmentEmployee(employee)
    }

    override suspend fun getCenterEmployees(centerName: String): List<Employee> {
        return api.getEmployees(type = "center", title = centerName).map { it.toEmployee() }
    }

    override fun getHalls(): List<CampusCategory> = Constants.halls
    override fun getOffices(): List<CampusCategory> = Constants.offices
    override fun getCenters(): List<CampusCategory> = Constants.centers

}