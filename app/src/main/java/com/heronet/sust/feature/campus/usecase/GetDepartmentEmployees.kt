package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetDepartmentEmployees(
    private val repository: CampusRepository
) {
    suspend operator fun invoke(id: Long): List<Employee> {
        return repository.getDepartmentEmployees(id)
    }
}