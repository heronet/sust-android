package com.heronet.sust.feature.campus.presentation.common.employee

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
class EmployeesViewModel @Inject constructor(
    private val useCases: CampusUseCases
) : ViewModel() {
    private val _state = mutableStateOf(EmployeesState())
    val state: State<EmployeesState> = _state

    fun getEmployees(type: String, title: String) {
        useCases.getEmployees(type, title).onEach { resource ->
            when (resource) {
                is Resource.Error -> {
                    _state.value = EmployeesState(
                        error = resource.message ?: "An unexpected error occurred",
                        employees = resource.data ?: emptyList(),
                        isLoading = false
                    )
                }

                is Resource.Loading -> {
                    _state.value = EmployeesState(
                        isLoading = true,
                        employees = resource.data ?: emptyList()
                    )
                }

                is Resource.Success -> {
                    _state.value =
                        EmployeesState(
                            employees = resource.data ?: emptyList(),
                            isLoading = false,
                            error = ""
                        )
                }
            }
        }.launchIn(viewModelScope)
    }
}