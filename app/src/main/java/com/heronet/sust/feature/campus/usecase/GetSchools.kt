package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.util.CampusCategory

class GetSchools(
    private val repository: CampusRepository
) {
    operator fun invoke(): List<CampusCategory> {
        return repository.getSchools()
    }
}