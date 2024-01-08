package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetHalls(
    private val repository: CampusRepository
) {
    operator fun invoke() = repository.getHalls()
}