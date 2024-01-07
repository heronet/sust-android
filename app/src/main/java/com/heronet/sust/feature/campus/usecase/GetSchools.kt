package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.model.School
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class GetSchools(
    private val repository: CampusRepository
) {
    operator fun invoke(): List<School> {
        return repository.getSchools()
    }
}