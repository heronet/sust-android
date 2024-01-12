package com.heronet.sust.feature.campus.presentation.school.departments

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.heronet.sust.feature.campus.domain.usecase.CampusUseCases
import com.heronet.sust.feature.common.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class DepartmentViewModel @Inject constructor(
    private val useCases: CampusUseCases
): ViewModel() {
    private val _state = mutableStateOf(DepartmentEmployeesState())
    val state: State<DepartmentEmployeesState> = _state

    fun getDepartmentEmployees(title: String) {
        useCases.getDepartmentEmployees(title).onEach { resource ->
            when(resource) {
                is Resource.Error -> {
                    _state.value = DepartmentEmployeesState(error = resource.message ?: "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = DepartmentEmployeesState(isLoading = true)
                }
                is Resource.Success -> {
                    _state.value = DepartmentEmployeesState(employees = resource.data ?: emptyList())
                }
            }
        }.launchIn(viewModelScope)
    }
}