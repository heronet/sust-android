package com.heronet.sust.feature.campus.usecase

import com.heronet.sust.feature.campus.domain.model.Teacher
import com.heronet.sust.feature.campus.domain.repository.CampusRepository

class AddTeacher(
    private val repository: CampusRepository
) {
    suspend operator fun invoke(teacher: Teacher) {
        repository.addTeacher(teacher)
    }
}