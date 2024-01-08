package com.heronet.sust.feature.campus.presentation.center

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
fun CenterEmployeesScreen(centerName: String) {
    val centerViewModel = hiltViewModel<CenterViewModel>()

    val state = centerViewModel.centerEmployeesState.value

    LaunchedEffect(Unit) {
        centerViewModel.getCenterEmployees(centerName)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(state.centerEmployees) {
                Text(text = it.name)
            }
        }
        if (state.centerEmployees.isEmpty()) {
            Text(text = "No Employees")
        }

        if (state.error.isNotBlank()) {
            Text(text = state.error, color = MaterialTheme.colorScheme.error)
        }
        if(state.isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}