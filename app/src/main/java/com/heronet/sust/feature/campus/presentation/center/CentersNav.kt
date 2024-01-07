package com.heronet.sust.feature.campus.presentation.center

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.centersNav(navController: NavHostController) {
    navigation(
        startDestination = "${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}/Centers",
        route = "${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}"
    ) {
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}/Centers") {
            CentersScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}/{center}",
            arguments = listOf(navArgument(name = "center") { type = NavType.StringType })
        ) {backStackEntry ->
            val center = backStackEntry.arguments?.getString("center")
            Text(text = "TODO: $center Employees")
        }
    }
}