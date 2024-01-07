package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetOffices(
    private val repository: CampusRepository
) {
    operator fun invoke() = repository.getOffices()
}