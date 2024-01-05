package com.heronet.sust.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.presentation.CampusScreen
import com.heronet.sust.feature.campus.presentation.school.SchoolsScreen
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun MainNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = MainRoutes.Campus.name) {
        // Campus Graph
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
                    "Schools" -> SchoolsScreen()
                }
            }
        }

        composable(MainRoutes.Updates.name) {
            Text(text = MainRoutes.Updates.name)
        }
        composable(MainRoutes.Calendar.name) {
            Text(text = MainRoutes.Calendar.name)
        }
        composable(MainRoutes.Bus.name) {
            Text(text = MainRoutes.Bus.name)
        }
    }
}