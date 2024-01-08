package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetDepartments(
    private val repository: CampusRepository
) {
    operator fun invoke(school: String): List<Department> {
        return repository.getDepartments(school)
    }
}