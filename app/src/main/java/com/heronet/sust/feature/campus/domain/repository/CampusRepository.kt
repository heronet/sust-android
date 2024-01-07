package com.heronet.sust.feature.campus.domain.repository

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Teacher
import com.heronet.sust.feature.campus.util.CampusCategory

interface CampusRepository {
    fun getSchools(): List<CampusCategory>
    fun getDepartments(school: String): List<Department>
    suspend fun getTeachers(department: String): List<Teacher>
    suspend fun addTeacher(teacher: Teacher)

    fun getHalls(): List<CampusCategory>

    fun getOffices(): List<CampusCategory>
    fun getCenters(): List<CampusCategory>
}