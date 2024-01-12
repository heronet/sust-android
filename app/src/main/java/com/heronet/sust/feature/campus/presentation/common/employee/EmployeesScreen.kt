package com.heronet.sust.feature.campus.presentation.common.employee

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun EmployeesScreen(workplaceType: String, workplaceTitle: String) {
    val employeesViewModel = hiltViewModel<EmployeesViewModel>()

    val state = employeesViewModel.state.value

    LaunchedEffect(Unit) {
        employeesViewModel.getEmployees(workplaceType, workplaceTitle)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(state.employees) {
                EmployeeItem(employee = it)
            }
        }

        if (state.error.isNotBlank() && state.employees.isEmpty()) {
            Text(text = state.error, color = MaterialTheme.colorScheme.error)
        }
        if (state.isLoading && state.employees.isEmpty()) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}