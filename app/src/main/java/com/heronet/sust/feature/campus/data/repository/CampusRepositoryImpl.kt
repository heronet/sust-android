package com.heronet.sust.feature.campus.data.repository

import com.heronet.sust.feature.campus.data.local.database.CampusDao
import com.heronet.sust.feature.campus.data.remote.CampusApi
import com.heronet.sust.feature.campus.data.remote.dto.toCenterEmployee
import com.heronet.sust.feature.campus.domain.model.CenterEmployee
import com.heronet.sust.feature.campus.domain.model.SchoolEmployee
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

    override suspend fun getSchoolEmployees(department: String): List<SchoolEmployee> {
        return dao.getSchoolEmployees(department)
    }
    override suspend fun addSchoolEmployee(schoolEmployee: SchoolEmployee) {
        dao.insertSchoolEmployee(schoolEmployee)
    }

    override suspend fun getCenterEmployees(centerName: String): List<CenterEmployee> {
        return api.getCenterEmployees(centerName).map { it.toCenterEmployee() }
    }

    override fun getHalls(): List<CampusCategory> = Constants.halls
    override fun getOffices(): List<CampusCategory> = Constants.offices
    override fun getCenters(): List<CampusCategory> = Constants.centers

}