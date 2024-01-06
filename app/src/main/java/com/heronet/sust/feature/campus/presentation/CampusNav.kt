package com.heronet.sust.feature.campus.presentation

import android.util.Half
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.presentation.hall.HallsScreen
import com.heronet.sust.feature.campus.presentation.school.SchoolsScreen
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.campusNav(navController: NavHostController) {
    navigation(
        startDestination = "main",
        route = MainRoutes.Campus.name
    ) {
        composable("main") {
            CampusScreen(navController)
        }
        composable(
            route = "${MainRoutes.Campus.name}/{campusItem}",
            arguments = listOf(
                navArgument("campusItem") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            when (backStackEntry.arguments?.getString("campusItem")) {
                CampusRoutes.Schools.name -> SchoolsScreen()
                CampusRoutes.Halls.name -> HallsScreen()
            }
        }
    }
}