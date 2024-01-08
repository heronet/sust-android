package com.heronet.sust.feature.campus.presentation.hall

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
fun HallsScreen(navHostController: NavHostController) {
    val campusViewModel = hiltViewModel<CampusViewModel>()

    val halls = remember {
        campusViewModel.getHalls()
    }

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(halls) { hall ->
                CategoryItem(hall) {
                    navHostController.navigate("${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}/${hall.title}")
                }
            }
        }
    }
}