package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetCenters(
    private val repository: CampusRepository
) {
    operator fun invoke() = repository.getCenters()
}