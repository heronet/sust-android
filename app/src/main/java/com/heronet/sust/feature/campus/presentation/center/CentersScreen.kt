package com.heronet.sust.feature.campus.presentation.center

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.heronet.sust.feature.campus.presentation.common.components.CategoryDetailedItem
import com.heronet.sust.feature.campus.presentation.CampusViewModel
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun CentersScreen(navController: NavHostController) {
    val campusViewModel = hiltViewModel<CampusViewModel>()
    val centers = remember {
        campusViewModel.getCenters()
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(centers) { center ->
            CategoryDetailedItem(
                title = center.title,
                description = center.description
            ) {
                navController.navigate("${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}/${center.title}")
            }
        }
    }
}