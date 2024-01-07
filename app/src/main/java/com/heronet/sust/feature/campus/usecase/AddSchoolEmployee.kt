package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.model.SchoolEmployee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class AddSchoolEmployee(
    private val repository: CampusRepository
) {
    suspend operator fun invoke(schoolEmployee: SchoolEmployee) {
        repository.addSchoolEmployee(schoolEmployee)
    }
}