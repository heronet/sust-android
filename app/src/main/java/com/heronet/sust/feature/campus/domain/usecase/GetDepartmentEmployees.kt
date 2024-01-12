package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetDepartmentEmployees(
    private val repository: CampusRepository
) {
    operator fun invoke(title: String) = repository.getDepartmentEmployees(title)
}