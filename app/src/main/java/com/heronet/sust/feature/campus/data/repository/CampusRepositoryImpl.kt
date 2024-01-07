package com.heronet.sust.feature.campus.data.repository

import com.heronet.sust.feature.campus.data.local.database.CampusDao
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.model.School
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class CampusRepositoryImpl(
    private val dao: CampusDao
) : CampusRepository {
    override suspend fun getDepartmentEmployees(id: Long): List<Employee> {
        return dao.getDepartmentWithEmployees(id).employees
    }

    override suspend fun getDepartments(school: School?): List<Department> {
        return if (school != null) {
            dao.getDepartmentsBySchool(school.title)
        } else {
            dao.getDepartments()
        }
    }

    override suspend fun addDepartment(department: Department) {
        dao.insertDepartment(department)
    }

    override suspend fun addEmployee(employee: Employee) {
        dao.insertEmployee(employee)
    }

}