package com.heronet.sust.feature.campus.presentation.center

import com.heronet.sust.feature.campus.domain.model.CenterEmployee

data class CenterEmployeesState(
    val isLoading: Boolean = false,
    val centerEmployees: List<CenterEmployee> = emptyList(),
    val error: String = ""
)
