package com.heronet.sust.feature.campus.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.usecase.CampusUseCases
import kotlinx.coroutines.launch

class CampusViewModel(
    private val useCases: CampusUseCases
): ViewModel() {
    var departments by mutableStateOf(listOf<Department>())
        private set

    fun getDepartments() {
        viewModelScope.launch {
            departments = useCases.getDepartments()
        }
    }

    fun addDepartment() {
        viewModelScope.launch {
            val department = Department(
                title = "Physics",
                description = "Department of phy",
                school = "Physical Sciences"
            )
            useCases.addDepartment(department)
        }
    }
}