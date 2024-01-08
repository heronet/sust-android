package com.heronet.sust.feature.campus.presentation.center

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.heronet.sust.feature.campus.domain.model.CenterEmployee

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
//                Employee(employee = it)
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Employee(
//    employee: CenterEmployee
) {
    Card(
        modifier = Modifier.padding(8.dp).height(96.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            AsyncImage(
                model = "https://www.sust.edu/uploads/profile-images/1513593908.jpg",
                contentDescription = "image",
                modifier = Modifier
                    .fillMaxHeight()
            )
            Column(
                Modifier.padding(8.dp)
            ) {
                Text(
                    text = "Employee",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
//                Text(
//                    text = employee.name,
//                    style = MaterialTheme.typography.titleMedium,
//                    modifier = Modifier.padding(bottom = 4.dp)
//                )
//                Text(
//                    text = employee.jobTitle,
//                    style = MaterialTheme.typography.titleMedium,
//                    modifier = Modifier.padding(bottom = 4.dp)
//                )
//                Text(
//                    text = employee.phone,
//                    style = MaterialTheme.typography.titleMedium,
//                    modifier = Modifier.padding(bottom = 4.dp)
//                )
//                Text(
//                    text = employee.email,
//                    style = MaterialTheme.typography.titleMedium,
//                    modifier = Modifier.padding(bottom = 4.dp)
//                )
            }
        }
    }
}