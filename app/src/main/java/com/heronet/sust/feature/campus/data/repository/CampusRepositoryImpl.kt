package com.heronet.sust.feature.campus.data.repository

import com.heronet.sust.feature.campus.data.local.database.CampusDao
import com.heronet.sust.feature.campus.domain.model.Center
import com.heronet.sust.feature.campus.domain.model.Teacher
import com.heronet.sust.feature.campus.domain.model.Hall
import com.heronet.sust.feature.campus.domain.model.Office
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.util.Constants

class CampusRepositoryImpl(
    private val dao: CampusDao
) : CampusRepository {
    override fun getSchools() = Constants.schools

    override fun getDepartments(school: String) =
        Constants.departments.filter { dept -> dept.school == school }

    override suspend fun getTeachers(department: String): List<Teacher> {
        return dao.getTeachers(department)
    }
    override suspend fun addTeacher(teacher: Teacher) {
        dao.insertTeacher(teacher)
    }

    override fun getHalls(): List<Hall> = Constants.halls
    override fun getOffices(): List<Office> = Constants.offices
    override fun getCenters(): List<Center> = Constants.centers

}