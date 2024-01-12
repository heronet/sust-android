package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class AddEmployee(
    private val repository: CampusRepository
) {
    suspend operator fun invoke(employee: Employee) {
        repository.addEmployee(employee)
    }
}