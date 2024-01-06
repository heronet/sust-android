package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class AddDepartment(
    private val repository: CampusRepository
) {
    suspend operator fun invoke(department: Department) {
        repository.addDepartment(department)
    }
}