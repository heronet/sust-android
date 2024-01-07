package com.heronet.sust.feature.campus.presentation

import androidx.lifecycle.ViewModel
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.usecase.CampusUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CampusViewModel @Inject constructor(
    private val useCases: CampusUseCases
): ViewModel() {
    fun getSchools() = useCases.getSchools()
    fun getDepartments(school: String): List<Department> {
        return useCases.getDepartments(school)
    }
}