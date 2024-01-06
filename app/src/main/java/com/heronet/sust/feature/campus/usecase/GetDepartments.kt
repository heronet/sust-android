package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetDepartments(
    private val repository: CampusRepository
) {
    suspend operator fun invoke(): List<Department> {
        return repository.getDepartments()
    }
}