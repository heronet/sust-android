package com.heronet.sust.feature.campus.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.heronet.sust.core.presentation.components.SimpleClickableItem
import com.heronet.sust.feature.campus.util.Constants
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun CampusScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(Constants.campusItems) { item ->
            SimpleClickableItem(
                title = item.title,
                description = item.description,
                imageVector = item.imageVector
            ) {
                navController.navigate("${MainRoutes.Campus.route}/${item.title}")
            }
        }
    }
}
