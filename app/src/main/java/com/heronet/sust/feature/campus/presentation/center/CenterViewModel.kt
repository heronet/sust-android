package com.heronet.sust.feature.campus.presentation.center

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
class CenterViewModel @Inject constructor(
    private val useCases: CampusUseCases,
//    savedStateHandle: SavedStateHandle
): ViewModel() {
    private val _centerEmployeesState = mutableStateOf(CenterEmployeesState())
    val centerEmployeesState: State<CenterEmployeesState> = _centerEmployeesState

    init {
//        savedStateHandle.get<String>("centerName")?.let {
//            getCenterEmployees(it)
//            Log.d("CENTERN", it)
//        }
    }

    fun getCenterEmployees(centerName: String) {
        useCases.getCenterEmployees(centerName).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _centerEmployeesState.value =
                        CenterEmployeesState(centerEmployees = result.data ?: emptyList())
                }

                is Resource.Error -> {
                    _centerEmployeesState.value = CenterEmployeesState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _centerEmployeesState.value = CenterEmployeesState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}