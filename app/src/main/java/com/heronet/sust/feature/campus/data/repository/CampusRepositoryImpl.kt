package com.heronet.sust.feature.campus.data.repository

import com.heronet.sust.feature.campus.data.local.database.CampusDao
import com.heronet.sust.feature.campus.domain.model.SchoolEmployee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.util.CampusCategory
import com.heronet.sust.feature.campus.util.Constants

class CampusRepositoryImpl(
    private val dao: CampusDao
) : CampusRepository {
    override fun getSchools() = Constants.schools

    override fun getDepartments(school: String) =
        Constants.departments.filter { dept -> dept.school == school }

    override suspend fun getSchoolEmployees(department: String): List<SchoolEmployee> {
        return dao.getSchoolEmployees(department)
    }
    override suspend fun addSchoolEmployee(schoolEmployee: SchoolEmployee) {
        dao.insertSchoolEmployee(schoolEmployee)
    }

    override fun getHalls(): List<CampusCategory> = Constants.halls
    override fun getOffices(): List<CampusCategory> = Constants.offices
    override fun getCenters(): List<CampusCategory> = Constants.centers

}