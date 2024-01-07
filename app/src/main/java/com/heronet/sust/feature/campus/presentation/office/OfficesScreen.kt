package com.heronet.sust.feature.campus.presentation.office

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.heronet.sust.core.presentation.components.CategoryItem
import com.heronet.sust.feature.campus.presentation.CampusViewModel
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun OfficesScreen(navController: NavHostController) {
    val campusViewModel = hiltViewModel<CampusViewModel>()
    val offices = remember {
        campusViewModel.getOffices()
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(offices) { office ->
            CategoryItem(office) {
                navController.navigate("${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}/${office.title}")
            }
        }
    }
}
