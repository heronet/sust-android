package com.heronet.sust.feature.campus.domain.repository

import com.heronet.sust.feature.campus.domain.model.Center
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Teacher
import com.heronet.sust.feature.campus.domain.model.Hall
import com.heronet.sust.feature.campus.domain.model.Office
import com.heronet.sust.feature.campus.domain.model.School

interface CampusRepository {
    fun getSchools(): List<School>
    fun getDepartments(school: String): List<Department>
    suspend fun getTeachers(department: String): List<Teacher>
    suspend fun addTeacher(teacher: Teacher)

    fun getHalls(): List<Hall>

    fun getOffices(): List<Office>
    fun getCenters(): List<Center>
}