package com.heronet.sust.feature.campus.presentation.school

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.heronet.sust.core.presentation.components.CategoryDetailedItem
import com.heronet.sust.feature.campus.presentation.CampusViewModel

@Composable
fun DepartmentsScreen(schoolName: String) {
    val campusViewModel = hiltViewModel<CampusViewModel>()
    val departments = remember {
        campusViewModel.getDepartments(schoolName)
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(departments) {
            CategoryDetailedItem(
                title = "Department of ${it.title}",
                description = it.description,
                onClick = {}
            )
        }
    }
}

