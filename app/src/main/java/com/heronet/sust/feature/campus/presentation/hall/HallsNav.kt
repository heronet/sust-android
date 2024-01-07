package com.heronet.sust.feature.campus.presentation.hall

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.hallsNav(navController: NavHostController) {
    navigation(
        startDestination = "${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}/Halls",
        route = "${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}"
    ) {
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}/Halls") {
            HallsScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}/{hall}",
            arguments = listOf(navArgument(name = "hall") { type = NavType.StringType })
        ) {backStackEntry ->
            val hall = backStackEntry.arguments?.getString("hall")
            Text(text = "TODO: $hall Employees")
        }
    }
}