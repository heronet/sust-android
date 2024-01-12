package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetEmployees(
    private val repository: CampusRepository
) {
    operator fun invoke(type: String, title: String) = repository.getEmployees(type, title)
}