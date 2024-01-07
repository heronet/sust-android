package com.heronet.sust.feature.campus.data.repository

import com.heronet.sust.feature.campus.data.local.database.CampusDao
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.util.Constants

class CampusRepositoryImpl(
    private val dao: CampusDao
) : CampusRepository {
    override fun getSchools() = Constants.schools

    override fun getDepartments(school: String) =
        Constants.departments.filter { dept -> dept.school == school }

    override suspend fun getEmployees(affiliation: String) {
        dao.getEmployees(affiliation)
    }
    override suspend fun addEmployee(employee: Employee) {
        dao.insertEmployee(employee)
    }

}