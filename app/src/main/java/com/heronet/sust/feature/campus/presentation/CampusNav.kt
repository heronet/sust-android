package com.heronet.sust.feature.campus.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.presentation.hall.hallsNav
import com.heronet.sust.feature.campus.presentation.school.schoolsNav
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.campusNav(navController: NavHostController) {
    navigation(
        startDestination = "main",
        route = MainRoutes.Campus.route
    ) {
        composable("main") {
            CampusScreen(navController)
        }
        // Graphs
        schoolsNav(navController)
        hallsNav(navController)
    }
}