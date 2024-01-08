package com.heronet.sust.feature.campus.presentation.school

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.heronet.sust.feature.campus.presentation.CampusViewModel
import com.heronet.sust.feature.campus.presentation.common.components.CategoryItem
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun SchoolsScreen(navController: NavHostController) {
    val campusViewModel = hiltViewModel<CampusViewModel>()
    val schools = remember {
        campusViewModel.getSchools()
    }

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(schools) { school ->
                CategoryItem(
                    school,
                    onClick = {
                        navController.navigate("${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/${school.title}")
                    }
                )
            }
        }
    }
}
