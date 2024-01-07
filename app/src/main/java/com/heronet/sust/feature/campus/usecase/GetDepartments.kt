package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.School
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetDepartments(
    private val repository: CampusRepository
) {
    suspend operator fun invoke(school: School? = null): List<Department> {
        return repository.getDepartments(school)
    }
}