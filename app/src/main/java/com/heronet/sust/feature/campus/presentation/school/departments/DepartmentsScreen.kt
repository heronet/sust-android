package com.heronet.sust.feature.campus.presentation.school.departments

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.heronet.sust.feature.campus.presentation.CampusViewModel
import com.heronet.sust.feature.campus.presentation.common.components.CategoryDetailedItem
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun DepartmentsScreen(schoolName: String, navController: NavController) {
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
                onClick = {
                    navController.navigate("${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/${schoolName}/${it.title}")
                }
            )
        }
    }
}

